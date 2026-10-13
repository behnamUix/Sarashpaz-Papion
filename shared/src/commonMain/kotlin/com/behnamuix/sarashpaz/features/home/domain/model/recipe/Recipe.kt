package com.behnamuix.sarashpaz.features.home.domain.model.recipe

data class Recipe(

    // شناسه یکتای هر دستور پخت
    val id: String,

    // نام غذا؛ مثل زرشک پلو با مرغ
    val title: String,

    // توضیحات کوتاه درباره غذا
    val description: String,

    // آدرس تصویر غذا؛ ممکن است تصویر نداشته باشد
    val imageUrl: String? = null,

    // شناسه دسته‌بندی غذا؛ مثل ایرانی، سالاد یا دسر
    val categoryId: String,

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

    // فهرست مواد اولیه موردنیاز برای تهیه غذا
    val ingredients: List<Ingredient>,

    // مراحل تهیه و پخت غذا به ترتیب
    val steps: List<RecipeStep>,

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
    val updatedAt: String = ""

) {

    // زمان کل تهیه غذا؛ مجموع زمان آماده‌سازی و زمان پخت
    // این مقدار محاسبه می‌شود و نیازی به ذخیره جداگانه ندارد
    val totalTimeMinutes: Int
        get() = preparationTimeMinutes + cookingTimeMinutes

}
enum class RecipeDifficulty {
    EASY,
    MEDIUM,
    HARD
}
