package com.behnamuix.sarashpaz.features.category.presentation.screen.web

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.behnamuix.sarashpaz.core.design.LogoFont
import com.behnamuix.sarashpaz.features.category.domain.model.RecipeModel
import com.behnamuix.sarashpaz.features.category.presentation.contract.CategoryAction
import com.behnamuix.sarashpaz.features.category.presentation.viewmodel.CategoryViewModel
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.RecipeDifficulty
import org.jetbrains.compose.resources.painterResource
import org.koin.compose.koinInject
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.min
import kotlin.math.sin


@Composable
fun WebDetailSc(
    categoryViewModel: CategoryViewModel = koinInject(),
    id: Int,
    title: String,
    backNow: () -> Unit
) {
    var ingredientsExpanded by remember { mutableStateOf(false) }
    var spicesExpanded by remember { mutableStateOf(false) }
    val categoryState by categoryViewModel.categoryState.collectAsState()
    LaunchedEffect(Unit) {
        categoryViewModel.onCategoryAction(CategoryAction.RecipeDetail(id, title))

    }
    val recipe = categoryState.recipeDetail

    if (recipe == null) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
            contentAlignment = Alignment.Center
        ) {
            Text("غذایی برای نمایش وجود ندارد")
        }
        return
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(rememberScrollState())
    ) {
        Header(recipe) {
            backNow()
        }
        DifficultyMeterComp(recipe.difficulty)


    }
}


@Composable
fun DifficultyMeterComp(
    difficulty: RecipeDifficulty
) {
    val progress = when (difficulty) {
        RecipeDifficulty.EASY -> 0.1667f
        RecipeDifficulty.MEDIUM -> 0.5f
        RecipeDifficulty.HARD -> 0.8333f
    }


    val difficultyColor = when (difficulty) {
        RecipeDifficulty.EASY -> Color(0xFF38C98B)
        RecipeDifficulty.MEDIUM -> Color(0xFFFFB547)
        RecipeDifficulty.HARD -> Color(0xFFFF5964)
    }

    val animatedProgress by animateFloatAsState(
        targetValue = progress,
        animationSpec = tween(1000),
        label = "difficulty_animation"
    )
    Column(horizontalAlignment = Alignment.Start, modifier = Modifier.fillMaxWidth()) {  }
    Card(
        modifier = Modifier.padding(16.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF151C27)
        )
    ) {
        Column(

            modifier = Modifier

                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "درجه سختی پخت",
                style = MaterialTheme.typography.titleMedium,
                color = Color.White
            )

            Spacer(Modifier.height(16.dp))

            Canvas(
                modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)
            ) {
                val cx = size.width / 2f
                val cy = size.height * 0.88f

                val radius = min(
                    size.width * 0.42f,
                    size.height * 0.84f
                )

                val arcSize = Size(
                    radius * 2,
                    radius * 2
                )

                val topLeft = Offset(
                    cx - radius,
                    cy - radius
                )

                // Three difficulty levels
                val colors = listOf(
                    Color(0xFF38C98B),
                    Color(0xFFFFB547),
                    Color(0xFFFF5964)
                )

                colors.forEachIndexed { index, color ->

                    drawArc(
                        color = color.copy(alpha = 0.18f),
                        startAngle = 180f + index * 60f + 2f,
                        sweepAngle = 56f,
                        useCenter = false,
                        topLeft = topLeft,
                        size = arcSize,
                        style = Stroke(
                            width = 15.dp.toPx(),
                            cap = StrokeCap.Round
                        )
                    )

                    drawArc(
                        color = color,
                        startAngle = 180f + index * 60f + 2f,
                        sweepAngle = 56f,
                        useCenter = false,
                        topLeft = topLeft,
                        size = arcSize,
                        style = Stroke(
                            width = 7.dp.toPx(),
                            cap = StrokeCap.Round
                        )
                    )
                }

                // Needle
                val angle = 180f + animatedProgress * 180f
                val radians = angle * PI.toFloat() / 180f

                val needleLength = radius * 0.72f

                val needleEnd = Offset(
                    cx + cos(radians) * needleLength,
                    cy + sin(radians) * needleLength
                )

                drawLine(
                    color = difficultyColor.copy(alpha = 0.25f),
                    start = Offset(cx, cy),
                    end = needleEnd,
                    strokeWidth = 9.dp.toPx(),
                    cap = StrokeCap.Round
                )

                drawLine(
                    color = Color.White,
                    start = Offset(cx, cy),
                    end = needleEnd,
                    strokeWidth = 3.dp.toPx(),
                    cap = StrokeCap.Round
                )

                // Needle center
                drawCircle(
                    color = Color(0xFF263448),
                    radius = 11.dp.toPx(),
                    center = Offset(cx, cy)
                )

                drawCircle(
                    color = difficultyColor,
                    radius = 6.dp.toPx(),
                    center = Offset(cx, cy)
                )
            }

            Spacer(Modifier.height(4.dp))

            // Difficulty labels
            Row(

                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                DifficultyLabel(
                    title = "آسان",
                    color = Color(0xFF38C98B),
                    selected = difficulty == RecipeDifficulty.EASY
                )

                DifficultyLabel(
                    title = "متوسط",
                    color = Color(0xFFFFB547),
                    selected = difficulty == RecipeDifficulty.MEDIUM
                )

                DifficultyLabel(
                    title = "سخت",
                    color = Color(0xFFFF5964),
                    selected = difficulty == RecipeDifficulty.HARD
                )
            }



        }
    }
}

@Composable
private fun DifficultyLabel(
    title: String,
    color: Color,
    selected: Boolean
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(7.dp)
    ) {
        Box(
            modifier = Modifier
                .width(32.dp)
                .height(3.dp)
                .background(
                    color = if (selected) color else color.copy(alpha = 0.3f),
                    shape = RoundedCornerShape(50)
                )
        )

        Text(
            text = title,
            color = if (selected) color else Color(0xFF8794A5),
            style = MaterialTheme.typography.bodyMedium
        )
    }
}


@Composable
fun Header(recipe: RecipeModel, backNow: () -> Unit) {
    Box(modifier = Modifier.fillMaxWidth().height(400.dp)) {
        Image(
            painter = painterResource(recipe.image),
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            contentDescription = ""
        )

        Box(
            Modifier.fillMaxSize().background(
                brush = Brush.verticalGradient(
                    listOf(
                        Color.Black,
                        Color.Transparent,
                        Color.Black
                    )
                )
            )
        ) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            listOf(
                                Color.Black.copy(alpha = 0.7f),
                                Color.Transparent,
                                Color.Black.copy(alpha = 0.8f)
                            )
                        )
                    )
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomStart)
                        .padding(24.dp)
                ) {
                    Column(

                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Text(
                            text = recipe.title,
                            fontFamily = LogoFont(),
                            color = Color.White,
                            fontSize = 28.sp
                        )
                        Text(
                            text = " آشپز ${recipe.chefName}",
                            color = Color.White,
                            style = MaterialTheme.typography.bodyMedium
                        )

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            HeroContentCard(Icons.Default.Groups, recipe.servings)

                            HeroContentCard(
                                Icons.Default.Star,
                                recipe.rating?.toInt() ?: 0
                            )

                            HeroContentCard(
                                Icons.Default.Timer,
                                recipe.cookingTimeMinutes
                            )
                        }
                    }
                }
            }

        }
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.TopEnd) {
            IconButton(modifier = Modifier.padding(16.dp), onClick = {
                backNow()
            }) {
                Icon(
                    tint = Color.White,
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = ""
                )
            }
        }
    }

}

@Composable
fun HeroContentCard(
    icon: ImageVector,
    value: Int
) {
    Column(
        modifier = Modifier.border(color = Color.White.copy(0.5f), width = 0.5.dp, shape = RoundedCornerShape(16.dp)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Column(Modifier.padding(16.dp)          ,horizontalAlignment = Alignment.CenterHorizontally,) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier.size(26.dp),
                tint = Color.White
            )

            Text(
                text = value.toString(),
                color = Color.White.copy(0.5f),
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}
