package com.behnamuix.sarashpaz.features.home.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.behnamuix.sarashpaz.features.home.presentation.contract.HomeAction
import com.behnamuix.sarashpaz.features.home.presentation.screen.comp.NewSetRecipeCarouselComp
import com.behnamuix.sarashpaz.features.home.presentation.screen.comp.PopularRecipeComp
import com.behnamuix.sarashpaz.features.home.presentation.screen.comp.SlideShowRecipe
import com.behnamuix.sarashpaz.features.home.presentation.viewmodel.HomeViewModel
import com.kyant.backdrop.backdrops.layerBackdrop
import com.kyant.backdrop.backdrops.rememberLayerBackdrop
import org.jetbrains.compose.resources.painterResource
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeSc(viewModel: HomeViewModel = koinViewModel()) {
    val homeState by viewModel.homeState.collectAsState()
    val backdrop = rememberLayerBackdrop()
    LaunchedEffect(Unit) {
        viewModel.onHomeAction(HomeAction.SlideShow)
        viewModel.onHomeAction(HomeAction.NewRecipe)
        viewModel.onHomeAction(HomeAction.PopularRecipe)
    }
    Box() {
        Column(
            Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            SlideShowRecipe(
                modifer = Modifier.fillMaxWidth(),
                items = homeState.slideShowList,
            ) { recipe ->
                Box() {
                    Card {
                        Image(
                            painter = painterResource(recipe.image),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxWidth().height(240.dp)

                        )
                    }
                    Box(
                        Modifier.fillMaxWidth().height(240.dp),
                        contentAlignment = Alignment.BottomEnd
                    ) {
                        Column(
                            Modifier.clip(
                                shape = RoundedCornerShape(
                                    bottomStart = 8.dp,
                                    bottomEnd = 8.dp
                                )
                            ).fillMaxWidth().background(Color.Black.copy(0.5f))) {

                            Text(


                                text = "دستور پخت " + "\n" + recipe.title,
                                modifier = Modifier.fillMaxWidth().padding(12.dp),
                                color = MaterialTheme.colorScheme.onPrimary,
                                style = MaterialTheme.typography.headlineMedium
                            )


                        }
                    }
                }
            }
            NewSetRecipeCarouselComp(
                homeState.newRecipeList.shuffled(),
                "جدیدترین دستور پخت ها"
            ) { recipe ->
                Box(modifier = Modifier.height(205.dp)) {
                    Card(
                        shape = RoundedCornerShape(16.dp),
                        elevation = CardDefaults.elevatedCardElevation(8.dp)
                    ) {
                        Image(
                            painter = painterResource(recipe.image),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .layerBackdrop(backdrop)
                        )
                    }
                    Box(

                        Modifier.fillMaxSize().clip(RoundedCornerShape(16.dp)),
                        contentAlignment = Alignment.BottomEnd
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.Black.copy(0.5f)),
                            contentAlignment = Alignment.BottomEnd
                        ) {
                            Column(

                                Modifier.clip(
                                    shape = RoundedCornerShape(
                                        bottomStart = 8.dp,
                                        bottomEnd = 8.dp
                                    )
                                ).fillMaxWidth().padding(12.dp),
                                verticalArrangement = Arrangement.spacedBy(12.dp)

                            )
                            {

                                Text(


                                    text = "آموزش " + recipe.title,
                                    modifier = Modifier.fillMaxWidth(),

                                    color = MaterialTheme.colorScheme.onPrimary,
                                    style = MaterialTheme.typography.bodyMedium
                                )
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                                    modifier = Modifier.fillMaxWidth().align(Alignment.Start)
                                ) {


                                    Box(
                                        modifier = Modifier.size(24.dp).clip(CircleShape)
                                            .background(Color.Red)
                                    ) {
                                        Image(
                                            painter = painterResource(recipe.creator_profile),
                                            contentDescription = "",
                                            contentScale = ContentScale.Crop

                                        )
                                    }
                                    Text(


                                        text = recipe.creator,
                                        modifier = Modifier.weight(1f),
                                        color = MaterialTheme.colorScheme.onPrimary,
                                        style = MaterialTheme.typography.labelSmall
                                    )

                                }


                            }
                        }

                    }
                }

            }


            PopularRecipeComp(homeState.popularRecipeList,"محبوب ترین ها")
        }


    }
}




