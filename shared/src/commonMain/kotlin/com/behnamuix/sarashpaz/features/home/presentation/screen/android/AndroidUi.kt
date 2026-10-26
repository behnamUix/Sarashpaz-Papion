package com.behnamuix.sarashpaz.features.home.presentation.screen.android



import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.behnamuix.sarashpaz.features.home.presentation.contract.HomeAction
import com.behnamuix.sarashpaz.features.home.presentation.screen.comp.ArticleRecipeComp
import com.behnamuix.sarashpaz.features.home.presentation.screen.comp.HeroSlide
import com.behnamuix.sarashpaz.features.home.presentation.screen.comp.InterViewCustomerComp
import com.behnamuix.sarashpaz.features.home.presentation.screen.comp.NewSetRecipeCarouselComp
import com.behnamuix.sarashpaz.features.home.presentation.screen.comp.PopularRecipeComp
import com.behnamuix.sarashpaz.features.home.presentation.screen.comp.RecipeHeroSlider
import com.behnamuix.sarashpaz.features.home.presentation.viewmodel.HomeViewModel
import com.kyant.backdrop.backdrops.layerBackdrop
import com.kyant.backdrop.backdrops.rememberLayerBackdrop
import org.jetbrains.compose.resources.painterResource
import sarashpaz.shared.generated.resources.Res
import sarashpaz.shared.generated.resources.online

@Composable
fun AndroidUi(viewModel: HomeViewModel){
    val infiniteTransition = rememberInfiniteTransition()

    val animatedAlpha by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1000),
            repeatMode = RepeatMode.Reverse
        )
    )
    val homeState by viewModel.homeState.collectAsState()
    val backdrop = rememberLayerBackdrop()
    LaunchedEffect(Unit) {
        viewModel.onHomeAction(HomeAction.SlideShow)
        viewModel.onHomeAction(HomeAction.NewRecipe)
        viewModel.onHomeAction(HomeAction.PopularRecipe)
        viewModel.onHomeAction(HomeAction.ArticleRecipe)
        viewModel.onHomeAction(HomeAction.InterviewRecipe)
    }
    val slides = homeState.slideShowList.map { recipe ->
        HeroSlide(
            title = recipe.title,
            subtitle = "یک دستور خوشمزه برای امروز",
            image = recipe.image
        )
    }

    Box() {
        Column(
            Modifier.fillMaxSize().padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            Card(
                colors = CardDefaults.cardColors(Color.White),
                elevation = CardDefaults.elevatedCardElevation(6.dp),
                shape = CircleShape
            ) {
                Row(
                    modifier = Modifier.padding(8.dp).fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier.size(24.dp).alpha(animatedAlpha),
                        painter = painterResource(Res.drawable.online),
                        contentDescription = ""
                    )
                    Text(
                        "ارتباط با پایگاه داده برقرار است",
                        style = MaterialTheme.typography.labelMedium
                    )
                }
            }

            RecipeHeroSlider(
                items = slides,
                modifier = Modifier.fillMaxWidth(),
                autoPlay = true
            )

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
            PopularRecipeComp(homeState.popularRecipeList, "محبوب ترین ها")
            ArticleRecipeComp(homeState.articleList, "مقالات")
            InterViewCustomerComp(homeState.chefCustomerList, "مصاحبه با کاربران برتر")
        }


    }
}
