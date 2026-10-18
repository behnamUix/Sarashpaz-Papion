package com.behnamuix.sarashpaz.features.home.presentation.screen.comp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Recipe
import com.kyant.backdrop.backdrops.layerBackdrop
import org.jetbrains.compose.resources.painterResource

@Composable
fun PopularRecipeComp(popularRecipeList: List<Recipe>, title: String) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "همه",
                color = Color.Black,

                modifier = Modifier.padding(end = 8.dp),
                // برای کلیک روی «همه» بهتر است از TextButton استفاده شود.
                style = androidx.compose.material3.MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = title,
                color = Color.Black,

                style = androidx.compose.material3.MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold
            )

        }
        LazyHorizontalGrid(

            rows = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(horizontal = 8.dp)
        ) {
            items(popularRecipeList.shuffled()) {
                FoodItem(it)
            }
        }
    }
}

@Composable
fun FoodItem(item: Recipe) {
    Box(
        modifier = Modifier
            .size(150.dp)
            .padding(4.dp)
    ){
        Card(

            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp
            )
        ) {
            Image(
                painter = painterResource(item.image),
                contentDescription = item.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
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


                        text = "آموزش " + item.title,
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

                        ) {
                            Image(
                                painter = painterResource(item.creator_profile),
                                contentDescription = "",
                                contentScale = ContentScale.Crop

                            )
                        }
                        Text(


                            text = item.creator,
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

