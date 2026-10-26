package com.behnamuix.sarashpaz.features.home.presentation.screen.comp

import com.behnamuix.sarashpaz.features.home.domain.model.interviewCustomer.QAChefCustomer

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight

import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.behnamuix.sarashpaz.features.home.domain.model.interviewCustomer.ChefCustomer

import kotlinx.coroutines.launch
import sarashpaz.shared.generated.resources.Res
import sarashpaz.shared.generated.resources.arrow
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun InterViewCustomerComp(
    interviewList: List<ChefCustomer>,
    title: String,
    modifier: Modifier = Modifier
) {
    val pagerState = rememberPagerState(
        pageCount = { interviewList.size }
    )
    val scope = rememberCoroutineScope()

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // عنوان
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = title,
                color = Color.Black,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold
            )
        }

        if (interviewList.isNotEmpty()) {
            BoxWithConstraints(
                modifier = Modifier.fillMaxWidth()
            ) {
                val cardHeight = when {
                    maxWidth < 400.dp -> 420.dp
                    maxWidth < 700.dp -> 450.dp
                    else -> 480.dp
                }

                HorizontalPager(
                    state = pagerState,
                    modifier = Modifier.fillMaxWidth(),
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    pageSpacing = 12.dp
                ) {
                    Card(
                        elevation = CardDefaults.elevatedCardElevation(
                            defaultElevation = 6.dp
                        ),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        shape = RoundedCornerShape(24.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .widthIn(max = 560.dp)
                            .height(cardHeight)
                    ) {
                        ChefCustomerItemContent(
                            chef = interviewList[it]
                        )
                    }
                }
            }

            // هندل‌های جابه‌جایی کارت‌ها
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    enabled = pagerState.currentPage > 0,
                    onClick = {
                        scope.launch {
                            pagerState.animateScrollToPage(
                                (pagerState.currentPage - 1).coerceAtLeast(0)
                            )
                        }
                    }
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                        contentDescription = "کارت قبلی",
                        tint = if (pagerState.currentPage > 0) {
                            Color.Black
                        } else {
                            Color.LightGray
                        },
                        modifier = Modifier.size(32.dp)
                    )
                }

                Spacer(modifier = Modifier.width(24.dp))

                IconButton(
                    enabled = pagerState.currentPage < interviewList.lastIndex,
                    onClick = {
                        scope.launch {
                            pagerState.animateScrollToPage(
                                (pagerState.currentPage + 1)
                                    .coerceAtMost(interviewList.lastIndex)
                            )
                        }
                    }
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        contentDescription = "کارت بعدی",
                        tint = if (pagerState.currentPage < interviewList.lastIndex) {
                            Color.Black
                        } else {
                            Color.LightGray
                        },
                        modifier = Modifier.size(32.dp)
                    )
                }
            }
        }
    }
}

@Composable
private fun ChefCustomerItemContent(
    chef: ChefCustomer
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painter = painterResource(chef.imageUrl),
                contentDescription = chef.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(85.dp)
                    .height(110.dp)
                    .clip(RoundedCornerShape(45.dp))
            )

            Text(
                text = chef.name,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = chef.registeredAt,
                style = MaterialTheme.typography.labelMedium
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            chef.q_a.forEach { qa ->
                QACardItem(item = qa)
            }
        }
    }
}

@Composable
fun QACardItem(
    item: QAChefCustomer
) {
    var showAnswer by remember(item) {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Card(
            onClick = {
                showAnswer = !showAnswer
            },
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .animateContentSize(
                    animationSpec = tween(durationMillis = 300)
                ),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = item.question,
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.bodyMedium
                    )

                    Icon(
                        painter = painterResource(Res.drawable.arrow),
                        contentDescription = if (showAnswer) {
                            "بستن پاسخ"
                        } else {
                            "نمایش پاسخ"
                        },
                        modifier = Modifier.size(16.dp)
                    )
                }

                if (showAnswer) {
                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = item.answer,
                        color = Color.Black.copy(alpha = 0.5f),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.labelMedium
                    )
                }
            }
        }

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp,
            color = Color.Black.copy(alpha = 0.2f)
        )
    }
}
