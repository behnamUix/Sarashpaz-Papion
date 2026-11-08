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
val ingredientUnitFa = mapOf(
    IngredientUnit.GRAM to "گرم",
    IngredientUnit.KILOGRAM to "کیلوگرم",
    IngredientUnit.MILLIGRAM to "میلی‌گرم",
    IngredientUnit.LITER to "لیتر",
    IngredientUnit.MILLILITER to "میلی‌لیتر",
    IngredientUnit.CUP to "پیمانه",
    IngredientUnit.STALK to "ساقه",
    IngredientUnit.QUARTER_CUP to "یک‌چهارم پیمانه",
    IngredientUnit.TABLESPOON to "قاشق غذاخوری",
    IngredientUnit.TEASPOON to "قاشق چای‌خوری",
    IngredientUnit.PIECE to "عدد",
    IngredientUnit.CLOVE to "حبه",
    IngredientUnit.BUNCH to "دسته",
    IngredientUnit.PINCH to "نوک قاشق",
    IngredientUnit.CAN to "قوطی",
    IngredientUnit.LEAF to "برگ",
    IngredientUnit.SHOT to "شات",
    IngredientUnit.PACK to "بسته",
    IngredientUnit.TO_TASTE to "به مقدار لازم"
)
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

