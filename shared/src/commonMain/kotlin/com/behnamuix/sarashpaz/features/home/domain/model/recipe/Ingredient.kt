package com.behnamuix.sarashpaz.features.home.domain.model.recipe

import kotlinx.serialization.Serializable


enum class IngredientUnit {
    GRAM,          // گرم
    KILOGRAM,      // کیلوگرم
    MILLIGRAM,     // میلی‌گرم
    LITER,         // لیتر
    MILLILITER,    // میلی‌لیتر
    CUP,
    STALK,
    QUARTER_CUP,// پیمانه
    TABLESPOON,    // قاشق غذاخوری
    TEASPOON,      // قاشق چای‌خوری
    PIECE,         // عدد
    CLOVE,         // حبه (سیر)
    BUNCH,         // دسته (سبزی)
    PINCH,// نوک قاشق
    CAN,
    LEAF,
    SHOT,
    PACK,
    TO_TASTE  ,     // به مقدار لازم
}
@Serializable
data class Ingredients(
    val name: String,

    val quantity: String,//مقدار

    val unit: IngredientUnit
)
@Serializable
data class Spices(
    val name: String,

    val quantity: String="ب",//مقدار

    val unit:IngredientUnit
)

