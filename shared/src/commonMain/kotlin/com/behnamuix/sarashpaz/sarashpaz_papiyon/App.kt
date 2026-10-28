package com.behnamuix.sarashpaz.sarashpaz_papiyon


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.behnamuix.sarashpaz.core.design.AppTheme
import com.behnamuix.sarashpaz.core.design.LogoFont
import com.behnamuix.sarashpaz.core.navigation.CategoryScreenRoute
import com.behnamuix.sarashpaz.core.navigation.GalleryScreenRoute
import com.behnamuix.sarashpaz.core.navigation.HomeScreenRoute
import com.behnamuix.sarashpaz.core.navigation.ProfileScreenRoute
import com.behnamuix.sarashpaz.core.navigation.bottomNav.BottomNavigationBar
import com.behnamuix.sarashpaz.core.navigation.SarashpazNavigation
import com.behnamuix.sarashpaz.core.utils.CheckUiVersion
import org.jetbrains.compose.resources.painterResource
import sarashpaz.shared.generated.resources.Res
import sarashpaz.shared.generated.resources.notif_icon
import sarashpaz.shared.generated.resources.search_icon
import sarashpaz.shared.generated.resources.chef
import sarashpaz.shared.generated.resources.logo

@Composable

fun App(onNavHostReady: suspend (NavHostController) -> Unit = {}) {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    var selectedItem by remember {
        mutableStateOf("home")
    }

    AppTheme {
        Scaffold(
            containerColor = Color.Transparent,
            topBar = {
                CompositionLocalProvider(
                    LocalLayoutDirection provides LayoutDirection.Rtl
                ) {
                    BoxWithConstraints(Modifier.fillMaxWidth().padding(12.dp)) {
                        CheckUiVersion(
                            max = maxWidth,
                            webContent = {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                                ) {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        56.dp

                                        Text(
                                            "سرآشپز پاپیون",
                                            fontFamily = LogoFont(),
                                            fontSize = 16.sp
                                        )
                                        Image(
                                            modifier = Modifier.size(52.dp),
                                            painter = painterResource(Res.drawable.logo),
                                            contentDescription = ""
                                        )
                                    }


                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(24.dp)
                                    ) {
                                        NavbarItem(
                                            title = "خانه",
                                            itemId = "home",
                                            selectedItem = selectedItem
                                        ) { item ->
                                            selectedItem = item

                                            navController.navigate(HomeScreenRoute) {
                                                launchSingleTop = true
                                            }
                                        }
                                        NavbarItem(
                                            title = "دسته‌بندی",
                                            itemId = "category",
                                            selectedItem = selectedItem
                                        ) { item ->
                                            selectedItem = item

                                            navController.navigate(CategoryScreenRoute) {
                                                launchSingleTop = true
                                            }
                                        }
                                        NavbarItem(
                                            title = "گالری",
                                            itemId = "gallery",
                                            selectedItem = selectedItem
                                        ) { item ->
                                            selectedItem = item

                                            navController.navigate(GalleryScreenRoute) {
                                                launchSingleTop = true
                                            }
                                        }
                                        NavbarItem(
                                            title = "پروفایل",
                                            itemId = "profile",
                                            selectedItem = selectedItem
                                        ) { item ->
                                            selectedItem = item

                                            navController.navigate(ProfileScreenRoute) {
                                                launchSingleTop = true
                                            }
                                        }

                                    }
                                    Spacer(Modifier.weight(1f))
                                    Button(
                                        modifier = Modifier.padding(end = 24.dp),
                                        contentPadding = PaddingValues(horizontal = 36.dp),
                                        onClick = {

                                        },
                                        shape = RoundedCornerShape(12.dp),
                                        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.secondary)
                                    ) {
                                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                                            Text(
                                                "چی بپزم؟",
                                                style = MaterialTheme.typography.labelSmall
                                            )
                                            Icon(
                                                modifier = Modifier.size(22.dp),
                                                painter = painterResource(Res.drawable.chef),
                                                contentDescription = ""
                                            )
                                        }
                                    }
                                    WebSearchField(
                                        modifier = Modifier.width(320.dp),
                                        onSearch = { query ->
                                            // TODO: جست‌وجوی غذاها
                                        }
                                    )

                                }
                            },
                            androidContent = {
                                CenterAlignedTopAppBar(
                                    modifier = Modifier.padding(8.dp),
                                    title = {

                                    },
                                    navigationIcon = {
                                        Row(verticalAlignment = Alignment.CenterVertically) {

                                            Text(
                                                "سرآشپز پاپیون",
                                                fontFamily = LogoFont(),
                                                fontSize = 16.sp
                                            )
                                            Image(
                                                modifier = Modifier.size(52.dp),
                                                painter = painterResource(Res.drawable.logo),
                                                contentDescription = ""
                                            )
                                        }

                                    },

                                    actions = {
                                        Row(
                                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                                            verticalAlignment = Alignment.CenterVertically

                                        ) {
                                            Row(
                                                horizontalArrangement = Arrangement.spacedBy(12.dp),
                                                verticalAlignment = Alignment.CenterVertically
                                            ) {
                                                Button(
                                                    modifier = Modifier.padding(end = 24.dp),
                                                    contentPadding = PaddingValues(horizontal = 36.dp),
                                                    onClick = {

                                                    },
                                                    shape = RoundedCornerShape(12.dp),
                                                    colors = ButtonDefaults.buttonColors(
                                                        MaterialTheme.colorScheme.secondary
                                                    )
                                                ) {
                                                    Row(
                                                        horizontalArrangement = Arrangement.spacedBy(
                                                            4.dp
                                                        )
                                                    ) {
                                                        Text(
                                                            "چی بپزم؟",
                                                            style = MaterialTheme.typography.labelSmall
                                                        )
                                                        Icon(
                                                            modifier = Modifier.size(22.dp),
                                                            painter = painterResource(Res.drawable.chef),
                                                            contentDescription = ""
                                                        )
                                                    }
                                                }


                                            }
                                            Icon(
                                                painter = painterResource(Res.drawable.notif_icon),
                                                contentDescription = ""
                                            )
                                            Icon(
                                                painter = painterResource(Res.drawable.search_icon),
                                                contentDescription = ""
                                            )
                                        }

                                    }
                                )
                            })
                    }
                }

            },
            bottomBar = {
                CompositionLocalProvider(
                    LocalLayoutDirection provides LayoutDirection.Rtl
                ) {
                    BoxWithConstraints {
                        CheckUiVersion(
                            max = maxWidth,
                            webContent = {},
                            androidContent = {
                                BottomNavigationBar(navController)

                            })
                    }


                }

            }
        ) {
            Box(
                Modifier.padding(it).fillMaxSize()
                    .background(MaterialTheme.colorScheme.background)
            ) {
                CompositionLocalProvider(
                    LocalLayoutDirection provides LayoutDirection.Rtl
                ) {
                    SarashpazNavigation(navController)
                }
            }

        }

    }
}


@Composable
fun NavbarItem(
    title: String,
    itemId: String,
    selectedItem: String,
    onClick: (String) -> Unit
) {
    val isSelected = selectedItem == itemId
    val lineWidth by animateDpAsState(
        targetValue = if (isSelected) 24.dp else 0.dp,
        animationSpec = tween(500)
    )
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.clickable {
            onClick(itemId)
        }
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(Modifier.height(4.dp))
        Box(

            modifier = Modifier
                .clip(CircleShape)
                .width(lineWidth)
                .height(2.dp)
                .background(MaterialTheme.colorScheme.primary)
        )
    }
}

@Composable
fun WebSearchField(
    modifier: Modifier = Modifier,
    onSearch: (String) -> Unit = {}
) {
    var query by remember { mutableStateOf("") }
    var isFocused by remember { mutableStateOf(false) }

    val borderColor = if (isFocused) {
        Color.Black.copy(0.5f)
    } else {
        Color(0xFFE4E7E1)
    }

    CompositionLocalProvider(
        LocalLayoutDirection provides LayoutDirection.Rtl
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(54.dp)
                .border(
                    width = if (isFocused) 1.5.dp else 1.dp,
                    color = borderColor,
                    shape = RoundedCornerShape(16.dp)
                )
                .background(
                    color = Color(0xFFFCFDFB),
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(Res.drawable.search_icon),
                contentDescription = "جست‌وجو",
                modifier = Modifier.size(21.dp)
            )

            Spacer(Modifier.width(12.dp))

            BasicTextField(
                value = query,
                onValueChange = { query = it },
                modifier = Modifier
                    .weight(1f)
                    .onFocusChanged { isFocused = it.isFocused },
                singleLine = true,
                textStyle = TextStyle(
                    fontSize = 14.sp,
                    color = Color(0xFF292D26),
                    textAlign = TextAlign.Start
                ),
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Search
                ),
                keyboardActions = KeyboardActions(
                    onSearch = { onSearch(query) }
                ),
                decorationBox = { innerTextField ->
                    Box {
                        if (query.isEmpty()) {
                            Text(
                                text = "دنبال چه غذایی می‌گردی؟",
                                fontSize = 14.sp,
                                color = Color(0xFF999F95)
                            )
                        }
                        innerTextField()
                    }
                }
            )
        }
    }
}