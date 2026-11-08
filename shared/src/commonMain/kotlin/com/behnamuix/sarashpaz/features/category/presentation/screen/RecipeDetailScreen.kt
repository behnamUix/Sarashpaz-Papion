package com.behnamuix.sarashpaz.features.category.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.behnamuix.sarashpaz.features.category.presentation.screen.android.AndroidDetailSc
import com.behnamuix.sarashpaz.features.category.presentation.screen.web.WebDetailSc
import com.behnamuix.sarashpaz.isAndroid

@Composable
fun RecipeDetail(

    id: Int,
    title: String
) {

    Box(Modifier.fillMaxSize()) {
        if(isAndroid()){
            AndroidDetailSc(id=id,title=title)
        }else{
            WebDetailSc(id=id,title=title)
        }
    }


}