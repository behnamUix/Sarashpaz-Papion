package com.behnamuix.sarashpaz.features.home.presentation.screen

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.behnamuix.sarashpaz.core.design.LogoFont
import com.behnamuix.sarashpaz.features.home.presentation.contract.HomeAction
import com.behnamuix.sarashpaz.features.home.presentation.screen.android.AndroidUi
import com.behnamuix.sarashpaz.features.home.presentation.screen.comp.ArticleRecipeComp
import com.behnamuix.sarashpaz.features.home.presentation.screen.comp.InterViewCustomerComp
import com.behnamuix.sarashpaz.features.home.presentation.screen.comp.NewSetRecipeCarouselComp
import com.behnamuix.sarashpaz.features.home.presentation.screen.comp.PopularRecipeComp
import com.behnamuix.sarashpaz.features.home.presentation.screen.comp.SlideShowRecipe
import com.behnamuix.sarashpaz.features.home.presentation.screen.web.WebUi
import com.behnamuix.sarashpaz.features.home.presentation.viewmodel.HomeViewModel
import com.behnamuix.sarashpaz.isAndroid
import com.kyant.backdrop.backdrops.layerBackdrop
import com.kyant.backdrop.backdrops.rememberLayerBackdrop
import org.jetbrains.compose.resources.painterResource
import org.koin.compose.koinInject
import sarashpaz.shared.generated.resources.Res
import sarashpaz.shared.generated.resources.online


@Composable
fun HomeSc(viewModel: HomeViewModel = koinInject()) {
    if (isAndroid()) {
        AndroidUi(viewModel)
    } else {
        WebUi(viewModel)
    }


}
