package com.behnamuix.sarashpaz.features.home.domain.model.recipe


enum class IngredientUnit {
    GRAM,          // گرم
    KILOGRAM,      // کیلوگرم
    MILLIGRAM,     // میلی‌گرم
    LITER,         // لیتر
    MILLILITER,    // میلی‌لیتر
    CUP,           // پیمانه
    TABLESPOON,    // قاشق غذاخوری
    TEASPOON,      // قاشق چای‌خوری
    PIECE,         // عدد
    CLOVE,         // حبه (سیر)
    BUNCH,         // دسته (سبزی)
    PINCH,         // نوک قاشق
    TO_TASTE       // به مقدار لازم
}
data class Ingredients(
    val name: String,

    val quantity: String,//مقدار

    val unit: IngredientUnit
)

data class Spices(
    val name: String,

    val quantity: String="ب",//مقدار

    val unit:IngredientUnit
)

