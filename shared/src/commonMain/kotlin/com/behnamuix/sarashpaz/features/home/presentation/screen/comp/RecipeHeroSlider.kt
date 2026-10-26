package com.behnamuix.sarashpaz.features.home.presentation.screen.comp



import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.collectIsDraggedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

data class HeroSlide(
    val title: String,
    val subtitle: String,
    val image: DrawableResource
)

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RecipeHeroSlider(
    items: List<HeroSlide>,
    modifier: Modifier = Modifier,
    autoPlay: Boolean = true,
    intervalMillis: Long = 4000L,
    onSlideClick: (HeroSlide) -> Unit = {}
) {
    if (items.isEmpty()) return

    val pagerState = rememberPagerState(
        pageCount = { items.size }
    )

    val isDragged by
    pagerState.interactionSource.collectIsDraggedAsState()

    // پخش خودکار؛ هنگام تعامل کاربر متوقف می‌شود.
    LaunchedEffect(
        pagerState,
        items.size,
        autoPlay,
        isDragged
    ) {
        if (!autoPlay || items.size < 2 || isDragged) {
            return@LaunchedEffect
        }

        while (true) {
            delay(intervalMillis)

            val nextPage =
                (pagerState.currentPage + 1) % items.size

            pagerState.animateScrollToPage(nextPage)
        }
    }

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
                .height(380.dp),
            contentPadding = PaddingValues(horizontal = 20.dp),
            pageSpacing = 14.dp
        ) { page ->

            val slide = items[page]

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(28.dp))
            ) {
                Image(
                    painter = painterResource(slide.image),
                    contentDescription = slide.title,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )

                // گرادیان تیره برای خوانایی متن
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.Black.copy(alpha = 0.15f),
                                    Color.Black.copy(alpha = 0.85f)
                                )
                            )
                        )
                )

                Column(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .fillMaxWidth()
                        .padding(
                            horizontal = 24.dp,
                            vertical = 28.dp
                        ),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "پیشنهاد سرآشپز",
                        color = Color.White.copy(alpha = 0.8f),
                        style = MaterialTheme.typography.labelLarge
                    )

                    Text(
                        text = slide.title,
                        color = Color.White,
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )

                    Text(
                        text = slide.subtitle,
                        color = Color.White.copy(alpha = 0.9f),
                        style = MaterialTheme.typography.bodyMedium,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }

        // نشانگر متحرک صفحات
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            repeat(items.size) { index ->
                val selected = pagerState.currentPage == index

                val indicatorWidth by animateDpAsState(
                    targetValue = if (selected) 28.dp else 8.dp,
                    label = "indicatorWidth"
                )

                Box(
                    modifier = Modifier
                        .padding(horizontal = 3.dp)
                        .size(
                            width = indicatorWidth,
                            height = 8.dp
                        )
                        .clip(CircleShape)
                        .background(
                            if (selected) {
                                MaterialTheme.colorScheme.primary
                            } else {
                                Color(0xFFD8D8D8)
                            }
                        )
                )
            }
        }
    }
}
