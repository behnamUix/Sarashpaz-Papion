package com.behnamuix.sarashpaz.features.category.domain.model

import androidx.compose.runtime.Immutable
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Ingredients
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.NutritionInfo
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.RecipeDifficulty
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.RecipeStep
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Spices
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.DrawableResource

data class CategoryRecipe(
    val id: Int,
    val image: DrawableResource,
    val title: String,
    val recipeCount: Int,
    val recipeList: List<RecipeModel>
)

data class RecipeModel(
    val id: Int,

    val image: DrawableResource,
    val title: String,
    val cookingSteps: List<String>,
    val chefName: String,
    // نوع یا سبک آشپزی؛ مثل ایرانی، ایتالیایی یا گیلانی
    val cuisine: String? = null,

    // مدت زمان آماده‌سازی مواد اولیه، برحسب دقیقه
    val preparationTimeMinutes: Int = 0,

    // مدت زمان پخت غذا، برحسب دقیقه
    val cookingTimeMinutes: Int = 0,

    // تعداد نفراتی که این مقدار غذا برای آن‌ها کافی است
    val servings: Int = 2,

    // میزان سختی تهیه غذا؛ آسان، متوسط یا سخت
    val difficulty: RecipeDifficulty = RecipeDifficulty.MEDIUM,




    // اطلاعات ارزش غذایی؛ مثل کالری، پروتئین، چربی و کربوهیدرات
    // علامت ? یعنی این اطلاعات می‌تواند null باشد
    val nutrition: NutritionInfo? = null,

    // برچسب‌های غذا برای جست‌وجو و فیلتر؛ مثل گیاهی، سریع یا مجلسی
    val tags: List<String> = emptyList(),

    // امتیاز غذا؛ مثلاً 4.8 از 5
    // ممکن است غذا هنوز امتیازی نداشته باشد
    val rating: Double? = null,

    // تعداد افرادی که به غذا امتیاز داده‌اند
    val ratingCount: Int = 0,

    // مشخص می‌کند کاربر این غذا را به علاقه‌مندی‌هایش اضافه کرده است یا نه
    val isFavorite: Boolean = false,

    // مشخص می‌کند غذا جزو غذاهای ویژه و منتخب برنامه است یا نه
    val isFeatured: Boolean = false,

    // تاریخ ایجاد دستور پخت؛ به‌صورت رشته، مثلاً "1405-07-21"
    val createdAt: String = "",

    // تاریخ آخرین به‌روزرسانی دستور پخت
    val updatedAt: String = "",
    val ingredients: List<Ingredients>,
    val spices: List<Spices>
)