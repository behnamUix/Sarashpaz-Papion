package com.behnamuix.sarashpaz.features.home.presentation.screen.comp.utils



import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

class InvertedCornerShape(
    private val cornerRadius: Dp = 18.dp
) : Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val radius = with(density) {
            cornerRadius.toPx()
        }.coerceAtMost(size.minDimension / 2f)

        val path = Path().apply {
            // گوشه بالا
            moveTo(radius, 0f)
            lineTo(size.width - radius, 0f)
            quadraticTo(
                size.width - radius,
                radius,
                size.width,
                radius
            )

            // گوشه پایین سمت راست
            lineTo(size.width, size.height - radius)
            quadraticTo(
                size.width - radius,
                size.height - radius,
                size.width - radius,
                size.height
            )

            // گوشه پایین سمت چپ
            lineTo(radius, size.height)
            quadraticTo(
                radius,
                size.height - radius,
                0f,
                size.height - radius
            )

            // گوشه بالا سمت چپ
            lineTo(0f, radius)
            quadraticTo(
                radius,
                radius,
                radius,
                0f
            )

            close()
        }

        return Outline.Generic(path)
    }
}
