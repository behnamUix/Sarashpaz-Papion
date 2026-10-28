package com.behnamuix.sarashpaz.features.category.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.behnamuix.sarashpaz.core.utils.CheckUiVersion
import com.behnamuix.sarashpaz.features.category.domain.model.CategoryRecipe
import com.behnamuix.sarashpaz.features.category.domain.model.RecipeModel
import com.behnamuix.sarashpaz.features.category.presentation.contract.CategoryAction
import com.behnamuix.sarashpaz.features.category.presentation.screen.comp.CategoryItem
import com.behnamuix.sarashpaz.features.category.presentation.viewmodel.CategoryViewModel
import org.jetbrains.compose.resources.painterResource
import org.koin.compose.koinInject
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun CategoryScreen(categoryViewModel: CategoryViewModel = koinInject(),
                   onCardClick:(Int)->Unit
) {
    val categoryState by categoryViewModel.categoryState.collectAsState()
    LaunchedEffect(Unit) {
        categoryViewModel.onCategoryAction(CategoryAction.Category)

    }
    Box() {
        Column(
            Modifier.fillMaxSize().padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
        ) {

            BoxWithConstraints {
                CheckUiVersion(
                    maxWidth,
                    androidContent = {
                        LazyColumn(modifier = Modifier.height(800.dp)) {
                            items(categoryState.categoryList) {

                                CategoryItem(it){
                                    onCardClick(it.id)

                                }
                            }
                        }
                    },
                    webContent = {
                        LazyVerticalGrid(
                            columns = GridCells.Fixed(3),

                        ) {
                            items(categoryState.categoryList) {

                                CategoryItem(it){
                                    onCardClick(it.id)
                                }
                            }
                        }
                    }
                )

            }


        }
    }

}


