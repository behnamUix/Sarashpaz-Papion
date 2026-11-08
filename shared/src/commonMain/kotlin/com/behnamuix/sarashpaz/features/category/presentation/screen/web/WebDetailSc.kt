package com.behnamuix.sarashpaz.features.category.presentation.screen.web

import kotlin.math.*
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.LocalFireDepartment
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.behnamuix.sarashpaz.features.category.presentation.contract.CategoryAction
import com.behnamuix.sarashpaz.features.category.presentation.viewmodel.CategoryViewModel
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.RecipeDifficulty
import org.jetbrains.compose.resources.painterResource
import org.koin.compose.koinInject
import kotlin.math.cos
import kotlin.math.sin


@Composable
fun WebDetailSc(categoryViewModel: CategoryViewModel = koinInject(), id: Int, title: String) {
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

        // Hero Section
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        ) {

            Image(
                painter = painterResource(recipe.image),
                contentDescription = recipe.title,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Black.copy(alpha = 0.05f),
                                Color.Transparent,
                                Color.Black.copy(alpha = 0.85f)
                            )
                        )
                    )
            )

            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .background(Color.Black.copy(alpha = 0.5f))
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {

                Text(
                    text = recipe.title,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Spacer(Modifier.height(8.dp))

                Text(
                    text = "سرآشپز: ${recipe.chefName}",
                    fontSize = 12.sp,
                    color = Color.White.copy(alpha = 0.9f)
                )

                Spacer(Modifier.height(18.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {

                    InfoItem(
                        title = "زمان پخت",
                        value = recipe.cookingTimeMinutes.toString(),
                        modifier = Modifier.weight(1f)
                    )

                    InfoItem(
                        title = "امتیاز",
                        value = "${recipe.rating} / ۵",
                        modifier = Modifier.weight(1f)
                    )

                    InfoItem(
                        title = "مناسب برای",
                        value = "${recipe.servings}نفر ",
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }

        // Difficulty
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp)
        ) {

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF91C8A4)
                )
            ) {

                RecipeDifficultySection(recipe.difficulty)
            }

            Spacer(Modifier.height(14.dp))

            Text(
                text = "میخوای بدونی برای پخت این غذا چقدر زمان بگیری؟",
                fontSize = 13.sp,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.onBackground
            )

            Spacer(Modifier.height(8.dp))

            Text(
                text = "مواد لازم بر اساس تعداد نفرات قابل تنظیم هستند.",
                fontSize = 11.sp,
                color = Color.Black.copy(alpha = 0.5f)
            )
        }

        // Ingredients
        Column(
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {

            SectionTitle("مواد لازم")

            ExpandableSection(
                title = "مواد اولیه",
                expanded = ingredientsExpanded,
                onClick = {
                    ingredientsExpanded = !ingredientsExpanded
                }
            ) {
                recipe.ingredients.forEach { ingredient ->
                    DetailListItem(ingredient.toString())
                }
            }

            Spacer(Modifier.height(8.dp))

            ExpandableSection(
                title = "ادویه‌جات",
                expanded = spicesExpanded,
                onClick = {
                    spicesExpanded = !spicesExpanded
                }
            ) {
                recipe.spices.forEach { spice ->
                    DetailListItem(spice.toString())
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        // Cooking Steps
        Column(
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {

            SectionTitle("مراحل طبخ")

            recipe.cookingSteps.forEachIndexed { index, step ->

                CookingStep(
                    number = index + 1,
                    description = step
                )

                Spacer(Modifier.height(18.dp))
            }
        }

        // Cooking Tips
        Column(
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {

            SectionTitle("نکات مهم آشپزی")

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {

                Column(
                    modifier = Modifier.padding(16.dp)
                ) {

                    Text(
                        text = "💡 پیشنهاد سرآشپز",
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                        color = MaterialTheme.colorScheme.primary
                    )

                    Spacer(Modifier.height(10.dp))

                    Text(
                        text = "برای داشتن طعمی بهتر، مواد اولیه را تازه انتخاب کنید و مراحل پخت را با دقت انجام دهید.",
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.onBackground,
                        lineHeight = 23.sp
                    )
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        // Comments Section
        CommentsSection()

        Spacer(Modifier.height(30.dp))
    }
}

@Composable
private fun InfoItem(
    title: String,
    value: String,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(Color.Black.copy(alpha = 0.35f))
            .padding(vertical = 10.dp, horizontal = 5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = value,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Spacer(Modifier.height(5.dp))

        Text(
            text = title,
            fontSize = 10.sp,
            color = Color.White.copy(alpha = 0.85f)
        )
    }
}

@Composable
private fun SectionTitle(title: String) {

    Text(
        text = title,
        fontSize = 17.sp,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.padding(
            top = 10.dp,
            bottom = 14.dp
        )
    )
}

@Composable
private fun ExpandableSection(
    title: String,
    expanded: Boolean,
    onClick: () -> Unit,
    content: @Composable ColumnScope.() -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(MaterialTheme.colorScheme.background)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onClick() }
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = title,
                fontSize = 13.sp,

                fontWeight = FontWeight.Medium
            )

            Text(
                text = if (expanded) "↑" else "↓",
                fontSize = 18.sp,

                )
        }

        if (expanded) {

            HorizontalDivider(
                color = Color.LightGray.copy(alpha = 0.5f)
            )

            Column(
                modifier = Modifier.padding(12.dp),
                content = content
            )
        }
    }
}

@Composable
private fun DetailListItem(text: String) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 7.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Text(
            text = text,
            fontSize = 12.sp,

            )

        Text(
            text = "↓",
            color = MaterialTheme.colorScheme.background.copy(alpha = 0.5f),
            fontSize = 12.sp
        )
    }
}

@Composable
private fun CookingStep(
    number: Int,
    description: String
) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top
    ) {

        Box(
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ) {

            Text(
                text = number.toString(),
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp
            )
        }

        Spacer(Modifier.width(12.dp))

        Column(
            modifier = Modifier.weight(1f)
        ) {

            Text(
                text = "مرحله $number",
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,

                )

            Spacer(Modifier.height(8.dp))

            Text(
                text = description,
                fontSize = 12.sp,
                lineHeight = 24.sp,

                textAlign = TextAlign.Justify
            )
        }
    }
}

@Composable
private fun CommentsSection() {

    var comment by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {

        SectionTitle("نظرات کاربران")

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {

            Column(
                modifier = Modifier.padding(14.dp)
            ) {

                Text(
                    text = "نظر خودت رو درباره این غذا بنویس",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,

                    )

                Spacer(Modifier.height(12.dp))

                OutlinedTextField(
                    value = comment,
                    onValueChange = { comment = it },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(
                            "تجربه خودت رو با بقیه به اشتراک بذار...",
                            fontSize = 11.sp
                        )
                    },
                    minLines = 3,
                    shape = RoundedCornerShape(10.dp)
                )

                Spacer(Modifier.height(12.dp))

                Button(
                    onClick = {
                        // TODO: Send comment
                        comment = ""
                    },
                    modifier = Modifier.align(Alignment.End),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary
                    ),
                    shape = RoundedCornerShape(8.dp)
                ) {

                    Text(
                        text = "ارسال نظر",
                        fontSize = 12.sp
                    )
                }
            }
        }

        Spacer(Modifier.height(16.dp))

        // Sample comments

        repeat(4) { index ->

            CommentItem(
                username = "بهنام محجوب",
                date = "۲ روز پیش",
                description = "من این غذا رو درست کردم و واقعاً طعمش عالی بود. خیلی خوشمزه و خوش‌عطر شده بود."
            )

            Spacer(Modifier.height(12.dp))
        }
    }
}

@Composable
private fun CommentItem(
    username: String,
    date: String,
    description: String
) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {

        Column(
            modifier = Modifier.padding(14.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Column(
                    modifier = Modifier.weight(1f)
                ) {

                    Text(
                        text = username,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,

                        )

                    Text(
                        text = date,
                        fontSize = 10.sp,

                        )
                }

                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.LightGray)
                )
            }

            Spacer(Modifier.height(12.dp))

            Text(
                text = description,
                fontSize = 12.sp,

                lineHeight = 22.sp
            )

            Spacer(Modifier.height(12.dp))

            HorizontalDivider(
                color = Color.LightGray.copy(alpha = 0.5f)
            )

            Spacer(Modifier.height(8.dp))

            Text(
                text = "پاسخ به نظر",
                fontSize = 11.sp,
                color = Color(0xFF00AFA5),
                modifier = Modifier.clickable {
                    // TODO: Reply to comment
                }
            )
        }
    }
}



@Composable
fun DifficultyMeter(
    diff: RecipeDifficulty,
    modifier: Modifier = Modifier
) {
    val progress = when (diff) {
        RecipeDifficulty.EASY -> 0.25f
        RecipeDifficulty.MEDIUM -> 0.5f
        RecipeDifficulty.HARD -> 1f
    }

    val animatedProgress by animateFloatAsState(
        targetValue = progress,
        animationSpec = tween(1200, easing = FastOutSlowInEasing),
        label = "Gauge Animation"
    )

    val difficultyColor = when (diff) {
        RecipeDifficulty.EASY -> Color(0xFF43A978)
        RecipeDifficulty.MEDIUM -> Color(0xFF3988D8)
        RecipeDifficulty.HARD -> Color(0xFFE45B5B)
    }

    val difficultyTitle = when (diff) {
        RecipeDifficulty.EASY -> "آسان"
        RecipeDifficulty.MEDIUM -> "متوسط"
        RecipeDifficulty.HARD -> "سخت"
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Canvas(
            modifier = Modifier
                .width(160.dp)
                .height(95.dp)
        ) {
            val stroke = 12.dp.toPx()

            val arcSize = Size(
                width = size.width - stroke,
                height = (size.height * 2) - stroke
            )

            val topLeft = Offset(stroke / 2, stroke / 2)

            // Background
            drawArc(
                color = Color.LightGray.copy(alpha = 0.25f),
                startAngle = 180f,
                sweepAngle = 180f,
                useCenter = false,
                topLeft = topLeft,
                size = arcSize,
                style = Stroke(
                    width = stroke,
                    cap = StrokeCap.Round
                )
            )

            // Colored gauge segments
            val segments = listOf(
                Color(0xFF43A978),
                Color(0xFF3988D8),
                Color(0xFFE45B5B)
            )

            segments.forEachIndexed { index, color ->
                drawArc(
                    color = color,
                    startAngle = 180f + index * 60f + 3f,
                    sweepAngle = 54f,
                    useCenter = false,
                    topLeft = topLeft,
                    size = arcSize,
                    style = Stroke(
                        width = stroke,
                        cap = StrokeCap.Round
                    )
                )
            }

            // Needle angle
            val angle = (180f + animatedProgress * 180f) * (PI / 180.0)

            val center = Offset(
                x = size.width / 2,
                y = size.height - stroke / 2
            )

            val needleLength = size.height * 0.72f

            val needleEnd = Offset(
                x = center.x + cos(angle).toFloat() * needleLength,
                y = center.y + sin(angle).toFloat() * needleLength
            )

            // Needle shadow
            drawLine(
                color = Color.Black.copy(alpha = 0.15f),
                start = center + Offset(1.dp.toPx(), 2.dp.toPx()),
                end = needleEnd + Offset(1.dp.toPx(), 2.dp.toPx()),
                strokeWidth = 5.dp.toPx(),
                cap = StrokeCap.Round
            )

            // Needle
            drawLine(
                color = Color(0xFF252525),
                start = center,
                end = needleEnd,
                strokeWidth = 3.dp.toPx(),
                cap = StrokeCap.Round
            )

            // Needle center
            drawCircle(
                color = Color(0xFF252525),
                radius = 7.dp.toPx(),
                center = center
            )

            drawCircle(
                color = Color.White,
                radius = 3.dp.toPx(),
                center = center
            )
        }

        Spacer(Modifier.height(4.dp))

        Text(
            text = difficultyTitle,
            style = MaterialTheme.typography.titleSmall,
            color = difficultyColor,
            fontWeight = FontWeight.Bold
        )
    }
}


@Composable
fun RecipeDifficultySection(
    difficulty: RecipeDifficulty,
    modifier: Modifier = Modifier
) {
    val difficultyColor = when (difficulty) {
        RecipeDifficulty.EASY -> Color(0xFF43A978)
        RecipeDifficulty.MEDIUM -> Color(0xFF3988D8)
        RecipeDifficulty.HARD -> Color(0xFFE45B5B)
    }





    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(24.dp))
            .background(
                MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f)
            )
            .padding(18.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {

        // Header
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "درجه سختی",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.ExtraBold,
                color = difficultyColor
            )

                DifficultyMeter(
                    diff = difficulty
                )


        }
    }
}