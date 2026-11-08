package com.behnamuix.sarashpaz.features.category.presentation.screen.web

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.behnamuix.sarashpaz.features.category.presentation.contract.CategoryAction
import com.behnamuix.sarashpaz.features.category.presentation.viewmodel.CategoryViewModel
import org.jetbrains.compose.resources.painterResource
import org.koin.compose.koinInject

private val PageBackground = Color(0xFFECECEC)
private val CardBackground = Color(0xFFF8F8F8)
private val PrimaryColor = Color(0xFFF02D68)
private val TextDark = Color(0xFF292929)
private val TextGray = Color(0xFF777777)

@Composable
fun WebDetailSc(categoryViewModel: CategoryViewModel = koinInject(),id:Int ,title: String) {
    val categoryState by categoryViewModel.categoryState.collectAsState()
    LaunchedEffect(Unit) {
        categoryViewModel.onCategoryAction(CategoryAction.RecipeDetail(id, title))

    }
    val recipe = categoryState.recipeDetail

    if (recipe == null) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(PageBackground),
            contentAlignment = Alignment.Center
        ) {
            Text("غذایی برای نمایش وجود ندارد")
        }
        return
    }

    var ingredientsExpanded by remember { mutableStateOf(false) }
    var spicesExpanded by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PageBackground)
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
                        value = "۴۵ دقیقه",
                        modifier = Modifier.weight(1f)
                    )

                    InfoItem(
                        title = "امتیاز",
                        value = "۴.۹ / ۵",
                        modifier = Modifier.weight(1f)
                    )

                    InfoItem(
                        title = "مناسب برای",
                        value = "۴ نفر",
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

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Column {
                        Text(
                            text = "درجه سختی",
                            fontSize = 12.sp,
                            color = TextDark
                        )

                        Spacer(Modifier.height(6.dp))

                        Text(
                            text = "سخت  •  متوسط  •  آسان",
                            fontSize = 11.sp,
                            color = TextDark
                        )
                    }

                    Text(
                        text = "━━━━",
                        color = Color(0xFF008F9D),
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(Modifier.height(14.dp))

            Text(
                text = "میخوای بدونی برای پخت این غذا چقدر زمان بگیری؟",
                fontSize = 13.sp,
                fontWeight = FontWeight.Medium,
                color = TextDark
            )

            Spacer(Modifier.height(8.dp))

            Text(
                text = "مواد لازم بر اساس تعداد نفرات قابل تنظیم هستند.",
                fontSize = 11.sp,
                color = TextGray
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
                        color = PrimaryColor
                    )

                    Spacer(Modifier.height(10.dp))

                    Text(
                        text = "برای داشتن طعمی بهتر، مواد اولیه را تازه انتخاب کنید و مراحل پخت را با دقت انجام دهید.",
                        fontSize = 12.sp,
                        color = TextDark,
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
        color = TextDark,
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
            .background(CardBackground)
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
                color = TextDark,
                fontWeight = FontWeight.Medium
            )

            Text(
                text = if (expanded) "↑" else "↓",
                fontSize = 18.sp,
                color = TextDark
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
            color = TextDark
        )

        Text(
            text = "↓",
            color = TextGray,
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
                .background(PrimaryColor),
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
                color = TextDark
            )

            Spacer(Modifier.height(8.dp))

            Text(
                text = description,
                fontSize = 12.sp,
                lineHeight = 24.sp,
                color = TextDark,
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
                    color = TextDark
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
                        containerColor = PrimaryColor
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
                        color = TextDark
                    )

                    Text(
                        text = date,
                        fontSize = 10.sp,
                        color = TextGray
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
                color = TextDark,
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