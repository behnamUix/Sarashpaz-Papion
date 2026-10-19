package com.behnamuix.sarashpaz.features.home.presentation.screen.comp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Recipe

@Composable
fun NewSetRecipeCarouselComp(
    items: List<Recipe>,
    title: String,
    onSeeAllClick: () -> Unit = {},
    content: @Composable (Recipe) -> Unit
) {
    Column(

        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = title,
                color = Color.Black,

                style = androidx.compose.material3.MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "همه",
                color = Color.Black,

                modifier = Modifier.padding(end = 8.dp),
                // برای کلیک روی «همه» بهتر است از TextButton استفاده شود.
                style = androidx.compose.material3.MaterialTheme.typography.bodyMedium
            )

        }


            HorizontalMultiBrowseCarousel(

                state = rememberCarouselState {
                    items.size
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(vertical = 16.dp),
                preferredItemWidth = 186.dp,
                itemSpacing = 6.dp,
                userScrollEnabled = true,

                contentPadding = PaddingValues(horizontal = 16.dp)
            ) { index ->
                content(items[index])
            }
        }

}