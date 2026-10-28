package com.behnamuix.sarashpaz.features.category.presentation.screen.comp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.behnamuix.sarashpaz.features.category.domain.model.CategoryRecipe
import org.jetbrains.compose.resources.painterResource

@Composable
fun CategoryItem(item: CategoryRecipe,onCardClick:()->Unit) {
    Card(
        onClick = { onCardClick() },
        colors = CardDefaults.cardColors(Color.White),
        modifier = Modifier.fillMaxWidth().padding(4.dp),
        elevation = CardDefaults.elevatedCardElevation(6.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Box(modifier = Modifier.clip(CircleShape)) {
                Image(
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(52.dp).padding(4.dp),
                    painter = painterResource(item.image),
                    contentDescription = ""
                )
            }
            Text(
                item.title,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Black
            )
            Spacer(Modifier.weight(1f))
            OutlinedCard() {
                Text(
                    item.recipeList.size.toString() + "دستور پخت",
                    modifier = Modifier.padding(8.dp),
                    style = MaterialTheme.typography.labelSmall
                )
            }
        }
    }
}