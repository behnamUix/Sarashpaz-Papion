package com.behnamuix.sarashpaz.features.category.data.datasource.fakeData

import com.behnamuix.sarashpaz.features.category.domain.model.CategoryRecipe
import com.behnamuix.sarashpaz.features.category.domain.model.RecipeModel
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.IngredientUnit
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Ingredients
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.NutritionInfo
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.RecipeDifficulty
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.RecipeStep
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Spices
import org.jetbrains.compose.resources.DrawableResource
import sarashpaz.shared.generated.resources.Res
import sarashpaz.shared.generated.resources.food1
import sarashpaz.shared.generated.resources.food2
import sarashpaz.shared.generated.resources.food3
import sarashpaz.shared.generated.resources.food4
import sarashpaz.shared.generated.resources.food5
import sarashpaz.shared.generated.resources.food6
import kotlin.String


object FakeCategoryData {

    // برای جلوگیری از تکرار کد در ساخت آیتم‌های غذا
    private fun recipe(
        id: Int,
        image: DrawableResource,
        title: String,
        cookingSteps: List<String>,
        chefName: String,
        cuisine: String? = null,
        preparationTimeMinutes: Int = 0,
        cookingTimeMinutes: Int = 0,
        servings: Int = 2,
        difficulty: RecipeDifficulty = RecipeDifficulty.MEDIUM,

        nutrition: NutritionInfo? = null,
        tags: List<String> = emptyList(),
        rating: Double? = null,
        ratingCount: Int = 0,
        isFavorite: Boolean = false,
        isFeatured: Boolean = false,
        createdAt: String = "",
        updatedAt: String = "",
        ingredients: List<Ingredients>,
        spices: List<Spices>
    ) = RecipeModel(
        id = id,
        image = image,
        title = title,
        cookingSteps = cookingSteps,
        chefName = chefName,
        cuisine = cuisine,
        preparationTimeMinutes = preparationTimeMinutes,
        cookingTimeMinutes = cookingTimeMinutes,
        servings = servings,
        difficulty = difficulty,
        nutrition = nutrition,
        tags = tags,
        rating = rating,
        ratingCount = ratingCount,
        isFavorite = isFavorite,
        isFeatured = isFeatured,
        createdAt = createdAt,
        updatedAt = updatedAt,
        ingredients = ingredients,
        spices = spices
    )

    val allRecipe=listOf(

        recipe(
            id = 1,
            image = Res.drawable.food1,
            title = "سالاد سزار",
            chefName = "ترانه شریفی",
            cuisine = "ایتالیایی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 15,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "سینه مرغ را با نمک، فلفل سیاه و کمی روغن زیتون مزه‌دار کنید.",
                "مرغ را در تابه گریل کنید تا کاملاً مغزپخت و طلایی شود.",
                "نان تست را به شکل مکعبی خرد کنید و با روغن زیتون و پودر سیر تفت دهید تا ترد و طلایی شود.",
                "کاهوی تازه را بشویید، خشک کنید و به قطعات متوسط تقسیم کنید.",
                "برای تهیه سس، مایونز، آبلیمو، سیر رنده‌شده، خردل و پنیر پارمزان را مخلوط کنید.",
                "مرغ گریل‌شده را به برش‌های باریک تقسیم کنید.",
                "کاهو را در ظرف سرو قرار دهید و مرغ و نان تست را روی آن اضافه کنید.",
                "سس سزار را روی مواد بریزید و با پنیر پارمزان تزئین کنید.",
                "سالاد را بلافاصله پس از آماده‌سازی سرو کنید تا نان تست ترد باقی بماند."
            ),

            nutrition = NutritionInfo(
                calories = 420,
                proteinGrams = 32.0,
                carbohydratesGrams = 22.0,
                fatGrams = 23.0
            ),

            tags = listOf(
                "سالاد",
                "غذای بین‌المللی",
                "ایتالیایی",
                "مرغ",
                "پروتئین بالا",
                "ناهار",
                "شام"
            ),

            rating = 4.8,
            ratingCount = 126,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("سینه مرغ", "300", IngredientUnit.GRAM),
                Ingredients("کاهو", "1", IngredientUnit.PIECE),
                Ingredients("نان تست", "3", IngredientUnit.PIECE),
                Ingredients("پنیر پارمزان", "50", IngredientUnit.GRAM),
                Ingredients("مایونز", "3", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن زیتون", "2", IngredientUnit.TABLESPOON),
                Ingredients("سیر", "2", IngredientUnit.PIECE),
                Ingredients("سس خردل", "1", IngredientUnit.TEASPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 2,
            image = Res.drawable.food2,
            title = "سالاد الویه",
            chefName = "مریم احمدی",
            cuisine = "روسی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 35,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "سیب‌زمینی‌ها را با پوست در آب جوش بپزید تا کاملاً نرم شوند.",
                "تخم‌مرغ‌ها را به مدت 10 تا 12 دقیقه آب‌پز کنید تا سفت شوند.",
                "سینه مرغ را همراه پیاز، مقداری نمک و آب در قابلمه بپزید تا کاملاً مغزپخت شود.",
                "نخودفرنگی را در آب جوش بپزید یا از نخودفرنگی پخته استفاده کنید.",
                "پس از خنک شدن مواد، سیب‌زمینی و تخم‌مرغ‌ها را پوست بگیرید.",
                "سینه مرغ، سیب‌زمینی، تخم‌مرغ و خیارشور را به قطعات ریز و یکدست خرد کنید.",
                "تمام مواد خردشده را همراه نخودفرنگی در یک ظرف بزرگ بریزید.",
                "سس مایونز، آبلیمو، نمک و فلفل سیاه را اضافه کنید و مواد را به‌آرامی مخلوط کنید.",
                "ظرف سالاد را بپوشانید و حداقل یک ساعت در یخچال قرار دهید تا مواد کاملاً مزه‌دار شوند.",
                "سالاد الویه را در ظرف سرو بریزید و در صورت تمایل با خیارشور و نخودفرنگی تزئین کنید."
            ),

            nutrition = NutritionInfo(
                calories = 385,
                proteinGrams = 21.0,
                carbohydratesGrams = 28.0,
                fatGrams = 21.0
            ),

            tags = listOf(
                "سالاد",
                "غذای سرد",
                "غذای بین‌المللی",
                "مرغ",
                "سیب‌زمینی",
                "مناسب مهمانی",
                "ناهار",
                "شام",
                "ساندویچ"
            ),

            rating = 4.7,
            ratingCount = 98,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("سیب‌زمینی", "4", IngredientUnit.PIECE),
                Ingredients("سینه مرغ", "250", IngredientUnit.GRAM),
                Ingredients("تخم‌مرغ", "3", IngredientUnit.PIECE),
                Ingredients("خیارشور", "150", IngredientUnit.GRAM),
                Ingredients("نخودفرنگی", "100", IngredientUnit.GRAM),
                Ingredients("سس مایونز", "5", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON),
                Ingredients("پیاز", "1", IngredientUnit.PIECE)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 3,
            image = Res.drawable.food3,
            title = "سالاد شیرازی",
            chefName = "امیرحسین کاظمی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 0,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "خیارها را بشویید و در صورت تمایل پوست آن‌ها را بگیرید.",
                "خیارها را به صورت نگینی بسیار ریز و یکدست خرد کنید.",
                "گوجه‌فرنگی‌های تازه و سفت را به اندازه خیارها نگینی خرد کنید.",
                "پیاز را پوست بگیرید و به قطعات بسیار ریز خرد کنید.",
                "تمام سبزیجات خردشده را در یک کاسه مناسب بریزید و مخلوط کنید.",
                "آبغوره و آبلیموی تازه را به سبزیجات اضافه کنید.",
                "نعناع خشک، نمک و فلفل سیاه را اضافه کرده و مواد را به‌آرامی هم بزنید.",
                "سالاد را حدود 15 دقیقه در یخچال قرار دهید تا طعم مواد با یکدیگر ترکیب شود.",
                "سالاد شیرازی را خنک و تازه در کنار غذاهایی مانند کباب، پلو و خورشت سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 45,
                proteinGrams = 1.5,
                carbohydratesGrams = 9.0,
                fatGrams = 0.4
            ),

            tags = listOf(
                "سالاد",
                "غذای سنتی",
                "ایرانی",
                "شیرازی",
                "گیاهی",
                "وگان",
                "کم‌کالری",
                "رژیمی",
                "بدون پخت",
                "پیش‌غذا"
            ),

            rating = 4.9,
            ratingCount = 214,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("خیار", "3", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "3", IngredientUnit.PIECE),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("آبغوره", "3", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON),
                Ingredients("نعناع خشک", "1", IngredientUnit.TEASPOON)
            ),

            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 4,
            image = Res.drawable.food4,
            title = "سالاد ماکارونی",
            chefName = "آرمان صادقی",
            cuisine = "ایتالیایی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 10,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "یک قابلمه آب را به جوش آورده و مقداری نمک به آن اضافه کنید.",
                "ماکارونی فرمی را داخل آب جوش بریزید و مطابق زمان درج‌شده روی بسته‌بندی بپزید تا نرم شود اما شکل خود را حفظ کند.",
                "ماکارونی را آبکش کنید و با آب سرد بشویید تا فرایند پخت متوقف شود.",
                "کالباس، خیارشور و فلفل دلمه‌ای را به قطعات نگینی کوچک خرد کنید.",
                "ذرت و نخودفرنگی را در صورت خام بودن جداگانه بپزید و اجازه دهید خنک شوند.",
                "ماکارونی خنک‌شده را همراه کالباس، خیارشور، فلفل دلمه‌ای، ذرت و نخودفرنگی در ظرف بزرگی بریزید.",
                "سس مایونز، ماست، آبلیمو، نمک، فلفل سیاه و آویشن را در ظرفی جداگانه مخلوط کنید.",
                "سس آماده‌شده را به مواد سالاد اضافه کنید و به‌آرامی هم بزنید تا تمام مواد به سس آغشته شوند.",
                "روی ظرف را بپوشانید و سالاد را حداقل یک ساعت در یخچال قرار دهید تا کاملاً خنک و مزه‌دار شود.",
                "سالاد ماکارونی را در ظرف سرو بریزید و در صورت تمایل با ذرت و فلفل دلمه‌ای تزئین کنید."
            ),

            nutrition = NutritionInfo(
                calories = 385,
                proteinGrams = 13.0,
                carbohydratesGrams = 42.0,
                fatGrams = 19.0
            ),

            tags = listOf(
                "سالاد",
                "غذای سرد",
                "غذای بین‌المللی",
                "ماکارونی",
                "فست فود",
                "مناسب مهمانی",
                "ناهار",
                "شام",
                "غذای سریع"
            ),

            rating = 4.7,
            ratingCount = 156,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("ماکارونی فرمی", "300", IngredientUnit.GRAM),
                Ingredients("کالباس", "150", IngredientUnit.GRAM),
                Ingredients("خیارشور", "100", IngredientUnit.GRAM),
                Ingredients("ذرت", "100", IngredientUnit.GRAM),
                Ingredients("نخودفرنگی", "80", IngredientUnit.GRAM),
                Ingredients("فلفل دلمه‌ای", "1", IngredientUnit.PIECE),
                Ingredients("سس مایونز", "4", IngredientUnit.TABLESPOON),
                Ingredients("ماست", "2", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("آویشن", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 5,
            image = Res.drawable.food5,
            title = "سالاد یونانی",
            chefName = "پارسا نیک‌روش",
            cuisine = "یونانی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 0,
            servings = 3,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "خیارها را بشویید و به قطعات متوسط و نسبتاً درشت خرد کنید.",
                "گوجه‌فرنگی‌ها را به صورت قاچ‌های متوسط برش دهید تا آب و بافت آن‌ها حفظ شود.",
                "پیاز قرمز را پوست بگیرید و به حلقه‌های نازک برش دهید.",
                "فلفل دلمه‌ای سبز را بشویید، دانه‌های آن را جدا کنید و به قطعات متوسط خرد کنید.",
                "خیار، گوجه‌فرنگی، پیاز قرمز و فلفل دلمه‌ای را در ظرف سالاد بریزید.",
                "زیتون سیاه را به سبزیجات اضافه کنید و مواد را به‌آرامی مخلوط کنید.",
                "روغن زیتون، آبلیمو، پونه کوهی، نمک و فلفل سیاه را در ظرف کوچکی ترکیب کنید.",
                "سس آماده‌شده را روی سبزیجات بریزید تا تمام مواد به آن آغشته شوند.",
                "پنیر فتا را به قطعات مکعبی تقسیم کنید و روی سالاد قرار دهید.",
                "در صورت تمایل کمی پونه کوهی و روغن زیتون روی پنیر بریزید و سالاد را تازه سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 245,
                proteinGrams = 8.0,
                carbohydratesGrams = 12.0,
                fatGrams = 19.0
            ),

            tags = listOf(
                "سالاد",
                "غذای بین‌المللی",
                "یونانی",
                "مدیترانه‌ای",
                "گیاهی",
                "بدون پخت",
                "پنیر فتا",
                "زیتون",
                "کم‌کربوهیدرات",
                "پیش‌غذا"
            ),

            rating = 4.8,
            ratingCount = 183,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("خیار", "2", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "3", IngredientUnit.PIECE),
                Ingredients("پیاز قرمز", "1", IngredientUnit.PIECE),
                Ingredients("فلفل دلمه‌ای سبز", "1", IngredientUnit.PIECE),
                Ingredients("زیتون سیاه", "80", IngredientUnit.GRAM),
                Ingredients("پنیر فتا", "150", IngredientUnit.GRAM),
                Ingredients("روغن زیتون", "3", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON),
                Spices("پونه کوهی", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 6,
            image = Res.drawable.food6,
            title = "سالاد فصل",
            chefName = "ترانه شریفی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 0,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "ابتدا کاهو را برگ‌برگ کنید، با آب سرد بشویید و اجازه دهید کاملاً خشک شود.",
                "خیارها را شسته و به صورت حلقه‌ای یا نیم‌حلقه‌ای با ضخامت متوسط خرد کنید.",
                "گوجه‌فرنگی‌ها را شسته و به قطعات متوسط برش دهید.",
                "هویج‌ها را پوست بگیرید و با رنده درشت رنده کنید.",
                "کلم سفید را به صورت رشته‌های باریک و یکدست خرد کنید.",
                "کاهو، خیار، گوجه‌فرنگی، هویج و کلم سفید را در ظرف بزرگی با یکدیگر ترکیب کنید.",
                "برای تهیه سس، آبلیمو و روغن زیتون را در ظرف کوچکی بریزید.",
                "نمک و فلفل سیاه را به سس اضافه کرده و مواد را خوب هم بزنید.",
                "سبزیجات را به شکل دلخواه در ظرف سرو بچینید.",
                "سس را درست هنگام سرو روی سالاد بریزید تا سبزیجات تازگی و تردی خود را حفظ کنند."
            ),

            nutrition = NutritionInfo(
                calories = 115,
                proteinGrams = 3.0,
                carbohydratesGrams = 14.0,
                fatGrams = 6.0
            ),

            tags = listOf(
                "سالاد",
                "غذای ایرانی",
                "سالاد سبزیجات",
                "گیاهی",
                "رژیمی",
                "کم‌کالری",
                "بدون پخت",
                "سالم",
                "وگان",
                "پیش‌غذا"
            ),

            rating = 4.7,
            ratingCount = 214,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("کاهو", "1", IngredientUnit.PIECE),
                Ingredients("خیار", "2", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "2", IngredientUnit.PIECE),
                Ingredients("هویج", "2", IngredientUnit.PIECE),
                Ingredients("کلم سفید", "100", IngredientUnit.GRAM),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن زیتون", "2", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 7,
            image = Res.drawable.food1,
            title = "سالاد کلم",
            chefName = "مریم احمدی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 0,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "کلم سفید را برگ‌برگ کرده و پس از شست‌وشو به صورت رشته‌های بسیار نازک خرد کنید.",
                "هویج‌ها را پوست بگیرید و با رنده درشت رنده کنید.",
                "کلم خردشده و هویج رنده‌شده را داخل یک کاسه بزرگ بریزید.",
                "برای تهیه سس، سس مایونز و ماست را در ظرف جداگانه‌ای ترکیب کنید.",
                "سرکه سفید را به مخلوط سس اضافه کرده و هم بزنید تا یکدست شود.",
                "شکر، نمک و فلفل سیاه را به سس اضافه کنید و مواد را کاملاً مخلوط کنید.",
                "سس آماده‌شده را به کلم و هویج اضافه کنید.",
                "تمام مواد را به آرامی هم بزنید تا سس به طور یکنواخت با سبزیجات ترکیب شود.",
                "روی ظرف را بپوشانید و سالاد را حدود ۳۰ تا ۴۵ دقیقه در یخچال قرار دهید.",
                "پس از خنک شدن، سالاد کلم را در ظرف مناسب بریزید و سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 185,
                proteinGrams = 3.0,
                carbohydratesGrams = 15.0,
                fatGrams = 13.0
            ),

            tags = listOf(
                "سالاد",
                "سالاد کلم",
                "غذای بین‌المللی",
                "پیش‌غذا",
                "سالاد سرد",
                "گیاهی",
                "آسان",
                "خانگی",
                "مناسب مهمانی",
                "سس مایونز"
            ),

            rating = 4.8,
            ratingCount = 176,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("کلم سفید", "400", IngredientUnit.GRAM),
                Ingredients("هویج", "2", IngredientUnit.PIECE),
                Ingredients("سس مایونز", "3", IngredientUnit.TABLESPOON),
                Ingredients("ماست", "2", IngredientUnit.TABLESPOON),
                Ingredients("سرکه سفید", "2", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "1", IngredientUnit.TEASPOON)
            ),

            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 8,
            image = Res.drawable.food2,
            title = "سالاد تن ماهی",
            chefName = "سارا محمدی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 25,
            servings = 3,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "ابتدا قوطی تن ماهی را طبق دستور روی بسته‌بندی به مدت ۲۰ دقیقه در آب جوش قرار دهید.",
                "سیب‌زمینی‌ها را بشویید و همراه آب در قابلمه بپزید تا کاملاً نرم شوند.",
                "پس از خنک شدن سیب‌زمینی‌ها، پوست آن‌ها را جدا کرده و به مکعب‌های متوسط خرد کنید.",
                "خیارشورها را به صورت نگینی خرد کنید.",
                "پیاز را پوست گرفته و به قطعات بسیار ریز خرد کنید.",
                "ذرت و لوبیای قرمز پخته را آماده کرده و در ظرف بزرگی بریزید.",
                "سیب‌زمینی، خیارشور و پیاز خردشده را به مواد اضافه کنید.",
                "پس از خنک شدن تن ماهی، روغن اضافی آن را جدا کرده و گوشت ماهی را با چنگال تکه‌تکه کنید.",
                "تن ماهی را به سایر مواد اضافه کنید.",
                "آبلیمو، نمک، فلفل سیاه و پودر سیر را به مواد اضافه کنید.",
                "روغن زیتون را روی سالاد بریزید و تمام مواد را به آرامی مخلوط کنید تا شکل خود را حفظ کنند.",
                "سالاد را حدود ۲۰ دقیقه در یخچال قرار دهید تا طعم مواد به خوبی ترکیب شود.",
                "سالاد تن ماهی را در ظرف سرو بریزید و در صورت تمایل با جعفری تازه تزئین کنید."
            ),

            nutrition = NutritionInfo(
                calories = 325,
                proteinGrams = 22.0,
                carbohydratesGrams = 32.0,
                fatGrams = 11.0
            ),

            tags = listOf(
                "سالاد",
                "غذای دریایی",
                "تن ماهی",
                "سالاد پروتئینی",
                "غذای بین‌المللی",
                "غذای سریع",
                "سالاد سرد",
                "غذای کامل",
                "مناسب ناهار",
                "غذای خانگی"
            ),

            rating = 4.8,
            ratingCount = 192,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("تن ماهی", "1", IngredientUnit.CAN),
                Ingredients("سیب‌زمینی", "2", IngredientUnit.PIECE),
                Ingredients("خیارشور", "80", IngredientUnit.GRAM),
                Ingredients("ذرت", "80", IngredientUnit.GRAM),
                Ingredients("لوبیا قرمز پخته", "100", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن زیتون", "1", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 9,
            image = Res.drawable.food3,
            title = "سالاد اسفناج",
            chefName = "نگار رضایی",
            cuisine = "مدیترانه‌ای",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 8,
            servings = 3,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "برگ‌های اسفناج تازه را جدا کرده، با آب سرد بشویید و اجازه دهید کاملاً خشک شوند.",
                "قارچ‌ها را تمیز کرده و به صورت ورقه‌های نازک خرد کنید.",
                "یک قاشق روغن زیتون را در تابه گرم کنید.",
                "قارچ‌های خردشده را به تابه اضافه کرده و چند دقیقه تفت دهید تا آب اضافی آن‌ها تبخیر شود.",
                "قارچ‌ها را از روی حرارت بردارید و اجازه دهید کمی خنک شوند.",
                "گردوها را به قطعات کوچک تقسیم کنید.",
                "پنیر فتا را به مکعب‌های متوسط خرد کنید.",
                "برگ‌های اسفناج را در ظرف سرو قرار دهید.",
                "قارچ تفت‌داده‌شده، گردو و پنیر فتا را روی اسفناج پخش کنید.",
                "روغن زیتون باقی‌مانده و سرکه بالزامیک را در ظرف کوچکی مخلوط کنید.",
                "نمک و فلفل سیاه را به سس اضافه کرده و خوب هم بزنید.",
                "سس آماده‌شده را روی سالاد بریزید و به آرامی مخلوط کنید.",
                "سالاد را بلافاصله سرو کنید تا اسفناج تازگی خود را حفظ کند."
            ),

            nutrition = NutritionInfo(
                calories = 285,
                proteinGrams = 10.0,
                carbohydratesGrams = 9.0,
                fatGrams = 24.0
            ),

            tags = listOf(
                "سالاد",
                "سالاد اسفناج",
                "غذای مدیترانه‌ای",
                "گیاهی",
                "پنیر فتا",
                "گردو",
                "اسفناج تازه",
                "آنتی‌اکسیدان",
                "سالم",
                "پیش‌غذا"
            ),

            rating = 4.9,
            ratingCount = 167,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("اسفناج تازه", "250", IngredientUnit.GRAM),
                Ingredients("قارچ", "150", IngredientUnit.GRAM),
                Ingredients("گردو", "50", IngredientUnit.GRAM),
                Ingredients("پنیر فتا", "80", IngredientUnit.GRAM),
                Ingredients("روغن زیتون", "2", IngredientUnit.TABLESPOON),
                Ingredients("سرکه بالزامیک", "2", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 10,
            image = Res.drawable.food4,
            title = "سالاد چغندر",
            chefName = "الناز کریمی",
            cuisine = "مدیترانه‌ای",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 40,
            servings = 3,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "چغندرها را به خوبی بشویید و برگ‌ها و قسمت‌های اضافی آن‌ها را جدا کنید.",
                "چغندرها را همراه آب در قابلمه قرار دهید و روی حرارت متوسط بپزید تا کاملاً نرم شوند.",
                "برای بررسی پخت، یک چنگال در چغندر فرو کنید؛ اگر به راحتی وارد شد، آماده است.",
                "چغندرهای پخته را از آب خارج کنید و اجازه دهید کاملاً خنک شوند.",
                "پوست چغندرها را جدا کرده و آن‌ها را به صورت ورقه‌ای یا مکعبی خرد کنید.",
                "پنیر فتا را به قطعات مکعبی متوسط تقسیم کنید.",
                "گردوها را به قطعات کوچک خرد کنید تا در سالاد به خوبی پخش شوند.",
                "چغندر خردشده را در ظرف سرو بچینید.",
                "پنیر فتا و گردو را روی چغندرها اضافه کنید.",
                "روغن زیتون و سرکه بالزامیک را در ظرف کوچکی مخلوط کنید.",
                "نمک، فلفل سیاه و آویشن را به سس اضافه کرده و هم بزنید.",
                "سس آماده‌شده را به صورت یکنواخت روی مواد سالاد بریزید.",
                "سالاد را حدود ۱۵ دقیقه در یخچال قرار دهید تا طعم مواد ترکیب شود.",
                "سالاد چغندر را به صورت خنک سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 235,
                proteinGrams = 8.0,
                carbohydratesGrams = 19.0,
                fatGrams = 15.0
            ),

            tags = listOf(
                "سالاد",
                "سالاد چغندر",
                "غذای مدیترانه‌ای",
                "گیاهی",
                "پنیر فتا",
                "گردو",
                "چغندر",
                "آنتی‌اکسیدان",
                "سالاد سرد",
                "پیش‌غذا"
            ),

            rating = 4.8,
            ratingCount = 145,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("چغندر", "3", IngredientUnit.PIECE),
                Ingredients("پنیر فتا", "100", IngredientUnit.GRAM),
                Ingredients("گردو", "40", IngredientUnit.GRAM),
                Ingredients("روغن زیتون", "2", IngredientUnit.TABLESPOON),
                Ingredients("سرکه بالزامیک", "2", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON),
                Spices("آویشن", "0.5", IngredientUnit.TEASPOON)
            )
        ),
        recipe(
            id = 11,
            image = Res.drawable.food5,
            title = "سالاد اندونزی",
            chefName = "مریم احمدی",
            cuisine = "اندونزیایی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 10,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "کلم سفید و کلم بنفش را به صورت رشته‌های باریک خرد کنید.",
                "هویج‌ها را پوست بگیرید و با رنده درشت رنده کنید.",
                "خیارشور و ژامبون را به صورت نگینی خرد کنید.",
                "ذرت و نخودفرنگی را در صورت نیاز بپزید و اجازه دهید خنک شوند.",
                "تمام مواد خردشده را در یک کاسه بزرگ بریزید و به آرامی مخلوط کنید.",
                "سس مایونز، ماست و آبلیمو را در ظرفی جداگانه ترکیب کنید تا یکدست شود.",
                "نمک و فلفل سیاه را به سس اضافه کنید و هم بزنید.",
                "سس را به مواد سالاد اضافه کنید و همه مواد را به خوبی مخلوط کنید.",
                "سالاد را حداقل ۳۰ دقیقه در یخچال قرار دهید تا طعم‌ها به خورد هم بروند.",
                "سالاد اندونزی را سرد و تازه سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 285,
                proteinGrams = 10.5,
                carbohydratesGrams = 22.0,
                fatGrams = 17.0
            ),

            tags = listOf("سالاد", "سالاد اندونزی", "پیش‌غذا", "غذای سرد", "مجلسی"),

            rating = 4.8,
            ratingCount = 216,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("کلم سفید", "200", IngredientUnit.GRAM),
                Ingredients("کلم بنفش", "100", IngredientUnit.GRAM),
                Ingredients("هویج", "2", IngredientUnit.PIECE),
                Ingredients("خیارشور", "100", IngredientUnit.GRAM),
                Ingredients("ژامبون", "100", IngredientUnit.GRAM),
                Ingredients("ذرت", "100", IngredientUnit.GRAM),
                Ingredients("نخودفرنگی", "80", IngredientUnit.GRAM),
                Ingredients("سس مایونز", "4", IngredientUnit.TABLESPOON),
                Ingredients("ماست", "2", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 12,
            image = Res.drawable.food6,
            title = "سالاد مرغ گریل",
            chefName = "سارا محمدی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 15,
            servings = 2,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "سینه مرغ را به صورت ورقه‌ای برش دهید.",
                "روغن زیتون، آبلیمو، نمک، فلفل سیاه، پاپریکا و پودر سیر را در ظرفی مخلوط کنید.",
                "مرغ را به مواد مزه‌دارکننده آغشته کنید و حداقل ۱۵ دقیقه در یخچال استراحت دهید.",
                "تابه گریل را گرم کنید و مرغ را از هر طرف بپزید تا کاملاً مغزپخت و طلایی شود.",
                "مرغ گریل‌شده را از تابه خارج کنید و چند دقیقه استراحت دهید.",
                "کاهو را بشویید، خشک کنید و به اندازه دلخواه خرد کنید.",
                "خیار را حلقه‌ای یا نیم‌حلقه‌ای برش دهید.",
                "گوجه‌های گیلاسی را از وسط نصف کنید.",
                "ذرت پخته و خنک‌شده را به سبزیجات اضافه کنید.",
                "مرغ را به صورت نوارهای باریک برش دهید.",
                "کاهو، خیار، گوجه و ذرت را در ظرف سرو بچینید و مرغ را روی آن قرار دهید.",
                "در صورت تمایل سس دلخواه را اضافه کنید و سالاد را سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 365,
                proteinGrams = 35.0,
                carbohydratesGrams = 18.0,
                fatGrams = 17.0
            ),

            tags = listOf("سالاد", "مرغ گریل", "پروتئینی", "غذای سالم", "رژیمی"),

            rating = 4.9,
            ratingCount = 248,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("سینه مرغ", "250", IngredientUnit.GRAM),
                Ingredients("کاهو", "150", IngredientUnit.GRAM),
                Ingredients("خیار", "1", IngredientUnit.PIECE),
                Ingredients("گوجه گیلاسی", "100", IngredientUnit.GRAM),
                Ingredients("ذرت", "80", IngredientUnit.GRAM),
                Ingredients("روغن زیتون", "2", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "1", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 13,
            image = Res.drawable.food1,
            title = "سالاد آووکادو",
            chefName = "نگار رضایی",
            cuisine = "مدیترانه‌ای",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 0,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "آووکادوها را از وسط نصف کنید و هسته آن‌ها را خارج کنید.",
                "گوشت آووکادو را با قاشق جدا کرده و به مکعب‌های متوسط خرد کنید.",
                "خیار را بشویید و به قطعات کوچک خرد کنید.",
                "گوجه‌فرنگی‌ها را به صورت مکعبی برش دهید.",
                "پیاز قرمز را به صورت خلالی نازک خرد کنید.",
                "برگ‌های کاهو را بشویید، خشک کنید و در ظرف سرو قرار دهید.",
                "آووکادو، خیار، گوجه‌فرنگی و پیاز را روی کاهو بریزید.",
                "آبلیمو و روغن زیتون را در ظرف کوچکی مخلوط کنید.",
                "نمک، فلفل سیاه و پودر چیلی را به سس اضافه کنید.",
                "سس را روی مواد سالاد بریزید و به آرامی مخلوط کنید تا آووکادو له نشود.",
                "سالاد را بلافاصله و به صورت تازه سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 320,
                proteinGrams = 5.0,
                carbohydratesGrams = 21.0,
                fatGrams = 25.0
            ),

            tags = listOf("سالاد", "آووکادو", "گیاهی", "غذای سالم", "مدیترانه‌ای"),

            rating = 4.8,
            ratingCount = 194,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("آووکادو", "2", IngredientUnit.PIECE),
                Ingredients("خیار", "1", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "2", IngredientUnit.PIECE),
                Ingredients("پیاز قرمز", "0.5", IngredientUnit.PIECE),
                Ingredients("کاهو", "100", IngredientUnit.GRAM),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن زیتون", "2", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON),
                Spices("پودر چیلی", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 14,
            image = Res.drawable.food2,
            title = "سالاد نخود",
            chefName = "ترانه شریفی",
            cuisine = "مدیترانه‌ای",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 60,
            servings = 3,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "نخود را از شب قبل در آب خیس کنید و چند بار آب آن را عوض کنید.",
                "نخود را با آب تازه روی حرارت متوسط بپزید تا کاملاً نرم شود.",
                "نخود پخته را آبکش کنید و کنار بگذارید تا خنک شود.",
                "خیارها را بشویید و به صورت نگینی خرد کنید.",
                "گوجه‌فرنگی‌ها را نیز به قطعات کوچک خرد کنید.",
                "پیاز قرمز را ریز خرد کنید.",
                "جعفری تازه را بشویید، خشک کنید و ساطوری کنید.",
                "نخود خنک‌شده، خیار، گوجه‌فرنگی، پیاز و جعفری را در ظرف بزرگی بریزید.",
                "آبلیمو و روغن زیتون را به مواد اضافه کنید.",
                "نمک، فلفل سیاه و زیره سبز را اضافه کرده و مواد را به آرامی مخلوط کنید.",
                "سالاد را حدود ۱۵ دقیقه در یخچال قرار دهید تا طعم مواد با یکدیگر ترکیب شود.",
                "سالاد نخود را خنک سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 285,
                proteinGrams = 11.0,
                carbohydratesGrams = 38.0,
                fatGrams = 10.0
            ),

            tags = listOf("سالاد", "نخود", "گیاهی", "پروتئینی", "سالم", "مدیترانه‌ای"),

            rating = 4.7,
            ratingCount = 167,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("نخود پخته", "250", IngredientUnit.GRAM),
                Ingredients("خیار", "2", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "2", IngredientUnit.PIECE),
                Ingredients("پیاز قرمز", "1", IngredientUnit.PIECE),
                Ingredients("جعفری", "30", IngredientUnit.GRAM),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن زیتون", "2", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON),
                Spices("زیره سبز", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 15,
            image = Res.drawable.food3,
            title = "سالاد کینوا",
            chefName = "الناز کریمی",
            cuisine = "مدیترانه‌ای",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 15,
            servings = 2,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "کینوا را چند بار با آب سرد بشویید تا تلخی احتمالی آن گرفته شود.",
                "کینوا را همراه با دو برابر حجم آن آب در قابلمه بریزید.",
                "قابلمه را روی حرارت متوسط قرار دهید تا آب به جوش بیاید.",
                "حرارت را کم کنید، در قابلمه را بگذارید و حدود ۱۲ تا ۱۵ دقیقه بپزید تا آب جذب شود.",
                "کینوا را با چنگال کمی زیرورو کنید و کنار بگذارید تا کاملاً خنک شود.",
                "خیار و گوجه‌فرنگی را به صورت نگینی خرد کنید.",
                "جعفری و نعناع تازه را بشویید، خشک کنید و ساطوری کنید.",
                "کینوا خنک‌شده را در ظرف بزرگی بریزید و سبزیجات خردشده را به آن اضافه کنید.",
                "آبلیمو و روغن زیتون را در ظرفی جداگانه مخلوط کنید.",
                "نمک، فلفل سیاه و زیره سبز را به سس اضافه کنید.",
                "سس را روی سالاد بریزید و همه مواد را به آرامی مخلوط کنید.",
                "سالاد را کمی در یخچال استراحت دهید و سپس سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 295,
                proteinGrams = 9.0,
                carbohydratesGrams = 42.0,
                fatGrams = 11.0
            ),

            tags = listOf("سالاد", "کینوا", "گیاهی", "غذای سالم", "بدون گوشت", "مدیترانه‌ای"),

            rating = 4.8,
            ratingCount = 182,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("کینوا", "150", IngredientUnit.GRAM),
                Ingredients("خیار", "1", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "2", IngredientUnit.PIECE),
                Ingredients("جعفری", "30", IngredientUnit.GRAM),
                Ingredients("نعناع تازه", "15", IngredientUnit.GRAM),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن زیتون", "2", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON),
                Spices("زیره سبز", "0.25", IngredientUnit.TEASPOON)
            )
        ),
        recipe(
            id = 16,
            image = Res.drawable.food1,
            title = "قورمه‌سبزی",
            chefName = "مریم احمدی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 30,
            cookingTimeMinutes = 180,
            servings = 4,
            difficulty = RecipeDifficulty.HARD,

            cookingSteps = listOf(
                "لوبیا قرمز را از چند ساعت قبل در آب خیس کنید و چند بار آب آن را عوض کنید.",
                "پیازها را نگینی خرد کرده و در قابلمه با روغن تفت دهید تا طلایی و سبک شوند.",
                "گوشت گوسفندی را به قطعات خورشتی خرد کنید و به پیاز اضافه کنید.",
                "گوشت را تفت دهید تا رنگ آن تغییر کند، سپس زردچوبه و فلفل سیاه را اضافه کنید.",
                "لوبیای خیس‌خورده را آبکش کرده و همراه گوشت چند دقیقه تفت دهید.",
                "سبزی قورمه شامل تره، جعفری، گشنیز و مقدار کمی شنبلیله را پاک کرده، بشویید و ریز خرد کنید.",
                "سبزی خردشده را در تابه با روغن روی حرارت متوسط سرخ کنید تا آب آن کشیده شود و عطرش آزاد شود.",
                "سبزی سرخ‌شده را به قابلمه گوشت و لوبیا اضافه کنید و مواد را مخلوط کنید.",
                "به اندازه کافی آب جوش داخل قابلمه بریزید و اجازه دهید خورشت به جوش برسد.",
                "لیموعمانی‌ها را با چنگال سوراخ کنید و پس از شست‌وشو به خورشت اضافه کنید.",
                "حرارت را کم کنید و در قابلمه را بگذارید تا خورشت حدود ۲ تا ۳ ساعت آرام بپزد.",
                "در طول پخت، میزان آب خورشت را بررسی کنید و در صورت نیاز کمی آب جوش اضافه کنید.",
                "پس از نرم شدن گوشت و لوبیا، نمک را اضافه کرده و طعم خورشت را تنظیم کنید.",
                "اجازه دهید خورشت با حرارت ملایم جا بیفتد و روغن سبزی روی سطح آن ظاهر شود.",
                "قورمه‌سبزی را همراه برنج ایرانی سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 485,
                proteinGrams = 32.0,
                carbohydratesGrams = 28.0,
                fatGrams = 27.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "قورمه‌سبزی", "غذای سنتی", "ناهار", "مجلسی"),

            rating = 4.9,
            ratingCount = 428,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت گوسفندی", "400", IngredientUnit.GRAM),
                Ingredients("سبزی قورمه", "500", IngredientUnit.GRAM),
                Ingredients("لوبیا قرمز", "150", IngredientUnit.GRAM),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("لیموعمانی", "3", IngredientUnit.PIECE),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 17,
            image = Res.drawable.food2,
            title = "قیمه سیب‌زمینی",
            chefName = "ترانه شریفی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 120,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "لپه را بشویید و حدود یک ساعت در آب خیس کنید.",
                "پیازها را نگینی خرد کرده و در قابلمه با روغن تفت دهید تا طلایی شوند.",
                "گوشت خورشتی را اضافه کنید و چند دقیقه تفت دهید تا رنگ آن تغییر کند.",
                "زردچوبه و فلفل سیاه را اضافه کنید و مواد را هم بزنید.",
                "لپه را آبکش کرده و به قابلمه اضافه کنید و چند دقیقه همراه گوشت تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کنید و روی حرارت ملایم تفت دهید تا رنگ آن باز شود.",
                "چند پیمانه آب جوش به قابلمه اضافه کنید و اجازه دهید مواد به جوش بیایند.",
                "حرارت را کم کنید و در قابلمه را بگذارید تا گوشت و لپه به آرامی بپزند.",
                "لیموعمانی‌ها را سوراخ کرده و پس از شست‌وشو به خورشت اضافه کنید.",
                "سیب‌زمینی‌ها را پوست بگیرید و به صورت خلالی یکدست خرد کنید.",
                "سیب‌زمینی‌ها را بشویید و با دستمال خشک کنید تا هنگام سرخ شدن ترد شوند.",
                "سیب‌زمینی‌ها را در روغن داغ سرخ کنید تا طلایی و برشته شوند.",
                "پس از نرم شدن گوشت و لپه، نمک و دارچین را به خورشت اضافه کنید.",
                "اجازه دهید خورشت چند دقیقه دیگر با حرارت ملایم جا بیفتد.",
                "قیمه را در ظرف سرو بریزید و سیب‌زمینی سرخ‌شده را روی آن قرار دهید."
            ),

            nutrition = NutritionInfo(
                calories = 520,
                proteinGrams = 29.0,
                carbohydratesGrams = 46.0,
                fatGrams = 24.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "قیمه", "غذای سنتی", "ناهار", "غذای مجلسی"),

            rating = 4.8,
            ratingCount = 365,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت خورشتی", "350", IngredientUnit.GRAM),
                Ingredients("لپه", "150", IngredientUnit.GRAM),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "3", IngredientUnit.TABLESPOON),
                Ingredients("سیب‌زمینی", "3", IngredientUnit.PIECE),
                Ingredients("لیموعمانی", "2", IngredientUnit.PIECE),
                Ingredients("روغن", "5", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 18,
            image = Res.drawable.food3,
            title = "فسنجان",
            chefName = "سارا محمدی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 180,
            servings = 4,
            difficulty = RecipeDifficulty.HARD,

            cookingSteps = listOf(
                "گردوها را آسیاب کنید تا کاملاً ریز شوند، اما به روغن نیفتند.",
                "پیاز را رنده کنید و آب اضافی آن را بگیرید.",
                "پیاز را در قابلمه با مقدار کمی روغن تفت دهید تا نرم و طلایی شود.",
                "گردوی آسیاب‌شده را اضافه کنید و چند دقیقه با حرارت ملایم تفت دهید.",
                "چند پیمانه آب سرد به گردو اضافه کنید و مواد را هم بزنید تا یکدست شوند.",
                "قابلمه را روی حرارت ملایم قرار دهید و اجازه دهید گردو به آرامی بپزد.",
                "در طول پخت، هر چند دقیقه خورشت را هم بزنید تا گردو ته نگیرد.",
                "تکه‌های مرغ را با کمی نمک، زردچوبه و آب در قابلمه‌ای جداگانه نیم‌پز کنید.",
                "مرغ نیم‌پز را به قابلمه گردو اضافه کنید.",
                "رب انار را اضافه کرده و مواد را به آرامی مخلوط کنید.",
                "خورشت را با حرارت بسیار ملایم حدود ۲ تا ۳ ساعت بپزید تا گردو روغن بیندازد.",
                "در صورت تمایل برای متعادل کردن طعم ترش رب انار، کمی شکر اضافه کنید.",
                "در طول پخت در صورت غلیظ شدن بیش از حد خورشت، کمی آب سرد اضافه کنید.",
                "پس از پخت کامل مرغ و جا افتادن خورشت، نمک و طعم نهایی را تنظیم کنید.",
                "فسنجان را همراه برنج ایرانی سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 625,
                proteinGrams = 30.0,
                carbohydratesGrams = 24.0,
                fatGrams = 47.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "فسنجان", "غذای سنتی", "غذای مجلسی", "گردو"),

            rating = 4.9,
            ratingCount = 392,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گردوی آسیاب‌شده", "300", IngredientUnit.GRAM),
                Ingredients("مرغ", "500", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("رب انار", "4", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "2", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 19,
            image = Res.drawable.food4,
            title = "خورشت بادمجان",
            chefName = "نگار رضایی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 30,
            cookingTimeMinutes = 120,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "بادمجان‌ها را پوست بگیرید و از طول برش دهید.",
                "روی بادمجان‌ها کمی نمک بپاشید و حدود ۳۰ دقیقه کنار بگذارید تا تلخی احتمالی آن‌ها گرفته شود.",
                "بادمجان‌ها را با دستمال خشک کنید و در روغن سرخ کنید تا دو طرف آن‌ها طلایی شود.",
                "بادمجان‌های سرخ‌شده را روی دستمال قرار دهید تا روغن اضافی آن‌ها گرفته شود.",
                "پیازها را نگینی خرد کرده و در قابلمه با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کنید و همراه زردچوبه و فلفل تفت دهید تا رنگ آن تغییر کند.",
                "رب گوجه‌فرنگی را اضافه کنید و چند دقیقه تفت دهید تا رنگ آن باز شود.",
                "آب جوش به قابلمه اضافه کنید و اجازه دهید گوشت با حرارت ملایم بپزد.",
                "گوجه‌فرنگی‌ها را نصف کنید و در صورت تمایل کمی جداگانه تفت دهید.",
                "پس از نیم‌پز شدن گوشت، گوجه‌فرنگی و بادمجان‌های سرخ‌شده را به قابلمه اضافه کنید.",
                "حرارت را کم کنید و اجازه دهید خورشت آرام بپزد تا گوشت کاملاً نرم شود.",
                "نمک خورشت را تنظیم کنید و اجازه دهید سس آن غلیظ و جاافتاده شود.",
                "خورشت بادمجان را همراه برنج ایرانی سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 465,
                proteinGrams = 27.0,
                carbohydratesGrams = 19.0,
                fatGrams = 30.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "بادمجان", "غذای سنتی", "ناهار", "غذای خانگی"),

            rating = 4.7,
            ratingCount = 284,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت خورشتی", "350", IngredientUnit.GRAM),
                Ingredients("بادمجان", "4", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "3", IngredientUnit.PIECE),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "5", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 20,
            image = Res.drawable.food5,
            title = "خورشت کرفس",
            chefName = "الناز کریمی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 120,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "ساقه‌های کرفس را بشویید و به قطعات دو تا سه سانتی‌متری خرد کنید.",
                "برگ‌های لطیف کرفس را جدا کرده و در صورت تمایل برای عطر بیشتر خرد کنید.",
                "جعفری و نعناع را پاک کنید، بشویید و ریز خرد کنید.",
                "پیاز را نگینی خرد کرده و در قابلمه با روغن تفت دهید تا طلایی شود.",
                "گوشت خورشتی را اضافه کنید و همراه زردچوبه و فلفل تفت دهید.",
                "کرفس خردشده را در تابه‌ای جداگانه با کمی روغن تفت دهید تا کمی نرم شود.",
                "جعفری و نعناع خردشده را جداگانه با حرارت ملایم تفت دهید تا عطر آن‌ها آزاد شود.",
                "کرفس و سبزی سرخ‌شده را به قابلمه گوشت اضافه کنید.",
                "آب جوش به قابلمه اضافه کنید و اجازه دهید مواد به جوش بیایند.",
                "حرارت را کم کنید و در قابلمه را بگذارید تا گوشت و کرفس به آرامی بپزند.",
                "در مراحل پایانی آبلیمو را اضافه کنید و خورشت را به آرامی هم بزنید.",
                "پس از نرم شدن گوشت و کرفس، نمک و میزان ترشی خورشت را تنظیم کنید.",
                "اجازه دهید خورشت کمی دیگر بجوشد تا جا بیفتد و سپس سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 410,
                proteinGrams = 28.0,
                carbohydratesGrams = 16.0,
                fatGrams = 25.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "کرفس", "غذای سنتی", "سبزیجات", "ناهار"),

            rating = 4.7,
            ratingCount = 218,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت خورشتی", "350", IngredientUnit.GRAM),
                Ingredients("کرفس", "500", IngredientUnit.GRAM),
                Ingredients("جعفری", "150", IngredientUnit.GRAM),
                Ingredients("نعناع", "50", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 21,
            image = Res.drawable.food6,
            title = "آلو اسفناج",
            chefName = "مریم احمدی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 100,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "آلوهای خورشتی را بشویید و حدود ۲۰ دقیقه در آب ولرم خیس کنید.",
                "پیاز را نگینی خرد کرده و در قابلمه با روغن تفت دهید تا طلایی شود.",
                "گوشت خورشتی را اضافه کنید و همراه زردچوبه و فلفل تفت دهید.",
                "چند پیمانه آب جوش اضافه کنید و اجازه دهید گوشت با حرارت ملایم نیم‌پز شود.",
                "اسفناج را پاک کنید، چند بار بشویید و پس از آبکش شدن خرد کنید.",
                "اسفناج خردشده را در تابه‌ای جداگانه تفت دهید تا آب آن کشیده و حجم آن کم شود.",
                "اسفناج تفت‌داده‌شده را به قابلمه گوشت اضافه کنید.",
                "آلوهای خیس‌خورده را آبکش کرده و همراه مقدار کمی از آب خیساندن به خورشت اضافه کنید.",
                "خورشت را با حرارت ملایم بپزید تا گوشت و آلو کاملاً نرم شوند.",
                "آبلیمو را اضافه کنید و طعم خورشت را بچشید.",
                "نمک را تنظیم کنید و اجازه دهید خورشت چند دقیقه دیگر جا بیفتد.",
                "خورشت آلو اسفناج را همراه برنج سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 395,
                proteinGrams = 27.0,
                carbohydratesGrams = 25.0,
                fatGrams = 21.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "اسفناج", "آلو", "غذای سنتی", "مجلسی"),

            rating = 4.8,
            ratingCount = 176,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("اسفناج", "500", IngredientUnit.GRAM),
                Ingredients("آلو خورشتی", "150", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("روغن", "3", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 22,
            image = Res.drawable.food1,
            title = "خورشت به‌آلو",
            chefName = "ترانه شریفی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 120,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "به‌ها را بشویید، پوست بگیرید و به قطعات متوسط خرد کنید.",
                "آلوهای خورشتی را بشویید و حدود ۲۰ دقیقه در آب ولرم خیس کنید.",
                "پیاز را نگینی خرد کرده و در قابلمه با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کنید و همراه زردچوبه و فلفل تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کنید و چند دقیقه تفت دهید تا رنگ آن باز شود.",
                "آب جوش به قابلمه اضافه کنید و اجازه دهید گوشت نیم‌پز شود.",
                "تکه‌های به را در تابه با کمی روغن تفت دهید تا سطح آن‌ها کمی طلایی شود.",
                "به و آلوهای آبکش‌شده را به قابلمه اضافه کنید.",
                "دارچین و شکر را اضافه کنید تا طعم ترش و شیرین خورشت متعادل شود.",
                "خورشت را با حرارت ملایم بپزید تا گوشت و به نرم شوند، اما تکه‌های به شکل خود را حفظ کنند.",
                "نمک و طعم نهایی خورشت را تنظیم کنید.",
                "خورشت به‌آلو را همراه برنج ایرانی سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 435,
                proteinGrams = 26.0,
                carbohydratesGrams = 35.0,
                fatGrams = 19.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "به", "آلو", "غذای ملس", "غذای سنتی"),

            rating = 4.7,
            ratingCount = 153,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("به", "2", IngredientUnit.PIECE),
                Ingredients("آلو خورشتی", "120", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "1", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "1", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "3", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "0.5", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 23,
            image = Res.drawable.food2,
            title = "خورشت آلو مسما",
            chefName = "سارا محمدی",
            cuisine = "گیلانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 90,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "مرغ را بشویید و با دستمال تمیز کاملاً خشک کنید.",
                "آلوهای بخارا را بشویید و حدود ۲۰ دقیقه در آب ولرم خیس کنید.",
                "پیازها را خلالی خرد کرده و در قابلمه با روغن تفت دهید تا طلایی شوند.",
                "تکه‌های مرغ را اضافه کنید و دو طرف آن‌ها را کمی سرخ کنید.",
                "زردچوبه و فلفل سیاه را اضافه کنید و مواد را به آرامی هم بزنید.",
                "رب گوجه‌فرنگی را اضافه کنید و چند دقیقه تفت دهید تا رنگ آن باز شود.",
                "مقداری آب جوش به قابلمه اضافه کنید و اجازه دهید مرغ نیم‌پز شود.",
                "آلوهای آبکش‌شده را به قابلمه اضافه کنید.",
                "زعفران دم‌کرده را اضافه کنید و در صورت تمایل کمی شکر برای متعادل کردن ترشی آلو بریزید.",
                "حرارت را کم کنید و اجازه دهید مرغ کاملاً بپزد و سس خورشت غلیظ شود.",
                "در پایان نمک و طعم خورشت را تنظیم کنید.",
                "خورشت آلو مسما را همراه برنج ایرانی سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 465,
                proteinGrams = 31.0,
                carbohydratesGrams = 34.0,
                fatGrams = 22.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "آلو مسما", "غذای گیلانی", "مرغ", "غذای مجلسی"),

            rating = 4.9,
            ratingCount = 237,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("مرغ", "600", IngredientUnit.GRAM),
                Ingredients("آلو بخارا", "200", IngredientUnit.GRAM),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "2", IngredientUnit.TABLESPOON),
                Ingredients("زعفران دم‌کرده", "2", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "1", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "3", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 24,
            image = Res.drawable.food3,
            title = "خورشت قیمه بادمجان",
            chefName = "نگار رضایی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 30,
            cookingTimeMinutes = 120,
            servings = 4,
            difficulty = RecipeDifficulty.HARD,

            cookingSteps = listOf(
                "لپه را بشویید و حدود یک ساعت در آب خیس کنید.",
                "پیازها را نگینی خرد کرده و در قابلمه با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کنید و همراه زردچوبه و فلفل تفت دهید.",
                "لپه را آبکش کرده و به قابلمه اضافه کنید و چند دقیقه تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کنید و تفت دهید تا رنگ آن باز شود.",
                "آب جوش به قابلمه اضافه کنید و اجازه دهید مواد به جوش بیایند.",
                "لیموعمانی‌ها را سوراخ کرده و پس از شست‌وشو به خورشت اضافه کنید.",
                "خورشت را با حرارت ملایم بپزید تا گوشت و لپه نرم شوند.",
                "بادمجان‌ها را پوست بگیرید، از طول برش دهید و روی آن‌ها کمی نمک بپاشید.",
                "پس از حدود ۳۰ دقیقه بادمجان‌ها را خشک کنید و در روغن سرخ کنید.",
                "بادمجان‌های سرخ‌شده را در نیم ساعت پایانی پخت به خورشت اضافه کنید.",
                "نمک و طعم خورشت را تنظیم کنید و اجازه دهید مواد به آرامی جا بیفتند.",
                "خورشت قیمه بادمجان را همراه برنج ایرانی سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 495,
                proteinGrams = 29.0,
                carbohydratesGrams = 35.0,
                fatGrams = 25.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "قیمه بادمجان", "بادمجان", "غذای سنتی", "مجلسی"),

            rating = 4.8,
            ratingCount = 276,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("لپه", "120", IngredientUnit.GRAM),
                Ingredients("بادمجان", "4", IngredientUnit.PIECE),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "2", IngredientUnit.TABLESPOON),
                Ingredients("لیموعمانی", "2", IngredientUnit.PIECE),
                Ingredients("روغن", "5", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 25,
            image = Res.drawable.food4,
            title = "خورشت لوبیا سبز",
            chefName = "الناز کریمی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 120,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "لوبیا سبزها را بشویید و به قطعات دو تا سه سانتی‌متری خرد کنید.",
                "پیازها را نگینی خرد کرده و در قابلمه با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کنید و همراه زردچوبه و فلفل تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کنید و چند دقیقه تفت دهید تا رنگ آن باز شود.",
                "لوبیا سبز خردشده را در تابه‌ای جداگانه با کمی روغن تفت دهید.",
                "لوبیا را به قابلمه گوشت اضافه کنید و مواد را مخلوط کنید.",
                "آب جوش به قابلمه اضافه کنید و اجازه دهید خورشت به جوش بیاید.",
                "حرارت را کم کنید و در قابلمه را بگذارید تا گوشت و لوبیا بپزند.",
                "گوجه‌فرنگی‌ها را خرد کنید و در نیمه دوم پخت به خورشت اضافه کنید.",
                "اجازه دهید خورشت با حرارت ملایم جا بیفتد و سس آن غلیظ شود.",
                "در پایان نمک و آبلیمو را اضافه کنید و طعم خورشت را تنظیم کنید.",
                "خورشت لوبیا سبز را همراه برنج ایرانی سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 425,
                proteinGrams = 28.0,
                carbohydratesGrams = 24.0,
                fatGrams = 23.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "لوبیا سبز", "غذای سنتی", "سبزیجات", "ناهار"),

            rating = 4.7,
            ratingCount = 193,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت خورشتی", "350", IngredientUnit.GRAM),
                Ingredients("لوبیا سبز", "400", IngredientUnit.GRAM),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "2", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "2", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 26,
            image = Res.drawable.food5,
            title = "خورشت هویج",
            chefName = "مریم احمدی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 100,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "هویج‌ها را پوست بگیرید و به صورت خلالی یکدست خرد کنید.",
                "پیاز را نگینی خرد کرده و در قابلمه با روغن تفت دهید تا طلایی شود.",
                "گوشت خورشتی را اضافه کنید و همراه زردچوبه و فلفل تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کنید و چند دقیقه تفت دهید.",
                "آب جوش به قابلمه اضافه کنید و اجازه دهید گوشت نیم‌پز شود.",
                "هویج‌های خلالی را در تابه‌ای جداگانه با کمی روغن تفت دهید تا کمی نرم شوند.",
                "هویج را به قابلمه گوشت اضافه کنید و مواد را به آرامی مخلوط کنید.",
                "زعفران دم‌کرده و آبلیمو را اضافه کنید.",
                "حرارت را کم کنید و اجازه دهید خورشت بپزد تا هویج نرم و گوشت کاملاً پخته شود.",
                "در صورت تمایل برای ایجاد طعم ملس، مقدار کمی شکر اضافه کنید.",
                "در پایان نمک و طعم خورشت را تنظیم کنید و اجازه دهید خورشت جا بیفتد.",
                "خورشت هویج را همراه برنج سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 440,
                proteinGrams = 27.0,
                carbohydratesGrams = 32.0,
                fatGrams = 22.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "هویج", "غذای سنتی", "زعفرانی", "غذای خانگی"),

            rating = 4.6,
            ratingCount = 142,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("هویج", "400", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "1", IngredientUnit.TABLESPOON),
                Ingredients("زعفران دم‌کرده", "2", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 27,
            image = Res.drawable.food6,
            title = "خورشت مرغ و آلو",
            chefName = "ترانه شریفی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 90,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "آلوها را بشویید و حدود ۲۰ دقیقه در آب ولرم خیس کنید.",
                "پیازها را نگینی خرد کرده و در قابلمه با روغن تفت دهید.",
                "تکه‌های مرغ را اضافه کنید و دو طرف آن‌ها را سرخ کنید تا کمی طلایی شوند.",
                "زردچوبه و فلفل سیاه را اضافه کنید و مواد را هم بزنید.",
                "رب گوجه‌فرنگی را اضافه کنید و چند دقیقه تفت دهید تا رنگ آن باز شود.",
                "آب جوش به قابلمه اضافه کنید و اجازه دهید مرغ نیم‌پز شود.",
                "آلوهای آبکش‌شده را به قابلمه اضافه کنید.",
                "زعفران دم‌کرده و آبلیمو را اضافه کنید.",
                "حرارت را کم کنید و اجازه دهید خورشت بپزد تا مرغ کاملاً مغزپخت شود.",
                "در صورت تمایل کمی شکر برای متعادل کردن ترشی آلو اضافه کنید.",
                "نمک خورشت را تنظیم کنید و اجازه دهید سس آن غلیظ شود.",
                "خورشت مرغ و آلو را همراه برنج ایرانی سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 455,
                proteinGrams = 32.0,
                carbohydratesGrams = 30.0,
                fatGrams = 20.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "مرغ", "آلو", "غذای ملس", "غذای مجلسی"),

            rating = 4.8,
            ratingCount = 201,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("مرغ", "600", IngredientUnit.GRAM),
                Ingredients("آلو بخارا", "150", IngredientUnit.GRAM),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "2", IngredientUnit.TABLESPOON),
                Ingredients("زعفران دم‌کرده", "2", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "3", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 28,
            image = Res.drawable.food1,
            title = "خورشت کدو",
            chefName = "سارا محمدی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 100,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "کدوها را بشویید و در صورت تمایل پوست آن‌ها را به صورت راه‌راه بگیرید.",
                "کدوها را از طول نصف کنید و در تابه با کمی روغن سرخ کنید تا سطح آن‌ها طلایی شود.",
                "پیاز را نگینی خرد کرده و در قابلمه با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کنید و همراه زردچوبه و فلفل تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کنید و چند دقیقه تفت دهید.",
                "آب جوش به قابلمه اضافه کنید و اجازه دهید گوشت بپزد.",
                "گوجه‌فرنگی‌ها را خرد کرده و پس از نیم‌پز شدن گوشت به قابلمه اضافه کنید.",
                "کدوهای سرخ‌شده را در مراحل پایانی پخت به خورشت اضافه کنید.",
                "حرارت را کم کنید و اجازه دهید خورشت آرام جا بیفتد تا کدوها شکل خود را حفظ کنند.",
                "آبلیمو و نمک را اضافه کنید و طعم خورشت را تنظیم کنید.",
                "خورشت کدو را همراه برنج ایرانی سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 390,
                proteinGrams = 26.0,
                carbohydratesGrams = 17.0,
                fatGrams = 23.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "کدو سبز", "غذای سنتی", "سبزیجات", "ناهار"),

            rating = 4.6,
            ratingCount = 158,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("کدو سبز", "4", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "2", IngredientUnit.PIECE),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "2", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 29,
            image = Res.drawable.food2,
            title = "خورشت غوره بادمجان",
            chefName = "نگار رضایی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 30,
            cookingTimeMinutes = 110,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "بادمجان‌ها را پوست بگیرید و روی آن‌ها کمی نمک بپاشید.",
                "پس از حدود ۳۰ دقیقه بادمجان‌ها را خشک کنید و در روغن سرخ کنید.",
                "پیاز را نگینی خرد کرده و در قابلمه با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کنید و همراه زردچوبه و فلفل تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کنید و چند دقیقه تفت دهید.",
                "آب جوش به قابلمه اضافه کنید و اجازه دهید گوشت نیم‌پز شود.",
                "گوجه‌فرنگی‌ها را نصف کنید و همراه بادمجان‌های سرخ‌شده به قابلمه اضافه کنید.",
                "غوره را بشویید و در نیم ساعت پایانی پخت به خورشت اضافه کنید.",
                "خورشت را با حرارت ملایم بپزید تا گوشت و بادمجان نرم شوند.",
                "در پایان نمک و میزان ترشی خورشت را تنظیم کنید.",
                "اجازه دهید خورشت چند دقیقه دیگر جا بیفتد و سپس همراه برنج سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 425,
                proteinGrams = 26.0,
                carbohydratesGrams = 20.0,
                fatGrams = 25.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "غوره", "بادمجان", "غذای ترش", "غذای سنتی"),

            rating = 4.7,
            ratingCount = 164,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("بادمجان", "4", IngredientUnit.PIECE),
                Ingredients("غوره", "150", IngredientUnit.GRAM),
                Ingredients("گوجه‌فرنگی", "2", IngredientUnit.PIECE),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "1", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 30,
            image = Res.drawable.food3,
            title = "خورشت ریواس",
            chefName = "الناز کریمی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 100,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "ریواس‌ها را بشویید و پوست نازک و رشته‌ای آن‌ها را جدا کنید.",
                "ریواس را به قطعات سه تا چهار سانتی‌متری خرد کنید.",
                "پیاز را نگینی خرد کرده و در قابلمه با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کنید و همراه زردچوبه و فلفل تفت دهید.",
                "آب جوش به قابلمه اضافه کنید و اجازه دهید گوشت کاملاً بپزد.",
                "جعفری و نعناع را پاک کنید، بشویید و ریز خرد کنید.",
                "سبزی خردشده را در تابه با کمی روغن تفت دهید تا عطر آن آزاد شود.",
                "سبزی سرخ‌شده را به قابلمه گوشت اضافه کنید.",
                "ریواس خردشده را در ۱۵ تا ۲۰ دقیقه پایانی پخت به خورشت اضافه کنید.",
                "خورشت را به آرامی هم بزنید تا ریواس له نشود.",
                "پس از نرم شدن ریواس، نمک خورشت را تنظیم کنید.",
                "خورشت را چند دقیقه دیگر روی حرارت ملایم قرار دهید تا جا بیفتد و سپس سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 380,
                proteinGrams = 26.0,
                carbohydratesGrams = 18.0,
                fatGrams = 22.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "ریواس", "غذای ترش", "سبزیجات", "غذای سنتی"),

            rating = 4.7,
            ratingCount = 139,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("ریواس", "400", IngredientUnit.GRAM),
                Ingredients("جعفری", "150", IngredientUnit.GRAM),
                Ingredients("نعناع", "50", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 31,
            image = Res.drawable.food4,
            title = "خورشت به",
            chefName = "مریم احمدی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 110,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "به‌ها را بشویید، پوست بگیرید و به قطعات متوسط خرد کنید.",
                "پیاز را نگینی خرد کرده و در قابلمه با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کنید و همراه زردچوبه و فلفل تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کنید و چند دقیقه تفت دهید.",
                "آب جوش به قابلمه اضافه کنید و اجازه دهید گوشت نیم‌پز شود.",
                "تکه‌های به را در تابه با کمی روغن تفت دهید تا سطح آن‌ها کمی طلایی شود.",
                "به را همراه زعفران دم‌کرده به قابلمه اضافه کنید.",
                "شکر و آبلیمو را اضافه کنید تا طعم ملس و متعادلی ایجاد شود.",
                "خورشت را با حرارت ملایم بپزید تا به نرم شود اما شکل خود را حفظ کند.",
                "در پایان نمک و طعم نهایی خورشت را تنظیم کنید.",
                "خورشت به را همراه برنج ایرانی سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 420,
                proteinGrams = 26.0,
                carbohydratesGrams = 32.0,
                fatGrams = 19.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "به", "غذای ملس", "زعفرانی", "غذای سنتی"),

            rating = 4.8,
            ratingCount = 171,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("به", "3", IngredientUnit.PIECE),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "1", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "2", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON),
                Ingredients("زعفران دم‌کرده", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "3", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "0.5", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 32,
            image = Res.drawable.food5,
            title = "خورشت خلال کرمانشاهی",
            chefName = "ترانه شریفی",
            cuisine = "کرمانشاهی",
            preparationTimeMinutes = 30,
            cookingTimeMinutes = 150,
            servings = 4,
            difficulty = RecipeDifficulty.HARD,

            cookingSteps = listOf(
                "خلال بادام را حدود یک ساعت در ترکیب آب و گلاب خیس کنید.",
                "پیاز را ریز خرد کرده و در قابلمه با روغن تفت دهید تا سبک و طلایی شود.",
                "گوشت گوسفندی را به قطعات کوچک خورشتی خرد کنید و به پیاز اضافه کنید.",
                "گوشت را همراه زردچوبه و فلفل تفت دهید تا رنگ آن تغییر کند.",
                "رب گوجه‌فرنگی را اضافه کنید و چند دقیقه تفت دهید تا رنگ آن باز شود.",
                "آب جوش به قابلمه اضافه کنید و اجازه دهید گوشت با حرارت ملایم بپزد.",
                "خلال بادام را آبکش کنید و پس از نیم‌پز شدن گوشت به قابلمه اضافه کنید.",
                "لیموعمانی‌ها را سوراخ کرده و پس از شست‌وشو به خورشت اضافه کنید.",
                "زعفران دم‌کرده را اضافه کنید و مواد را به آرامی مخلوط کنید.",
                "زرشک را بشویید و با مقدار کمی روغن یا کره روی حرارت ملایم تفت دهید.",
                "زرشک تفت‌داده‌شده را در مراحل پایانی به خورشت اضافه کنید.",
                "اجازه دهید خورشت با حرارت ملایم بپزد تا گوشت نرم و خلال بادام لطیف شود.",
                "نمک را تنظیم کنید و خورشت را پس از جا افتادن همراه برنج ایرانی سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 510,
                proteinGrams = 32.0,
                carbohydratesGrams = 29.0,
                fatGrams = 30.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "غذای کرمانشاهی", "خورشت خلال", "بادام", "غذای مجلسی"),

            rating = 4.9,
            ratingCount = 203,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت گوسفندی", "350", IngredientUnit.GRAM),
                Ingredients("خلال بادام", "100", IngredientUnit.GRAM),
                Ingredients("زرشک", "50", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "2", IngredientUnit.TABLESPOON),
                Ingredients("لیموعمانی", "2", IngredientUnit.PIECE),
                Ingredients("گلاب", "2", IngredientUnit.TABLESPOON),
                Ingredients("زعفران دم‌کرده", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "3", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "0.5", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 33,
            image = Res.drawable.food6,
            title = "خورشت تره",
            chefName = "سارا محمدی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 110,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "تره و جعفری را پاک کنید، چند بار بشویید و ریز خرد کنید.",
                "پیاز را نگینی خرد کرده و در قابلمه با روغن تفت دهید تا طلایی شود.",
                "گوشت خورشتی را اضافه کنید و همراه زردچوبه و فلفل تفت دهید.",
                "سبزی خردشده را در تابه‌ای جداگانه با کمی روغن تفت دهید تا آب آن گرفته شود.",
                "سبزی سرخ‌شده را به قابلمه گوشت اضافه کنید و مواد را مخلوط کنید.",
                "آب جوش به قابلمه اضافه کنید و اجازه دهید خورشت به جوش بیاید.",
                "حرارت را کم کنید و در قابلمه را بگذارید تا گوشت به آرامی بپزد.",
                "سیب‌زمینی را پوست بگیرید و به مکعب‌های کوچک خرد کنید.",
                "سیب‌زمینی را در نیمه دوم پخت به خورشت اضافه کنید.",
                "آبلیمو را در مراحل پایانی اضافه کنید و خورشت را به آرامی هم بزنید.",
                "پس از پخت کامل گوشت و نرم شدن سیب‌زمینی، نمک را تنظیم کنید.",
                "اجازه دهید خورشت با حرارت ملایم جا بیفتد و سپس همراه برنج سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 430,
                proteinGrams = 28.0,
                carbohydratesGrams = 27.0,
                fatGrams = 22.0
            ),

            tags = listOf("خورشت", "غذای ایرانی", "تره", "غذای سنتی", "سبزیجات", "غذای خانگی"),

            rating = 4.7,
            ratingCount = 148,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("تره", "400", IngredientUnit.GRAM),
                Ingredients("جعفری", "100", IngredientUnit.GRAM),
                Ingredients("سیب‌زمینی", "2", IngredientUnit.PIECE),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        ),
        recipe(
            id = 34,
            image = Res.drawable.food1,
            title = "تیرامیسو",
            chefName = "نگار رضایی",
            cuisine = "ایتالیایی",
            preparationTimeMinutes = 30,
            cookingTimeMinutes = 0,
            servings = 6,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "قهوه غلیظ را آماده کنید و اجازه دهید کاملاً خنک شود.",
                "زرده تخم‌مرغ و شکر را در ظرفی مقاوم به حرارت بریزید و روی بخار آب با همزن بزنید تا مخلوط روشن و غلیظ شود.",
                "مخلوط زرده را از روی بخار بردارید و اجازه دهید کمی خنک شود.",
                "پنیر ماسکارپونه را به مخلوط زرده اضافه کنید و به‌آرامی هم بزنید تا کرمی یکدست به دست آید.",
                "خامه سرد را در ظرفی جداگانه با همزن بزنید تا فرم بگیرد و رد پره‌های همزن روی آن باقی بماند.",
                "خامه فرم‌گرفته را در دو مرحله به ترکیب ماسکارپونه اضافه کنید و با لیسک به‌آرامی مخلوط کنید.",
                "بیسکویت‌های لیدی‌فینگر را برای یک تا دو ثانیه در قهوه خنک فرو ببرید تا بیش از حد نرم نشوند.",
                "یک لایه از بیسکویت‌های آغشته به قهوه را کف ظرف سرو بچینید.",
                "نیمی از کرم ماسکارپونه را روی بیسکویت‌ها پخش کنید و سطح آن را صاف کنید.",
                "یک لایه دیگر بیسکویت قهوه‌ای بچینید و باقی کرم را روی آن پخش کنید.",
                "روی ظرف را بپوشانید و تیرامیسو را حداقل ۶ ساعت در یخچال قرار دهید تا کاملاً خودش را بگیرد.",
                "پیش از سرو، پودر کاکائو را از الک روی سطح دسر بپاشید."
            ),

            nutrition = NutritionInfo(
                calories = 465,
                proteinGrams = 8.0,
                carbohydratesGrams = 42.0,
                fatGrams = 30.0
            ),

            tags = listOf("دسر", "تیرامیسو", "دسر ایتالیایی", "قهوه", "دسر مجلسی", "بدون فر"),

            rating = 4.9,
            ratingCount = 326,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("پنیر ماسکارپونه", "250", IngredientUnit.GRAM),
                Ingredients("بیسکویت لیدی‌فینگر", "200", IngredientUnit.GRAM),
                Ingredients("خامه", "200", IngredientUnit.GRAM),
                Ingredients("زرده تخم‌مرغ", "3", IngredientUnit.PIECE),
                Ingredients("شکر", "80", IngredientUnit.GRAM),
                Ingredients("قهوه غلیظ", "200", IngredientUnit.MILLILITER),
                Ingredients("پودر کاکائو", "2", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("وانیل", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 35,
            image = Res.drawable.food2,
            title = "کرم کارامل",
            chefName = "الناز کریمی",
            cuisine = "فرانسوی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 55,
            servings = 6,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "شکر مخصوص کارامل را داخل قابلمه کوچکی بریزید و روی حرارت ملایم قرار دهید.",
                "اجازه دهید شکر بدون هم زدن ذوب شود و به رنگ طلایی کهربایی برسد.",
                "کارامل داغ را با احتیاط کف قالب‌های مخصوص دسر یا یک قالب بزرگ بریزید و قالب را بچرخانید تا کف آن پوشیده شود.",
                "تخم‌مرغ‌ها و شکر مخصوص کرم را در ظرفی بریزید و با همزن دستی به‌آرامی مخلوط کنید تا یکدست شوند.",
                "شیر را در قابلمه‌ای جداگانه گرم کنید، اما اجازه ندهید بجوشد.",
                "شیر گرم را به‌تدریج و در چند مرحله به مخلوط تخم‌مرغ اضافه کنید و هم‌زمان هم بزنید.",
                "وانیل را اضافه کنید و مایه کرم را از صافی ریز عبور دهید تا بافتی لطیف داشته باشد.",
                "مایه کرم را به‌آرامی داخل قالب‌های حاوی کارامل بریزید.",
                "قالب‌ها را داخل ظرف بزرگ‌تری قرار دهید و تا نیمه ارتفاع قالب‌ها آب گرم بریزید.",
                "ظرف را در فر از قبل گرم‌شده با دمای ۱۶۰ درجه سانتی‌گراد قرار دهید.",
                "حدود ۴۵ تا ۵۵ دقیقه بپزید تا کرم بسته شود و مرکز آن کمی لرزش داشته باشد.",
                "قالب‌ها را از ظرف آب خارج کنید و اجازه دهید در دمای محیط خنک شوند.",
                "کرم کارامل را حداقل ۴ ساعت در یخچال قرار دهید تا کاملاً سرد و منسجم شود.",
                "دور دسر را با چاقوی نازک آزاد کنید و قالب را در ظرف سرو برگردانید."
            ),

            nutrition = NutritionInfo(
                calories = 285,
                proteinGrams = 8.0,
                carbohydratesGrams = 39.0,
                fatGrams = 11.0
            ),

            tags = listOf("دسر", "کرم کارامل", "دسر فرانسوی", "کاراملی", "دسر خنک", "مناسب مهمانی"),

            rating = 4.8,
            ratingCount = 274,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("شیر", "500", IngredientUnit.MILLILITER),
                Ingredients("تخم‌مرغ", "4", IngredientUnit.PIECE),
                Ingredients("شکر برای کرم", "100", IngredientUnit.GRAM),
                Ingredients("شکر برای کارامل", "100", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("وانیل", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 36,
            image = Res.drawable.food3,
            title = "پاناکوتا",
            chefName = "ترانه شریفی",
            cuisine = "ایتالیایی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 10,
            servings = 5,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "پودر ژلاتین را روی آب سرد بپاشید و حدود ۵ تا ۱۰ دقیقه صبر کنید تا اسفنجی شود.",
                "خامه و شیر را داخل قابلمه‌ای مناسب بریزید.",
                "شکر را اضافه کنید و مواد را روی حرارت ملایم قرار دهید.",
                "مخلوط را مرتب هم بزنید تا شکر کاملاً حل شود، اما اجازه ندهید بجوشد.",
                "قابلمه را از روی حرارت بردارید و ژلاتین اسفنجی‌شده را اضافه کنید.",
                "مواد را هم بزنید تا ژلاتین کاملاً حل شود و هیچ دانه‌ای باقی نماند.",
                "وانیل را اضافه کنید و مخلوط را از صافی عبور دهید تا بافتی لطیف پیدا کند.",
                "مایه پاناکوتا را داخل قالب‌های کوچک یا لیوان‌های سرو بریزید.",
                "اجازه دهید مایه در دمای محیط کمی خنک شود.",
                "قالب‌ها را حداقل ۴ ساعت در یخچال قرار دهید تا پاناکوتا کاملاً ببندد.",
                "برای خارج کردن از قالب، چند ثانیه کف قالب را در آب ولرم قرار دهید و سپس در ظرف سرو برگردانید.",
                "پاناکوتا را با سس میوه، توت‌فرنگی یا تکه‌های میوه تازه تزئین کنید."
            ),

            nutrition = NutritionInfo(
                calories = 310,
                proteinGrams = 5.0,
                carbohydratesGrams = 29.0,
                fatGrams = 20.0
            ),

            tags = listOf("دسر", "پاناکوتا", "دسر ایتالیایی", "دسر خنک", "دسر خامه‌ای", "بدون فر"),

            rating = 4.8,
            ratingCount = 218,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("خامه", "200", IngredientUnit.MILLILITER),
                Ingredients("شیر", "300", IngredientUnit.MILLILITER),
                Ingredients("شکر", "70", IngredientUnit.GRAM),
                Ingredients("پودر ژلاتین", "2", IngredientUnit.TABLESPOON),
                Ingredients("آب سرد", "4", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("وانیل", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 37,
            image = Res.drawable.food4,
            title = "ژله میوه‌ای",
            chefName = "مریم احمدی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 0,
            servings = 6,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "پودر ژله را داخل ظرفی مناسب و مقاوم به حرارت بریزید.",
                "یک لیوان آب جوش به پودر ژله اضافه کنید.",
                "مواد را با قاشق یا همزن دستی هم بزنید تا پودر ژله کاملاً حل شود و محلول شفافی به دست آید.",
                "یک لیوان آب سرد اضافه کنید و دوباره هم بزنید تا دمای مایه کاهش پیدا کند.",
                "توت‌فرنگی، موز و کیوی را بشویید و به قطعات کوچک و یکدست خرد کنید.",
                "میوه‌های خردشده را کف قالب ژله بچینید.",
                "اجازه دهید مایه ژله کمی خنک شود و سپس آن را به‌آرامی روی میوه‌ها بریزید.",
                "قالب را با احتیاط حداقل ۴ ساعت در یخچال قرار دهید تا ژله کاملاً سفت شود.",
                "پس از بستن ژله، قالب را چند ثانیه در آب ولرم قرار دهید تا دیواره‌های آن آزاد شوند.",
                "ژله را در ظرف سرو برگردانید و با چند تکه میوه تازه تزئین کنید."
            ),

            nutrition = NutritionInfo(
                calories = 125,
                proteinGrams = 2.0,
                carbohydratesGrams = 29.0,
                fatGrams = 0.2
            ),

            tags = listOf("دسر", "ژله", "ژله میوه‌ای", "دسر خنک", "میوه‌ای", "مناسب مهمانی"),

            rating = 4.7,
            ratingCount = 192,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("پودر ژله", "1", IngredientUnit.PACK),
                Ingredients("آب جوش", "250", IngredientUnit.MILLILITER),
                Ingredients("آب سرد", "250", IngredientUnit.MILLILITER),
                Ingredients("توت‌فرنگی", "100", IngredientUnit.GRAM),
                Ingredients("موز", "1", IngredientUnit.PIECE),
                Ingredients("کیوی", "1", IngredientUnit.PIECE)
            ),

            spices = listOf()
        ),

        recipe(
            id = 38,
            image = Res.drawable.food5,
            title = "پودینگ شکلاتی",
            chefName = "سارا محمدی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 10,
            cookingTimeMinutes = 15,
            servings = 5,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "نشاسته ذرت، شکر و پودر کاکائو را داخل قابلمه‌ای مناسب بریزید و مخلوط کنید.",
                "شیر سرد را به‌تدریج اضافه کنید و هم بزنید تا مواد کاملاً حل شوند و گلوله‌ای باقی نماند.",
                "قابلمه را روی حرارت ملایم قرار دهید.",
                "مواد را مرتب با همزن دستی هم بزنید تا به‌تدریج غلیظ شوند.",
                "وقتی مایه به غلظت فرنی رسید، شکلات تلخ خردشده را اضافه کنید.",
                "کره را اضافه کرده و هم بزنید تا شکلات و کره کاملاً ذوب شوند.",
                "وانیل را اضافه کنید و قابلمه را از روی حرارت بردارید.",
                "پودینگ را در حالی که هنوز گرم است داخل ظرف‌های سرو بریزید.",
                "برای جلوگیری از ایجاد لایه روی سطح، سلفون را مستقیماً روی سطح پودینگ قرار دهید.",
                "پس از خنک شدن در دمای محیط، ظرف‌ها را حداقل ۲ ساعت در یخچال قرار دهید.",
                "پودینگ را با خامه فرم‌گرفته، شکلات رنده‌شده یا میوه دلخواه تزئین و سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 325,
                proteinGrams = 7.0,
                carbohydratesGrams = 43.0,
                fatGrams = 14.0
            ),

            tags = listOf("دسر", "پودینگ", "شکلاتی", "دسر خنک", "دسر خانگی", "بدون فر"),

            rating = 4.8,
            ratingCount = 245,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("شیر", "500", IngredientUnit.MILLILITER),
                Ingredients("شکر", "100", IngredientUnit.GRAM),
                Ingredients("پودر کاکائو", "3", IngredientUnit.TABLESPOON),
                Ingredients("نشاسته ذرت", "3", IngredientUnit.TABLESPOON),
                Ingredients("شکلات تلخ", "80", IngredientUnit.GRAM),
                Ingredients("کره", "30", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("وانیل", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 39,
            image = Res.drawable.food6,
            title = "چیزکیک",
            chefName = "نگار رضایی",
            cuisine = "آمریکایی",
            preparationTimeMinutes = 30,
            cookingTimeMinutes = 60,
            servings = 8,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "بیسکویت‌های پتی‌بور را داخل غذاساز خرد کنید تا کاملاً پودر شوند.",
                "کره را ذوب کنید و به بیسکویت خردشده اضافه کنید.",
                "مواد را مخلوط کنید تا بافتی شبیه شن مرطوب پیدا کنند.",
                "مخلوط بیسکویت را کف قالب کمربندی بریزید و با پشت قاشق یا لیوان کاملاً فشرده کنید.",
                "قالب را حدود ۲۰ دقیقه در یخچال قرار دهید تا لایه پایه سفت شود.",
                "پنیر خامه‌ای را که به دمای محیط رسیده است با شکر مخلوط کنید تا بافتی نرم و یکدست پیدا کند.",
                "تخم‌مرغ‌ها را یکی‌یکی اضافه کنید و پس از هر بار افزودن، مواد را با دور کم هم بزنید.",
                "خامه و وانیل را اضافه کنید و فقط تا یکدست شدن مایه هم بزنید.",
                "مایه پنیری را روی لایه بیسکویتی بریزید و سطح آن را صاف کنید.",
                "قالب را در فر از قبل گرم‌شده با دمای ۱۶۰ درجه سانتی‌گراد قرار دهید.",
                "حدود ۵۰ تا ۶۰ دقیقه بپزید تا اطراف چیزکیک بسته شود و مرکز آن کمی لرزان باقی بماند.",
                "فر را خاموش کنید و اجازه دهید چیزکیک با درِ نیمه‌باز فر به‌آرامی خنک شود.",
                "پس از رسیدن به دمای محیط، چیزکیک را چند ساعت در یخچال قرار دهید تا کاملاً سرد و منسجم شود.",
                "پیش از سرو، روی دسر را با سس میوه یا مربای دلخواه تزئین کنید."
            ),

            nutrition = NutritionInfo(
                calories = 465,
                proteinGrams = 8.0,
                carbohydratesGrams = 39.0,
                fatGrams = 31.0
            ),

            tags = listOf("دسر", "چیزکیک", "دسر آمریکایی", "دسر پنیری", "مناسب مهمانی", "دسر مجلسی"),

            rating = 4.9,
            ratingCount = 341,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("پنیر خامه‌ای", "400", IngredientUnit.GRAM),
                Ingredients("بیسکویت پتی‌بور", "200", IngredientUnit.GRAM),
                Ingredients("کره", "100", IngredientUnit.GRAM),
                Ingredients("شکر", "120", IngredientUnit.GRAM),
                Ingredients("تخم‌مرغ", "2", IngredientUnit.PIECE),
                Ingredients("خامه", "150", IngredientUnit.MILLILITER),
                Ingredients("سس میوه", "100", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("وانیل", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 40,
            image = Res.drawable.food1,
            title = "فرنی",
            chefName = "الناز کریمی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 10,
            cookingTimeMinutes = 20,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "آرد برنج را داخل قابلمه‌ای مناسب بریزید.",
                "شیر سرد را به‌تدریج اضافه کنید و هم بزنید تا آرد کاملاً در شیر حل شود.",
                "قابلمه را روی حرارت ملایم قرار دهید.",
                "مواد را مرتب با قاشق چوبی یا همزن دستی هم بزنید تا ته نگیرند.",
                "شکر را اضافه کنید و به هم زدن ادامه دهید تا کاملاً حل شود.",
                "وقتی فرنی کمی غلیظ شد، گلاب را اضافه کنید.",
                "در صورت تمایل زعفران دم‌کرده را نیز اضافه کنید و مواد را هم بزنید تا رنگ یکنواختی پیدا کند.",
                "پس از رسیدن فرنی به غلظتی نرم و کرمی، قابلمه را از روی حرارت بردارید.",
                "فرنی را بلافاصله داخل ظرف‌های سرو بریزید.",
                "اجازه دهید فرنی کمی خنک شود و سپس با دارچین و خلال پسته تزئین کنید."
            ),

            nutrition = NutritionInfo(
                calories = 235,
                proteinGrams = 7.0,
                carbohydratesGrams = 39.0,
                fatGrams = 6.0
            ),

            tags = listOf("دسر", "فرنی", "غذای ایرانی", "دسر سنتی", "دسر شیری", "میان‌وعده"),

            rating = 4.8,
            ratingCount = 286,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("شیر", "500", IngredientUnit.MILLILITER),
                Ingredients("آرد برنج", "4", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "5", IngredientUnit.TABLESPOON),
                Ingredients("گلاب", "3", IngredientUnit.TABLESPOON),
                Ingredients("خلال پسته", "20", IngredientUnit.GRAM),
                Ingredients("زعفران دم‌کرده", "1", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("دارچین", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 41,
            image = Res.drawable.food2,
            title = "شله‌زرد",
            chefName = "ترانه شریفی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 30,
            cookingTimeMinutes = 90,
            servings = 6,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "برنج نیم‌دانه را چند بار با آب سرد بشویید تا آب آن نسبتاً شفاف شود.",
                "برنج را حدود ۲ تا ۳ ساعت در آب خیس کنید.",
                "برنج خیس‌خورده را همراه آب در قابلمه‌ای بزرگ بریزید.",
                "قابلمه را روی حرارت متوسط قرار دهید تا آب به جوش بیاید.",
                "پس از جوش آمدن، کف روی آب را بگیرید و حرارت را کم کنید.",
                "اجازه دهید برنج به‌آرامی بپزد و کاملاً شکفته و نرم شود.",
                "زعفران دم‌کرده غلیظ را اضافه کنید و هم بزنید تا رنگ شله‌زرد یکنواخت شود.",
                "شکر را کم‌کم اضافه کنید و مرتب هم بزنید تا کاملاً حل شود.",
                "گلاب را اضافه کنید و مواد را به‌آرامی مخلوط کنید.",
                "کره را داخل قابلمه بریزید و هم بزنید تا کاملاً ذوب شود.",
                "خلال بادام را اضافه کنید و اجازه دهید شله‌زرد با حرارت ملایم غلیظ شود.",
                "در صورت غلیظ شدن بیش از حد، کمی آب جوش اضافه کنید و هم بزنید.",
                "پس از رسیدن به غلظت مناسب، شله‌زرد را داخل ظرف‌های سرو بریزید.",
                "پس از خنک شدن، روی شله‌زرد را با دارچین، خلال بادام و خلال پسته تزئین کنید."
            ),

            nutrition = NutritionInfo(
                calories = 390,
                proteinGrams = 5.0,
                carbohydratesGrams = 82.0,
                fatGrams = 6.0
            ),

            tags = listOf("دسر", "شله‌زرد", "غذای ایرانی", "دسر سنتی", "زعفرانی", "مناسب نذری"),

            rating = 4.9,
            ratingCount = 358,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("برنج نیم‌دانه", "250", IngredientUnit.GRAM),
                Ingredients("شکر", "400", IngredientUnit.GRAM),
                Ingredients("آب", "2", IngredientUnit.LITER),
                Ingredients("گلاب", "100", IngredientUnit.MILLILITER),
                Ingredients("خلال بادام", "50", IngredientUnit.GRAM),
                Ingredients("کره", "50", IngredientUnit.GRAM),
                Ingredients("زعفران دم‌کرده", "4", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("دارچین", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 42,
            image = Res.drawable.food3,
            title = "بستنی خانگی",
            chefName = "مریم احمدی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 0,
            servings = 6,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "خامه پرچرب و سرد را داخل ظرفی مناسب بریزید و با همزن کمی بزنید تا حجم بگیرد.",
                "شیر عسلی را به خامه اضافه کنید.",
                "وانیل را اضافه کرده و مواد را با دور ملایم همزن مخلوط کنید.",
                "مخلوط را آن‌قدر بزنید تا بافتی یکدست، حجیم و کرمی پیدا کند.",
                "شکلات چیپسی را به‌آرامی با لیسک داخل مایه بستنی مخلوط کنید.",
                "مغز پسته خردشده را نیز اضافه کنید و مواد را به‌آرامی هم بزنید.",
                "مایه بستنی را داخل ظرف دردار و مناسب فریزر بریزید و سطح آن را صاف کنید.",
                "ظرف را به مدت ۶ تا ۸ ساعت در فریزر قرار دهید تا بستنی کاملاً سفت شود.",
                "در صورت امکان طی دو ساعت اول، هر ۳۰ تا ۴۵ دقیقه بستنی را خارج کرده و هم بزنید تا بافت نرم‌تری پیدا کند.",
                "پس از سفت شدن کامل، بستنی را چند دقیقه در دمای محیط قرار دهید تا کمی نرم شود.",
                "بستنی را با مغز پسته، شکلات یا سس دلخواه سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 385,
                proteinGrams = 5.0,
                carbohydratesGrams = 32.0,
                fatGrams = 27.0
            ),

            tags = listOf("دسر", "بستنی", "بستنی خانگی", "دسر خنک", "شکلاتی", "بدون دستگاه"),

            rating = 4.8,
            ratingCount = 263,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("خامه پرچرب", "400", IngredientUnit.MILLILITER),
                Ingredients("شیر عسلی", "200", IngredientUnit.GRAM),
                Ingredients("شکلات چیپسی", "50", IngredientUnit.GRAM),
                Ingredients("مغز پسته", "30", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("وانیل", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 43,
            image = Res.drawable.food4,
            title = "موس شکلاتی",
            chefName = "سارا محمدی",
            cuisine = "فرانسوی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 0,
            servings = 6,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "شکلات تلخ را به قطعات کوچک خرد کنید.",
                "شکلات را به روش بن‌ماری روی بخار آب ذوب کنید و اجازه دهید کمی خنک شود.",
                "زرده و سفیده تخم‌مرغ‌ها را با دقت از یکدیگر جدا کنید.",
                "زرده‌ها را با شکر مخلوط کنید تا روشن و یکدست شوند.",
                "شکلات ذوب‌شده و خنک‌شده را به مخلوط زرده اضافه کنید و هم بزنید.",
                "خامه سرد را در ظرفی جداگانه بزنید تا فرم نیمه‌سفت پیدا کند.",
                "خامه فرم‌گرفته را در چند مرحله به مخلوط شکلات اضافه کنید و با لیسک به‌آرامی هم بزنید.",
                "سفیده تخم‌مرغ را در ظرفی کاملاً تمیز با همزن بزنید تا فرم بگیرد و با برگرداندن ظرف از آن خارج نشود.",
                "سفیده فرم‌گرفته را در چند مرحله به مخلوط شکلات اضافه کنید و با حرکات دورانی آرام ترکیب کنید.",
                "وانیل را اضافه کنید و مواد را تا یکدست شدن مخلوط کنید.",
                "موس را داخل لیوان‌های سرو بریزید و سطح آن را صاف کنید.",
                "دسر را حداقل ۴ ساعت در یخچال قرار دهید تا بافت آن کاملاً منسجم شود.",
                "موس شکلاتی را با خامه فرم‌گرفته و شکلات رنده‌شده تزئین و سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 390,
                proteinGrams = 6.0,
                carbohydratesGrams = 29.0,
                fatGrams = 29.0
            ),

            tags = listOf("دسر", "موس شکلاتی", "شکلات", "دسر فرانسوی", "دسر خامه‌ای", "مناسب مهمانی"),

            rating = 4.9,
            ratingCount = 298,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("شکلات تلخ", "200", IngredientUnit.GRAM),
                Ingredients("خامه", "200", IngredientUnit.MILLILITER),
                Ingredients("تخم‌مرغ", "3", IngredientUnit.PIECE),
                Ingredients("شکر", "50", IngredientUnit.GRAM),
                Ingredients("کره", "30", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("وانیل", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 44,
            image = Res.drawable.food5,
            title = "پارفه میوه",
            chefName = "نگار رضایی",
            cuisine = "فرانسوی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 0,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "توت‌فرنگی، موز و سایر میوه‌های دلخواه را بشویید و کاملاً خشک کنید.",
                "میوه‌ها را به قطعات کوچک و یکدست خرد کنید.",
                "خامه سرد را با یک قاشق عسل مخلوط کنید و کمی هم بزنید تا بافتی نرم و سبک پیدا کند.",
                "ماست یونانی را با باقی عسل هم بزنید تا یکدست شود.",
                "خامه را به‌آرامی با ماست یونانی ترکیب کنید تا کرمی لطیف به دست آید.",
                "بیسکویت را با دست یا غذاساز خرد کنید، به‌طوری‌که کمی بافت ترد آن باقی بماند.",
                "داخل لیوان‌های سرو یک لایه بیسکویت خردشده بریزید.",
                "یک لایه از ترکیب ماست و خامه روی بیسکویت اضافه کنید.",
                "مقداری از میوه‌های خردشده را روی لایه کرمی قرار دهید.",
                "لایه‌ها را به همین ترتیب تکرار کنید تا لیوان‌ها پر شوند.",
                "روی دسر را با میوه تازه و بادام خردشده تزئین کنید.",
                "پارفه را حدود یک ساعت در یخچال قرار دهید و سپس خنک سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 285,
                proteinGrams = 8.0,
                carbohydratesGrams = 38.0,
                fatGrams = 12.0
            ),

            tags = listOf("دسر", "پارفه", "دسر میوه‌ای", "توت‌فرنگی", "دسر خنک", "میان‌وعده"),

            rating = 4.7,
            ratingCount = 184,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("توت‌فرنگی", "150", IngredientUnit.GRAM),
                Ingredients("موز", "2", IngredientUnit.PIECE),
                Ingredients("ماست یونانی", "200", IngredientUnit.GRAM),
                Ingredients("خامه", "100", IngredientUnit.MILLILITER),
                Ingredients("عسل", "3", IngredientUnit.TABLESPOON),
                Ingredients("بیسکویت", "100", IngredientUnit.GRAM),
                Ingredients("بادام خردشده", "30", IngredientUnit.GRAM)
            ),

            spices = listOf()
        ),

        recipe(
            id = 45,
            image = Res.drawable.food6,
            title = "دسر بیسکوییتی",
            chefName = "الناز کریمی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 15,
            servings = 8,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "شیر، شکر، نشاسته ذرت و پودر کاکائو را داخل قابلمه‌ای مناسب بریزید.",
                "مواد را با همزن دستی مخلوط کنید تا نشاسته و پودر کاکائو کاملاً در شیر حل شوند.",
                "قابلمه را روی حرارت ملایم قرار دهید و مرتب هم بزنید.",
                "پس از گرم شدن شیر، به هم زدن ادامه دهید تا کرم به‌تدریج غلیظ شود.",
                "وقتی کرم به غلظت مناسب رسید، قابلمه را از روی حرارت بردارید.",
                "کره و وانیل را اضافه کنید و هم بزنید تا کره کاملاً ذوب و مواد یکدست شوند.",
                "کف ظرف سرو یک لایه بیسکویت پتی‌بور بچینید.",
                "مقداری از کرم گرم را روی بیسکویت‌ها پخش کنید تا تمام سطح آن‌ها پوشیده شود.",
                "دوباره یک لایه بیسکویت و یک لایه کرم اضافه کنید.",
                "این کار را تا تمام شدن مواد ادامه دهید و لایه آخر را با کرم شکلاتی بپوشانید.",
                "اجازه دهید دسر در دمای محیط خنک شود.",
                "دسر را حداقل ۴ ساعت در یخچال قرار دهید تا لایه‌ها نرم و منسجم شوند.",
                "روی دسر را با پودر کاکائو یا شکلات رنده‌شده تزئین کنید و به شکل برش‌های منظم سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 315,
                proteinGrams = 6.0,
                carbohydratesGrams = 46.0,
                fatGrams = 12.0
            ),

            tags = listOf("دسر", "دسر بیسکوییتی", "شکلاتی", "دسر یخچالی", "بدون فر", "دسر خانگی"),

            rating = 4.8,
            ratingCount = 231,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("بیسکویت پتی‌بور", "250", IngredientUnit.GRAM),
                Ingredients("شیر", "600", IngredientUnit.MILLILITER),
                Ingredients("شکر", "100", IngredientUnit.GRAM),
                Ingredients("نشاسته ذرت", "4", IngredientUnit.TABLESPOON),
                Ingredients("پودر کاکائو", "2", IngredientUnit.TABLESPOON),
                Ingredients("کره", "40", IngredientUnit.GRAM),
                Ingredients("شکلات رنده‌شده", "30", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("وانیل", "0.5", IngredientUnit.TEASPOON)
            )
        ),
        recipe(
            id = 46,
            image = Res.drawable.food1,
            title = "کیک شکلاتی",
            chefName = "سارا محمدی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 40,
            servings = 8,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "فر را روی ۱۸۰ درجه سانتی‌گراد گرم کنید.",
                "تخم‌مرغ، شکر و وانیل را با همزن بزنید تا کرم‌رنگ و حجیم شود.",
                "شیر و روغن را اضافه کرده و مخلوط کنید.",
                "آرد، پودر کاکائو و بیکینگ‌پودر را الک کرده و به مواد اضافه کنید.",
                "مواد خشک را به‌آرامی با مواد تر مخلوط کنید تا مایه یکدستی به دست آید.",
                "مایه کیک را داخل قالب چرب‌شده بریزید.",
                "قالب را در فر قرار دهید و حدود ۳۵ تا ۴۵ دقیقه بپزید.",
                "با خلال دندان پخت کیک را بررسی کنید و پس از خنک شدن سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 385,
                proteinGrams = 6.5,
                carbohydratesGrams = 54.0,
                fatGrams = 17.0
            ),

            tags = listOf("کیک", "کیک شکلاتی", "شکلاتی", "دسر", "شیرینی خانگی", "مناسب عصرانه"),

            rating = 4.8,
            ratingCount = 286,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("آرد سفید", "۲", IngredientUnit.CUP),
                Ingredients("شکر", "۱", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("شیر", "۱", IngredientUnit.CUP),
                Ingredients("روغن مایع", "نصف", IngredientUnit.CUP),
                Ingredients("پودر کاکائو", "نصف", IngredientUnit.CUP),
                Ingredients("بیکینگ‌پودر", "۲", IngredientUnit.TEASPOON)
            ),

            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 47,
            image = Res.drawable.food2,
            title = "کیک هویج",
            chefName = "نگار رضایی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 45,
            servings = 8,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "فر را روی ۱۸۰ درجه سانتی‌گراد گرم کنید.",
                "تخم‌مرغ و شکر را با همزن بزنید تا حجیم و کرم‌رنگ شود.",
                "روغن مایع را اضافه کنید و مواد را مخلوط کنید.",
                "هویج رنده‌شده و گردوی خردشده را به مواد اضافه کنید.",
                "آرد و بیکینگ‌پودر را الک کنید.",
                "مواد خشک و دارچین را به‌آرامی به مایه اضافه کنید و هم بزنید.",
                "مایه کیک را داخل قالب چرب‌شده بریزید.",
                "کیک را حدود ۴۰ تا ۴۵ دقیقه در فر بپزید و پس از خنک شدن سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 365,
                proteinGrams = 6.0,
                carbohydratesGrams = 48.0,
                fatGrams = 17.0
            ),

            tags = listOf("کیک", "کیک هویج", "گردو", "دارچین", "شیرینی خانگی", "عصرانه"),

            rating = 4.9,
            ratingCount = 312,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("آرد سفید", "۲", IngredientUnit.CUP),
                Ingredients("هویج رنده‌شده", "۲", IngredientUnit.CUP),
                Ingredients("شکر", "۱", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("روغن مایع", "۳/۴", IngredientUnit.CUP),
                Ingredients("گردوی خردشده", "نصف", IngredientUnit.CUP),
                Ingredients("بیکینگ‌پودر", "۲", IngredientUnit.TEASPOON)
            ),

            spices = listOf(
                Spices("دارچین", "۱", IngredientUnit.TEASPOON),
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),
        recipe(
            id = 62,
            image = Res.drawable.food1,
            title = "پیتزا پپرونی",
            chefName = "علی رضایی",
            cuisine = "ایتالیایی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 15,
            servings = 2,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "خمیر پیتزا را آماده کنید و اجازه دهید حجم بگیرد.",
                "خمیر را روی سطح آردپاشی‌شده باز کنید.",
                "سس گوجه‌فرنگی را روی خمیر پخش کنید.",
                "پنیر موزارلا را روی سس بریزید.",
                "برش‌های پپرونی را روی پنیر بچینید.",
                "فلفل دلمه‌ای و قارچ خردشده را روی مواد پخش کنید.",
                "آویشن و فلفل سیاه را اضافه کنید.",
                "پیتزا را در فر از قبل گرم‌شده با دمای ۲۲۰ درجه حدود ۱۲ تا ۱۵ دقیقه بپزید.",
                "پس از طلایی شدن پنیر، پیتزا را برش زده و سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 520,
                proteinGrams = 24.0,
                carbohydratesGrams = 48.0,
                fatGrams = 25.0
            ),

            tags = listOf("پیتزا", "پیتزا پپرونی", "فست فود", "غذای ایتالیایی", "غذای خانگی", "پنیر موزارلا"),

            rating = 4.9,
            ratingCount = 342,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("خمیر پیتزا", "۱", IngredientUnit.PIECE),
                Ingredients("پنیر موزارلا", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("پپرونی", "۱۵۰", IngredientUnit.GRAM),
                Ingredients("سس گوجه‌فرنگی", "نصف", IngredientUnit.CUP),
                Ingredients("فلفل دلمه‌ای", "نصف", IngredientUnit.PIECE),
                Ingredients("قارچ", "۱۰۰", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("آویشن", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 63,
            image = Res.drawable.food2,
            title = "همبرگر خانگی",
            chefName = "امیر محمدی",
            cuisine = "آمریکایی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 15,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "گوشت چرخ‌کرده را با پیاز رنده‌شده و آب‌گرفته مخلوط کنید.",
                "نمک، فلفل و پودر سیر را اضافه کنید.",
                "مواد را خوب ورز دهید تا کاملاً یکدست شوند.",
                "گوشت را به چهار قسمت تقسیم کنید و به شکل برگر درآورید.",
                "برگرها را حدود ۳۰ دقیقه در یخچال استراحت دهید.",
                "آن‌ها را در تابه یا روی گریل با حرارت متوسط بپزید تا کاملاً مغزپخت شوند.",
                "در دقایق پایانی پنیر ورقه‌ای را روی برگرها قرار دهید تا ذوب شود.",
                "نان همبرگر را کمی گرم کنید.",
                "برگر را همراه کاهو، گوجه، خیارشور و سس داخل نان قرار دهید."
            ),

            nutrition = NutritionInfo(
                calories = 560,
                proteinGrams = 32.0,
                carbohydratesGrams = 38.0,
                fatGrams = 29.0
            ),

            tags = listOf("همبرگر", "برگر خانگی", "فست فود", "غذای آمریکایی", "گوشت چرخ‌کرده", "ساندویچ"),

            rating = 4.8,
            ratingCount = 298,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت چرخ‌کرده", "۴۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("نان همبرگر", "۴", IngredientUnit.PIECE),
                Ingredients("کاهو", "۴", IngredientUnit.LEAF),
                Ingredients("گوجه‌فرنگی", "۱", IngredientUnit.PIECE),
                Ingredients("خیارشور", "۴", IngredientUnit.PIECE),
                Ingredients("پنیر ورقه‌ای", "۴", IngredientUnit.PIECE)
            ),

            spices = listOf(
                Spices("نمک", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 64,
            image = Res.drawable.food3,
            title = "هات‌داگ",
            chefName = "محمد کریمی",
            cuisine = "آمریکایی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 15,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "سوسیس‌ها را در آب جوش چند دقیقه گرم کنید یا در تابه سرخ کنید.",
                "پیاز را خلالی خرد کرده و با کمی روغن تفت دهید تا طلایی شود.",
                "قارچ خردشده را اضافه کنید و تفت دهید تا آب آن کشیده شود.",
                "فلفل سیاه و آویشن را به قارچ و پیاز اضافه کنید.",
                "نان هات‌داگ را کمی گرم کنید.",
                "سوسیس را داخل نان قرار دهید.",
                "قارچ، پیاز و خیارشور خردشده را اضافه کنید.",
                "سس خردل و کچاپ را روی مواد بریزید.",
                "هات‌داگ را گرم سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 430,
                proteinGrams = 17.0,
                carbohydratesGrams = 39.0,
                fatGrams = 23.0
            ),

            tags = listOf("هات‌داگ", "فست فود", "ساندویچ", "سوسیس", "غذای سریع", "غذای خیابانی"),

            rating = 4.7,
            ratingCount = 215,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("سوسیس", "۴", IngredientUnit.PIECE),
                Ingredients("نان هات‌داگ", "۴", IngredientUnit.PIECE),
                Ingredients("قارچ", "۱۵۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("خیارشور", "۴", IngredientUnit.PIECE),
                Ingredients("سس خردل", "۲", IngredientUnit.TABLESPOON),
                Ingredients("سس کچاپ", "۲", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پودر آویشن", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 65,
            image = Res.drawable.food4,
            title = "ساندویچ مرغ",
            chefName = "علی رضایی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 20,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "سینه مرغ را به قطعات کوچک برش دهید.",
                "مرغ را با نمک، فلفل و پودر سیر مزه‌دار کنید.",
                "مرغ را با کمی روغن در تابه بپزید تا کاملاً مغزپخت شود.",
                "قارچ و فلفل دلمه‌ای خردشده را اضافه کرده و تفت دهید.",
                "نان ساندویچی را باز کنید و کمی سس داخل آن بمالید.",
                "مرغ و سبزیجات را داخل نان قرار دهید.",
                "کاهو، گوجه و خیارشور را اضافه کنید.",
                "در صورت تمایل کمی پنیر روی مواد قرار دهید و ساندویچ را سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 410,
                proteinGrams = 32.0,
                carbohydratesGrams = 42.0,
                fatGrams = 13.0
            ),

            tags = listOf("ساندویچ مرغ", "مرغ", "فست فود", "ساندویچ خانگی", "غذای سریع", "غذای سبک"),

            rating = 4.8,
            ratingCount = 267,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("سینه مرغ", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("نان ساندویچی", "۲", IngredientUnit.PIECE),
                Ingredients("قارچ", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("فلفل دلمه‌ای", "۱", IngredientUnit.PIECE),
                Ingredients("کاهو", "۴", IngredientUnit.LEAF),
                Ingredients("گوجه‌فرنگی", "۱", IngredientUnit.PIECE),
                Ingredients("خیارشور", "۳", IngredientUnit.PIECE)
            ),

            spices = listOf(
                Spices("پودر سیر", "۱", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 66,
            image = Res.drawable.food5,
            title = "لازانیا",
            chefName = "امیر محمدی",
            cuisine = "ایتالیایی",
            preparationTimeMinutes = 30,
            cookingTimeMinutes = 40,
            servings = 6,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "پیاز خردشده را در روغن تفت دهید تا نرم و طلایی شود.",
                "گوشت چرخ‌کرده را اضافه کنید و تفت دهید تا رنگ آن تغییر کند.",
                "قارچ و فلفل دلمه‌ای خردشده را اضافه کنید.",
                "رب گوجه‌فرنگی را اضافه کرده و چند دقیقه تفت دهید.",
                "نمک و ادویه‌ها را اضافه کنید و اجازه دهید مایه گوشتی بپزد.",
                "برای تهیه سس بشامل، کره را در قابلمه ذوب کنید.",
                "آرد را به کره اضافه کنید و کمی تفت دهید.",
                "شیر را کم‌کم اضافه کنید و مرتب هم بزنید تا سس غلیظ و یکدست شود.",
                "ورقه‌های لازانیا را طبق دستور بسته آماده کنید.",
                "در ظرف فر یک لایه سس بشامل، ورقه لازانیا و مایه گوشتی بریزید.",
                "لایه‌ها را تکرار کنید و در پایان پنیر موزارلا اضافه کنید.",
                "لازانیا را در فر ۱۸۰ درجه حدود ۳۰ تا ۴۰ دقیقه بپزید.",
                "پس از خارج کردن از فر، چند دقیقه استراحت دهید و سپس برش بزنید."
            ),

            nutrition = NutritionInfo(
                calories = 490,
                proteinGrams = 28.0,
                carbohydratesGrams = 43.0,
                fatGrams = 23.0
            ),

            tags = listOf("لازانیا", "غذای ایتالیایی", "پاستا", "گوشت چرخ‌کرده", "پنیر موزارلا", "غذای فر"),

            rating = 4.9,
            ratingCount = 376,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("ورقه لازانیا", "۹", IngredientUnit.PIECE),
                Ingredients("گوشت چرخ‌کرده", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("قارچ", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("فلفل دلمه‌ای", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۲", IngredientUnit.TABLESPOON),
                Ingredients("پنیر موزارلا", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("شیر", "۲", IngredientUnit.CUP),
                Ingredients("آرد سفید", "۲", IngredientUnit.TABLESPOON),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("آویشن", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 67,
            image = Res.drawable.food6,
            title = "سیب‌زمینی تنوری",
            chefName = "محمد کریمی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 40,
            servings = 3,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "سیب‌زمینی‌ها را خوب بشویید و به شکل قاچ‌های درشت برش دهید.",
                "در صورت تمایل پوست سیب‌زمینی‌ها را جدا نکنید.",
                "سیب‌زمینی‌ها را با روغن زیتون و سیر خردشده مخلوط کنید.",
                "نمک، فلفل، پاپریکا و آویشن را اضافه کنید.",
                "سیب‌زمینی‌ها را در سینی فر با فاصله بچینید.",
                "در فر از قبل گرم‌شده با دمای ۲۰۰ درجه حدود ۳۵ تا ۴۵ دقیقه بپزید.",
                "در نیمه زمان پخت، سیب‌زمینی‌ها را برگردانید.",
                "پس از طلایی و برشته شدن، پنیر پارمزان را روی آن‌ها بپاشید و سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 285,
                proteinGrams = 7.0,
                carbohydratesGrams = 39.0,
                fatGrams = 12.0
            ),

            tags = listOf("سیب‌زمینی تنوری", "پیش‌غذا", "غذای فر", "سیب‌زمینی", "میان‌وعده", "غذای گیاهی"),

            rating = 4.8,
            ratingCount = 194,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("سیب‌زمینی", "۵۰۰", IngredientUnit.GRAM),
                Ingredients("روغن زیتون", "۳", IngredientUnit.TABLESPOON),
                Ingredients("سیر", "۲", IngredientUnit.PIECE),
                Ingredients("پنیر پارمزان", "۳۰", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("پاپریکا", "۱", IngredientUnit.TEASPOON),
                Spices("آویشن", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 68,
            image = Res.drawable.food1,
            title = "ناگت مرغ",
            chefName = "علی رضایی",
            cuisine = "آمریکایی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 15,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "سینه مرغ را چرخ یا کاملاً ریز خرد کنید.",
                "مرغ را با نمک، فلفل و پودر سیر مخلوط کنید.",
                "پنیر پارمزان را اضافه کنید و مواد را خوب هم بزنید.",
                "از مواد تکه‌های کوچک و یک‌شکل درست کنید.",
                "ناگت‌ها را ابتدا در آرد بغلتانید.",
                "سپس آن‌ها را در تخم‌مرغ زده‌شده فرو ببرید.",
                "در پایان ناگت‌ها را با پودر سوخاری کاملاً بپوشانید.",
                "ناگت‌ها را در روغن داغ با حرارت متوسط سرخ کنید تا طلایی و مغزپخت شوند.",
                "پس از سرخ شدن، روی دستمال قرار دهید تا روغن اضافی گرفته شود.",
                "با سس دلخواه سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 390,
                proteinGrams = 30.0,
                carbohydratesGrams = 25.0,
                fatGrams = 19.0
            ),

            tags = listOf("ناگت مرغ", "مرغ سوخاری", "فست فود", "پیش‌غذا", "غذای کودک", "ساندویچ"),

            rating = 4.9,
            ratingCount = 321,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("سینه مرغ", "۴۰۰", IngredientUnit.GRAM),
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("آرد سفید", "نصف", IngredientUnit.CUP),
                Ingredients("پودر سوخاری", "۱", IngredientUnit.CUP),
                Ingredients("پنیر پارمزان", "۳۰", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("پودر سیر", "۱", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 69,
            image = Res.drawable.food2,
            title = "ساندویچ کلاب",
            chefName = "امیر محمدی",
            cuisine = "آمریکایی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 15,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "سینه مرغ را با کمی نمک و فلفل بپزید و به برش‌های نازک تقسیم کنید.",
                "نان تست‌ها را کمی برشته کنید.",
                "روی یک برش نان سس مایونز بمالید.",
                "مرغ، کاهو و گوجه را روی نان قرار دهید.",
                "برش دوم نان را اضافه کنید و ژامبون و پنیر را روی آن بچینید.",
                "در صورت تمایل کمی سس مایونز روی برش دوم نان بمالید.",
                "برش سوم نان را قرار دهید.",
                "ساندویچ را به شکل مثلثی برش دهید و با خلال دندان ثابت کنید.",
                "ساندویچ کلاب را همراه سیب‌زمینی سرخ‌کرده یا سالاد سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 460,
                proteinGrams = 29.0,
                carbohydratesGrams = 43.0,
                fatGrams = 19.0
            ),

            tags = listOf("ساندویچ کلاب", "ساندویچ مرغ", "فست فود", "ژامبون", "غذای سریع", "صبحانه"),

            rating = 4.8,
            ratingCount = 246,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("نان تست", "۶", IngredientUnit.PIECE),
                Ingredients("سینه مرغ", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("ژامبون", "۴", IngredientUnit.PIECE),
                Ingredients("پنیر ورقه‌ای", "۲", IngredientUnit.PIECE),
                Ingredients("کاهو", "۴", IngredientUnit.LEAF),
                Ingredients("گوجه‌فرنگی", "۱", IngredientUnit.PIECE),
                Ingredients("سس مایونز", "۳", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 70,
            image = Res.drawable.food3,
            title = "پیتزا سبزیجات",
            chefName = "محمد کریمی",
            cuisine = "ایتالیایی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 15,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "فر را روی دمای ۲۲۰ درجه سانتی‌گراد گرم کنید.",
                "خمیر پیتزا را روی سطح آردپاشی‌شده باز کنید.",
                "سس گوجه‌فرنگی را روی خمیر پخش کنید.",
                "مقداری پنیر موزارلا روی سس بریزید.",
                "قارچ و فلفل دلمه‌ای را خرد کنید.",
                "زیتون را حلقه‌ای خرد کنید و همراه ذرت روی خمیر پخش کنید.",
                "باقی پنیر را روی مواد بریزید.",
                "آویشن و فلفل سیاه را اضافه کنید.",
                "پیتزا را در فر حدود ۱۲ تا ۱۵ دقیقه بپزید تا خمیر طلایی و پنیر ذوب شود."
            ),

            nutrition = NutritionInfo(
                calories = 390,
                proteinGrams = 18.0,
                carbohydratesGrams = 49.0,
                fatGrams = 14.0
            ),

            tags = listOf("پیتزا سبزیجات", "پیتزا", "غذای گیاهی", "غذای ایتالیایی", "قارچ", "غذای خانگی"),

            rating = 4.7,
            ratingCount = 183,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("خمیر پیتزا", "۱", IngredientUnit.PIECE),
                Ingredients("پنیر موزارلا", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("قارچ", "۱۵۰", IngredientUnit.GRAM),
                Ingredients("فلفل دلمه‌ای", "۱", IngredientUnit.PIECE),
                Ingredients("ذرت", "نصف", IngredientUnit.CUP),
                Ingredients("زیتون", "نصف", IngredientUnit.CUP),
                Ingredients("سس گوجه‌فرنگی", "نصف", IngredientUnit.CUP)
            ),

            spices = listOf(
                Spices("آویشن", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 71,
            image = Res.drawable.food4,
            title = "تاکوی مرغ",
            chefName = "علی رضایی",
            cuisine = "مکزیکی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 15,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "سینه مرغ را به نوارهای باریک برش دهید.",
                "مرغ را با روغن، پاپریکا، زیره و فلفل مزه‌دار کنید.",
                "مرغ را در تابه داغ بپزید تا کاملاً مغزپخت شود.",
                "پیاز را خلالی خرد کرده و همراه مرغ کمی تفت دهید.",
                "نان تاکو یا ترتیلا را در تابه کمی گرم کنید.",
                "کاهو و گوجه را خرد کنید.",
                "مرغ را همراه سبزیجات داخل نان قرار دهید.",
                "پنیر رنده‌شده و آبلیمو را اضافه کنید.",
                "تاکوها را با سس دلخواه سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 370,
                proteinGrams = 29.0,
                carbohydratesGrams = 31.0,
                fatGrams = 15.0
            ),

            tags = listOf("تاکوی مرغ", "غذای مکزیکی", "مرغ", "فست فود", "غذای سریع", "تاکو"),

            rating = 4.8,
            ratingCount = 229,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("سینه مرغ", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("نان ترتیلا", "۴", IngredientUnit.PIECE),
                Ingredients("کاهو", "۴", IngredientUnit.LEAF),
                Ingredients("گوجه‌فرنگی", "۲", IngredientUnit.PIECE),
                Ingredients("پنیر چدار", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("آبلیمو", "۲", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("پاپریکا", "۱", IngredientUnit.TEASPOON),
                Spices("زیره سبز", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل قرمز", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 72,
            image = Res.drawable.food5,
            title = "رپ مرغ",
            chefName = "امیر محمدی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 15,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "سینه مرغ را به قطعات باریک برش دهید.",
                "مرغ را با نمک، فلفل و پاپریکا مزه‌دار کنید.",
                "مرغ را در تابه با کمی روغن بپزید تا کاملاً مغزپخت شود.",
                "نان ترتیلا را کمی گرم کنید تا نرم شود.",
                "سس مایونز را روی سطح نان پخش کنید.",
                "مرغ، کاهو، گوجه و خیارشور را وسط نان قرار دهید.",
                "پنیر ورقه‌ای را روی مواد بگذارید.",
                "لبه‌های نان را تا کنید و آن را محکم رول کنید.",
                "رپ را از وسط برش دهید و سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 420,
                proteinGrams = 31.0,
                carbohydratesGrams = 36.0,
                fatGrams = 17.0
            ),

            tags = listOf("رپ مرغ", "ساندویچ مرغ", "غذای سریع", "فست فود", "مرغ", "غذای سبک"),

            rating = 4.8,
            ratingCount = 204,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("سینه مرغ", "۲۵۰", IngredientUnit.GRAM),
                Ingredients("نان ترتیلا", "۲", IngredientUnit.PIECE),
                Ingredients("کاهو", "۴", IngredientUnit.LEAF),
                Ingredients("گوجه‌فرنگی", "۱", IngredientUnit.PIECE),
                Ingredients("خیارشور", "۲", IngredientUnit.PIECE),
                Ingredients("سس مایونز", "۲", IngredientUnit.TABLESPOON),
                Ingredients("پنیر ورقه‌ای", "۲", IngredientUnit.PIECE)
            ),

            spices = listOf(
                Spices("پاپریکا", "۱", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 73,
            image = Res.drawable.food6,
            title = "پنینی ژامبون",
            chefName = "محمد کریمی",
            cuisine = "ایتالیایی",
            preparationTimeMinutes = 10,
            cookingTimeMinutes = 10,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "نان پنینی را از وسط باز کنید.",
                "روی یک سمت نان سس خردل بمالید.",
                "ژامبون، پنیر، گوجه و قارچ را داخل نان قرار دهید.",
                "کمی آویشن و فلفل سیاه روی مواد بپاشید.",
                "نان را ببندید و در دستگاه پنینی‌ساز قرار دهید.",
                "چند دقیقه حرارت دهید تا نان برشته و پنیر کاملاً ذوب شود.",
                "پنینی را از دستگاه خارج کنید و به دو قسمت برش دهید.",
                "پنینی را داغ سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 445,
                proteinGrams = 23.0,
                carbohydratesGrams = 42.0,
                fatGrams = 20.0
            ),

            tags = listOf("پنینی", "پنینی ژامبون", "ساندویچ", "غذای ایتالیایی", "فست فود", "پنیر"),

            rating = 4.7,
            ratingCount = 176,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("نان پنینی", "۲", IngredientUnit.PIECE),
                Ingredients("ژامبون", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("پنیر موزارلا", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("گوجه‌فرنگی", "۱", IngredientUnit.PIECE),
                Ingredients("قارچ", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("سس خردل", "۱", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("آویشن", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 74,
            image = Res.drawable.food1,
            title = "ماکارونی فوری",
            chefName = "علی رضایی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 25,
            servings = 3,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "ماکارونی را در آب جوش و نمک بپزید و آبکش کنید.",
                "پیاز خردشده را در تابه با روغن تفت دهید تا طلایی شود.",
                "گوشت چرخ‌کرده را اضافه کنید و تفت دهید تا رنگ آن تغییر کند.",
                "رب گوجه‌فرنگی را اضافه کنید و چند دقیقه تفت دهید.",
                "نمک، زردچوبه، فلفل سیاه و آویشن را اضافه کنید.",
                "کمی آب به سس اضافه کنید و اجازه دهید چند دقیقه جا بیفتد.",
                "ماکارونی را با سس مخلوط کنید.",
                "مواد را چند دقیقه روی حرارت ملایم قرار دهید تا مزه‌ها ترکیب شوند.",
                "ماکارونی را در ظرف مناسب بریزید و گرم سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 460,
                proteinGrams = 22.0,
                carbohydratesGrams = 61.0,
                fatGrams = 15.0
            ),

            tags = listOf("ماکارونی", "پاستا", "غذای ایرانی", "غذای سریع", "گوشت چرخ‌کرده", "غذای خانگی"),

            rating = 4.8,
            ratingCount = 291,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("ماکارونی", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("گوشت چرخ‌کرده", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۲", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("آویشن", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 75,
            image = Res.drawable.food2,
            title = "کوئسادیای مرغ",
            chefName = "امیر محمدی",
            cuisine = "مکزیکی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 15,
            servings = 2,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "سینه مرغ را به قطعات کوچک خرد کنید.",
                "مرغ را با پاپریکا، فلفل و کمی روغن در تابه بپزید.",
                "فلفل دلمه‌ای و پیاز خردشده را اضافه کنید و تفت دهید.",
                "یک نان ترتیلا را در تابه قرار دهید.",
                "روی نصف نان پنیر چدار و مواد مرغ را پخش کنید.",
                "نان را از وسط تا کنید و کمی فشار دهید.",
                "دو طرف آن را روی حرارت ملایم برشته کنید تا پنیر کاملاً ذوب شود.",
                "کوئسادیای آماده را از تابه خارج کرده و به چند قسمت برش دهید.",
                "با سس دلخواه سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 485,
                proteinGrams = 35.0,
                carbohydratesGrams = 34.0,
                fatGrams = 23.0
            ),

            tags = listOf("کوئسادیای مرغ", "غذای مکزیکی", "مرغ", "پنیر چدار", "فست فود", "غذای سریع"),

            rating = 4.9,
            ratingCount = 263,
            isFavorite = false,
            isFeatured = true,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("سینه مرغ", "۲۵۰", IngredientUnit.GRAM),
                Ingredients("نان ترتیلا", "۲", IngredientUnit.PIECE),
                Ingredients("پنیر چدار", "۱۵۰", IngredientUnit.GRAM),
                Ingredients("فلفل دلمه‌ای", "۱", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("روغن زیتون", "۱", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("پاپریکا", "۱", IngredientUnit.TEASPOON),
                Spices("زیره سبز", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),
        recipe(
            id = 93,
            image = Res.drawable.food1,
            title = "کوکو سیب‌زمینی",
            chefName = "مریم احمدی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 25,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "سیب‌زمینی‌ها را آب‌پز کنید و اجازه دهید خنک شوند.",
                "سیب‌زمینی‌ها را پوست بگیرید و رنده یا له کنید.",
                "تخم‌مرغ، پیاز رنده‌شده و آب‌گرفته را اضافه کنید.",
                "نمک و ادویه‌ها را اضافه کرده و مواد را مخلوط کنید.",
                "از مواد به اندازه دلخواه بردارید و در تابه شکل دهید.",
                "کوکوها را در روغن داغ با حرارت متوسط سرخ کنید.",
                "پس از طلایی شدن هر دو طرف، روی دستمال قرار دهید و سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 310,
                proteinGrams = 10.0,
                carbohydratesGrams = 35.0,
                fatGrams = 14.0
            ),

            tags = listOf("غذای ایرانی", "کوکو", "سیب‌زمینی", "غذای ساده", "غذای خانگی"),

            rating = 4.7,
            ratingCount = 198,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("سیب‌زمینی", "۴", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("آرد سفید", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۴", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 94,
            image = Res.drawable.food2,
            title = "کتلت",
            chefName = "ترانه شریفی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 30,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "سیب‌زمینی و پیاز را رنده کنید و آب اضافی آن‌ها را بگیرید.",
                "گوشت چرخ‌کرده را به مواد اضافه کنید.",
                "تخم‌مرغ، نمک و ادویه‌ها را اضافه کنید.",
                "مواد را خوب ورز دهید تا یکدست شوند.",
                "از مواد بردارید و به شکل بیضی و تخت فرم دهید.",
                "کتلت‌ها را در روغن داغ با حرارت متوسط سرخ کنید.",
                "پس از طلایی شدن هر دو طرف، روی دستمال قرار دهید و سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 390,
                proteinGrams = 24.0,
                carbohydratesGrams = 28.0,
                fatGrams = 19.0
            ),

            tags = listOf("غذای ایرانی", "کتلت", "گوشت چرخ‌کرده", "غذای خانگی", "غذای سنتی"),

            rating = 4.8,
            ratingCount = 267,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت چرخ‌کرده", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("سیب‌زمینی", "۲", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "۱", IngredientUnit.PIECE),
                Ingredients("آرد سوخاری", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۴", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 95,
            image = Res.drawable.food3,
            title = "فلافل ساندویچی",
            chefName = "علی رضایی",
            cuisine = "عربی",
            preparationTimeMinutes = 30,
            cookingTimeMinutes = 20,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "نخود را از شب قبل در آب خیس کنید و چند بار آب آن را عوض کنید.",
                "نخود آبکش‌شده را همراه سیر و پیاز چرخ کنید.",
                "جعفری خردشده و ادویه‌ها را اضافه کنید.",
                "مواد را مخلوط کنید تا خمیر منسجمی به دست آید.",
                "خمیر را حدود یک ساعت در یخچال استراحت دهید.",
                "با قالب فلافل از مواد بردارید و در روغن داغ سرخ کنید.",
                "فلافل‌ها را داخل نان با کاهو، گوجه، خیارشور و سس سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 460,
                proteinGrams = 16.0,
                carbohydratesGrams = 62.0,
                fatGrams = 17.0
            ),

            tags = listOf("غذای عربی", "فلافل", "ساندویچ", "غذای گیاهی", "غذای خیابانی"),

            rating = 4.8,
            ratingCount = 312,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("نخود خشک", "۲", IngredientUnit.CUP),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("سیر", "۳", IngredientUnit.PIECE),
                Ingredients("جعفری خردشده", "نصف", IngredientUnit.CUP),
                Ingredients("نان ساندویچی", "۴", IngredientUnit.PIECE),
                Ingredients("خیارشور", "۴", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "۲", IngredientUnit.PIECE)
            ),

            spices = listOf(
                Spices("زیره سبز", "۱", IngredientUnit.TEASPOON),
                Spices("پودر تخم گشنیز", "۱", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل قرمز", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 96,
            image = Res.drawable.food4,
            title = "شامی کباب",
            chefName = "سارا محمدی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 35,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "لپه را بشویید و با آب بپزید تا نرم شود.",
                "لپه پخته را آبکش کرده و له کنید.",
                "گوشت چرخ‌کرده، پیاز رنده‌شده و تخم‌مرغ را اضافه کنید.",
                "نمک و ادویه‌ها را اضافه کرده و مواد را ورز دهید.",
                "از مواد بردارید و به شکل گرد و تخت فرم دهید.",
                "وسط هر شامی را با انگشت کمی سوراخ کنید.",
                "شامی‌ها را در روغن داغ سرخ کنید تا هر دو طرف طلایی شود."
            ),

            nutrition = NutritionInfo(
                calories = 420,
                proteinGrams = 27.0,
                carbohydratesGrams = 25.0,
                fatGrams = 22.0
            ),

            tags = listOf("غذای ایرانی", "شامی کباب", "گوشت چرخ‌کرده", "لپه", "غذای سنتی"),

            rating = 4.8,
            ratingCount = 223,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("گوشت چرخ‌کرده", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("لپه", "۱", IngredientUnit.CUP),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("آرد نخودچی", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۴", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 97,
            image = Res.drawable.food5,
            title = "خوراک مرغ",
            chefName = "نگار رضایی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 50,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "پیاز را خلالی خرد کرده و در قابلمه تفت دهید.",
                "تکه‌های مرغ را اضافه کنید و دو طرف آن‌ها را کمی سرخ کنید.",
                "زردچوبه، فلفل و نمک را اضافه کنید.",
                "رب گوجه‌فرنگی را اضافه کرده و تفت دهید.",
                "هویج و سیب‌زمینی خردشده را به قابلمه اضافه کنید.",
                "یک لیوان آب جوش اضافه کنید و در قابلمه را بگذارید.",
                "اجازه دهید مرغ و سبزیجات با حرارت ملایم کاملاً بپزند.",
                "خوراک را همراه نان تازه سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 430,
                proteinGrams = 34.0,
                carbohydratesGrams = 32.0,
                fatGrams = 17.0
            ),

            tags = listOf("غذای ایرانی", "خوراک مرغ", "مرغ", "غذای خانگی", "خوراک"),

            rating = 4.7,
            ratingCount = 176,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("مرغ", "۴", IngredientUnit.PIECE),
                Ingredients("سیب‌زمینی", "۲", IngredientUnit.PIECE),
                Ingredients("هویج", "۲", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۲", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 98,
            image = Res.drawable.food6,
            title = "تخم‌مرغ و سوسیس",
            chefName = "امیر محمدی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 10,
            cookingTimeMinutes = 15,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "سوسیس‌ها را به شکل حلقه‌ای خرد کنید.",
                "کمی روغن در تابه بریزید و سوسیس‌ها را تفت دهید.",
                "گوجه‌فرنگی خردشده را اضافه کنید و اجازه دهید نرم شود.",
                "نمک و فلفل را اضافه کنید.",
                "تخم‌مرغ‌ها را روی مواد بشکنید.",
                "درب تابه را بگذارید تا تخم‌مرغ‌ها به میزان دلخواه بپزند.",
                "غذا را همراه نان تازه سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 390,
                proteinGrams = 22.0,
                carbohydratesGrams = 10.0,
                fatGrams = 28.0
            ),

            tags = listOf("صبحانه", "تخم‌مرغ", "سوسیس", "غذای سریع", "غذای ساده"),

            rating = 4.6,
            ratingCount = 159,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("سوسیس", "۲", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "۲", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("روغن", "۱", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 99,
            image = Res.drawable.food1,
            title = "نان سیر",
            chefName = "الناز کریمی",
            cuisine = "ایتالیایی",
            preparationTimeMinutes = 10,
            cookingTimeMinutes = 10,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "کره نرم‌شده را با سیر رنده‌شده مخلوط کنید.",
                "جعفری خردشده و کمی نمک به کره اضافه کنید.",
                "نان باگت را از وسط برش دهید.",
                "مخلوط کره و سیر را روی سطح نان پخش کنید.",
                "پنیر موزارلا را روی نان بریزید.",
                "نان‌ها را در فر ۱۸۰ درجه حدود ۸ تا ۱۰ دقیقه قرار دهید.",
                "پس از ذوب شدن پنیر و طلایی شدن لبه‌ها، سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 320,
                proteinGrams = 11.0,
                carbohydratesGrams = 34.0,
                fatGrams = 16.0
            ),

            tags = listOf("پیش‌غذا", "نان سیر", "غذای ایتالیایی", "پنیر", "میان‌وعده"),

            rating = 4.8,
            ratingCount = 241,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("نان باگت", "۱", IngredientUnit.PIECE),
                Ingredients("کره", "۵۰", IngredientUnit.GRAM),
                Ingredients("سیر", "۴", IngredientUnit.PIECE),
                Ingredients("پنیر موزارلا", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("جعفری خردشده", "۲", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "نصف", IngredientUnit.TEASPOON),
                Spices("آویشن", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 100,
            image = Res.drawable.food2,
            title = "کشک بادمجان",
            chefName = "مریم احمدی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 35,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "بادمجان‌ها را پوست بگیرید و از طول برش دهید.",
                "بادمجان‌ها را سرخ کنید یا با کمی روغن در فر بپزید.",
                "پیاز را خلالی خرد کرده و سرخ کنید.",
                "سیر خردشده را اضافه کنید و کمی تفت دهید.",
                "بادمجان‌ها را اضافه کرده و با گوشت‌کوب له کنید.",
                "کشک را با کمی آب رقیق کنید و به بادمجان اضافه کنید.",
                "مواد را روی حرارت ملایم چند دقیقه بجوشانید.",
                "با نعناع‌داغ، پیازداغ و گردو تزیین کرده و سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 350,
                proteinGrams = 12.0,
                carbohydratesGrams = 27.0,
                fatGrams = 23.0
            ),

            tags = listOf("غذای ایرانی", "کشک بادمجان", "پیش‌غذا", "بادمجان", "غذای سنتی"),

            rating = 4.9,
            ratingCount = 294,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("بادمجان", "۵", IngredientUnit.PIECE),
                Ingredients("کشک", "۱", IngredientUnit.CUP),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("سیر", "۳", IngredientUnit.PIECE),
                Ingredients("گردوی خردشده", "نصف", IngredientUnit.CUP),
                Ingredients("نعناع خشک", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۴", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 101,
            image = Res.drawable.food3,
            title = "میرزاقاسمی",
            chefName = "ترانه شریفی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 30,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "بادمجان‌ها را روی شعله یا در فر کباب کنید تا پوست آن‌ها بسوزد و داخلشان نرم شود.",
                "پوست بادمجان‌ها را جدا کنید و گوشت آن‌ها را خرد یا له کنید.",
                "گوجه‌فرنگی‌ها را پوست بگیرید و خرد کنید.",
                "سیر خردشده را در روغن تفت دهید.",
                "گوجه‌فرنگی را اضافه کنید و اجازه دهید آب آن کشیده شود.",
                "بادمجان کبابی را اضافه کنید و مواد را مخلوط کنید.",
                "تخم‌مرغ‌ها را اضافه کنید و هم بزنید تا بپزند.",
                "با نان تازه سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 260,
                proteinGrams = 13.0,
                carbohydratesGrams = 18.0,
                fatGrams = 16.0
            ),

            tags = listOf("غذای ایرانی", "میرزاقاسمی", "غذای گیلانی", "بادمجان", "غذای محلی"),

            rating = 4.9,
            ratingCount = 337,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("بادمجان", "۴", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "۳", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("سیر", "۴", IngredientUnit.PIECE),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 102,
            image = Res.drawable.food4,
            title = "خوراک لوبیا",
            chefName = "علی رضایی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 90,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "لوبیا چیتی را از شب قبل خیس کنید و چند بار آب آن را عوض کنید.",
                "لوبیا را همراه آب تازه بپزید تا نیم‌پز شود.",
                "پیاز را خرد کرده و در روغن تفت دهید.",
                "رب گوجه‌فرنگی و ادویه‌ها را اضافه کنید.",
                "سیب‌زمینی خردشده را به لوبیا اضافه کنید.",
                "مخلوط پیاز و رب را داخل قابلمه بریزید.",
                "اجازه دهید خوراک با حرارت ملایم جا بیفتد و لوبیا کاملاً نرم شود.",
                "خوراک را با آبلیمو و نان تازه سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 330,
                proteinGrams = 17.0,
                carbohydratesGrams = 52.0,
                fatGrams = 8.0
            ),

            tags = listOf("غذای ایرانی", "خوراک لوبیا", "لوبیا چیتی", "غذای گیاهی", "صبحانه"),

            rating = 4.7,
            ratingCount = 218,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("لوبیا چیتی", "۲", IngredientUnit.CUP),
                Ingredients("سیب‌زمینی", "۱", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۲", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "۲", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 103,
            image = Res.drawable.food5,
            title = "خوراک قارچ و پنیر",
            chefName = "سارا محمدی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 20,
            servings = 3,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "قارچ‌ها را تمیز کرده و ورقه‌ای خرد کنید.",
                "پیاز را خرد کرده و با کمی روغن تفت دهید.",
                "قارچ‌ها را اضافه کنید و با حرارت بالا تفت دهید تا آب آن‌ها کشیده شود.",
                "فلفل دلمه‌ای خردشده را اضافه کنید.",
                "نمک و فلفل را اضافه کنید.",
                "قارچ‌ها را در ظرف مناسب فر بریزید.",
                "پنیر موزارلا را روی قارچ‌ها پخش کنید.",
                "ظرف را در فر ۱۸۰ درجه قرار دهید تا پنیر ذوب و طلایی شود.",
                "خوراک را با نان تازه سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 360,
                proteinGrams = 19.0,
                carbohydratesGrams = 17.0,
                fatGrams = 24.0
            ),

            tags = listOf("خوراک", "قارچ", "پنیر", "پیش‌غذا", "غذای سریع"),

            rating = 4.7,
            ratingCount = 167,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("قارچ", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("پنیر موزارلا", "۱۵۰", IngredientUnit.GRAM),
                Ingredients("فلفل دلمه‌ای", "۱", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM),
                Ingredients("نان", "۲", IngredientUnit.PIECE)
            ),

            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "نصف", IngredientUnit.TEASPOON),
                Spices("آویشن", "۱", IngredientUnit.TEASPOON)
            )
        ),
        recipe(
            id = 104,
            image = Res.drawable.food1,
            title = "اسموتی توت‌فرنگی",
            chefName = "نگار رضایی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 10,
            cookingTimeMinutes = 0,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "توت‌فرنگی‌ها را بشویید و برگ آن‌ها را جدا کنید.",
                "موز را پوست بگیرید و خرد کنید.",
                "توت‌فرنگی، موز، شیر و عسل را داخل مخلوط‌کن بریزید.",
                "چند تکه یخ اضافه کنید.",
                "مواد را مخلوط کنید تا کاملاً یکدست و غلیظ شوند.",
                "اسموتی را در لیوان بریزید و با توت‌فرنگی تزیین کنید."
            ),

            nutrition = NutritionInfo(
                calories = 185,
                proteinGrams = 5.0,
                carbohydratesGrams = 36.0,
                fatGrams = 3.0
            ),

            tags = listOf("نوشیدنی", "اسموتی", "توت‌فرنگی", "خنک", "میوه‌ای"),

            rating = 4.8,
            ratingCount = 186,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("توت‌فرنگی", "۱", IngredientUnit.CUP),
                Ingredients("موز", "۱", IngredientUnit.PIECE),
                Ingredients("شیر", "۱", IngredientUnit.CUP),
                Ingredients("عسل", "۱", IngredientUnit.TABLESPOON),
                Ingredients("یخ", "۴", IngredientUnit.PIECE)
            ),

            spices = listOf()
        ),

        recipe(
            id = 105,
            image = Res.drawable.food2,
            title = "لیموناد",
            chefName = "مریم احمدی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 5,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "لیموها را از وسط نصف کنید و آب آن‌ها را بگیرید.",
                "شکر را با کمی آب گرم مخلوط کنید تا کاملاً حل شود.",
                "آب لیمو را به شربت شکر اضافه کنید.",
                "آب سرد را اضافه کرده و مواد را هم بزنید.",
                "چند تکه یخ داخل پارچ بریزید.",
                "لیموناد را با برش لیمو و برگ نعناع سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 105,
                proteinGrams = 0.2,
                carbohydratesGrams = 27.0,
                fatGrams = 0.1
            ),

            tags = listOf("نوشیدنی", "لیموناد", "خنک", "ترش", "تابستانی"),

            rating = 4.7,
            ratingCount = 214,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("آب لیموترش تازه", "نصف", IngredientUnit.CUP),
                Ingredients("آب سرد", "۳", IngredientUnit.CUP),
                Ingredients("شکر", "نصف", IngredientUnit.CUP),
                Ingredients("یخ", "۶", IngredientUnit.PIECE),
                Ingredients("برگ نعناع", "۱۰", IngredientUnit.PIECE)
            ),

            spices = listOf()
        ),

        recipe(
            id = 106,
            image = Res.drawable.food3,
            title = "شیک شکلات",
            chefName = "ترانه شریفی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 10,
            cookingTimeMinutes = 0,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "شیر را داخل مخلوط‌کن بریزید.",
                "بستنی وانیلی و پودر کاکائو را اضافه کنید.",
                "سس شکلات را به مواد اضافه کنید.",
                "مواد را مخلوط کنید تا بافتی غلیظ و یکدست ایجاد شود.",
                "شیک را داخل لیوان بلند بریزید.",
                "روی آن را با خامه و سس شکلات تزیین کنید."
            ),

            nutrition = NutritionInfo(
                calories = 390,
                proteinGrams = 9.0,
                carbohydratesGrams = 48.0,
                fatGrams = 19.0
            ),

            tags = listOf("نوشیدنی", "شیک", "شکلاتی", "بستنی", "دسر"),

            rating = 4.9,
            ratingCount = 327,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("شیر سرد", "۱", IngredientUnit.CUP),
                Ingredients("بستنی وانیلی", "۲", IngredientUnit.CUP),
                Ingredients("پودر کاکائو", "۲", IngredientUnit.TABLESPOON),
                Ingredients("سس شکلات", "۲", IngredientUnit.TABLESPOON),
                Ingredients("خامه فرم‌گرفته", "۲", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 107,
            image = Res.drawable.food4,
            title = "آیس‌کافی",
            chefName = "سارا محمدی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 10,
            cookingTimeMinutes = 5,
            servings = 1,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "قهوه فوری یا اسپرسو را آماده کنید.",
                "در صورت استفاده از قهوه فوری، آن را با کمی آب داغ حل کنید.",
                "اجازه دهید قهوه خنک شود.",
                "لیوان را با تکه‌های یخ پر کنید.",
                "شیر سرد را روی یخ‌ها بریزید.",
                "قهوه خنک‌شده را اضافه کنید.",
                "در صورت تمایل شکر یا سیروپ اضافه کرده و هم بزنید."
            ),

            nutrition = NutritionInfo(
                calories = 125,
                proteinGrams = 6.0,
                carbohydratesGrams = 17.0,
                fatGrams = 4.0
            ),

            tags = listOf("نوشیدنی", "قهوه", "آیس‌کافی", "خنک", "کافئین‌دار"),

            rating = 4.8,
            ratingCount = 295,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("قهوه اسپرسو", "۲", IngredientUnit.SHOT),
                Ingredients("شیر سرد", "۱", IngredientUnit.CUP),
                Ingredients("یخ", "۶", IngredientUnit.PIECE),
                Ingredients("شکر", "۱", IngredientUnit.TEASPOON)
            ),

            spices = listOf()
        ),

        recipe(
            id = 108,
            image = Res.drawable.food5,
            title = "شربت زعفران",
            chefName = "الناز کریمی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 10,
            cookingTimeMinutes = 15,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "آب و شکر را داخل قابلمه بریزید.",
                "قابلمه را روی حرارت ملایم قرار دهید تا شکر حل شود.",
                "زعفران دم‌کرده را به شربت اضافه کنید.",
                "گلاب را اضافه کنید و چند دقیقه هم بزنید.",
                "شربت را از روی حرارت بردارید و اجازه دهید خنک شود.",
                "برای سرو، مقداری از شربت را با آب سرد و یخ مخلوط کنید."
            ),

            nutrition = NutritionInfo(
                calories = 165,
                proteinGrams = 0.1,
                carbohydratesGrams = 42.0,
                fatGrams = 0.0
            ),

            tags = listOf("نوشیدنی", "شربت", "زعفرانی", "ایرانی", "خنک"),

            rating = 4.9,
            ratingCount = 241,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("آب", "۲", IngredientUnit.CUP),
                Ingredients("شکر", "۱", IngredientUnit.CUP),
                Ingredients("گلاب", "۳", IngredientUnit.TABLESPOON),
                Ingredients("زعفران دم‌کرده", "۲", IngredientUnit.TABLESPOON),
                Ingredients("یخ", "۴", IngredientUnit.PIECE)
            ),

            spices = listOf(
                Spices("هل", "۲", IngredientUnit.PIECE)
            )
        ),

        recipe(
            id = 109,
            image = Res.drawable.food6,
            title = "موهیتو",
            chefName = "نگار رضایی",
            cuisine = "کوبایی",
            preparationTimeMinutes = 10,
            cookingTimeMinutes = 0,
            servings = 1,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "لیموترش را به چند قسمت برش دهید.",
                "برگ‌های نعناع را داخل لیوان بریزید.",
                "لیمو و شکر را اضافه کنید.",
                "مواد را به‌آرامی بکوبید تا آب لیمو و عطر نعناع آزاد شود.",
                "لیوان را با یخ خردشده پر کنید.",
                "آب گازدار سرد را اضافه کنید.",
                "نوشیدنی را به‌آرامی هم بزنید و با نعناع تزیین کنید."
            ),

            nutrition = NutritionInfo(
                calories = 115,
                proteinGrams = 0.5,
                carbohydratesGrams = 29.0,
                fatGrams = 0.1
            ),

            tags = listOf("نوشیدنی", "موهیتو", "نعناعی", "خنک", "لیمو"),

            rating = 4.8,
            ratingCount = 263,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("لیموترش", "۲", IngredientUnit.PIECE),
                Ingredients("برگ نعناع", "۱۵", IngredientUnit.PIECE),
                Ingredients("شکر", "۲", IngredientUnit.TEASPOON),
                Ingredients("آب گازدار", "۱", IngredientUnit.CUP),
                Ingredients("یخ خردشده", "۱", IngredientUnit.CUP)
            ),

            spices = listOf()
        ),

        recipe(
            id = 110,
            image = Res.drawable.food1,
            title = "اسموتی موز",
            chefName = "مریم احمدی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 10,
            cookingTimeMinutes = 0,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "موزها را پوست بگیرید و حلقه‌حلقه کنید.",
                "موز را همراه شیر داخل مخلوط‌کن بریزید.",
                "عسل و ماست را اضافه کنید.",
                "چند تکه یخ اضافه کنید.",
                "مواد را مخلوط کنید تا کاملاً یکدست شوند.",
                "اسموتی را داخل لیوان بریزید و سرد سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 210,
                proteinGrams = 7.0,
                carbohydratesGrams = 39.0,
                fatGrams = 4.0
            ),

            tags = listOf("نوشیدنی", "اسموتی", "موز", "میوه‌ای", "مقوی"),

            rating = 4.7,
            ratingCount = 198,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("موز", "۲", IngredientUnit.PIECE),
                Ingredients("شیر", "۱", IngredientUnit.CUP),
                Ingredients("ماست", "نصف", IngredientUnit.CUP),
                Ingredients("عسل", "۱", IngredientUnit.TABLESPOON),
                Ingredients("یخ", "۴", IngredientUnit.PIECE)
            ),

            spices = listOf(
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 111,
            image = Res.drawable.food2,
            title = "شیر موز",
            chefName = "ترانه شریفی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 10,
            cookingTimeMinutes = 0,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "موزها را پوست بگیرید و خرد کنید.",
                "موز را همراه شیر سرد داخل مخلوط‌کن بریزید.",
                "بستنی وانیلی و عسل را اضافه کنید.",
                "مواد را چند دقیقه مخلوط کنید تا نوشیدنی کف‌دار و یکدست شود.",
                "شیر موز را داخل لیوان بریزید.",
                "در صورت تمایل با پودر پسته تزیین کنید."
            ),

            nutrition = NutritionInfo(
                calories = 320,
                proteinGrams = 9.0,
                carbohydratesGrams = 48.0,
                fatGrams = 11.0
            ),

            tags = listOf("نوشیدنی", "شیر موز", "موز", "بستنی", "مقوی"),

            rating = 4.9,
            ratingCount = 312,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("موز", "۲", IngredientUnit.PIECE),
                Ingredients("شیر سرد", "۲", IngredientUnit.CUP),
                Ingredients("بستنی وانیلی", "۱", IngredientUnit.CUP),
                Ingredients("عسل", "۱", IngredientUnit.TABLESPOON),
                Ingredients("پودر پسته", "۱", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 112,
            image = Res.drawable.food3,
            title = "چای ماسالا",
            chefName = "سارا محمدی",
            cuisine = "هندی",
            preparationTimeMinutes = 5,
            cookingTimeMinutes = 15,
            servings = 2,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "آب را داخل قابلمه بریزید و روی حرارت قرار دهید.",
                "چوب دارچین، هل، میخک و زنجبیل را به آب اضافه کنید.",
                "اجازه دهید ادویه‌ها حدود ۵ تا ۷ دقیقه بجوشند.",
                "چای سیاه را اضافه کنید و چند دقیقه دم کنید.",
                "شیر را اضافه کنید و اجازه دهید نوشیدنی به‌آرامی گرم شود.",
                "چای را از صافی عبور دهید.",
                "در صورت تمایل با عسل یا شکر شیرین کنید و گرم سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 125,
                proteinGrams = 4.0,
                carbohydratesGrams = 19.0,
                fatGrams = 4.0
            ),

            tags = listOf("نوشیدنی", "چای", "ماسالا", "هندی", "ادویه‌ای", "گرم"),

            rating = 4.8,
            ratingCount = 276,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("آب", "۱", IngredientUnit.CUP),
                Ingredients("شیر", "۱", IngredientUnit.CUP),
                Ingredients("چای سیاه", "۲", IngredientUnit.TEASPOON),
                Ingredients("عسل", "۱", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("چوب دارچین", "۱", IngredientUnit.PIECE),
                Spices("هل", "۳", IngredientUnit.PIECE),
                Spices("میخک", "۲", IngredientUnit.PIECE),
                Spices("زنجبیل تازه", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 113,
            image = Res.drawable.food4,
            title = "هات‌چاکلت",
            chefName = "الناز کریمی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 5,
            cookingTimeMinutes = 10,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "پودر کاکائو و شکر را داخل قابلمه بریزید.",
                "چند قاشق شیر اضافه کنید و هم بزنید تا خمیر یکدستی ایجاد شود.",
                "باقی شیر را اضافه کنید.",
                "قابلمه را روی حرارت ملایم قرار دهید و مرتب هم بزنید.",
                "شکلات خردشده را اضافه کنید تا کاملاً ذوب شود.",
                "وقتی نوشیدنی غلیظ و یکدست شد، آن را از روی حرارت بردارید.",
                "هات‌چاکلت را با خامه یا پودر کاکائو تزیین و گرم سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 310,
                proteinGrams = 9.0,
                carbohydratesGrams = 35.0,
                fatGrams = 16.0
            ),

            tags = listOf("نوشیدنی", "هات‌چاکلت", "شکلاتی", "گرم", "زمستانی"),

            rating = 4.9,
            ratingCount = 348,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("شیر", "۲", IngredientUnit.CUP),
                Ingredients("شکلات تلخ", "۵۰", IngredientUnit.GRAM),
                Ingredients("پودر کاکائو", "۲", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "۲", IngredientUnit.TABLESPOON),
                Ingredients("خامه", "۲", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 114,
            image = Res.drawable.food5,
            title = "شربت بهارنارنج",
            chefName = "نگار رضایی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 10,
            cookingTimeMinutes = 15,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "آب و شکر را داخل قابلمه بریزید.",
                "روی حرارت ملایم قرار دهید تا شکر کاملاً حل شود.",
                "عرق بهارنارنج را اضافه کنید.",
                "گلاب و آبلیمو را اضافه کرده و مخلوط کنید.",
                "شربت را از روی حرارت بردارید و اجازه دهید خنک شود.",
                "برای سرو، مقداری شربت را با آب سرد و یخ ترکیب کنید."
            ),

            nutrition = NutritionInfo(
                calories = 160,
                proteinGrams = 0.1,
                carbohydratesGrams = 41.0,
                fatGrams = 0.0
            ),

            tags = listOf("نوشیدنی", "شربت", "بهارنارنج", "ایرانی", "خنک", "گیاهی"),

            rating = 4.8,
            ratingCount = 193,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("آب", "۲", IngredientUnit.CUP),
                Ingredients("شکر", "۱", IngredientUnit.CUP),
                Ingredients("عرق بهارنارنج", "نصف", IngredientUnit.CUP),
                Ingredients("گلاب", "۲", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "۱", IngredientUnit.TEASPOON),
                Ingredients("یخ", "۴", IngredientUnit.PIECE)
            ),

            spices = listOf(
                Spices("هل", "۲", IngredientUnit.PIECE)
            )
        ),

        recipe(
            id = 115,
            image = Res.drawable.food6,
            title = "آب هندوانه",
            chefName = "مریم احمدی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 10,
            cookingTimeMinutes = 0,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "هندوانه را پوست بگیرید و هسته‌های آن را جدا کنید.",
                "گوشت هندوانه را به قطعات کوچک تقسیم کنید.",
                "هندوانه را داخل مخلوط‌کن بریزید.",
                "آبلیمو و چند تکه یخ اضافه کنید.",
                "مواد را مخلوط کنید تا کاملاً یکدست شوند.",
                "در صورت تمایل نوشیدنی را از صافی عبور دهید.",
                "آب هندوانه را سرد سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 95,
                proteinGrams = 1.5,
                carbohydratesGrams = 23.0,
                fatGrams = 0.4
            ),

            tags = listOf("نوشیدنی", "آبمیوه", "هندوانه", "خنک", "تابستانی"),

            rating = 4.7,
            ratingCount = 228,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("هندوانه بدون هسته", "۳", IngredientUnit.CUP),
                Ingredients("آبلیمو", "۱", IngredientUnit.TABLESPOON),
                Ingredients("یخ", "۵", IngredientUnit.PIECE)
            ),

            spices = listOf()
        ),

        recipe(
            id = 116,
            image = Res.drawable.food1,
            title = "اسموتی انبه",
            chefName = "ترانه شریفی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 10,
            cookingTimeMinutes = 0,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "انبه را پوست بگیرید و هسته آن را جدا کنید.",
                "گوشت انبه را به قطعات کوچک تقسیم کنید.",
                "انبه را همراه ماست و شیر داخل مخلوط‌کن بریزید.",
                "عسل و چند تکه یخ اضافه کنید.",
                "مواد را مخلوط کنید تا بافتی نرم و یکدست ایجاد شود.",
                "اسموتی را داخل لیوان بریزید و سرد سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 220,
                proteinGrams = 6.0,
                carbohydratesGrams = 42.0,
                fatGrams = 4.0
            ),

            tags = listOf("نوشیدنی", "اسموتی", "انبه", "میوه‌ای", "خنک"),

            rating = 4.8,
            ratingCount = 205,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("انبه", "۱", IngredientUnit.PIECE),
                Ingredients("ماست یونانی", "نصف", IngredientUnit.CUP),
                Ingredients("شیر", "نصف", IngredientUnit.CUP),
                Ingredients("عسل", "۱", IngredientUnit.TABLESPOON),
                Ingredients("یخ", "۴", IngredientUnit.PIECE)
            ),

            spices = listOf(
                Spices("هل", "یک چهارم", IngredientUnit.TEASPOON)
            )
        )



    )

    // 1. سالادها
    // 1. سالادها — 15 غذا
    val saladRecipes = listOf(

        recipe(
            id=1, Res.drawable.food1, "سالاد سزار", chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "سینه مرغ را با نمک، فلفل و کمی روغن مزه‌دار کنید.",
                "مرغ را در تابه گریل کنید تا کاملاً مغزپخت و طلایی شود.",
                "نان تست را مکعبی خرد کنید و با روغن زیتون و پودر سیر تفت دهید.",
                "کاهوی تازه را شسته و به قطعات متوسط تقسیم کنید.",
                "سس سزار را با مایونز، آبلیمو، سیر و پنیر پارمزان آماده کنید.",
                "مرغ گریل‌شده را برش بزنید و همراه نان تست روی کاهو قرار دهید.",
                "سس و پنیر پارمزان را اضافه کرده و بلافاصله سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("سینه مرغ", "300", IngredientUnit.GRAM),
                Ingredients("کاهو", "1", IngredientUnit.PIECE),
                Ingredients("نان تست", "3", IngredientUnit.PIECE),
                Ingredients("پنیر پارمزان", "50", IngredientUnit.GRAM),
                Ingredients("مایونز", "3", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن زیتون", "2", IngredientUnit.TABLESPOON),
                Ingredients("سیر", "2", IngredientUnit.PIECE)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            2, Res.drawable.food2, "سالاد الویه", chefName = "مریم احمدی",
            cookingSteps = listOf(
                "سیب‌زمینی و تخم‌مرغ‌ها را جداگانه آب‌پز کنید.",
                "سینه مرغ را همراه پیاز و کمی نمک بپزید.",
                "سیب‌زمینی و تخم‌مرغ را پس از خنک شدن پوست بگیرید.",
                "مرغ، سیب‌زمینی، تخم‌مرغ و خیارشور را ریز خرد کنید.",
                "مواد خردشده را در یک ظرف بزرگ مخلوط کنید.",
                "مایونز، آبلیمو و ادویه‌ها را اضافه کنید.",
                "سالاد را حداقل یک ساعت در یخچال قرار دهید تا مزه‌ها ترکیب شوند."
            ),
            ingredients = listOf(
                Ingredients("سیب‌زمینی", "4", IngredientUnit.PIECE),
                Ingredients("سینه مرغ", "250", IngredientUnit.GRAM),
                Ingredients("تخم‌مرغ", "3", IngredientUnit.PIECE),
                Ingredients("خیارشور", "150", IngredientUnit.GRAM),
                Ingredients("نخودفرنگی", "100", IngredientUnit.GRAM),
                Ingredients("سس مایونز", "5", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            3, Res.drawable.food3, "سالاد شیرازی", chefName = "سارا محمدی",
            cookingSteps = listOf(
                "خیارها را بشویید و به صورت نگینی ریز خرد کنید.",
                "گوجه‌فرنگی‌ها را به اندازه خیارها خرد کنید.",
                "پیاز را پوست گرفته و بسیار ریز خرد کنید.",
                "تمام سبزیجات را در ظرف مناسبی مخلوط کنید.",
                "آبغوره و آبلیمو را اضافه کنید.",
                "نعناع خشک، نمک و فلفل را اضافه کرده و مخلوط کنید.",
                "سالاد را خنک و تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("خیار", "3", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "3", IngredientUnit.PIECE),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("آبغوره", "3", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON),
                Ingredients("نعناع خشک", "1", IngredientUnit.TEASPOON)
            ),
            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            4, Res.drawable.food4, "سالاد ماکارونی", chefName = "نگار رضایی",
            cookingSteps = listOf(
                "ماکارونی فرمی را در آب جوش و نمک بپزید.",
                "ماکارونی را آبکش کرده و اجازه دهید خنک شود.",
                "کالباس، خیارشور و فلفل دلمه‌ای را نگینی خرد کنید.",
                "ذرت و نخودفرنگی را آماده کنید.",
                "تمام مواد را در ظرف بزرگی با ماکارونی مخلوط کنید.",
                "سس مایونز، ماست و آبلیمو را ترکیب کرده و به سالاد اضافه کنید.",
                "سالاد را یک ساعت در یخچال استراحت دهید."
            ),
            ingredients = listOf(
                Ingredients("ماکارونی فرمی", "300", IngredientUnit.GRAM),
                Ingredients("کالباس", "150", IngredientUnit.GRAM),
                Ingredients("خیارشور", "100", IngredientUnit.GRAM),
                Ingredients("ذرت", "100", IngredientUnit.GRAM),
                Ingredients("نخودفرنگی", "80", IngredientUnit.GRAM),
                Ingredients("فلفل دلمه‌ای", "1", IngredientUnit.PIECE),
                Ingredients("سس مایونز", "4", IngredientUnit.TABLESPOON),
                Ingredients("ماست", "2", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("آویشن", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            5, Res.drawable.food5, "سالاد یونانی", chefName = "الناز کریمی",
            cookingSteps = listOf(
                "خیار و گوجه‌فرنگی را به قطعات متوسط خرد کنید.",
                "پیاز قرمز را به صورت حلقه‌های نازک برش دهید.",
                "فلفل دلمه‌ای را خرد کرده و همراه سبزیجات در ظرف بریزید.",
                "زیتون سیاه را به مواد اضافه کنید.",
                "پنیر فتا را به مکعب‌های متوسط تقسیم کنید.",
                "روغن زیتون، آبلیمو و پونه کوهی را مخلوط کنید.",
                "سس را روی سالاد بریزید و با پنیر فتا سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("خیار", "2", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "3", IngredientUnit.PIECE),
                Ingredients("پیاز قرمز", "1", IngredientUnit.PIECE),
                Ingredients("فلفل دلمه‌ای", "1", IngredientUnit.PIECE),
                Ingredients("زیتون سیاه", "80", IngredientUnit.GRAM),
                Ingredients("پنیر فتا", "150", IngredientUnit.GRAM),
                Ingredients("روغن زیتون", "3", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON),
                Spices("پونه کوهی", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            6, Res.drawable.food6, "سالاد فصل", chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "کاهو را شسته و به قطعات مناسب خرد کنید.",
                "خیار و گوجه‌فرنگی را حلقه‌ای خرد کنید.",
                "هویج را پوست گرفته و رنده کنید.",
                "کلم سفید را به صورت رشته‌های نازک خرد کنید.",
                "تمام سبزیجات را به شکل مرتب در ظرف بچینید.",
                "سس سالاد را با آبلیمو، روغن زیتون و کمی نمک آماده کنید.",
                "سس را هنگام سرو به سالاد اضافه کنید."
            ),
            ingredients = listOf(
                Ingredients("کاهو", "1", IngredientUnit.PIECE),
                Ingredients("خیار", "2", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "2", IngredientUnit.PIECE),
                Ingredients("هویج", "2", IngredientUnit.PIECE),
                Ingredients("کلم سفید", "100", IngredientUnit.GRAM),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن زیتون", "2", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            7, Res.drawable.food1, "سالاد کلم", chefName = "مریم احمدی",
            cookingSteps = listOf(
                "کلم سفید را به صورت رشته‌های بسیار نازک خرد کنید.",
                "هویج را پوست گرفته و رنده کنید.",
                "کلم و هویج را در ظرف مناسبی مخلوط کنید.",
                "سس مایونز، ماست و سرکه را ترکیب کنید.",
                "شکر و نمک را به سس اضافه کنید.",
                "سس را با سبزیجات مخلوط کنید.",
                "سالاد را حدود ۳۰ دقیقه در یخچال قرار دهید."
            ),
            ingredients = listOf(
                Ingredients("کلم سفید", "400", IngredientUnit.GRAM),
                Ingredients("هویج", "2", IngredientUnit.PIECE),
                Ingredients("سس مایونز", "3", IngredientUnit.TABLESPOON),
                Ingredients("ماست", "2", IngredientUnit.TABLESPOON),
                Ingredients("سرکه سفید", "2", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "1", IngredientUnit.TEASPOON)
            ),
            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            8, Res.drawable.food2, "سالاد تن ماهی", chefName = "سارا محمدی",
            cookingSteps = listOf(
                "تن ماهی را طبق دستور روی بسته‌بندی بجوشانید.",
                "سیب‌زمینی را آب‌پز کرده و به مکعب‌های کوچک خرد کنید.",
                "خیارشور و پیاز را ریز خرد کنید.",
                "ذرت و لوبیای پخته را به مواد اضافه کنید.",
                "تن ماهی را پس از جدا کردن روغن به مواد اضافه کنید.",
                "آبلیمو، روغن زیتون و ادویه‌ها را اضافه کنید.",
                "مواد را به آرامی مخلوط کرده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("تن ماهی", "1", IngredientUnit.CAN),
                Ingredients("سیب‌زمینی", "2", IngredientUnit.PIECE),
                Ingredients("خیارشور", "80", IngredientUnit.GRAM),
                Ingredients("ذرت", "80", IngredientUnit.GRAM),
                Ingredients("لوبیا قرمز پخته", "100", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            9, Res.drawable.food3, "سالاد اسفناج", chefName = "نگار رضایی",
            cookingSteps = listOf(
                "برگ‌های اسفناج تازه را بشویید و کاملاً خشک کنید.",
                "قارچ‌ها را ورقه‌ای خرد کنید.",
                "قارچ را با کمی روغن زیتون تفت دهید.",
                "گردو را به قطعات کوچک تقسیم کنید.",
                "اسفناج را در ظرف سرو قرار دهید.",
                "قارچ، گردو و پنیر فتا را روی اسفناج بریزید.",
                "سس بالزامیک را اضافه کرده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("اسفناج تازه", "250", IngredientUnit.GRAM),
                Ingredients("قارچ", "150", IngredientUnit.GRAM),
                Ingredients("گردو", "50", IngredientUnit.GRAM),
                Ingredients("پنیر فتا", "80", IngredientUnit.GRAM),
                Ingredients("روغن زیتون", "2", IngredientUnit.TABLESPOON),
                Ingredients("سرکه بالزامیک", "2", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            10, Res.drawable.food4, "سالاد چغندر", chefName = "الناز کریمی",
            cookingSteps = listOf(
                "چغندرها را بشویید و با پوست بپزید تا نرم شوند.",
                "پس از خنک شدن، پوست چغندر را جدا کنید.",
                "چغندر را به صورت ورقه‌ای یا مکعبی خرد کنید.",
                "پنیر را خرد کرده و گردو را کمی خرد کنید.",
                "چغندر، پنیر و گردو را در ظرف سرو بچینید.",
                "روغن زیتون و سرکه بالزامیک را مخلوط کنید.",
                "سس را روی سالاد بریزید و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("چغندر", "3", IngredientUnit.PIECE),
                Ingredients("پنیر فتا", "100", IngredientUnit.GRAM),
                Ingredients("گردو", "40", IngredientUnit.GRAM),
                Ingredients("روغن زیتون", "2", IngredientUnit.TABLESPOON),
                Ingredients("سرکه بالزامیک", "2", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON),
                Spices("آویشن", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            11, Res.drawable.food5, "سالاد اندونزی", chefName = "مریم احمدی",
            cookingSteps = listOf(
                "کلم سفید و کلم بنفش را به صورت رشته‌ای خرد کنید.",
                "هویج را رنده کنید.",
                "خیارشور و ژامبون را به صورت نگینی خرد کنید.",
                "ذرت و نخودفرنگی را آماده کنید.",
                "تمام مواد را در ظرف بزرگی مخلوط کنید.",
                "سس مایونز، ماست و آبلیمو را ترکیب کنید.",
                "سس را اضافه کرده و سالاد را سرد سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("کلم سفید", "200", IngredientUnit.GRAM),
                Ingredients("کلم بنفش", "100", IngredientUnit.GRAM),
                Ingredients("هویج", "2", IngredientUnit.PIECE),
                Ingredients("خیارشور", "100", IngredientUnit.GRAM),
                Ingredients("ژامبون", "100", IngredientUnit.GRAM),
                Ingredients("ذرت", "100", IngredientUnit.GRAM),
                Ingredients("نخودفرنگی", "80", IngredientUnit.GRAM),
                Ingredients("سس مایونز", "4", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            12, Res.drawable.food6, "سالاد مرغ گریل", chefName = "سارا محمدی",
            cookingSteps = listOf(
                "سینه مرغ را با روغن زیتون، آبلیمو و ادویه‌ها مزه‌دار کنید.",
                "مرغ را روی گریل بپزید تا کاملاً مغزپخت شود.",
                "کاهو را شسته و خرد کنید.",
                "خیار و گوجه گیلاسی را برش بزنید.",
                "ذرت را آماده کرده و به سبزیجات اضافه کنید.",
                "مرغ گریل‌شده را به صورت نواری برش دهید.",
                "تمام مواد را در ظرف سرو بچینید و سس دلخواه اضافه کنید."
            ),
            ingredients = listOf(
                Ingredients("سینه مرغ", "250", IngredientUnit.GRAM),
                Ingredients("کاهو", "150", IngredientUnit.GRAM),
                Ingredients("خیار", "1", IngredientUnit.PIECE),
                Ingredients("گوجه گیلاسی", "100", IngredientUnit.GRAM),
                Ingredients("ذرت", "80", IngredientUnit.GRAM),
                Ingredients("روغن زیتون", "2", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "1", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            13, Res.drawable.food1, "سالاد آووکادو", chefName = "نگار رضایی",
            cookingSteps = listOf(
                "آووکادو را از وسط نصف کرده و هسته آن را خارج کنید.",
                "گوشت آووکادو را به مکعب‌های متوسط خرد کنید.",
                "خیار و گوجه‌فرنگی را خرد کنید.",
                "پیاز قرمز را به صورت خلالی نازک برش دهید.",
                "مواد را همراه برگ‌های کاهو در ظرف بریزید.",
                "آبلیمو و روغن زیتون را مخلوط کنید.",
                "سس را اضافه کرده و سالاد را تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("آووکادو", "2", IngredientUnit.PIECE),
                Ingredients("خیار", "1", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "2", IngredientUnit.PIECE),
                Ingredients("پیاز قرمز", "0.5", IngredientUnit.PIECE),
                Ingredients("کاهو", "100", IngredientUnit.GRAM),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن زیتون", "2", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON),
                Spices("پودر چیلی", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            14, Res.drawable.food2, "سالاد نخود", chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "نخود را از شب قبل خیس کرده و بپزید تا نرم شود.",
                "خیار و گوجه‌فرنگی را نگینی خرد کنید.",
                "پیاز قرمز را ریز خرد کنید.",
                "جعفری تازه را ساطوری کنید.",
                "نخود پخته و سبزیجات را در ظرف مخلوط کنید.",
                "آبلیمو، روغن زیتون و ادویه‌ها را اضافه کنید.",
                "سالاد را پس از کمی استراحت سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("نخود پخته", "250", IngredientUnit.GRAM),
                Ingredients("خیار", "2", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "2", IngredientUnit.PIECE),
                Ingredients("پیاز قرمز", "1", IngredientUnit.PIECE),
                Ingredients("جعفری", "30", IngredientUnit.GRAM),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن زیتون", "2", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON),
                Spices("زیره سبز", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            15, Res.drawable.food3, "سالاد کینوا", chefName = "الناز کریمی",
            cookingSteps = listOf(
                "کینوا را چند بار با آب سرد بشویید.",
                "کینوا را با دو برابر حجم آب روی حرارت ملایم بپزید.",
                "پس از جذب آب، آن را کنار بگذارید تا خنک شود.",
                "خیار و گوجه‌فرنگی را نگینی خرد کنید.",
                "جعفری و نعناع تازه را ساطوری کنید.",
                "کینوا و سبزیجات را در ظرف مخلوط کنید.",
                "آبلیمو، روغن زیتون و ادویه‌ها را اضافه کرده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("کینوا", "150", IngredientUnit.GRAM),
                Ingredients("خیار", "1", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "2", IngredientUnit.PIECE),
                Ingredients("جعفری", "30", IngredientUnit.GRAM),
                Ingredients("نعناع تازه", "15", IngredientUnit.GRAM),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن زیتون", "2", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON),
                Spices("زیره سبز", "0.25", IngredientUnit.TEASPOON)
            )
        )
    )

    // 2. خورشت‌ها — 18 غذا
    // 2. خورشت‌ها — 18 غذا
    val stewRecipes = listOf(

        recipe(
            id = 16,
            image = Res.drawable.food1,
            title = "قورمه‌سبزی",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "لوبیا قرمز را از چند ساعت قبل خیس کنید و آب آن را چند بار عوض کنید.",
                "پیاز را خرد کرده و با روغن تفت دهید تا طلایی شود.",
                "گوشت خورشتی را اضافه کنید و تفت دهید تا رنگ آن تغییر کند.",
                "زردچوبه و فلفل را اضافه کنید و سپس لوبیای خیس‌خورده را داخل قابلمه بریزید.",
                "سبزی قورمه را جداگانه سرخ کنید تا عطر آن آزاد شود.",
                "سبزی سرخ‌شده را همراه آب جوش به قابلمه اضافه کنید.",
                "لیموعمانی‌ها را سوراخ کرده و داخل خورشت بیندازید.",
                "خورشت را با حرارت ملایم حدود ۳ ساعت بپزید تا گوشت و لوبیا کاملاً نرم شوند.",
                "در پایان نمک را تنظیم کرده و خورشت را همراه برنج سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت گوسفندی", "400", IngredientUnit.GRAM),
                Ingredients("سبزی قورمه", "500", IngredientUnit.GRAM),
                Ingredients("لوبیا قرمز", "150", IngredientUnit.GRAM),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("لیموعمانی", "3", IngredientUnit.PIECE),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 17,
            image = Res.drawable.food2,
            title = "قیمه سیب‌زمینی",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "لپه را بشویید و حدود یک ساعت در آب خیس کنید.",
                "پیاز را نگینی خرد کرده و با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کنید و همراه پیاز تفت دهید.",
                "زردچوبه و فلفل را اضافه کنید.",
                "لپه را آبکش کرده و چند دقیقه با مواد تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کنید و تفت دهید تا رنگ باز کند.",
                "آب جوش اضافه کنید و اجازه دهید گوشت و لپه بپزند.",
                "لیموعمانی را اضافه کنید و خورشت را با حرارت ملایم جا بیندازید.",
                "سیب‌زمینی‌ها را خلالی خرد کرده و جداگانه سرخ کنید.",
                "نمک خورشت را تنظیم کرده و هنگام سرو سیب‌زمینی سرخ‌شده را روی آن قرار دهید."
            ),
            ingredients = listOf(
                Ingredients("گوشت خورشتی", "350", IngredientUnit.GRAM),
                Ingredients("لپه", "150", IngredientUnit.GRAM),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "3", IngredientUnit.TABLESPOON),
                Ingredients("سیب‌زمینی", "3", IngredientUnit.PIECE),
                Ingredients("لیموعمانی", "2", IngredientUnit.PIECE),
                Ingredients("روغن", "5", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 18,
            image = Res.drawable.food3,
            title = "فسنجان",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "گردوها را آسیاب کنید تا کاملاً ریز شوند.",
                "پیاز را رنده کرده و با کمی روغن تفت دهید.",
                "گردوی آسیاب‌شده را اضافه کرده و چند دقیقه با حرارت ملایم تفت دهید.",
                "چند پیمانه آب سرد اضافه کنید و اجازه دهید گردو به‌آرامی بپزد.",
                "مرغ را همراه کمی نمک و زردچوبه جداگانه نیم‌پز کنید.",
                "مرغ را به قابلمه گردو اضافه کنید.",
                "رب انار را اضافه کرده و مواد را به‌آرامی مخلوط کنید.",
                "خورشت را با حرارت کم حدود ۲ تا ۳ ساعت بپزید تا روغن گردو روی سطح آن ظاهر شود.",
                "در صورت نیاز کمی شکر برای متعادل کردن طعم ترش اضافه کنید.",
                "پس از جا افتادن، خورشت را همراه برنج سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گردوی آسیاب‌شده", "300", IngredientUnit.GRAM),
                Ingredients("مرغ", "500", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("رب انار", "4", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "2", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 19,
            image = Res.drawable.food4,
            title = "خورشت بادمجان",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "بادمجان‌ها را پوست بگیرید و از طول برش دهید.",
                "روی بادمجان‌ها کمی نمک بپاشید و پس از استراحت، آب آن‌ها را خشک کنید.",
                "بادمجان‌ها را در روغن سرخ کنید و کنار بگذارید.",
                "پیاز را خرد کرده و با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کرده و همراه زردچوبه و فلفل تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کنید و کمی تفت دهید.",
                "آب جوش اضافه کرده و اجازه دهید گوشت بپزد.",
                "گوجه‌فرنگی‌ها را نصف کرده و همراه بادمجان به خورشت اضافه کنید.",
                "خورشت را با حرارت ملایم بپزید تا جا بیفتد.",
                "در پایان نمک را تنظیم کرده و همراه برنج سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت خورشتی", "350", IngredientUnit.GRAM),
                Ingredients("بادمجان", "4", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "3", IngredientUnit.PIECE),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "5", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 20,
            image = Res.drawable.food5,
            title = "خورشت کرفس",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "ساقه‌های کرفس را شسته و به قطعات کوچک خرد کنید.",
                "سبزی نعناع و جعفری را خرد کنید.",
                "پیاز را نگینی خرد کرده و با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کرده و با زردچوبه و فلفل تفت دهید.",
                "کرفس خردشده را جداگانه کمی تفت دهید.",
                "نعناع و جعفری را نیز با روغن کمی سرخ کنید.",
                "کرفس و سبزی را به قابلمه گوشت اضافه کنید.",
                "آب جوش اضافه کرده و اجازه دهید مواد با حرارت ملایم بپزند.",
                "آبلیمو یا آبغوره را در مراحل پایانی اضافه کنید.",
                "پس از نرم شدن گوشت و جا افتادن خورشت، نمک را تنظیم کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت خورشتی", "350", IngredientUnit.GRAM),
                Ingredients("کرفس", "500", IngredientUnit.GRAM),
                Ingredients("جعفری", "150", IngredientUnit.GRAM),
                Ingredients("نعناع", "50", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 21,
            image = Res.drawable.food6,
            title = "آلو اسفناج",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "آلوهای خورشتی را بشویید و در آب ولرم خیس کنید.",
                "پیاز را خرد کرده و با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کرده و همراه زردچوبه تفت دهید.",
                "آب جوش اضافه کنید و اجازه دهید گوشت نیم‌پز شود.",
                "اسفناج را شسته و خرد کنید.",
                "اسفناج را در تابه جداگانه تفت دهید تا حجم آن کم شود.",
                "اسفناج را به قابلمه گوشت اضافه کنید.",
                "آلوها را همراه کمی آب به خورشت اضافه کنید.",
                "خورشت را با حرارت ملایم بپزید تا گوشت و آلو نرم شوند.",
                "در پایان آبلیمو و نمک را تنظیم کرده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("اسفناج", "500", IngredientUnit.GRAM),
                Ingredients("آلو خورشتی", "150", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("روغن", "3", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 22,
            image = Res.drawable.food1,
            title = "خورشت به‌آلو",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "به‌ها را بشویید، پوست بگیرید و به قطعات متوسط خرد کنید.",
                "آلوها را بشویید و در آب ولرم خیس کنید.",
                "پیاز را خرد کرده و با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کرده و همراه زردچوبه تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کرده و کمی تفت دهید.",
                "آب جوش اضافه کنید و اجازه دهید گوشت نیم‌پز شود.",
                "تکه‌های به را در تابه کمی تفت دهید.",
                "به و آلو را به قابلمه اضافه کنید.",
                "دارچین و کمی شکر برای متعادل کردن طعم اضافه کنید.",
                "خورشت را با حرارت ملایم بپزید تا به و گوشت نرم شوند."
            ),
            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("به", "2", IngredientUnit.PIECE),
                Ingredients("آلو خورشتی", "120", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "1", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "1", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "3", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "0.5", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 23,
            image = Res.drawable.food2,
            title = "خورشت آلو مسما",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "مرغ را بشویید و با دستمال خشک کنید.",
                "پیاز را خلالی خرد کرده و در روغن تفت دهید.",
                "تکه‌های مرغ را اضافه کنید و دو طرف آن‌ها را کمی سرخ کنید.",
                "زردچوبه و فلفل را اضافه کنید.",
                "رب گوجه‌فرنگی را اضافه کرده و تفت دهید.",
                "آب جوش اضافه کنید و اجازه دهید مرغ نیم‌پز شود.",
                "آلوها را بشویید و به قابلمه اضافه کنید.",
                "کمی زعفران دم‌کرده و در صورت تمایل مقدار کمی شکر اضافه کنید.",
                "خورشت را با حرارت ملایم بپزید تا مرغ کاملاً پخته و سس غلیظ شود.",
                "نمک را تنظیم کرده و همراه برنج سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("مرغ", "600", IngredientUnit.GRAM),
                Ingredients("آلو بخارا", "200", IngredientUnit.GRAM),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "2", IngredientUnit.TABLESPOON),
                Ingredients("زعفران دم‌کرده", "2", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "1", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "3", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 24,
            image = Res.drawable.food3,
            title = "خورشت قیمه بادمجان",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "لپه را بشویید و حدود یک ساعت در آب خیس کنید.",
                "پیاز را خرد کرده و با روغن تفت دهید.",
                "گوشت را اضافه کرده و با زردچوبه و فلفل تفت دهید.",
                "لپه را اضافه کنید و چند دقیقه تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کرده و سپس آب جوش بریزید.",
                "لیموعمانی را سوراخ کرده و داخل خورشت قرار دهید.",
                "خورشت را بپزید تا گوشت و لپه نرم شوند.",
                "بادمجان‌ها را پوست گرفته و پس از نمک زدن سرخ کنید.",
                "بادمجان‌ها را در نیم ساعت پایانی پخت به خورشت اضافه کنید.",
                "نمک را تنظیم کرده و پس از جا افتادن سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("لپه", "120", IngredientUnit.GRAM),
                Ingredients("بادمجان", "4", IngredientUnit.PIECE),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "2", IngredientUnit.TABLESPOON),
                Ingredients("لیموعمانی", "2", IngredientUnit.PIECE),
                Ingredients("روغن", "5", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 25,
            image = Res.drawable.food4,
            title = "خورشت لوبیا سبز",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "لوبیا سبزها را بشویید و به اندازه‌های دو تا سه سانتی‌متری خرد کنید.",
                "پیاز را نگینی خرد کرده و با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کنید و همراه زردچوبه تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کرده و کمی تفت دهید.",
                "لوبیا سبز را در تابه جداگانه کمی تفت دهید.",
                "لوبیا را به قابلمه اضافه کنید.",
                "آب جوش بریزید و اجازه دهید گوشت و لوبیا بپزند.",
                "گوجه‌فرنگی خردشده را در نیمه دوم پخت اضافه کنید.",
                "خورشت را با حرارت ملایم جا بیندازید.",
                "در پایان نمک و آبلیمو را تنظیم کرده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت خورشتی", "350", IngredientUnit.GRAM),
                Ingredients("لوبیا سبز", "400", IngredientUnit.GRAM),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "2", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "2", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 26,
            image = Res.drawable.food5,
            title = "خورشت هویج",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "هویج‌ها را پوست بگیرید و به صورت خلالی خرد کنید.",
                "پیاز را نگینی خرد کرده و با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کرده و با زردچوبه و فلفل تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کنید و کمی تفت دهید.",
                "آب جوش اضافه کنید و اجازه دهید گوشت نیم‌پز شود.",
                "هویج‌ها را در تابه جداگانه کمی تفت دهید.",
                "هویج را به قابلمه اضافه کنید.",
                "زعفران دم‌کرده و کمی آبلیمو اضافه کنید.",
                "خورشت را با حرارت ملایم بپزید تا هویج نرم و گوشت کاملاً پخته شود.",
                "در پایان نمک را تنظیم کرده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("هویج", "400", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "1", IngredientUnit.TABLESPOON),
                Ingredients("زعفران دم‌کرده", "2", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 27,
            image = Res.drawable.food6,
            title = "خورشت مرغ و آلو",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "آلوها را بشویید و در آب ولرم خیس کنید.",
                "پیاز را خرد کرده و با روغن تفت دهید.",
                "تکه‌های مرغ را اضافه کنید و دو طرف آن‌ها را سرخ کنید.",
                "زردچوبه و فلفل را اضافه کنید.",
                "رب گوجه‌فرنگی را اضافه کرده و تفت دهید.",
                "آب جوش اضافه کنید و اجازه دهید مرغ نیم‌پز شود.",
                "آلوها را به قابلمه اضافه کنید.",
                "زعفران دم‌کرده و کمی آبلیمو اضافه کنید.",
                "خورشت را با حرارت ملایم بپزید تا مرغ کاملاً پخته و سس غلیظ شود.",
                "نمک را تنظیم کرده و همراه برنج سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("مرغ", "600", IngredientUnit.GRAM),
                Ingredients("آلو بخارا", "150", IngredientUnit.GRAM),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "2", IngredientUnit.TABLESPOON),
                Ingredients("زعفران دم‌کرده", "2", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "3", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 28,
            image = Res.drawable.food1,
            title = "خورشت کدو",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "کدوها را بشویید و پوست آن‌ها را در صورت تمایل بگیرید.",
                "کدوها را از طول نصف کرده و در روغن کمی سرخ کنید.",
                "پیاز را خرد کرده و با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کرده و با زردچوبه تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کنید و کمی تفت دهید.",
                "آب جوش اضافه کرده و اجازه دهید گوشت بپزد.",
                "گوجه‌فرنگی‌ها را خرد کرده و به قابلمه اضافه کنید.",
                "کدوهای سرخ‌شده را در مراحل پایانی به خورشت اضافه کنید.",
                "اجازه دهید خورشت با حرارت کم جا بیفتد و کدوها شکل خود را حفظ کنند.",
                "نمک و آبلیمو را تنظیم کرده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("کدو سبز", "4", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "2", IngredientUnit.PIECE),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "2", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 29,
            image = Res.drawable.food2,
            title = "خورشت غوره بادمجان",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "بادمجان‌ها را پوست بگیرید و پس از نمک زدن کنار بگذارید.",
                "بادمجان‌ها را خشک کرده و در روغن سرخ کنید.",
                "پیاز را خرد کرده و با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کرده و همراه زردچوبه تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کنید و کمی تفت دهید.",
                "آب جوش اضافه کرده و اجازه دهید گوشت نیم‌پز شود.",
                "گوجه‌فرنگی‌ها را نصف کرده و همراه بادمجان به قابلمه اضافه کنید.",
                "غوره را بشویید و در نیم ساعت پایانی پخت اضافه کنید.",
                "خورشت را با حرارت ملایم بپزید تا مواد نرم شوند.",
                "نمک و میزان ترشی خورشت را تنظیم کرده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("بادمجان", "4", IngredientUnit.PIECE),
                Ingredients("غوره", "150", IngredientUnit.GRAM),
                Ingredients("گوجه‌فرنگی", "2", IngredientUnit.PIECE),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "1", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 30,
            image = Res.drawable.food3,
            title = "خورشت ریواس",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "ریواس‌ها را بشویید و پوست نازک و رشته‌ای آن‌ها را جدا کنید.",
                "ریواس را به قطعات سه تا چهار سانتی‌متری خرد کنید.",
                "پیاز را نگینی خرد کرده و با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کرده و با زردچوبه و فلفل تفت دهید.",
                "آب جوش اضافه کنید و اجازه دهید گوشت کاملاً بپزد.",
                "نعناع و جعفری را خرد کرده و با کمی روغن تفت دهید.",
                "سبزی سرخ‌شده را به قابلمه اضافه کنید.",
                "ریواس خردشده را در ۱۵ تا ۲۰ دقیقه پایانی پخت اضافه کنید.",
                "خورشت را به‌آرامی هم بزنید تا ریواس له نشود.",
                "نمک را تنظیم کرده و پس از جا افتادن سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("ریواس", "400", IngredientUnit.GRAM),
                Ingredients("جعفری", "150", IngredientUnit.GRAM),
                Ingredients("نعناع", "50", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 31,
            image = Res.drawable.food4,
            title = "خورشت به",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "به‌ها را بشویید، پوست بگیرید و به قطعات متوسط خرد کنید.",
                "پیاز را خرد کرده و با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کرده و همراه زردچوبه تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کرده و کمی تفت دهید.",
                "آب جوش اضافه کنید و اجازه دهید گوشت نیم‌پز شود.",
                "تکه‌های به را در تابه با کمی روغن تفت دهید.",
                "به را همراه زعفران به قابلمه اضافه کنید.",
                "کمی شکر و آبلیمو برای ایجاد طعم ملس اضافه کنید.",
                "خورشت را با حرارت ملایم بپزید تا به نرم شود اما شکل خود را حفظ کند.",
                "نمک و طعم نهایی خورشت را تنظیم کرده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("به", "3", IngredientUnit.PIECE),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "1", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "2", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON),
                Ingredients("زعفران دم‌کرده", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "3", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "0.5", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 32,
            image = Res.drawable.food5,
            title = "خورشت خلال کرمانشاهی",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "خلال بادام را حدود یک ساعت در گلاب و آب خیس کنید.",
                "پیاز را ریز خرد کرده و با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کرده و همراه زردچوبه تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کرده و کمی تفت دهید.",
                "آب جوش اضافه کنید و اجازه دهید گوشت به‌آرامی بپزد.",
                "خلال بادام را آبکش کرده و به قابلمه اضافه کنید.",
                "زرشک را جداگانه با کمی کره یا روغن تفت دهید.",
                "زعفران دم‌کرده و لیموعمانی را به خورشت اضافه کنید.",
                "در مراحل پایانی زرشک را اضافه کنید و اجازه دهید خورشت جا بیفتد.",
                "نمک را تنظیم کرده و خورشت را همراه برنج سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت گوسفندی", "350", IngredientUnit.GRAM),
                Ingredients("خلال بادام", "100", IngredientUnit.GRAM),
                Ingredients("زرشک", "50", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "2", IngredientUnit.TABLESPOON),
                Ingredients("لیموعمانی", "2", IngredientUnit.PIECE),
                Ingredients("گلاب", "2", IngredientUnit.TABLESPOON),
                Ingredients("زعفران دم‌کرده", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "3", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "0.5", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.25", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 33,
            image = Res.drawable.food6,
            title = "خورشت تره",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "تره و جعفری را پاک کنید، بشویید و ریز خرد کنید.",
                "پیاز را نگینی خرد کرده و با روغن تفت دهید.",
                "گوشت خورشتی را اضافه کرده و با زردچوبه و فلفل تفت دهید.",
                "سبزی خردشده را جداگانه با کمی روغن تفت دهید.",
                "سبزی را به قابلمه گوشت اضافه کنید.",
                "آب جوش اضافه کرده و اجازه دهید گوشت با حرارت ملایم بپزد.",
                "سیب‌زمینی را پوست گرفته و به مکعب‌های کوچک خرد کنید.",
                "سیب‌زمینی را در نیمه دوم پخت به خورشت اضافه کنید.",
                "آبلیمو یا آبغوره را در مراحل پایانی اضافه کنید.",
                "پس از پخت کامل گوشت و جا افتادن خورشت، نمک را تنظیم کرده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت خورشتی", "300", IngredientUnit.GRAM),
                Ingredients("تره", "400", IngredientUnit.GRAM),
                Ingredients("جعفری", "100", IngredientUnit.GRAM),
                Ingredients("سیب‌زمینی", "2", IngredientUnit.PIECE),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("آبلیمو", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
        )
    )

    // 3. دسرها — 12 غذا
    // 3. دسرها — 12 غذا
    val dessertRecipes = listOf(

        recipe(
            id = 34,
            image = Res.drawable.food1,
            title = "تیرامیسو",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "قهوه غلیظ را آماده کنید و اجازه دهید کاملاً خنک شود.",
                "زرده تخم‌مرغ و شکر را با همزن بزنید تا کرم‌رنگ و کش‌دار شود.",
                "پنیر ماسکارپونه را به مخلوط زرده اضافه کنید و آرام هم بزنید.",
                "خامه را جداگانه بزنید تا فرم بگیرد.",
                "خامه فرم‌گرفته را به ترکیب ماسکارپونه اضافه کنید و به‌آرامی مخلوط کنید.",
                "بیسکویت لیدی‌فینگر را برای چند ثانیه در قهوه خنک فرو ببرید.",
                "یک لایه بیسکویت کف ظرف بچینید.",
                "نیمی از کرم ماسکارپونه را روی بیسکویت‌ها پخش کنید.",
                "یک لایه دیگر بیسکویت و سپس باقی کرم را اضافه کنید.",
                "دسر را حداقل ۶ ساعت در یخچال قرار دهید.",
                "پیش از سرو روی دسر پودر کاکائو الک کنید."
            ),
            ingredients = listOf(
                Ingredients("پنیر ماسکارپونه", "250", IngredientUnit.GRAM),
                Ingredients("بیسکویت لیدی‌فینگر", "200", IngredientUnit.GRAM),
                Ingredients("خامه", "200", IngredientUnit.GRAM),
                Ingredients("زرده تخم‌مرغ", "3", IngredientUnit.PIECE),
                Ingredients("شکر", "80", IngredientUnit.GRAM),
                Ingredients("قهوه غلیظ", "200", IngredientUnit.MILLILITER),
                Ingredients("پودر کاکائو", "2", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("وانیل", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 35,
            image = Res.drawable.food2,
            title = "کرم کارامل",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "شکر را داخل قابلمه کوچکی بریزید و روی حرارت ملایم قرار دهید.",
                "اجازه دهید شکر بدون هم زدن ذوب و به رنگ طلایی تبدیل شود.",
                "کارامل را کف قالب‌های مخصوص دسر بریزید.",
                "تخم‌مرغ‌ها و شکر را با همزن دستی مخلوط کنید.",
                "شیر را گرم کنید و به‌آرامی به مخلوط تخم‌مرغ اضافه کنید.",
                "وانیل را اضافه کرده و مواد را از صافی عبور دهید.",
                "مایه کرم را داخل قالب‌های کاراملی بریزید.",
                "قالب‌ها را داخل ظرف بزرگ‌تر حاوی آب گرم قرار دهید.",
                "ظرف را در فر از قبل گرم‌شده با دمای ۱۶۰ درجه قرار دهید.",
                "حدود ۴۵ تا ۵۵ دقیقه بپزید تا کرم خودش را بگیرد.",
                "پس از خنک شدن، دسر را حداقل ۴ ساعت در یخچال قرار دهید.",
                "دور دسر را با چاقو آزاد کنید و در ظرف سرو برگردانید."
            ),
            ingredients = listOf(
                Ingredients("شیر", "500", IngredientUnit.MILLILITER),
                Ingredients("تخم‌مرغ", "4", IngredientUnit.PIECE),
                Ingredients("شکر برای کرم", "100", IngredientUnit.GRAM),
                Ingredients("شکر برای کارامل", "100", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("وانیل", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 36,
            image = Res.drawable.food3,
            title = "پاناکوتا",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "پودر ژلاتین را روی آب سرد بپاشید و چند دقیقه صبر کنید تا اسفنجی شود.",
                "خامه و شیر را داخل قابلمه بریزید.",
                "شکر را اضافه کنید و مواد را روی حرارت ملایم گرم کنید.",
                "مواد را هم بزنید تا شکر کاملاً حل شود، اما اجازه ندهید بجوشد.",
                "ژلاتین آماده‌شده را به مخلوط گرم اضافه کنید.",
                "وانیل را اضافه کرده و مواد را هم بزنید تا یکدست شوند.",
                "مایه پاناکوتا را داخل قالب یا لیوان‌های سرو بریزید.",
                "پس از رسیدن به دمای محیط، قالب‌ها را داخل یخچال قرار دهید.",
                "حداقل ۴ ساعت صبر کنید تا دسر کاملاً ببندد.",
                "پاناکوتا را با سس میوه یا تکه‌های میوه تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("خامه", "200", IngredientUnit.MILLILITER),
                Ingredients("شیر", "300", IngredientUnit.MILLILITER),
                Ingredients("شکر", "70", IngredientUnit.GRAM),
                Ingredients("پودر ژلاتین", "2", IngredientUnit.TABLESPOON),
                Ingredients("آب سرد", "4", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("وانیل", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 37,
            image = Res.drawable.food4,
            title = "ژله میوه‌ای",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "پودر ژله را داخل یک ظرف مناسب بریزید.",
                "یک لیوان آب جوش به پودر ژله اضافه کنید.",
                "مواد را هم بزنید تا پودر ژله کاملاً حل شود.",
                "یک لیوان آب سرد اضافه کنید و دوباره هم بزنید.",
                "میوه‌ها را شسته و به قطعات کوچک خرد کنید.",
                "میوه‌های خردشده را داخل قالب ژله بچینید.",
                "مایه ژله را به‌آرامی روی میوه‌ها بریزید.",
                "قالب را حداقل ۴ ساعت در یخچال قرار دهید.",
                "پس از سفت شدن ژله، قالب را چند ثانیه در آب ولرم قرار دهید.",
                "ژله را در ظرف سرو برگردانید و تزئین کنید."
            ),
            ingredients = listOf(
                Ingredients("پودر ژله", "1", IngredientUnit.PACK),
                Ingredients("آب جوش", "250", IngredientUnit.MILLILITER),
                Ingredients("آب سرد", "250", IngredientUnit.MILLILITER),
                Ingredients("توت‌فرنگی", "100", IngredientUnit.GRAM),
                Ingredients("موز", "1", IngredientUnit.PIECE),
                Ingredients("کیوی", "1", IngredientUnit.PIECE)
            ),
            spices = listOf()
        ),

        recipe(
            id = 38,
            image = Res.drawable.food5,
            title = "پودینگ شکلاتی",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "نشاسته ذرت، شکر و پودر کاکائو را داخل قابلمه مخلوط کنید.",
                "شیر سرد را کم‌کم اضافه کنید و هم بزنید تا گلوله‌ای باقی نماند.",
                "قابلمه را روی حرارت ملایم قرار دهید.",
                "مواد را مرتب هم بزنید تا غلیظ شوند.",
                "شکلات تلخ خردشده را اضافه کنید.",
                "کره را اضافه کرده و هم بزنید تا کاملاً ذوب شود.",
                "وانیل را اضافه کنید و قابلمه را از روی حرارت بردارید.",
                "پودینگ را داخل ظرف‌های سرو بریزید.",
                "برای جلوگیری از ایجاد لایه روی سطح، روی دسر را با سلفون در تماس بپوشانید.",
                "پس از خنک شدن، پودینگ را حداقل ۲ ساعت در یخچال قرار دهید.",
                "با خامه یا شکلات رنده‌شده تزئین و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("شیر", "500", IngredientUnit.MILLILITER),
                Ingredients("شکر", "100", IngredientUnit.GRAM),
                Ingredients("پودر کاکائو", "3", IngredientUnit.TABLESPOON),
                Ingredients("نشاسته ذرت", "3", IngredientUnit.TABLESPOON),
                Ingredients("شکلات تلخ", "80", IngredientUnit.GRAM),
                Ingredients("کره", "30", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("وانیل", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 39,
            image = Res.drawable.food6,
            title = "چیزکیک",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "بیسکویت‌ها را داخل غذاساز خرد کنید.",
                "کره ذوب‌شده را به بیسکویت اضافه کرده و مخلوط کنید.",
                "مخلوط بیسکویت را کف قالب کمربندی بریزید و فشرده کنید.",
                "قالب را حدود ۲۰ دقیقه در یخچال قرار دهید.",
                "پنیر خامه‌ای و شکر را با همزن مخلوط کنید.",
                "تخم‌مرغ‌ها را یکی‌یکی اضافه کنید و هم بزنید.",
                "خامه و وانیل را اضافه کرده و مواد را یکدست کنید.",
                "مایه پنیری را روی لایه بیسکویتی بریزید.",
                "قالب را داخل فر با دمای ۱۶۰ درجه قرار دهید.",
                "حدود ۵۰ تا ۶۰ دقیقه بپزید تا اطراف دسر بسته و مرکز آن کمی لرزان باشد.",
                "پس از خنک شدن، چیزکیک را چند ساعت در یخچال قرار دهید.",
                "روی دسر را با سس میوه یا مربای دلخواه تزئین کنید."
            ),
            ingredients = listOf(
                Ingredients("پنیر خامه‌ای", "400", IngredientUnit.GRAM),
                Ingredients("بیسکویت پتی‌بور", "200", IngredientUnit.GRAM),
                Ingredients("کره", "100", IngredientUnit.GRAM),
                Ingredients("شکر", "120", IngredientUnit.GRAM),
                Ingredients("تخم‌مرغ", "2", IngredientUnit.PIECE),
                Ingredients("خامه", "150", IngredientUnit.MILLILITER),
                Ingredients("سس میوه", "100", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("وانیل", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 40,
            image = Res.drawable.food1,
            title = "فرنی",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "آرد برنج را داخل قابلمه بریزید.",
                "شیر سرد را به‌تدریج اضافه کنید و هم بزنید تا آرد کاملاً حل شود.",
                "قابلمه را روی حرارت ملایم قرار دهید.",
                "مواد را مرتب هم بزنید تا ته نگیرند.",
                "شکر را اضافه کنید و به هم زدن ادامه دهید.",
                "وقتی فرنی کمی غلیظ شد، گلاب را اضافه کنید.",
                "در صورت تمایل زعفران دم‌کرده را نیز اضافه کنید.",
                "پس از رسیدن به غلظت مناسب، قابلمه را از روی حرارت بردارید.",
                "فرنی را داخل ظرف‌های سرو بریزید.",
                "پس از خنک شدن با دارچین و خلال پسته تزئین کنید."
            ),
            ingredients = listOf(
                Ingredients("شیر", "500", IngredientUnit.MILLILITER),
                Ingredients("آرد برنج", "4", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "5", IngredientUnit.TABLESPOON),
                Ingredients("گلاب", "3", IngredientUnit.TABLESPOON),
                Ingredients("خلال پسته", "20", IngredientUnit.GRAM),
                Ingredients("زعفران دم‌کرده", "1", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("دارچین", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 41,
            image = Res.drawable.food2,
            title = "شله‌زرد",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "برنج را چند بار بشویید و چند ساعت در آب خیس کنید.",
                "برنج را همراه آب داخل قابلمه بریزید.",
                "قابلمه را روی حرارت قرار دهید تا برنج کاملاً شکفته و نرم شود.",
                "زعفران دم‌کرده را اضافه کنید.",
                "شکر را کم‌کم اضافه کرده و مرتب هم بزنید.",
                "گلاب را اضافه کنید.",
                "کره را داخل قابلمه بریزید و مواد را مخلوط کنید.",
                "خلال بادام را اضافه کنید و اجازه دهید شله‌زرد با حرارت ملایم غلیظ شود.",
                "در صورت نیاز کمی آب جوش اضافه کنید تا بافت مناسب به دست آید.",
                "شله‌زرد را داخل ظرف‌های سرو بریزید.",
                "پس از خنک شدن با دارچین، خلال بادام و پسته تزئین کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج نیم‌دانه", "250", IngredientUnit.GRAM),
                Ingredients("شکر", "400", IngredientUnit.GRAM),
                Ingredients("آب", "2", IngredientUnit.LITER),
                Ingredients("گلاب", "100", IngredientUnit.MILLILITER),
                Ingredients("خلال بادام", "50", IngredientUnit.GRAM),
                Ingredients("کره", "50", IngredientUnit.GRAM),
                Ingredients("زعفران دم‌کرده", "4", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("دارچین", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 42,
            image = Res.drawable.food3,
            title = "بستنی خانگی",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "خامه را داخل ظرف مناسبی بریزید و کمی هم بزنید.",
                "شیر عسلی را به خامه اضافه کنید.",
                "وانیل را اضافه کرده و مواد را مخلوط کنید.",
                "مخلوط را با همزن بزنید تا بافتی یکدست و کمی حجیم پیدا کند.",
                "در صورت تمایل تکه‌های شکلات یا میوه به مواد اضافه کنید.",
                "مایه بستنی را داخل ظرف دردار بریزید.",
                "ظرف را به مدت ۶ تا ۸ ساعت در فریزر قرار دهید.",
                "در صورت امکان طی دو ساعت اول، هر ۳۰ تا ۴۵ دقیقه بستنی را هم بزنید تا بافت نرم‌تری پیدا کند.",
                "پس از سفت شدن کامل، بستنی را چند دقیقه در دمای محیط قرار دهید.",
                "بستنی را با مغزها یا سس شکلات سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("خامه پرچرب", "400", IngredientUnit.MILLILITER),
                Ingredients("شیر عسلی", "200", IngredientUnit.GRAM),
                Ingredients("شکلات چیپسی", "50", IngredientUnit.GRAM),
                Ingredients("مغز پسته", "30", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("وانیل", "1", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 43,
            image = Res.drawable.food4,
            title = "موس شکلاتی",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "شکلات تلخ را خرد کنید.",
                "شکلات را به روش بن‌ماری ذوب کنید و اجازه دهید کمی خنک شود.",
                "زرده و سفیده تخم‌مرغ‌ها را جدا کنید.",
                "زرده‌ها را با شکر مخلوط کنید تا روشن و یکدست شوند.",
                "شکلات ذوب‌شده را به زرده‌ها اضافه کنید.",
                "خامه را جداگانه بزنید تا فرم نیمه‌سفت پیدا کند.",
                "خامه را به‌آرامی با مخلوط شکلات ترکیب کنید.",
                "سفیده تخم‌مرغ را در ظرف تمیز بزنید تا فرم بگیرد.",
                "سفیده فرم‌گرفته را به‌آرامی و در چند مرحله به مخلوط اضافه کنید.",
                "موس را داخل لیوان‌های سرو بریزید.",
                "دسر را حداقل ۴ ساعت در یخچال قرار دهید.",
                "با خامه و شکلات رنده‌شده تزئین و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("شکلات تلخ", "200", IngredientUnit.GRAM),
                Ingredients("خامه", "200", IngredientUnit.MILLILITER),
                Ingredients("تخم‌مرغ", "3", IngredientUnit.PIECE),
                Ingredients("شکر", "50", IngredientUnit.GRAM),
                Ingredients("کره", "30", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("وانیل", "0.5", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 44,
            image = Res.drawable.food5,
            title = "پارفه میوه",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "توت‌فرنگی، موز و سایر میوه‌های دلخواه را بشویید.",
                "میوه‌ها را به قطعات کوچک خرد کنید.",
                "خامه را با کمی عسل مخلوط کنید.",
                "ماست یونانی را با عسل هم بزنید تا یکدست شود.",
                "بیسکویت را خرد کنید.",
                "داخل لیوان سرو یک لایه بیسکویت خردشده بریزید.",
                "یک لایه ماست و خامه روی بیسکویت اضافه کنید.",
                "یک لایه میوه خردشده قرار دهید.",
                "لایه‌ها را به همین ترتیب تکرار کنید.",
                "روی دسر را با میوه تازه و مغز بادام تزئین کنید.",
                "پارفه را حدود یک ساعت در یخچال قرار دهید و سپس سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("توت‌فرنگی", "150", IngredientUnit.GRAM),
                Ingredients("موز", "2", IngredientUnit.PIECE),
                Ingredients("ماست یونانی", "200", IngredientUnit.GRAM),
                Ingredients("خامه", "100", IngredientUnit.MILLILITER),
                Ingredients("عسل", "3", IngredientUnit.TABLESPOON),
                Ingredients("بیسکویت", "100", IngredientUnit.GRAM),
                Ingredients("بادام خردشده", "30", IngredientUnit.GRAM)
            ),
            spices = listOf()
        ),

        recipe(
            id = 45,
            image = Res.drawable.food6,
            title = "دسر بیسکوییتی",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "شیر، شکر، نشاسته ذرت و پودر کاکائو را داخل قابلمه مخلوط کنید.",
                "مواد را روی حرارت ملایم قرار دهید و مرتب هم بزنید.",
                "پس از غلیظ شدن کرم، قابلمه را از روی حرارت بردارید.",
                "کره و وانیل را اضافه کنید و هم بزنید.",
                "کف ظرف سرو یک لایه بیسکویت بچینید.",
                "مقداری از کرم گرم را روی بیسکویت‌ها پخش کنید.",
                "دوباره یک لایه بیسکویت و یک لایه کرم اضافه کنید.",
                "این کار را تا تمام شدن مواد ادامه دهید.",
                "لایه آخر را با کرم شکلاتی بپوشانید.",
                "دسر را پس از خنک شدن حداقل ۴ ساعت در یخچال قرار دهید.",
                "روی دسر را با پودر کاکائو یا شکلات رنده‌شده تزئین کنید."
            ),
            ingredients = listOf(
                Ingredients("بیسکویت پتی‌بور", "250", IngredientUnit.GRAM),
                Ingredients("شیر", "600", IngredientUnit.MILLILITER),
                Ingredients("شکر", "100", IngredientUnit.GRAM),
                Ingredients("نشاسته ذرت", "4", IngredientUnit.TABLESPOON),
                Ingredients("پودر کاکائو", "2", IngredientUnit.TABLESPOON),
                Ingredients("کره", "40", IngredientUnit.GRAM),
                Ingredients("شکلات رنده‌شده", "30", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("وانیل", "0.5", IngredientUnit.TEASPOON)
            )
        )
    )

    // 4. کیک و شیرینی — 16 غذا
    val cakeRecipes = listOf(
        recipe(
            id = 46,
            image = Res.drawable.food1,
            title = "کیک شکلاتی",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "فر را روی ۱۸۰ درجه سانتی‌گراد گرم کنید.",
                "تخم‌مرغ، شکر و وانیل را با همزن بزنید تا کرم‌رنگ و حجیم شود.",
                "شیر و روغن را اضافه کرده و مخلوط کنید.",
                "آرد، پودر کاکائو و بیکینگ‌پودر را الک کرده و به مواد اضافه کنید.",
                "مایه کیک را داخل قالب چرب‌شده بریزید.",
                "حدود ۳۵ تا ۴۵ دقیقه بپزید و پس از خنک شدن سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("آرد سفید", "۲", IngredientUnit.CUP),
                Ingredients("شکر", "۱", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("شیر", "۱", IngredientUnit.CUP),
                Ingredients("روغن مایع", "نصف", IngredientUnit.CUP),
                Ingredients("پودر کاکائو", "نصف", IngredientUnit.CUP),
                Ingredients("بیکینگ‌پودر", "۲", IngredientUnit.TEASPOON)
            ),
            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 47,
            image = Res.drawable.food2,
            title = "کیک هویج",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "فر را روی ۱۸۰ درجه سانتی‌گراد گرم کنید.",
                "تخم‌مرغ و شکر را با همزن بزنید تا حجیم شود.",
                "روغن مایع را اضافه کنید.",
                "هویج رنده‌شده و گردوی خردشده را داخل مواد بریزید.",
                "آرد، بیکینگ‌پودر و دارچین را الک کرده و به‌آرامی مخلوط کنید.",
                "مایه را در قالب بریزید و حدود ۴۰ تا ۴۵ دقیقه بپزید."
            ),
            ingredients = listOf(
                Ingredients("آرد سفید", "۲", IngredientUnit.CUP),
                Ingredients("هویج رنده‌شده", "۲", IngredientUnit.CUP),
                Ingredients("شکر", "۱", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("روغن مایع", "۳/۴", IngredientUnit.CUP),
                Ingredients("گردوی خردشده", "نصف", IngredientUnit.CUP),
                Ingredients("بیکینگ‌پودر", "۲", IngredientUnit.TEASPOON)
            ),
            spices = listOf(
                Spices("دارچین", "۱", IngredientUnit.TEASPOON),
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 48,
            image = Res.drawable.food3,
            title = "کیک اسفنجی",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "فر را روی ۱۸۰ درجه سانتی‌گراد گرم کنید.",
                "زرده و سفیده تخم‌مرغ‌ها را جدا کنید.",
                "سفیده‌ها را با همزن بزنید تا کاملاً فرم بگیرند.",
                "زرده‌ها را با شکر و وانیل مخلوط کنید تا کرم‌رنگ شوند.",
                "آرد و بیکینگ‌پودر الک‌شده را به زرده‌ها اضافه کنید.",
                "سفیده را در چند مرحله به‌آرامی با مواد ترکیب کنید.",
                "مایه را در قالب بریزید و حدود ۳۵ تا ۴۰ دقیقه بپزید."
            ),
            ingredients = listOf(
                Ingredients("آرد سفید", "۱", IngredientUnit.CUP),
                Ingredients("شکر", "۱", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۴", IngredientUnit.PIECE),
                Ingredients("بیکینگ‌پودر", "۱", IngredientUnit.TEASPOON),
                Ingredients("آب گرم", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 49,
            image = Res.drawable.food4,
            title = "کیک ردولوت",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "فر را روی ۱۷۵ درجه سانتی‌گراد گرم کنید.",
                "تخم‌مرغ و شکر را با همزن بزنید تا حجیم شود.",
                "روغن، باترمیلک و رنگ خوراکی قرمز را اضافه کنید.",
                "آرد، پودر کاکائو و بیکینگ‌پودر را الک کنید.",
                "مواد خشک را به‌آرامی با مواد تر ترکیب کنید.",
                "مایه را در قالب بریزید و حدود ۳۰ تا ۳۵ دقیقه بپزید.",
                "پس از خنک شدن، با کرم پنیر خامه‌ای تزیین کنید."
            ),
            ingredients = listOf(
                Ingredients("آرد سفید", "۲ و نیم", IngredientUnit.CUP),
                Ingredients("شکر", "۱ و نیم", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("روغن مایع", "۱", IngredientUnit.CUP),
                Ingredients("باترمیلک", "۱", IngredientUnit.CUP),
                Ingredients("پودر کاکائو", "۲", IngredientUnit.TABLESPOON),
                Ingredients("پنیر خامه‌ای", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("بیکینگ‌پودر", "۱", IngredientUnit.TEASPOON)
            ),
            spices = listOf(
                Spices("وانیل", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 50,
            image = Res.drawable.food5,
            title = "کیک موزی",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "فر را روی ۱۸۰ درجه سانتی‌گراد گرم کنید.",
                "موزها را با چنگال کاملاً له کنید.",
                "تخم‌مرغ و شکر را با همزن بزنید.",
                "روغن و موز له‌شده را اضافه کنید.",
                "آرد و بیکینگ‌پودر الک‌شده را به مواد اضافه کنید.",
                "گردوی خردشده را داخل مایه بریزید.",
                "مایه را در قالب ریخته و حدود ۴۰ دقیقه بپزید."
            ),
            ingredients = listOf(
                Ingredients("آرد سفید", "۲", IngredientUnit.CUP),
                Ingredients("موز رسیده", "۳", IngredientUnit.PIECE),
                Ingredients("شکر", "۳/۴", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("روغن مایع", "نصف", IngredientUnit.CUP),
                Ingredients("گردوی خردشده", "نصف", IngredientUnit.CUP),
                Ingredients("بیکینگ‌پودر", "۲", IngredientUnit.TEASPOON)
            ),
            spices = listOf(
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON),
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 51,
            image = Res.drawable.food6,
            title = "کیک قهوه",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "فر را روی ۱۸۰ درجه سانتی‌گراد گرم کنید.",
                "قهوه فوری را در مقدار کمی آب گرم حل کنید.",
                "تخم‌مرغ، شکر و وانیل را با همزن بزنید.",
                "روغن، شیر و قهوه حل‌شده را اضافه کنید.",
                "آرد و بیکینگ‌پودر را الک کرده و به مواد اضافه کنید.",
                "مایه را داخل قالب بریزید.",
                "حدود ۳۵ تا ۴۰ دقیقه بپزید و پس از خنک شدن تزیین کنید."
            ),
            ingredients = listOf(
                Ingredients("آرد سفید", "۲", IngredientUnit.CUP),
                Ingredients("شکر", "۱", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("شیر", "۳/۴", IngredientUnit.CUP),
                Ingredients("روغن مایع", "نصف", IngredientUnit.CUP),
                Ingredients("قهوه فوری", "۲", IngredientUnit.TABLESPOON),
                Ingredients("بیکینگ‌پودر", "۲", IngredientUnit.TEASPOON)
            ),
            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 52,
            image = Res.drawable.food1,
            title = "کیک یزدی",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "فر را روی ۲۰۰ درجه سانتی‌گراد گرم کنید.",
                "تخم‌مرغ و شکر را با همزن بزنید تا روشن و حجیم شود.",
                "روغن و ماست را اضافه کنید و مخلوط کنید.",
                "آرد و بیکینگ‌پودر را الک کرده و به مواد اضافه کنید.",
                "گلاب و هل را اضافه کنید.",
                "مایه را در قالب‌های کوچک کیک بریزید.",
                "روی هر کیک کمی کنجد بپاشید و حدود ۱۵ تا ۲۰ دقیقه بپزید."
            ),
            ingredients = listOf(
                Ingredients("آرد سفید", "۲", IngredientUnit.CUP),
                Ingredients("شکر", "۱", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("ماست", "نصف", IngredientUnit.CUP),
                Ingredients("روغن مایع", "نصف", IngredientUnit.CUP),
                Ingredients("گلاب", "۲", IngredientUnit.TABLESPOON),
                Ingredients("بیکینگ‌پودر", "۱", IngredientUnit.TEASPOON),
                Ingredients("کنجد", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("هل", "۱", IngredientUnit.TEASPOON),
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 53,
            image = Res.drawable.food2,
            title = "براونی",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "فر را روی ۱۷۵ درجه سانتی‌گراد گرم کنید.",
                "شکلات تلخ و کره را به روش بن‌ماری ذوب کنید.",
                "تخم‌مرغ و شکر را با همزن دستی مخلوط کنید.",
                "مخلوط شکلات و کره را به تخم‌مرغ اضافه کنید.",
                "آرد و پودر کاکائو را الک کرده و به مواد اضافه کنید.",
                "گردوی خردشده را در صورت تمایل اضافه کنید.",
                "مایه را در قالب بریزید و حدود ۲۰ تا ۲۵ دقیقه بپزید."
            ),
            ingredients = listOf(
                Ingredients("شکلات تلخ", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("کره", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("آرد سفید", "۳/۴", IngredientUnit.CUP),
                Ingredients("شکر", "۱", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("پودر کاکائو", "۲", IngredientUnit.TABLESPOON),
                Ingredients("گردوی خردشده", "نصف", IngredientUnit.CUP)
            ),
            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 54,
            image = Res.drawable.food3,
            title = "کاپ‌کیک",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "فر را روی ۱۸۰ درجه سانتی‌گراد گرم کنید.",
                "تخم‌مرغ، شکر و وانیل را با همزن بزنید.",
                "شیر و روغن را اضافه کنید.",
                "آرد و بیکینگ‌پودر را الک کرده و به مواد اضافه کنید.",
                "کپسول‌های کاغذی را داخل قالب مافین قرار دهید.",
                "مایه را تا دو سوم ارتفاع کپسول‌ها بریزید.",
                "حدود ۱۸ تا ۲۲ دقیقه بپزید و پس از خنک شدن تزیین کنید."
            ),
            ingredients = listOf(
                Ingredients("آرد سفید", "۲", IngredientUnit.CUP),
                Ingredients("شکر", "۱", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("شیر", "۳/۴", IngredientUnit.CUP),
                Ingredients("روغن مایع", "نصف", IngredientUnit.CUP),
                Ingredients("بیکینگ‌پودر", "۲", IngredientUnit.TEASPOON)
            ),
            spices = listOf(
                Spices("وانیل", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 55,
            image = Res.drawable.food4,
            title = "شیرینی نخودچی",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "روغن جامد یا کره نرم‌شده را با پودر قند مخلوط کنید.",
                "هل را اضافه کنید.",
                "آرد نخودچی الک‌شده را کم‌کم اضافه کنید.",
                "خمیر را ورز دهید تا یکدست شود.",
                "خمیر را حدود یک ساعت در یخچال استراحت دهید.",
                "خمیر را با وردنه باز کرده و قالب بزنید.",
                "شیرینی‌ها را در فر ۱۶۰ درجه حدود ۱۵ تا ۲۰ دقیقه بپزید."
            ),
            ingredients = listOf(
                Ingredients("آرد نخودچی", "۲", IngredientUnit.CUP),
                Ingredients("پودر قند", "۱", IngredientUnit.CUP),
                Ingredients("روغن جامد", "۱۵۰", IngredientUnit.GRAM),
                Ingredients("پودر پسته", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("هل", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 56,
            image = Res.drawable.food5,
            title = "کیک پرتقالی",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "فر را روی ۱۸۰ درجه سانتی‌گراد گرم کنید.",
                "تخم‌مرغ، شکر و وانیل را با همزن بزنید.",
                "روغن و آب پرتقال تازه را اضافه کنید.",
                "پوست پرتقال رنده‌شده را اضافه کنید.",
                "آرد و بیکینگ‌پودر را الک کرده و به مواد اضافه کنید.",
                "مایه را داخل قالب چرب‌شده بریزید.",
                "حدود ۳۵ تا ۴۵ دقیقه بپزید."
            ),
            ingredients = listOf(
                Ingredients("آرد سفید", "۲", IngredientUnit.CUP),
                Ingredients("شکر", "۱", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("آب پرتقال", "۳/۴", IngredientUnit.CUP),
                Ingredients("روغن مایع", "نصف", IngredientUnit.CUP),
                Ingredients("پوست پرتقال رنده‌شده", "۱", IngredientUnit.TABLESPOON),
                Ingredients("بیکینگ‌پودر", "۲", IngredientUnit.TEASPOON)
            ),
            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 57,
            image = Res.drawable.food6,
            title = "کیک ردولوت کوچک",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "فر را روی ۱۷۵ درجه سانتی‌گراد گرم کنید.",
                "تخم‌مرغ و شکر را با همزن بزنید.",
                "روغن، باترمیلک و رنگ قرمز را اضافه کنید.",
                "آرد و پودر کاکائو را الک کرده و به مواد اضافه کنید.",
                "مایه را در قالب کوچک بریزید.",
                "حدود ۲۵ تا ۳۰ دقیقه بپزید.",
                "پس از خنک شدن با کرم پنیر خامه‌ای تزیین کنید."
            ),
            ingredients = listOf(
                Ingredients("آرد سفید", "۱ و نیم", IngredientUnit.CUP),
                Ingredients("شکر", "۱", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۱", IngredientUnit.PIECE),
                Ingredients("روغن مایع", "نصف", IngredientUnit.CUP),
                Ingredients("باترمیلک", "نصف", IngredientUnit.CUP),
                Ingredients("پودر کاکائو", "۱", IngredientUnit.TABLESPOON),
                Ingredients("پنیر خامه‌ای", "۱۵۰", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 58,
            image = Res.drawable.food1,
            title = "کوکی شکلاتی",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "فر را روی ۱۸۰ درجه سانتی‌گراد گرم کنید.",
                "کره نرم‌شده و شکر را با همزن بزنید.",
                "تخم‌مرغ و وانیل را اضافه کنید.",
                "آرد و بیکینگ‌پودر را کم‌کم اضافه کنید.",
                "شکلات چیپسی را داخل خمیر مخلوط کنید.",
                "از خمیر گلوله‌های کوچک بردارید و با فاصله روی سینی بچینید.",
                "حدود ۱۰ تا ۱۲ دقیقه بپزید و اجازه دهید روی سینی خنک شوند."
            ),
            ingredients = listOf(
                Ingredients("آرد سفید", "۲", IngredientUnit.CUP),
                Ingredients("کره", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("شکر قهوه‌ای", "نصف", IngredientUnit.CUP),
                Ingredients("شکر سفید", "نصف", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۱", IngredientUnit.PIECE),
                Ingredients("شکلات چیپسی", "۱", IngredientUnit.CUP),
                Ingredients("بیکینگ‌پودر", "۱", IngredientUnit.TEASPOON)
            ),
            spices = listOf(
                Spices("وانیل", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 59,
            image = Res.drawable.food2,
            title = "نان خامه‌ای",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "آب، کره و مقدار کمی نمک را داخل قابلمه بجوشانید.",
                "آرد را یک‌باره اضافه کنید و سریع هم بزنید تا خمیر جمع شود.",
                "خمیر را چند دقیقه روی حرارت ملایم هم بزنید و سپس خنک کنید.",
                "تخم‌مرغ‌ها را یکی‌یکی اضافه کنید تا خمیر براق و یکدست شود.",
                "خمیر را با قیف روی سینی فر پایپ کنید.",
                "در فر ۲۰۰ درجه حدود ۲۰ دقیقه و سپس در ۱۸۰ درجه تا خشک شدن داخل نان‌ها بپزید.",
                "پس از خنک شدن، داخل نان‌ها را با خامه فرم‌گرفته پر کنید."
            ),
            ingredients = listOf(
                Ingredients("آرد سفید", "۱", IngredientUnit.CUP),
                Ingredients("آب", "۱", IngredientUnit.CUP),
                Ingredients("کره", "۵۰", IngredientUnit.GRAM),
                Ingredients("تخم‌مرغ", "۴", IngredientUnit.PIECE),
                Ingredients("خامه قنادی", "۲۰۰", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 60,
            image = Res.drawable.food3,
            title = "شیرینی دانمارکی",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "آرد، خمیرمایه فوری، شکر و شیر ولرم را مخلوط کنید.",
                "تخم‌مرغ و کره نرم‌شده را اضافه کنید و خمیر را ورز دهید.",
                "خمیر را بپوشانید و حدود یک ساعت استراحت دهید.",
                "خمیر را روی سطح آردپاشی‌شده باز کنید.",
                "از کرم یا مارمالاد دلخواه داخل خمیر قرار دهید و آن را شکل دهید.",
                "شیرینی‌ها را روی سینی بچینید و حدود ۲۰ دقیقه استراحت دهید.",
                "با زرده تخم‌مرغ رومال کنید و در فر ۱۸۰ درجه حدود ۲۰ دقیقه بپزید."
            ),
            ingredients = listOf(
                Ingredients("آرد سفید", "۳", IngredientUnit.CUP),
                Ingredients("شیر", "۱", IngredientUnit.CUP),
                Ingredients("کره", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("شکر", "نصف", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("خمیرمایه فوری", "۱", IngredientUnit.TABLESPOON),
                Ingredients("مارمالاد", "نصف", IngredientUnit.CUP)
            ),
            spices = listOf(
                Spices("هل", "نصف", IngredientUnit.TEASPOON),
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 61,
            image = Res.drawable.food4,
            title = "تارت میوه",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "آرد و کره سرد خردشده را مخلوط کنید تا بافتی شبیه خرده نان ایجاد شود.",
                "پودر قند و زرده تخم‌مرغ را اضافه کنید و خمیر را جمع کنید.",
                "خمیر را حدود ۳۰ دقیقه در یخچال استراحت دهید.",
                "خمیر را در قالب تارت پهن کنید و کف آن را با چنگال سوراخ کنید.",
                "در فر ۱۸۰ درجه حدود ۱۵ تا ۲۰ دقیقه بپزید تا طلایی شود.",
                "پس از خنک شدن، داخل تارت را با کرم کاستارد پر کنید.",
                "میوه‌های خردشده را روی کرم بچینید و با ژله براق‌کننده تزیین کنید."
            ),
            ingredients = listOf(
                Ingredients("آرد سفید", "۲", IngredientUnit.CUP),
                Ingredients("کره سرد", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("پودر قند", "نصف", IngredientUnit.CUP),
                Ingredients("زرده تخم‌مرغ", "۱", IngredientUnit.PIECE),
                Ingredients("شیر", "۱", IngredientUnit.CUP),
                Ingredients("نشاسته ذرت", "۲", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "۳", IngredientUnit.TABLESPOON),
                Ingredients("میوه فصل", "۲", IngredientUnit.CUP)
            ),
            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        )
    )

    // 5. غذاهای فوری — 14 غذا
    val fastFoodRecipes = listOf(
        recipe(
            id = 62,
            image = Res.drawable.food1,
            title = "پیتزا پپرونی",
            chefName = "علی رضایی",
            cookingSteps = listOf(
                "خمیر پیتزا را آماده کنید و اجازه دهید حجم بگیرد.",
                "خمیر را روی سطح آردپاشی‌شده باز کنید.",
                "سس گوجه‌فرنگی را روی خمیر پخش کنید.",
                "پنیر موزارلا را روی سس بریزید.",
                "برش‌های پپرونی را روی پنیر بچینید.",
                "پیتزا را در فر از قبل گرم‌شده با دمای ۲۲۰ درجه حدود ۱۲ تا ۱۵ دقیقه بپزید.",
                "پس از طلایی شدن پنیر، پیتزا را برش زده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("خمیر پیتزا", "۱", IngredientUnit.PIECE),
                Ingredients("پنیر موزارلا", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("پپرونی", "۱۵۰", IngredientUnit.GRAM),
                Ingredients("سس گوجه‌فرنگی", "نصف", IngredientUnit.CUP),
                Ingredients("فلفل دلمه‌ای", "نصف", IngredientUnit.PIECE),
                Ingredients("قارچ", "۱۰۰", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("آویشن", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 63,
            image = Res.drawable.food2,
            title = "همبرگر خانگی",
            chefName = "امیر محمدی",
            cookingSteps = listOf(
                "گوشت چرخ‌کرده را با پیاز رنده‌شده و آب‌گرفته مخلوط کنید.",
                "نمک، فلفل و پودر سیر را اضافه کنید.",
                "مواد را خوب ورز دهید و به شکل برگر درآورید.",
                "برگرها را حدود ۳۰ دقیقه در یخچال استراحت دهید.",
                "آن‌ها را در تابه یا روی گریل با حرارت متوسط بپزید.",
                "نان همبرگر را کمی گرم کنید.",
                "برگر را همراه کاهو، گوجه، خیارشور و سس داخل نان قرار دهید."
            ),
            ingredients = listOf(
                Ingredients("گوشت چرخ‌کرده", "۴۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("نان همبرگر", "۴", IngredientUnit.PIECE),
                Ingredients("کاهو", "۴", IngredientUnit.LEAF),
                Ingredients("گوجه‌فرنگی", "۱", IngredientUnit.PIECE),
                Ingredients("خیارشور", "۴", IngredientUnit.PIECE),
                Ingredients("پنیر ورقه‌ای", "۴", IngredientUnit.PIECE)
            ),
            spices = listOf(
                Spices("نمک", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 64,
            image = Res.drawable.food3,
            title = "هات‌داگ",
            chefName = "محمد کریمی",
            cookingSteps = listOf(
                "سوسیس‌ها را در آب جوش چند دقیقه گرم کنید یا در تابه سرخ کنید.",
                "پیاز را خلالی خرد کرده و تفت دهید تا طلایی شود.",
                "قارچ خردشده را اضافه کنید و تفت دهید تا آب آن کشیده شود.",
                "نان هات‌داگ را کمی گرم کنید.",
                "سوسیس را داخل نان قرار دهید.",
                "قارچ، پیاز، خیارشور و سس دلخواه را اضافه کنید.",
                "هات‌داگ را گرم سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("سوسیس", "۴", IngredientUnit.PIECE),
                Ingredients("نان هات‌داگ", "۴", IngredientUnit.PIECE),
                Ingredients("قارچ", "۱۵۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("خیارشور", "۴", IngredientUnit.PIECE),
                Ingredients("سس خردل", "۲", IngredientUnit.TABLESPOON),
                Ingredients("سس کچاپ", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پودر آویشن", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 65,
            image = Res.drawable.food4,
            title = "ساندویچ مرغ",
            chefName = "علی رضایی",
            cookingSteps = listOf(
                "سینه مرغ را به قطعات کوچک برش دهید.",
                "مرغ را با نمک، فلفل و پودر سیر مزه‌دار کنید.",
                "مرغ را با کمی روغن در تابه بپزید تا کاملاً مغزپخت شود.",
                "قارچ و فلفل دلمه‌ای خردشده را اضافه کرده و تفت دهید.",
                "نان ساندویچی را باز کنید و کمی سس داخل آن بمالید.",
                "مرغ و سبزیجات را داخل نان قرار دهید.",
                "کاهو، گوجه و خیارشور را اضافه کرده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("سینه مرغ", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("نان ساندویچی", "۲", IngredientUnit.PIECE),
                Ingredients("قارچ", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("فلفل دلمه‌ای", "۱", IngredientUnit.PIECE),
                Ingredients("کاهو", "۴", IngredientUnit.LEAF),
                Ingredients("گوجه‌فرنگی", "۱", IngredientUnit.PIECE),
                Ingredients("خیارشور", "۳", IngredientUnit.PIECE)
            ),
            spices = listOf(
                Spices("پودر سیر", "۱", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 66,
            image = Res.drawable.food5,
            title = "لازانیا",
            chefName = "امیر محمدی",
            cookingSteps = listOf(
                "پیاز خردشده را در روغن تفت دهید.",
                "گوشت چرخ‌کرده را اضافه کنید و تفت دهید تا رنگ آن تغییر کند.",
                "قارچ و فلفل دلمه‌ای را اضافه کنید.",
                "رب گوجه‌فرنگی، نمک و ادویه‌ها را اضافه کرده و مواد را بپزید.",
                "سس بشامل را با کره، آرد و شیر آماده کنید.",
                "ورقه‌های لازانیا را طبق دستور بسته آماده کنید.",
                "در ظرف فر یک لایه سس بشامل، ورقه لازانیا و مایه گوشتی بریزید.",
                "لایه‌ها را تکرار کنید و در پایان پنیر موزارلا اضافه کنید.",
                "در فر ۱۸۰ درجه حدود ۳۰ تا ۴۰ دقیقه بپزید."
            ),
            ingredients = listOf(
                Ingredients("ورقه لازانیا", "۹", IngredientUnit.PIECE),
                Ingredients("گوشت چرخ‌کرده", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("قارچ", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("فلفل دلمه‌ای", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۲", IngredientUnit.TABLESPOON),
                Ingredients("پنیر موزارلا", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("شیر", "۲", IngredientUnit.CUP),
                Ingredients("آرد سفید", "۲", IngredientUnit.TABLESPOON),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("آویشن", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 67,
            image = Res.drawable.food6,
            title = "سیب‌زمینی تنوری",
            chefName = "محمد کریمی",
            cookingSteps = listOf(
                "سیب‌زمینی‌ها را خوب بشویید و به شکل قاچ‌های درشت برش دهید.",
                "سیب‌زمینی‌ها را با روغن زیتون مخلوط کنید.",
                "نمک، فلفل، پاپریکا و آویشن را اضافه کنید.",
                "سیب‌زمینی‌ها را در سینی فر با فاصله بچینید.",
                "در فر ۲۰۰ درجه حدود ۳۵ تا ۴۵ دقیقه بپزید.",
                "در نیمه زمان پخت، سیب‌زمینی‌ها را برگردانید.",
                "پس از طلایی و برشته شدن سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("سیب‌زمینی", "۵۰۰", IngredientUnit.GRAM),
                Ingredients("روغن زیتون", "۳", IngredientUnit.TABLESPOON),
                Ingredients("سیر", "۲", IngredientUnit.PIECE),
                Ingredients("پنیر پارمزان", "۳۰", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("پاپریکا", "۱", IngredientUnit.TEASPOON),
                Spices("آویشن", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 68,
            image = Res.drawable.food1,
            title = "ناگت مرغ",
            chefName = "علی رضایی",
            cookingSteps = listOf(
                "سینه مرغ را چرخ یا کاملاً ریز خرد کنید.",
                "مرغ را با نمک، فلفل و پودر سیر مخلوط کنید.",
                "از مواد تکه‌های کوچک و یک‌شکل درست کنید.",
                "ناگت‌ها را ابتدا در آرد، سپس تخم‌مرغ زده‌شده و در پایان پودر سوخاری بغلتانید.",
                "ناگت‌ها را در روغن داغ با حرارت متوسط سرخ کنید.",
                "پس از طلایی شدن، روی دستمال قرار دهید تا روغن اضافی گرفته شود.",
                "با سس دلخواه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("سینه مرغ", "۴۰۰", IngredientUnit.GRAM),
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("آرد سفید", "نصف", IngredientUnit.CUP),
                Ingredients("پودر سوخاری", "۱", IngredientUnit.CUP),
                Ingredients("پنیر پارمزان", "۳۰", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("پودر سیر", "۱", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 69,
            image = Res.drawable.food2,
            title = "ساندویچ کلاب",
            chefName = "امیر محمدی",
            cookingSteps = listOf(
                "سینه مرغ را با نمک و فلفل بپزید و به برش‌های نازک تقسیم کنید.",
                "نان تست‌ها را کمی برشته کنید.",
                "روی یک برش نان سس مایونز بمالید.",
                "مرغ، کاهو و گوجه را روی نان قرار دهید.",
                "برش دوم نان را اضافه کنید و ژامبون و پنیر را روی آن بچینید.",
                "برش سوم نان را قرار دهید.",
                "ساندویچ را به شکل مثلثی برش دهید و با خلال دندان ثابت کنید."
            ),
            ingredients = listOf(
                Ingredients("نان تست", "۶", IngredientUnit.PIECE),
                Ingredients("سینه مرغ", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("ژامبون", "۴", IngredientUnit.PIECE),
                Ingredients("پنیر ورقه‌ای", "۲", IngredientUnit.PIECE),
                Ingredients("کاهو", "۴", IngredientUnit.LEAF),
                Ingredients("گوجه‌فرنگی", "۱", IngredientUnit.PIECE),
                Ingredients("سس مایونز", "۳", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 70,
            image = Res.drawable.food3,
            title = "پیتزا سبزیجات",
            chefName = "محمد کریمی",
            cookingSteps = listOf(
                "خمیر پیتزا را روی سطح آردپاشی‌شده باز کنید.",
                "سس گوجه‌فرنگی را روی خمیر پخش کنید.",
                "مقداری پنیر موزارلا روی سس بریزید.",
                "قارچ، فلفل دلمه‌ای، زیتون و ذرت را خرد کنید.",
                "سبزیجات را روی پنیر بچینید.",
                "باقی پنیر را روی مواد پخش کنید.",
                "در فر ۲۲۰ درجه حدود ۱۲ تا ۱۵ دقیقه بپزید."
            ),
            ingredients = listOf(
                Ingredients("خمیر پیتزا", "۱", IngredientUnit.PIECE),
                Ingredients("پنیر موزارلا", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("قارچ", "۱۵۰", IngredientUnit.GRAM),
                Ingredients("فلفل دلمه‌ای", "۱", IngredientUnit.PIECE),
                Ingredients("ذرت", "نصف", IngredientUnit.CUP),
                Ingredients("زیتون", "نصف", IngredientUnit.CUP),
                Ingredients("سس گوجه‌فرنگی", "نصف", IngredientUnit.CUP)
            ),
            spices = listOf(
                Spices("آویشن", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 71,
            image = Res.drawable.food4,
            title = "تاکوی مرغ",
            chefName = "علی رضایی",
            cookingSteps = listOf(
                "سینه مرغ را به نوارهای باریک برش دهید.",
                "مرغ را با روغن، پاپریکا، زیره و فلفل مزه‌دار کنید.",
                "مرغ را در تابه داغ بپزید تا کاملاً مغزپخت شود.",
                "نان تاکو یا ترتیلا را کمی گرم کنید.",
                "کاهو و گوجه را خرد کنید.",
                "مرغ را همراه سبزیجات داخل نان قرار دهید.",
                "پنیر رنده‌شده و سس دلخواه را اضافه کنید."
            ),
            ingredients = listOf(
                Ingredients("سینه مرغ", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("نان ترتیلا", "۴", IngredientUnit.PIECE),
                Ingredients("کاهو", "۴", IngredientUnit.LEAF),
                Ingredients("گوجه‌فرنگی", "۲", IngredientUnit.PIECE),
                Ingredients("پنیر چدار", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("آبلیمو", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("پاپریکا", "۱", IngredientUnit.TEASPOON),
                Spices("زیره سبز", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل قرمز", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 72,
            image = Res.drawable.food5,
            title = "رپ مرغ",
            chefName = "امیر محمدی",
            cookingSteps = listOf(
                "سینه مرغ را به قطعات باریک برش دهید.",
                "مرغ را با نمک، فلفل و پاپریکا مزه‌دار کنید.",
                "مرغ را در تابه با کمی روغن بپزید.",
                "نان ترتیلا را کمی گرم کنید.",
                "سس دلخواه را روی نان پخش کنید.",
                "مرغ، کاهو، گوجه و خیارشور را وسط نان قرار دهید.",
                "لبه‌های نان را تا کنید و آن را محکم رول کنید."
            ),
            ingredients = listOf(
                Ingredients("سینه مرغ", "۲۵۰", IngredientUnit.GRAM),
                Ingredients("نان ترتیلا", "۲", IngredientUnit.PIECE),
                Ingredients("کاهو", "۴", IngredientUnit.LEAF),
                Ingredients("گوجه‌فرنگی", "۱", IngredientUnit.PIECE),
                Ingredients("خیارشور", "۲", IngredientUnit.PIECE),
                Ingredients("سس مایونز", "۲", IngredientUnit.TABLESPOON),
                Ingredients("پنیر ورقه‌ای", "۲", IngredientUnit.PIECE)
            ),
            spices = listOf(
                Spices("پاپریکا", "۱", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 73,
            image = Res.drawable.food6,
            title = "پنینی ژامبون",
            chefName = "محمد کریمی",
            cookingSteps = listOf(
                "نان پنینی را از وسط باز کنید.",
                "روی یک سمت نان سس دلخواه بمالید.",
                "ژامبون، پنیر، گوجه و قارچ را داخل نان قرار دهید.",
                "کمی آویشن روی مواد بپاشید.",
                "نان را ببندید و در دستگاه پنینی‌ساز قرار دهید.",
                "چند دقیقه حرارت دهید تا نان برشته و پنیر ذوب شود.",
                "پنینی را داغ سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("نان پنینی", "۲", IngredientUnit.PIECE),
                Ingredients("ژامبون", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("پنیر موزارلا", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("گوجه‌فرنگی", "۱", IngredientUnit.PIECE),
                Ingredients("قارچ", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("سس خردل", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("آویشن", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 74,
            image = Res.drawable.food1,
            title = "ماکارونی فوری",
            chefName = "علی رضایی",
            cookingSteps = listOf(
                "ماکارونی را در آب جوش و نمک بپزید و آبکش کنید.",
                "پیاز خردشده را در تابه تفت دهید.",
                "گوشت چرخ‌کرده را اضافه کنید و تفت دهید.",
                "رب گوجه‌فرنگی و ادویه‌ها را اضافه کنید.",
                "کمی آب به سس اضافه کنید و اجازه دهید جا بیفتد.",
                "ماکارونی را با سس مخلوط کنید.",
                "چند دقیقه روی حرارت ملایم قرار دهید و سپس سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("ماکارونی", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("گوشت چرخ‌کرده", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("آویشن", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 75,
            image = Res.drawable.food2,
            title = "کوئسادیای مرغ",
            chefName = "امیر محمدی",
            cookingSteps = listOf(
                "سینه مرغ را به قطعات کوچک خرد کنید.",
                "مرغ را با پاپریکا، فلفل و کمی روغن در تابه بپزید.",
                "فلفل دلمه‌ای و پیاز خردشده را اضافه کنید و تفت دهید.",
                "یک نان ترتیلا را در تابه قرار دهید.",
                "روی نصف نان پنیر چدار و مواد مرغ را پخش کنید.",
                "نان را از وسط تا کنید و دو طرف آن را برشته کنید تا پنیر ذوب شود.",
                "کوئسادیای آماده را به چند قسمت برش دهید و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("سینه مرغ", "۲۵۰", IngredientUnit.GRAM),
                Ingredients("نان ترتیلا", "۲", IngredientUnit.PIECE),
                Ingredients("پنیر چدار", "۱۵۰", IngredientUnit.GRAM),
                Ingredients("فلفل دلمه‌ای", "۱", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("روغن زیتون", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("پاپریکا", "۱", IngredientUnit.TEASPOON),
                Spices("زیره سبز", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        )
    )

    // 6. پلو و چلو — 17 غذا
    val riceRecipes = listOf(
        recipe(
            id = 76,
            image = Res.drawable.food1,
            title = "زرشک‌پلو با مرغ",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "مرغ را با پیاز، زردچوبه، نمک و فلفل تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کنید و کمی تفت دهید.",
                "آب اضافه کنید و اجازه دهید مرغ با حرارت ملایم کاملاً بپزد.",
                "برنج را بشویید و در آب جوش و نمک نیم‌پز کنید.",
                "برنج را آبکش کرده و همراه کمی روغن و آب در قابلمه دم بگذارید.",
                "زرشک را با کره و کمی شکر روی حرارت ملایم تفت دهید.",
                "برنج را در ظرف بکشید و با زرشک و زعفران تزیین کنید.",
                "مرغ را کنار برنج سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("مرغ", "۴", IngredientUnit.PIECE),
                Ingredients("زرشک", "۱", IngredientUnit.CUP),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۲", IngredientUnit.TABLESPOON),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM),
                Ingredients("شکر", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زعفران دم‌کرده", "۳", IngredientUnit.TABLESPOON),
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 77,
            image = Res.drawable.food2,
            title = "باقالی‌پلو با گوشت",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "گوشت را همراه پیاز، زردچوبه و فلفل تفت دهید.",
                "مقداری آب اضافه کنید و اجازه دهید گوشت کاملاً بپزد.",
                "باقالی را جداگانه چند دقیقه در آب بجوشانید.",
                "برنج را در آب جوش نیم‌پز و سپس آبکش کنید.",
                "در قابلمه لایه‌ای برنج، باقالی و شوید خشک بریزید.",
                "لایه‌ها را تکرار کنید و برنج را دم بگذارید.",
                "در پایان کمی کره و زعفران دم‌کرده روی برنج بریزید.",
                "باقالی‌پلو را همراه گوشت پخته سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("باقالی سبز", "۲", IngredientUnit.CUP),
                Ingredients("گوشت گوسفندی", "۴۰۰", IngredientUnit.GRAM),
                Ingredients("شوید خشک", "۳", IngredientUnit.TABLESPOON),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("زعفران دم‌کرده", "۲", IngredientUnit.TABLESPOON),
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 78,
            image = Res.drawable.food3,
            title = "عدس‌پلو",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "عدس را بشویید و با آب بپزید تا نرم شود.",
                "برنج را در آب جوش نیم‌پز کرده و آبکش کنید.",
                "پیاز را خلالی خرد کنید و در روغن تفت دهید تا طلایی شود.",
                "کشمش را اضافه کنید و کمی تفت دهید.",
                "در قابلمه لایه‌ای برنج و عدس بریزید.",
                "برنج را دم بگذارید تا کاملاً پخته شود.",
                "عدس‌پلو را با پیازداغ و کشمش تزیین کنید.",
                "در صورت تمایل با گوشت قلقلی سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("عدس", "۱", IngredientUnit.CUP),
                Ingredients("کشمش", "نصف", IngredientUnit.CUP),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON),
                Ingredients("گوشت چرخ‌کرده", "۲۰۰", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("دارچین", "۱", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 79,
            image = Res.drawable.food4,
            title = "لوبیاپلو",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "لوبیا سبز را خرد کنید و چند دقیقه در آب بجوشانید.",
                "پیاز را خرد کرده و در روغن تفت دهید.",
                "گوشت چرخ‌کرده را اضافه کنید و تفت دهید.",
                "لوبیا سبز و رب گوجه‌فرنگی را اضافه کنید.",
                "نمک و ادویه‌ها را اضافه کرده و اجازه دهید مواد بپزند.",
                "برنج را در آب جوش نیم‌پز و آبکش کنید.",
                "برنج و مایه لوبیا را به‌صورت لایه‌ای در قابلمه بریزید.",
                "برنج را دم بگذارید و پس از پخت سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("لوبیا سبز", "۲۵۰", IngredientUnit.GRAM),
                Ingredients("گوشت چرخ‌کرده", "۲۵۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 80,
            image = Res.drawable.food5,
            title = "استانبولی‌پلو",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "پیاز را خرد کرده و در روغن تفت دهید.",
                "سیب‌زمینی را نگینی خرد کنید و به پیاز اضافه کنید.",
                "رب گوجه‌فرنگی را اضافه کرده و کمی تفت دهید.",
                "گوجه‌فرنگی خردشده را اضافه کنید و اجازه دهید نرم شود.",
                "برنج شسته‌شده را همراه آب و نمک به مواد اضافه کنید.",
                "پس از جذب آب، حرارت را کم کنید و برنج را دم بگذارید.",
                "پس از پخت کامل، استانبولی را مخلوط کرده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "۲", IngredientUnit.CUP),
                Ingredients("سیب‌زمینی", "۲", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "۳", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۱", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 81,
            image = Res.drawable.food6,
            title = "ته‌چین مرغ",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "مرغ را با پیاز، نمک و زردچوبه بپزید و ریش‌ریش کنید.",
                "برنج را در آب جوش نیم‌پز کرده و آبکش کنید.",
                "ماست، زرده تخم‌مرغ، زعفران و کمی نمک را مخلوط کنید.",
                "برنج آبکش‌شده را به مخلوط ماست اضافه کنید.",
                "کف قابلمه را با روغن یا کره چرب کنید.",
                "نیمی از برنج را در قابلمه بریزید و فشرده کنید.",
                "مرغ ریش‌ریش و زرشک را روی برنج پخش کنید.",
                "باقی برنج را اضافه کنید و سطح آن را صاف کنید.",
                "با حرارت ملایم حدود یک ساعت دم بگذارید تا ته‌چین طلایی شود."
            ),
            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("سینه مرغ", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("ماست چکیده", "۱", IngredientUnit.CUP),
                Ingredients("زرده تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("زرشک", "نصف", IngredientUnit.CUP),
                Ingredients("کره", "۵۰", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("زعفران دم‌کرده", "۳", IngredientUnit.TABLESPOON),
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 82,
            image = Res.drawable.food1,
            title = "کلم‌پلو شیرازی",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "کلم قمری را خلالی خرد کنید.",
                "پیاز را تفت دهید و کلم را به آن اضافه کنید.",
                "کلم را با زردچوبه و فلفل تفت دهید تا نرم شود.",
                "گوشت چرخ‌کرده را با پیاز رنده‌شده و ادویه مخلوط کنید.",
                "از گوشت قلقلی‌های کوچک درست کنید و در تابه سرخ کنید.",
                "برنج را نیم‌پز کرده و آبکش کنید.",
                "برنج را به‌صورت لایه‌ای همراه کلم و سبزی معطر در قابلمه بریزید.",
                "گوشت قلقلی‌ها را میان لایه‌ها قرار دهید و برنج را دم بگذارید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("کلم قمری", "۲", IngredientUnit.PIECE),
                Ingredients("گوشت چرخ‌کرده", "۲۵۰", IngredientUnit.GRAM),
                Ingredients("سبزی کلم‌پلو", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پودر لیموعمانی", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 83,
            image = Res.drawable.food2,
            title = "سبزی‌پلو با ماهی",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "ماهی را با آبلیمو، نمک و فلفل مزه‌دار کنید.",
                "برنج را در آب جوش نیم‌پز کرده و آبکش کنید.",
                "سبزی پلویی خردشده را با برنج مخلوط کنید.",
                "برنج را در قابلمه دم بگذارید.",
                "ماهی را در تابه با کمی روغن سرخ کنید یا در فر بپزید.",
                "سیر را در صورت تمایل کمی تفت دهید و کنار ماهی قرار دهید.",
                "سبزی‌پلو را همراه ماهی و برش لیمو سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("ماهی", "۲", IngredientUnit.PIECE),
                Ingredients("سبزی پلویی", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("سیر", "۲", IngredientUnit.PIECE),
                Ingredients("آبلیمو", "۳", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 84,
            image = Res.drawable.food3,
            title = "شیرین‌پلو",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "پوست پرتقال را خلالی کنید و چند بار بجوشانید تا تلخی آن گرفته شود.",
                "خلال پرتقال را با کمی شکر و آب بپزید.",
                "هویج را خلالی خرد کرده و با کره و شکر تفت دهید.",
                "برنج را در آب جوش نیم‌پز کرده و آبکش کنید.",
                "مرغ را با پیاز و ادویه بپزید و تکه‌تکه کنید.",
                "برنج را دم بگذارید.",
                "خلال پرتقال، هویج و خلال بادام را با زعفران آماده کنید.",
                "برنج را با مواد شیرین و مرغ تزیین کرده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("سینه مرغ", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("هویج", "۲", IngredientUnit.PIECE),
                Ingredients("خلال پرتقال", "نصف", IngredientUnit.CUP),
                Ingredients("خلال بادام", "نصف", IngredientUnit.CUP),
                Ingredients("شکر", "۳", IngredientUnit.TABLESPOON),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("زعفران دم‌کرده", "۳", IngredientUnit.TABLESPOON),
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 85,
            image = Res.drawable.food4,
            title = "مرصع‌پلو",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "مرغ را با پیاز، نمک و زردچوبه بپزید و ریش‌ریش کنید.",
                "زرشک را با کمی کره و شکر تفت دهید.",
                "خلال پسته و بادام را آماده کنید.",
                "پوست پرتقال خلالی را چند بار بجوشانید تا تلخی آن گرفته شود.",
                "خلال پرتقال را با کمی شکر تفت دهید.",
                "برنج را نیم‌پز کرده و آبکش کنید.",
                "برنج را دم بگذارید و با زعفران دم‌کرده تزیین کنید.",
                "مرغ و مخلوط خلال‌ها و زرشک را روی برنج بچینید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("مرغ", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("زرشک", "نصف", IngredientUnit.CUP),
                Ingredients("خلال پسته", "نصف", IngredientUnit.CUP),
                Ingredients("خلال بادام", "نصف", IngredientUnit.CUP),
                Ingredients("خلال پرتقال", "نصف", IngredientUnit.CUP),
                Ingredients("شکر", "۲", IngredientUnit.TABLESPOON),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("زعفران دم‌کرده", "۳", IngredientUnit.TABLESPOON),
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 86,
            image = Res.drawable.food5,
            title = "آلبالوپلو",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "هسته آلبالوها را جدا کنید.",
                "آلبالو را با شکر روی حرارت ملایم قرار دهید تا کمی آب بیندازد.",
                "آلبالو را چند دقیقه بجوشانید و سپس از شربت جدا کنید.",
                "گوشت چرخ‌کرده را با پیاز رنده‌شده و ادویه مخلوط کنید.",
                "گوشت را به شکل قلقلی درآورید و سرخ کنید.",
                "برنج را نیم‌پز کرده و آبکش کنید.",
                "برنج و آلبالو را به‌صورت لایه‌ای در قابلمه بریزید.",
                "گوشت قلقلی را میان لایه‌ها قرار دهید و برنج را دم بگذارید.",
                "در پایان با زعفران و آلبالو تزیین کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("آلبالو بدون هسته", "۲", IngredientUnit.CUP),
                Ingredients("شکر", "نصف", IngredientUnit.CUP),
                Ingredients("گوشت چرخ‌کرده", "۲۵۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("زعفران دم‌کرده", "۲", IngredientUnit.TABLESPOON),
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 87,
            image = Res.drawable.food6,
            title = "هویج‌پلو",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "هویج‌ها را خلالی خرد کنید.",
                "هویج را با کمی کره و شکر تفت دهید تا نرم شود.",
                "پیاز را خرد کرده و مرغ را با آن تفت دهید.",
                "زعفران و کمی آب اضافه کنید و اجازه دهید مرغ بپزد.",
                "برنج را در آب جوش نیم‌پز کرده و آبکش کنید.",
                "برنج را با هویج به‌صورت لایه‌ای در قابلمه بریزید.",
                "مرغ را میان لایه‌ها قرار دهید و برنج را دم بگذارید.",
                "هویج‌پلو را با زعفران و خلال بادام تزیین کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("هویج", "۳", IngredientUnit.PIECE),
                Ingredients("مرغ", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("شکر", "۲", IngredientUnit.TABLESPOON),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM),
                Ingredients("خلال بادام", "نصف", IngredientUnit.CUP)
            ),
            spices = listOf(
                Spices("زعفران دم‌کرده", "۲", IngredientUnit.TABLESPOON),
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 88,
            image = Res.drawable.food1,
            title = "کته گوجه",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "گوجه‌فرنگی‌ها را رنده یا پوره کنید.",
                "پیاز را خرد کرده و در روغن تفت دهید.",
                "گوجه‌فرنگی و رب را اضافه کنید و اجازه دهید کمی غلیظ شود.",
                "برنج شسته‌شده را به مواد اضافه کنید.",
                "آب و نمک را به اندازه مناسب اضافه کنید.",
                "پس از جوش آمدن و جذب شدن آب، حرارت را کم کنید.",
                "درب قابلمه را بگذارید و اجازه دهید برنج دم بکشد.",
                "کته گوجه را با سبزی تازه یا ماست سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "۲", IngredientUnit.CUP),
                Ingredients("گوجه‌فرنگی", "۴", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۱", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 89,
            image = Res.drawable.food2,
            title = "رشته‌پلو",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "رشته پلویی را در تابه با کمی روغن تفت دهید.",
                "برنج را در آب جوش نیم‌پز کنید.",
                "در چند دقیقه پایانی پخت برنج، رشته را اضافه کنید.",
                "برنج و رشته را آبکش کنید.",
                "کف قابلمه روغن بریزید و ته‌دیگ دلخواه قرار دهید.",
                "مخلوط برنج و رشته را داخل قابلمه بریزید و دم بگذارید.",
                "کشمش را با کره کمی تفت دهید.",
                "رشته‌پلو را با کشمش، خرما یا گوشت قلقلی سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("رشته پلویی", "۱۵۰", IngredientUnit.GRAM),
                Ingredients("کشمش", "نصف", IngredientUnit.CUP),
                Ingredients("خرما", "۸", IngredientUnit.PIECE),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM),
                Ingredients("گوشت چرخ‌کرده", "۲۰۰", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("دارچین", "۱", IngredientUnit.TEASPOON),
                Spices("زعفران دم‌کرده", "۲", IngredientUnit.TABLESPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 90,
            image = Res.drawable.food3,
            title = "ماش‌پلو",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "ماش را بشویید و با آب بپزید تا نیم‌پز شود.",
                "برنج را جداگانه در آب جوش نیم‌پز کرده و آبکش کنید.",
                "پیاز را خرد کرده و در روغن تفت دهید.",
                "گوشت چرخ‌کرده را اضافه کنید و تفت دهید.",
                "ماش پخته را به گوشت اضافه کنید.",
                "برنج و مخلوط ماش را به‌صورت لایه‌ای در قابلمه بریزید.",
                "برنج را دم بگذارید تا کاملاً پخته شود.",
                "با پیازداغ و زعفران تزیین کرده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "۲", IngredientUnit.CUP),
                Ingredients("ماش", "۱", IngredientUnit.CUP),
                Ingredients("گوشت چرخ‌کرده", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 91,
            image = Res.drawable.food4,
            title = "کینوا پلو",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "کینوا را چند بار با آب بشویید تا تلخی آن گرفته شود.",
                "کینوا را با آب و کمی نمک حدود ۱۵ دقیقه بپزید.",
                "پیاز و سیر را خرد کرده و در روغن زیتون تفت دهید.",
                "هویج و فلفل دلمه‌ای خردشده را اضافه کنید.",
                "نخودفرنگی و ذرت را اضافه کنید و چند دقیقه تفت دهید.",
                "کینوا پخته را به سبزیجات اضافه کنید.",
                "مواد را با ادویه مخلوط کنید و چند دقیقه روی حرارت قرار دهید.",
                "کینوا پلو را با آبلیمو و سبزی تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("کینوا", "۲", IngredientUnit.CUP),
                Ingredients("هویج", "۱", IngredientUnit.PIECE),
                Ingredients("فلفل دلمه‌ای", "۱", IngredientUnit.PIECE),
                Ingredients("نخودفرنگی", "نصف", IngredientUnit.CUP),
                Ingredients("ذرت", "نصف", IngredientUnit.CUP),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("سیر", "۲", IngredientUnit.PIECE),
                Ingredients("روغن زیتون", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زیره سبز", "نصف", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 92,
            image = Res.drawable.food5,
            title = "چلو گوشت",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "گوشت را به تکه‌های مناسب تقسیم کنید.",
                "پیاز را خرد کرده و با کمی روغن تفت دهید.",
                "گوشت را اضافه کنید و همه طرف آن را تفت دهید.",
                "زردچوبه، فلفل و چوب دارچین را اضافه کنید.",
                "آب جوش اضافه کنید و اجازه دهید گوشت با حرارت ملایم بپزد.",
                "در صورت تمایل کمی زعفران و رب گوجه‌فرنگی به سس اضافه کنید.",
                "برنج را در آب جوش نیم‌پز کرده و آبکش کنید.",
                "برنج را دم بگذارید و پس از پخت همراه گوشت و سس سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("گوشت گوسفندی", "۵۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۱", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("دارچین", "۱", IngredientUnit.PIECE),
                Spices("زعفران دم‌کرده", "۲", IngredientUnit.TABLESPOON)
            )
        ),
        recipe(
            id = 76,
            image = Res.drawable.food1,
            title = "زرشک‌پلو با مرغ",
            chefName = "مریم احمدی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 60,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "مرغ را با پیاز، زردچوبه، نمک و فلفل تفت دهید.",
                "رب گوجه‌فرنگی را اضافه کنید و کمی تفت دهید.",
                "آب اضافه کنید و اجازه دهید مرغ با حرارت ملایم کاملاً بپزد.",
                "برنج را بشویید و در آب جوش و نمک نیم‌پز کنید.",
                "برنج را آبکش کرده و همراه کمی روغن و آب در قابلمه دم بگذارید.",
                "زرشک را با کره و کمی شکر روی حرارت ملایم تفت دهید.",
                "برنج را در ظرف بکشید و با زرشک و زعفران تزیین کنید.",
                "مرغ را کنار برنج سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 620,
                proteinGrams = 38.0,
                carbohydratesGrams = 78.0,
                fatGrams = 17.0
            ),

            tags = listOf("غذای ایرانی", "پلویی", "مرغ", "زرشک‌پلو", "غذای مجلسی"),

            rating = 4.9,
            ratingCount = 284,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("مرغ", "۴", IngredientUnit.PIECE),
                Ingredients("زرشک", "۱", IngredientUnit.CUP),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۲", IngredientUnit.TABLESPOON),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM),
                Ingredients("شکر", "۱", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("زعفران دم‌کرده", "۳", IngredientUnit.TABLESPOON),
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 77,
            image = Res.drawable.food2,
            title = "باقالی‌پلو با گوشت",
            chefName = "ترانه شریفی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 30,
            cookingTimeMinutes = 120,
            servings = 4,
            difficulty = RecipeDifficulty.HARD,

            cookingSteps = listOf(
                "گوشت را همراه پیاز، زردچوبه و فلفل تفت دهید.",
                "مقداری آب اضافه کنید و اجازه دهید گوشت کاملاً بپزد.",
                "باقالی را جداگانه چند دقیقه در آب بجوشانید.",
                "برنج را در آب جوش نیم‌پز و سپس آبکش کنید.",
                "در قابلمه لایه‌ای برنج، باقالی و شوید خشک بریزید.",
                "لایه‌ها را تکرار کنید و برنج را دم بگذارید.",
                "در پایان کمی کره و زعفران دم‌کرده روی برنج بریزید.",
                "باقالی‌پلو را همراه گوشت پخته سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 710,
                proteinGrams = 39.0,
                carbohydratesGrams = 86.0,
                fatGrams = 23.0
            ),

            tags = listOf("غذای ایرانی", "پلویی", "باقالی‌پلو", "گوشت گوسفندی", "غذای مجلسی"),

            rating = 4.9,
            ratingCount = 316,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("باقالی سبز", "۲", IngredientUnit.CUP),
                Ingredients("گوشت گوسفندی", "۴۰۰", IngredientUnit.GRAM),
                Ingredients("شوید خشک", "۳", IngredientUnit.TABLESPOON),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("زعفران دم‌کرده", "۲", IngredientUnit.TABLESPOON),
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 78,
            image = Res.drawable.food3,
            title = "عدس‌پلو",
            chefName = "سارا محمدی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 50,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "عدس را بشویید و با آب بپزید تا نرم شود.",
                "برنج را در آب جوش نیم‌پز کرده و آبکش کنید.",
                "پیاز را خلالی خرد کنید و در روغن تفت دهید تا طلایی شود.",
                "کشمش را اضافه کنید و کمی تفت دهید.",
                "در قابلمه لایه‌ای برنج و عدس بریزید.",
                "برنج را دم بگذارید تا کاملاً پخته شود.",
                "عدس‌پلو را با پیازداغ و کشمش تزیین کنید.",
                "در صورت تمایل با گوشت قلقلی سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 480,
                proteinGrams = 18.0,
                carbohydratesGrams = 79.0,
                fatGrams = 11.0
            ),

            tags = listOf("غذای ایرانی", "پلویی", "عدس", "غذای گیاهی", "غذای خانگی"),

            rating = 4.7,
            ratingCount = 192,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("عدس", "۱", IngredientUnit.CUP),
                Ingredients("کشمش", "نصف", IngredientUnit.CUP),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON),
                Ingredients("گوشت چرخ‌کرده", "۲۰۰", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("دارچین", "۱", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 79,
            image = Res.drawable.food4,
            title = "لوبیاپلو",
            chefName = "نگار رضایی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 60,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "لوبیا سبز را خرد کنید و چند دقیقه در آب بجوشانید.",
                "پیاز را خرد کرده و در روغن تفت دهید.",
                "گوشت چرخ‌کرده را اضافه کنید و تفت دهید.",
                "لوبیا سبز و رب گوجه‌فرنگی را اضافه کنید.",
                "نمک و ادویه‌ها را اضافه کرده و اجازه دهید مواد بپزند.",
                "برنج را در آب جوش نیم‌پز و آبکش کنید.",
                "برنج و مایه لوبیا را به‌صورت لایه‌ای در قابلمه بریزید.",
                "برنج را دم بگذارید و پس از پخت سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 560,
                proteinGrams = 25.0,
                carbohydratesGrams = 76.0,
                fatGrams = 16.0
            ),

            tags = listOf("غذای ایرانی", "پلویی", "لوبیا سبز", "گوشت چرخ‌کرده", "غذای خانگی"),

            rating = 4.8,
            ratingCount = 247,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("لوبیا سبز", "۲۵۰", IngredientUnit.GRAM),
                Ingredients("گوشت چرخ‌کرده", "۲۵۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 80,
            image = Res.drawable.food5,
            title = "استانبولی‌پلو",
            chefName = "الناز کریمی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 45,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "پیاز را خرد کرده و در روغن تفت دهید.",
                "سیب‌زمینی را نگینی خرد کنید و به پیاز اضافه کنید.",
                "رب گوجه‌فرنگی را اضافه کرده و کمی تفت دهید.",
                "گوجه‌فرنگی خردشده را اضافه کنید و اجازه دهید نرم شود.",
                "برنج شسته‌شده را همراه آب و نمک به مواد اضافه کنید.",
                "پس از جذب آب، حرارت را کم کنید و برنج را دم بگذارید.",
                "پس از پخت کامل، استانبولی را مخلوط کرده و سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 420,
                proteinGrams = 9.0,
                carbohydratesGrams = 76.0,
                fatGrams = 10.0
            ),

            tags = listOf("غذای ایرانی", "پلویی", "استانبولی", "سیب‌زمینی", "غذای اقتصادی"),

            rating = 4.6,
            ratingCount = 183,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("برنج", "۲", IngredientUnit.CUP),
                Ingredients("سیب‌زمینی", "۲", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "۳", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۱", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 81,
            image = Res.drawable.food6,
            title = "ته‌چین مرغ",
            chefName = "مریم احمدی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 30,
            cookingTimeMinutes = 60,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "مرغ را با پیاز، نمک و زردچوبه بپزید و ریش‌ریش کنید.",
                "برنج را در آب جوش نیم‌پز کرده و آبکش کنید.",
                "ماست، زرده تخم‌مرغ، زعفران و کمی نمک را مخلوط کنید.",
                "برنج آبکش‌شده را به مخلوط ماست اضافه کنید.",
                "کف قابلمه را با روغن یا کره چرب کنید.",
                "نیمی از برنج را در قابلمه بریزید و فشرده کنید.",
                "مرغ ریش‌ریش و زرشک را روی برنج پخش کنید.",
                "باقی برنج را اضافه کنید و سطح آن را صاف کنید.",
                "با حرارت ملایم حدود یک ساعت دم بگذارید تا ته‌چین طلایی شود."
            ),

            nutrition = NutritionInfo(
                calories = 590,
                proteinGrams = 32.0,
                carbohydratesGrams = 72.0,
                fatGrams = 19.0
            ),

            tags = listOf("غذای ایرانی", "ته‌چین", "مرغ", "غذای مجلسی", "غذای پلویی"),

            rating = 4.9,
            ratingCount = 328,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("سینه مرغ", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("ماست چکیده", "۱", IngredientUnit.CUP),
                Ingredients("زرده تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("زرشک", "نصف", IngredientUnit.CUP),
                Ingredients("کره", "۵۰", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("زعفران دم‌کرده", "۳", IngredientUnit.TABLESPOON),
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 82,
            image = Res.drawable.food1,
            title = "کلم‌پلو شیرازی",
            chefName = "ترانه شریفی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 35,
            cookingTimeMinutes = 55,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "کلم قمری را خلالی خرد کنید.",
                "پیاز را تفت دهید و کلم را به آن اضافه کنید.",
                "کلم را با زردچوبه و فلفل تفت دهید تا نرم شود.",
                "گوشت چرخ‌کرده را با پیاز رنده‌شده و ادویه مخلوط کنید.",
                "از گوشت قلقلی‌های کوچک درست کنید و در تابه سرخ کنید.",
                "برنج را نیم‌پز کرده و آبکش کنید.",
                "برنج را به‌صورت لایه‌ای همراه کلم و سبزی معطر در قابلمه بریزید.",
                "گوشت قلقلی‌ها را میان لایه‌ها قرار دهید و برنج را دم بگذارید."
            ),

            nutrition = NutritionInfo(
                calories = 570,
                proteinGrams = 25.0,
                carbohydratesGrams = 73.0,
                fatGrams = 18.0
            ),

            tags = listOf("غذای ایرانی", "غذای شیرازی", "کلم‌پلو", "گوشت قلقلی", "پلویی"),

            rating = 4.8,
            ratingCount = 216,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("کلم قمری", "۲", IngredientUnit.PIECE),
                Ingredients("گوشت چرخ‌کرده", "۲۵۰", IngredientUnit.GRAM),
                Ingredients("سبزی کلم‌پلو", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پودر لیموعمانی", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 83,
            image = Res.drawable.food2,
            title = "سبزی‌پلو با ماهی",
            chefName = "سارا محمدی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 50,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "ماهی را با آبلیمو، نمک و فلفل مزه‌دار کنید.",
                "برنج را در آب جوش نیم‌پز کرده و آبکش کنید.",
                "سبزی پلویی خردشده را با برنج مخلوط کنید.",
                "برنج را در قابلمه دم بگذارید.",
                "ماهی را در تابه با کمی روغن سرخ کنید یا در فر بپزید.",
                "سیر را در صورت تمایل کمی تفت دهید و کنار ماهی قرار دهید.",
                "سبزی‌پلو را همراه ماهی و برش لیمو سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 540,
                proteinGrams = 34.0,
                carbohydratesGrams = 69.0,
                fatGrams = 14.0
            ),

            tags = listOf("غذای ایرانی", "سبزی‌پلو", "ماهی", "غذای دریایی", "غذای مجلسی"),

            rating = 4.8,
            ratingCount = 265,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("ماهی", "۲", IngredientUnit.PIECE),
                Ingredients("سبزی پلویی", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("سیر", "۲", IngredientUnit.PIECE),
                Ingredients("آبلیمو", "۳", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 84,
            image = Res.drawable.food3,
            title = "شیرین‌پلو",
            chefName = "نگار رضایی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 35,
            cookingTimeMinutes = 60,
            servings = 4,
            difficulty = RecipeDifficulty.HARD,

            cookingSteps = listOf(
                "پوست پرتقال را خلالی کنید و چند بار بجوشانید تا تلخی آن گرفته شود.",
                "خلال پرتقال را با کمی شکر و آب بپزید.",
                "هویج را خلالی خرد کرده و با کره و شکر تفت دهید.",
                "برنج را در آب جوش نیم‌پز کرده و آبکش کنید.",
                "مرغ را با پیاز و ادویه بپزید و تکه‌تکه کنید.",
                "برنج را دم بگذارید.",
                "خلال پرتقال، هویج و خلال بادام را با زعفران آماده کنید.",
                "برنج را با مواد شیرین و مرغ تزیین کرده و سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 610,
                proteinGrams = 29.0,
                carbohydratesGrams = 88.0,
                fatGrams = 16.0
            ),

            tags = listOf("غذای ایرانی", "شیرین‌پلو", "مرغ", "غذای مجلسی", "پلویی"),

            rating = 4.7,
            ratingCount = 174,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("سینه مرغ", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("هویج", "۲", IngredientUnit.PIECE),
                Ingredients("خلال پرتقال", "نصف", IngredientUnit.CUP),
                Ingredients("خلال بادام", "نصف", IngredientUnit.CUP),
                Ingredients("شکر", "۳", IngredientUnit.TABLESPOON),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("زعفران دم‌کرده", "۳", IngredientUnit.TABLESPOON),
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 85,
            image = Res.drawable.food4,
            title = "مرصع‌پلو",
            chefName = "الناز کریمی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 40,
            cookingTimeMinutes = 60,
            servings = 4,
            difficulty = RecipeDifficulty.HARD,

            cookingSteps = listOf(
                "مرغ را با پیاز، نمک و زردچوبه بپزید و ریش‌ریش کنید.",
                "زرشک را با کمی کره و شکر تفت دهید.",
                "خلال پسته و بادام را آماده کنید.",
                "پوست پرتقال خلالی را چند بار بجوشانید تا تلخی آن گرفته شود.",
                "خلال پرتقال را با کمی شکر تفت دهید.",
                "برنج را نیم‌پز کرده و آبکش کنید.",
                "برنج را دم بگذارید و با زعفران دم‌کرده تزیین کنید.",
                "مرغ و مخلوط خلال‌ها و زرشک را روی برنج بچینید."
            ),

            nutrition = NutritionInfo(
                calories = 650,
                proteinGrams = 31.0,
                carbohydratesGrams = 83.0,
                fatGrams = 21.0
            ),

            tags = listOf("غذای ایرانی", "مرصع‌پلو", "مرغ", "غذای مجلسی", "پلویی"),

            rating = 4.9,
            ratingCount = 291,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("مرغ", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("زرشک", "نصف", IngredientUnit.CUP),
                Ingredients("خلال پسته", "نصف", IngredientUnit.CUP),
                Ingredients("خلال بادام", "نصف", IngredientUnit.CUP),
                Ingredients("خلال پرتقال", "نصف", IngredientUnit.CUP),
                Ingredients("شکر", "۲", IngredientUnit.TABLESPOON),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("زعفران دم‌کرده", "۳", IngredientUnit.TABLESPOON),
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 86,
            image = Res.drawable.food5,
            title = "آلبالوپلو",
            chefName = "مریم احمدی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 30,
            cookingTimeMinutes = 60,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "هسته آلبالوها را جدا کنید.",
                "آلبالو را با شکر روی حرارت ملایم قرار دهید تا کمی آب بیندازد.",
                "آلبالو را چند دقیقه بجوشانید و سپس از شربت جدا کنید.",
                "گوشت چرخ‌کرده را با پیاز رنده‌شده و ادویه مخلوط کنید.",
                "گوشت را به شکل قلقلی درآورید و سرخ کنید.",
                "برنج را نیم‌پز کرده و آبکش کنید.",
                "برنج و آلبالو را به‌صورت لایه‌ای در قابلمه بریزید.",
                "گوشت قلقلی را میان لایه‌ها قرار دهید و برنج را دم بگذارید.",
                "در پایان با زعفران و آلبالو تزیین کنید."
            ),

            nutrition = NutritionInfo(
                calories = 590,
                proteinGrams = 24.0,
                carbohydratesGrams = 89.0,
                fatGrams = 15.0
            ),

            tags = listOf("غذای ایرانی", "آلبالوپلو", "گوشت قلقلی", "پلویی", "غذای مجلسی"),

            rating = 4.8,
            ratingCount = 238,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("آلبالو بدون هسته", "۲", IngredientUnit.CUP),
                Ingredients("شکر", "نصف", IngredientUnit.CUP),
                Ingredients("گوشت چرخ‌کرده", "۲۵۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("زعفران دم‌کرده", "۲", IngredientUnit.TABLESPOON),
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 87,
            image = Res.drawable.food6,
            title = "هویج‌پلو",
            chefName = "ترانه شریفی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 55,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "هویج‌ها را خلالی خرد کنید.",
                "هویج را با کمی کره و شکر تفت دهید تا نرم شود.",
                "پیاز را خرد کرده و مرغ را با آن تفت دهید.",
                "زعفران و کمی آب اضافه کنید و اجازه دهید مرغ بپزد.",
                "برنج را در آب جوش نیم‌پز کرده و آبکش کنید.",
                "برنج را با هویج به‌صورت لایه‌ای در قابلمه بریزید.",
                "مرغ را میان لایه‌ها قرار دهید و برنج را دم بگذارید.",
                "هویج‌پلو را با زعفران و خلال بادام تزیین کنید."
            ),

            nutrition = NutritionInfo(
                calories = 570,
                proteinGrams = 28.0,
                carbohydratesGrams = 79.0,
                fatGrams = 15.0
            ),

            tags = listOf("غذای ایرانی", "هویج‌پلو", "مرغ", "پلویی", "غذای خانگی"),

            rating = 4.7,
            ratingCount = 186,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("هویج", "۳", IngredientUnit.PIECE),
                Ingredients("مرغ", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("شکر", "۲", IngredientUnit.TABLESPOON),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM),
                Ingredients("خلال بادام", "نصف", IngredientUnit.CUP)
            ),

            spices = listOf(
                Spices("زعفران دم‌کرده", "۲", IngredientUnit.TABLESPOON),
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 88,
            image = Res.drawable.food1,
            title = "کته گوجه",
            chefName = "سارا محمدی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 35,
            servings = 3,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "گوجه‌فرنگی‌ها را رنده یا پوره کنید.",
                "پیاز را خرد کرده و در روغن تفت دهید.",
                "گوجه‌فرنگی و رب را اضافه کنید و اجازه دهید کمی غلیظ شود.",
                "برنج شسته‌شده را به مواد اضافه کنید.",
                "آب و نمک را به اندازه مناسب اضافه کنید.",
                "پس از جوش آمدن و جذب شدن آب، حرارت را کم کنید.",
                "درب قابلمه را بگذارید و اجازه دهید برنج دم بکشد.",
                "کته گوجه را با سبزی تازه یا ماست سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 390,
                proteinGrams = 8.0,
                carbohydratesGrams = 72.0,
                fatGrams = 9.0
            ),

            tags = listOf("غذای ایرانی", "کته", "گوجه‌فرنگی", "غذای ساده", "غذای اقتصادی"),

            rating = 4.6,
            ratingCount = 154,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("برنج", "۲", IngredientUnit.CUP),
                Ingredients("گوجه‌فرنگی", "۴", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۱", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 89,
            image = Res.drawable.food2,
            title = "رشته‌پلو",
            chefName = "نگار رضایی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 45,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "رشته پلویی را در تابه با کمی روغن تفت دهید.",
                "برنج را در آب جوش نیم‌پز کنید.",
                "در چند دقیقه پایانی پخت برنج، رشته را اضافه کنید.",
                "برنج و رشته را آبکش کنید.",
                "کف قابلمه روغن بریزید و ته‌دیگ دلخواه قرار دهید.",
                "مخلوط برنج و رشته را داخل قابلمه بریزید و دم بگذارید.",
                "کشمش را با کره کمی تفت دهید.",
                "رشته‌پلو را با کشمش، خرما یا گوشت قلقلی سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 560,
                proteinGrams = 19.0,
                carbohydratesGrams = 86.0,
                fatGrams = 15.0
            ),

            tags = listOf("غذای ایرانی", "رشته‌پلو", "کشمش", "خرما", "غذای سنتی"),

            rating = 4.7,
            ratingCount = 201,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("رشته پلویی", "۱۵۰", IngredientUnit.GRAM),
                Ingredients("کشمش", "نصف", IngredientUnit.CUP),
                Ingredients("خرما", "۸", IngredientUnit.PIECE),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM),
                Ingredients("گوشت چرخ‌کرده", "۲۰۰", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("دارچین", "۱", IngredientUnit.TEASPOON),
                Spices("زعفران دم‌کرده", "۲", IngredientUnit.TABLESPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 90,
            image = Res.drawable.food3,
            title = "ماش‌پلو",
            chefName = "الناز کریمی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 50,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,

            cookingSteps = listOf(
                "ماش را بشویید و با آب بپزید تا نیم‌پز شود.",
                "برنج را جداگانه در آب جوش نیم‌پز کرده و آبکش کنید.",
                "پیاز را خرد کرده و در روغن تفت دهید.",
                "گوشت چرخ‌کرده را اضافه کنید و تفت دهید.",
                "ماش پخته را به گوشت اضافه کنید.",
                "برنج و مخلوط ماش را به‌صورت لایه‌ای در قابلمه بریزید.",
                "برنج را دم بگذارید تا کاملاً پخته شود.",
                "با پیازداغ و زعفران تزیین کرده و سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 510,
                proteinGrams = 22.0,
                carbohydratesGrams = 78.0,
                fatGrams = 12.0
            ),

            tags = listOf("غذای ایرانی", "ماش‌پلو", "ماش", "گوشت چرخ‌کرده", "پلویی"),

            rating = 4.6,
            ratingCount = 143,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("برنج", "۲", IngredientUnit.CUP),
                Ingredients("ماش", "۱", IngredientUnit.CUP),
                Ingredients("گوشت چرخ‌کرده", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 91,
            image = Res.drawable.food4,
            title = "کینوا پلو",
            chefName = "مریم احمدی",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 25,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,

            cookingSteps = listOf(
                "کینوا را چند بار با آب بشویید تا تلخی آن گرفته شود.",
                "کینوا را با آب و کمی نمک حدود ۱۵ دقیقه بپزید.",
                "پیاز و سیر را خرد کرده و در روغن زیتون تفت دهید.",
                "هویج و فلفل دلمه‌ای خردشده را اضافه کنید.",
                "نخودفرنگی و ذرت را اضافه کنید و چند دقیقه تفت دهید.",
                "کینوا پخته را به سبزیجات اضافه کنید.",
                "مواد را با ادویه مخلوط کنید و چند دقیقه روی حرارت قرار دهید.",
                "کینوا پلو را با آبلیمو و سبزی تازه سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 390,
                proteinGrams = 13.0,
                carbohydratesGrams = 61.0,
                fatGrams = 12.0
            ),

            tags = listOf("غذای سالم", "کینوا", "غذای گیاهی", "بدون گوشت", "غذای بین‌المللی"),

            rating = 4.5,
            ratingCount = 128,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("کینوا", "۲", IngredientUnit.CUP),
                Ingredients("هویج", "۱", IngredientUnit.PIECE),
                Ingredients("فلفل دلمه‌ای", "۱", IngredientUnit.PIECE),
                Ingredients("نخودفرنگی", "نصف", IngredientUnit.CUP),
                Ingredients("ذرت", "نصف", IngredientUnit.CUP),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("سیر", "۲", IngredientUnit.PIECE),
                Ingredients("روغن زیتون", "۲", IngredientUnit.TABLESPOON)
            ),

            spices = listOf(
                Spices("زیره سبز", "نصف", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 92,
            image = Res.drawable.food5,
            title = "چلو گوشت",
            chefName = "ترانه شریفی",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 150,
            servings = 4,
            difficulty = RecipeDifficulty.HARD,

            cookingSteps = listOf(
                "گوشت را به تکه‌های مناسب تقسیم کنید.",
                "پیاز را خرد کرده و با کمی روغن تفت دهید.",
                "گوشت را اضافه کنید و همه طرف آن را تفت دهید.",
                "زردچوبه، فلفل و چوب دارچین را اضافه کنید.",
                "آب جوش اضافه کنید و اجازه دهید گوشت با حرارت ملایم بپزد.",
                "در صورت تمایل کمی زعفران و رب گوجه‌فرنگی به سس اضافه کنید.",
                "برنج را در آب جوش نیم‌پز کرده و آبکش کنید.",
                "برنج را دم بگذارید و پس از پخت همراه گوشت و سس سرو کنید."
            ),

            nutrition = NutritionInfo(
                calories = 760,
                proteinGrams = 42.0,
                carbohydratesGrams = 82.0,
                fatGrams = 29.0
            ),

            tags = listOf("غذای ایرانی", "چلو گوشت", "گوشت گوسفندی", "غذای مجلسی", "غذای سنتی"),

            rating = 4.9,
            ratingCount = 342,
            isFavorite = false,
            isFeatured = false,
            createdAt = "1405-08-17",
            updatedAt = "1405-08-17",

            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("گوشت گوسفندی", "۵۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۱", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM)
            ),

            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("دارچین", "۱", IngredientUnit.PIECE),
                Spices("زعفران دم‌کرده", "۲", IngredientUnit.TABLESPOON)
            )
        )
    )

    // 7. غذاهای نونی — 11 غذا
    val breadRecipes = listOf(
        recipe(
            id = 93,
            image = Res.drawable.food1,
            title = "کوکو سیب‌زمینی",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "سیب‌زمینی‌ها را آب‌پز کنید و اجازه دهید خنک شوند.",
                "سیب‌زمینی‌ها را پوست بگیرید و رنده یا له کنید.",
                "تخم‌مرغ، پیاز رنده‌شده و آب‌گرفته را اضافه کنید.",
                "نمک و ادویه‌ها را اضافه کرده و مواد را مخلوط کنید.",
                "از مواد به اندازه دلخواه بردارید و در تابه شکل دهید.",
                "کوکوها را در روغن داغ با حرارت متوسط سرخ کنید.",
                "پس از طلایی شدن هر دو طرف، روی دستمال قرار دهید و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("سیب‌زمینی", "۴", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("آرد سفید", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۴", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 94,
            image = Res.drawable.food2,
            title = "کتلت",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "سیب‌زمینی و پیاز را رنده کنید و آب اضافی آن‌ها را بگیرید.",
                "گوشت چرخ‌کرده را به مواد اضافه کنید.",
                "تخم‌مرغ، نمک و ادویه‌ها را اضافه کنید.",
                "مواد را خوب ورز دهید تا یکدست شوند.",
                "از مواد بردارید و به شکل بیضی و تخت فرم دهید.",
                "کتلت‌ها را در روغن داغ با حرارت متوسط سرخ کنید.",
                "پس از طلایی شدن هر دو طرف، روی دستمال قرار دهید و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت چرخ‌کرده", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("سیب‌زمینی", "۲", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "۱", IngredientUnit.PIECE),
                Ingredients("آرد سوخاری", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۴", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 95,
            image = Res.drawable.food3,
            title = "فلافل ساندویچی",
            chefName = "علی رضایی",
            cookingSteps = listOf(
                "نخود را از شب قبل در آب خیس کنید و چند بار آب آن را عوض کنید.",
                "نخود آبکش‌شده را همراه سیر و پیاز چرخ کنید.",
                "جعفری خردشده و ادویه‌ها را اضافه کنید.",
                "مواد را مخلوط کنید تا خمیر منسجمی به دست آید.",
                "خمیر را حدود یک ساعت در یخچال استراحت دهید.",
                "با قالب فلافل از مواد بردارید و در روغن داغ سرخ کنید.",
                "فلافل‌ها را داخل نان با کاهو، گوجه، خیارشور و سس سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("نخود خشک", "۲", IngredientUnit.CUP),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("سیر", "۳", IngredientUnit.PIECE),
                Ingredients("جعفری خردشده", "نصف", IngredientUnit.CUP),
                Ingredients("نان ساندویچی", "۴", IngredientUnit.PIECE),
                Ingredients("خیارشور", "۴", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "۲", IngredientUnit.PIECE)
            ),
            spices = listOf(
                Spices("زیره سبز", "۱", IngredientUnit.TEASPOON),
                Spices("پودر تخم گشنیز", "۱", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل قرمز", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 96,
            image = Res.drawable.food4,
            title = "شامی کباب",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "لپه را بشویید و با آب بپزید تا نرم شود.",
                "لپه پخته را آبکش کرده و له کنید.",
                "گوشت چرخ‌کرده، پیاز رنده‌شده و تخم‌مرغ را اضافه کنید.",
                "نمک و ادویه‌ها را اضافه کرده و مواد را ورز دهید.",
                "از مواد بردارید و به شکل گرد و تخت فرم دهید.",
                "وسط هر شامی را با انگشت کمی سوراخ کنید.",
                "شامی‌ها را در روغن داغ سرخ کنید تا هر دو طرف طلایی شود."
            ),
            ingredients = listOf(
                Ingredients("گوشت چرخ‌کرده", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("لپه", "۱", IngredientUnit.CUP),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("آرد نخودچی", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۴", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 97,
            image = Res.drawable.food5,
            title = "خوراک مرغ",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "پیاز را خلالی خرد کرده و در قابلمه تفت دهید.",
                "تکه‌های مرغ را اضافه کنید و دو طرف آن‌ها را کمی سرخ کنید.",
                "زردچوبه، فلفل و نمک را اضافه کنید.",
                "رب گوجه‌فرنگی را اضافه کرده و تفت دهید.",
                "هویج و سیب‌زمینی خردشده را به قابلمه اضافه کنید.",
                "یک لیوان آب جوش اضافه کنید و در قابلمه را بگذارید.",
                "اجازه دهید مرغ و سبزیجات با حرارت ملایم کاملاً بپزند.",
                "خوراک را همراه نان تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("مرغ", "۴", IngredientUnit.PIECE),
                Ingredients("سیب‌زمینی", "۲", IngredientUnit.PIECE),
                Ingredients("هویج", "۲", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 98,
            image = Res.drawable.food6,
            title = "تخم‌مرغ و سوسیس",
            chefName = "امیر محمدی",
            cookingSteps = listOf(
                "سوسیس‌ها را به شکل حلقه‌ای خرد کنید.",
                "کمی روغن در تابه بریزید و سوسیس‌ها را تفت دهید.",
                "گوجه‌فرنگی خردشده را اضافه کنید و اجازه دهید نرم شود.",
                "نمک و فلفل را اضافه کنید.",
                "تخم‌مرغ‌ها را روی مواد بشکنید.",
                "درب تابه را بگذارید تا تخم‌مرغ‌ها به میزان دلخواه بپزند.",
                "غذا را همراه نان تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("سوسیس", "۲", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "۲", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("روغن", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 99,
            image = Res.drawable.food1,
            title = "نان سیر",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "کره نرم‌شده را با سیر رنده‌شده مخلوط کنید.",
                "جعفری خردشده و کمی نمک به کره اضافه کنید.",
                "نان باگت را از وسط برش دهید.",
                "مخلوط کره و سیر را روی سطح نان پخش کنید.",
                "پنیر موزارلا را روی نان بریزید.",
                "نان‌ها را در فر ۱۸۰ درجه حدود ۸ تا ۱۰ دقیقه قرار دهید.",
                "پس از ذوب شدن پنیر و طلایی شدن لبه‌ها، سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("نان باگت", "۱", IngredientUnit.PIECE),
                Ingredients("کره", "۵۰", IngredientUnit.GRAM),
                Ingredients("سیر", "۴", IngredientUnit.PIECE),
                Ingredients("پنیر موزارلا", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("جعفری خردشده", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "نصف", IngredientUnit.TEASPOON),
                Spices("آویشن", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 100,
            image = Res.drawable.food2,
            title = "کشک بادمجان",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "بادمجان‌ها را پوست بگیرید و از طول برش دهید.",
                "بادمجان‌ها را سرخ کنید یا با کمی روغن در فر بپزید.",
                "پیاز را خلالی خرد کرده و سرخ کنید.",
                "سیر خردشده را اضافه کنید و کمی تفت دهید.",
                "بادمجان‌ها را اضافه کرده و با گوشت‌کوب له کنید.",
                "کشک را با کمی آب رقیق کنید و به بادمجان اضافه کنید.",
                "مواد را روی حرارت ملایم چند دقیقه بجوشانید.",
                "با نعناع‌داغ، پیازداغ و گردو تزیین کرده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("بادمجان", "۵", IngredientUnit.PIECE),
                Ingredients("کشک", "۱", IngredientUnit.CUP),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("سیر", "۳", IngredientUnit.PIECE),
                Ingredients("گردوی خردشده", "نصف", IngredientUnit.CUP),
                Ingredients("نعناع خشک", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۴", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 101,
            image = Res.drawable.food3,
            title = "میرزاقاسمی",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "بادمجان‌ها را روی شعله یا در فر کباب کنید تا پوست آن‌ها بسوزد و داخلشان نرم شود.",
                "پوست بادمجان‌ها را جدا کنید و گوشت آن‌ها را خرد یا له کنید.",
                "گوجه‌فرنگی‌ها را پوست بگیرید و خرد کنید.",
                "سیر خردشده را در روغن تفت دهید.",
                "گوجه‌فرنگی را اضافه کنید و اجازه دهید آب آن کشیده شود.",
                "بادمجان کبابی را اضافه کنید و مواد را مخلوط کنید.",
                "تخم‌مرغ‌ها را اضافه کنید و هم بزنید تا بپزند.",
                "با نان تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("بادمجان", "۴", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "۳", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("سیر", "۴", IngredientUnit.PIECE),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 102,
            image = Res.drawable.food4,
            title = "خوراک لوبیا",
            chefName = "علی رضایی",
            cookingSteps = listOf(
                "لوبیا چیتی را از شب قبل خیس کنید و چند بار آب آن را عوض کنید.",
                "لوبیا را همراه آب تازه بپزید تا نیم‌پز شود.",
                "پیاز را خرد کرده و در روغن تفت دهید.",
                "رب گوجه‌فرنگی و ادویه‌ها را اضافه کنید.",
                "سیب‌زمینی خردشده را به لوبیا اضافه کنید.",
                "مخلوط پیاز و رب را داخل قابلمه بریزید.",
                "اجازه دهید خوراک با حرارت ملایم جا بیفتد و لوبیا کاملاً نرم شود.",
                "خوراک را با آبلیمو و نان تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("لوبیا چیتی", "۲", IngredientUnit.CUP),
                Ingredients("سیب‌زمینی", "۱", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۲", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 103,
            image = Res.drawable.food5,
            title = "خوراک قارچ و پنیر",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "قارچ‌ها را تمیز کرده و ورقه‌ای خرد کنید.",
                "پیاز را خرد کرده و با کمی روغن تفت دهید.",
                "قارچ‌ها را اضافه کنید و با حرارت بالا تفت دهید تا آب آن‌ها کشیده شود.",
                "فلفل دلمه‌ای خردشده را اضافه کنید.",
                "نمک و فلفل را اضافه کنید.",
                "قارچ‌ها را در ظرف مناسب فر بریزید.",
                "پنیر موزارلا را روی قارچ‌ها پخش کنید.",
                "ظرف را در فر ۱۸۰ درجه قرار دهید تا پنیر ذوب و طلایی شود.",
                "خوراک را با نان تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("قارچ", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("پنیر موزارلا", "۱۵۰", IngredientUnit.GRAM),
                Ingredients("فلفل دلمه‌ای", "۱", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM),
                Ingredients("نان", "۲", IngredientUnit.PIECE)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "نصف", IngredientUnit.TEASPOON),
                Spices("آویشن", "۱", IngredientUnit.TEASPOON)
            )
        )
    )

    // 8. نوشیدنی‌ها — 13 غذا
    val drinkRecipes = listOf(
        recipe(
            id = 104,
            image = Res.drawable.food1,
            title = "اسموتی توت‌فرنگی",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "توت‌فرنگی‌ها را بشویید و برگ آن‌ها را جدا کنید.",
                "موز را پوست بگیرید و خرد کنید.",
                "توت‌فرنگی، موز، شیر و عسل را داخل مخلوط‌کن بریزید.",
                "چند تکه یخ اضافه کنید.",
                "مواد را مخلوط کنید تا کاملاً یکدست و غلیظ شوند.",
                "اسموتی را در لیوان بریزید و با توت‌فرنگی تزیین کنید."
            ),
            ingredients = listOf(
                Ingredients("توت‌فرنگی", "۱", IngredientUnit.CUP),
                Ingredients("موز", "۱", IngredientUnit.PIECE),
                Ingredients("شیر", "۱", IngredientUnit.CUP),
                Ingredients("عسل", "۱", IngredientUnit.TABLESPOON),
                Ingredients("یخ", "۴", IngredientUnit.PIECE)
            ),
            spices = listOf()
        ),

        recipe(
            id = 105,
            image = Res.drawable.food2,
            title = "لیموناد",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "لیموها را از وسط نصف کنید و آب آن‌ها را بگیرید.",
                "شکر را با کمی آب گرم مخلوط کنید تا کاملاً حل شود.",
                "آب لیمو را به شربت شکر اضافه کنید.",
                "آب سرد را اضافه کرده و مواد را هم بزنید.",
                "چند تکه یخ داخل پارچ بریزید.",
                "لیموناد را با برش لیمو و برگ نعناع سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("آب لیموترش تازه", "نصف", IngredientUnit.CUP),
                Ingredients("آب سرد", "۳", IngredientUnit.CUP),
                Ingredients("شکر", "نصف", IngredientUnit.CUP),
                Ingredients("یخ", "۶", IngredientUnit.PIECE),
                Ingredients("برگ نعناع", "۱۰", IngredientUnit.PIECE)
            ),
            spices = listOf()
        ),

        recipe(
            id = 106,
            image = Res.drawable.food3,
            title = "شیک شکلات",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "شیر را داخل مخلوط‌کن بریزید.",
                "بستنی وانیلی و پودر کاکائو را اضافه کنید.",
                "سس شکلات را به مواد اضافه کنید.",
                "مواد را مخلوط کنید تا بافتی غلیظ و یکدست ایجاد شود.",
                "شیک را داخل لیوان بلند بریزید.",
                "روی آن را با خامه و سس شکلات تزیین کنید."
            ),
            ingredients = listOf(
                Ingredients("شیر سرد", "۱", IngredientUnit.CUP),
                Ingredients("بستنی وانیلی", "۲", IngredientUnit.CUP),
                Ingredients("پودر کاکائو", "۲", IngredientUnit.TABLESPOON),
                Ingredients("سس شکلات", "۲", IngredientUnit.TABLESPOON),
                Ingredients("خامه فرم‌گرفته", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 107,
            image = Res.drawable.food4,
            title = "آیس‌کافی",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "قهوه فوری یا اسپرسو را آماده کنید.",
                "در صورت استفاده از قهوه فوری، آن را با کمی آب داغ حل کنید.",
                "اجازه دهید قهوه خنک شود.",
                "لیوان را با تکه‌های یخ پر کنید.",
                "شیر سرد را روی یخ‌ها بریزید.",
                "قهوه خنک‌شده را اضافه کنید.",
                "در صورت تمایل شکر یا سیروپ اضافه کرده و هم بزنید."
            ),
            ingredients = listOf(
                Ingredients("قهوه اسپرسو", "۲", IngredientUnit.SHOT),
                Ingredients("شیر سرد", "۱", IngredientUnit.CUP),
                Ingredients("یخ", "۶", IngredientUnit.PIECE),
                Ingredients("شکر", "۱", IngredientUnit.TEASPOON)
            ),
            spices = listOf()
        ),

        recipe(
            id = 108,
            image = Res.drawable.food5,
            title = "شربت زعفران",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "آب و شکر را داخل قابلمه بریزید.",
                "قابلمه را روی حرارت ملایم قرار دهید تا شکر حل شود.",
                "زعفران دم‌کرده را به شربت اضافه کنید.",
                "گلاب را اضافه کنید و چند دقیقه هم بزنید.",
                "شربت را از روی حرارت بردارید و اجازه دهید خنک شود.",
                "برای سرو، مقداری از شربت را با آب سرد و یخ مخلوط کنید."
            ),
            ingredients = listOf(
                Ingredients("آب", "۲", IngredientUnit.CUP),
                Ingredients("شکر", "۱", IngredientUnit.CUP),
                Ingredients("گلاب", "۳", IngredientUnit.TABLESPOON),
                Ingredients("زعفران دم‌کرده", "۲", IngredientUnit.TABLESPOON),
                Ingredients("یخ", "۴", IngredientUnit.PIECE)
            ),
            spices = listOf(
                Spices("هل", "۲", IngredientUnit.PIECE)
            )
        ),

        recipe(
            id = 109,
            image = Res.drawable.food6,
            title = "موهیتو",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "لیموترش را به چند قسمت برش دهید.",
                "برگ‌های نعناع را داخل لیوان بریزید.",
                "لیمو و شکر را اضافه کنید.",
                "مواد را به‌آرامی بکوبید تا آب لیمو و عطر نعناع آزاد شود.",
                "لیوان را با یخ خردشده پر کنید.",
                "آب گازدار سرد را اضافه کنید.",
                "نوشیدنی را به‌آرامی هم بزنید و با نعناع تزیین کنید."
            ),
            ingredients = listOf(
                Ingredients("لیموترش", "۲", IngredientUnit.PIECE),
                Ingredients("برگ نعناع", "۱۵", IngredientUnit.PIECE),
                Ingredients("شکر", "۲", IngredientUnit.TEASPOON),
                Ingredients("آب گازدار", "۱", IngredientUnit.CUP),
                Ingredients("یخ خردشده", "۱", IngredientUnit.CUP)
            ),
            spices = listOf()
        ),

        recipe(
            id = 110,
            image = Res.drawable.food1,
            title = "اسموتی موز",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "موزها را پوست بگیرید و حلقه‌حلقه کنید.",
                "موز را همراه شیر داخل مخلوط‌کن بریزید.",
                "عسل و ماست را اضافه کنید.",
                "چند تکه یخ اضافه کنید.",
                "مواد را مخلوط کنید تا کاملاً یکدست شوند.",
                "اسموتی را داخل لیوان بریزید و سرد سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("موز", "۲", IngredientUnit.PIECE),
                Ingredients("شیر", "۱", IngredientUnit.CUP),
                Ingredients("ماست", "نصف", IngredientUnit.CUP),
                Ingredients("عسل", "۱", IngredientUnit.TABLESPOON),
                Ingredients("یخ", "۴", IngredientUnit.PIECE)
            ),
            spices = listOf(
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 111,
            image = Res.drawable.food2,
            title = "شیر موز",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "موزها را پوست بگیرید و خرد کنید.",
                "موز را همراه شیر سرد داخل مخلوط‌کن بریزید.",
                "بستنی وانیلی و عسل را اضافه کنید.",
                "مواد را چند دقیقه مخلوط کنید تا نوشیدنی کف‌دار و یکدست شود.",
                "شیر موز را داخل لیوان بریزید.",
                "در صورت تمایل با پودر پسته تزیین کنید."
            ),
            ingredients = listOf(
                Ingredients("موز", "۲", IngredientUnit.PIECE),
                Ingredients("شیر سرد", "۲", IngredientUnit.CUP),
                Ingredients("بستنی وانیلی", "۱", IngredientUnit.CUP),
                Ingredients("عسل", "۱", IngredientUnit.TABLESPOON),
                Ingredients("پودر پسته", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 112,
            image = Res.drawable.food3,
            title = "چای ماسالا",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "آب را داخل قابلمه بریزید و روی حرارت قرار دهید.",
                "چوب دارچین، هل، میخک و زنجبیل را به آب اضافه کنید.",
                "اجازه دهید ادویه‌ها حدود ۵ تا ۷ دقیقه بجوشند.",
                "چای سیاه را اضافه کنید و چند دقیقه دم کنید.",
                "شیر را اضافه کنید و اجازه دهید نوشیدنی به‌آرامی گرم شود.",
                "چای را از صافی عبور دهید.",
                "در صورت تمایل با عسل یا شکر شیرین کنید و گرم سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("آب", "۱", IngredientUnit.CUP),
                Ingredients("شیر", "۱", IngredientUnit.CUP),
                Ingredients("چای سیاه", "۲", IngredientUnit.TEASPOON),
                Ingredients("عسل", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("چوب دارچین", "۱", IngredientUnit.PIECE),
                Spices("هل", "۳", IngredientUnit.PIECE),
                Spices("میخک", "۲", IngredientUnit.PIECE),
                Spices("زنجبیل تازه", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 113,
            image = Res.drawable.food4,
            title = "هات‌چاکلت",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "پودر کاکائو و شکر را داخل قابلمه بریزید.",
                "چند قاشق شیر اضافه کنید و هم بزنید تا خمیر یکدستی ایجاد شود.",
                "باقی شیر را اضافه کنید.",
                "قابلمه را روی حرارت ملایم قرار دهید و مرتب هم بزنید.",
                "شکلات خردشده را اضافه کنید تا کاملاً ذوب شود.",
                "وقتی نوشیدنی غلیظ و یکدست شد، آن را از روی حرارت بردارید.",
                "هات‌چاکلت را با خامه یا پودر کاکائو تزیین و گرم سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("شیر", "۲", IngredientUnit.CUP),
                Ingredients("شکلات تلخ", "۵۰", IngredientUnit.GRAM),
                Ingredients("پودر کاکائو", "۲", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "۲", IngredientUnit.TABLESPOON),
                Ingredients("خامه", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 114,
            image = Res.drawable.food5,
            title = "شربت بهارنارنج",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "آب و شکر را داخل قابلمه بریزید.",
                "روی حرارت ملایم قرار دهید تا شکر کاملاً حل شود.",
                "عرق بهارنارنج را اضافه کنید.",
                "گلاب و آبلیمو را اضافه کرده و مخلوط کنید.",
                "شربت را از روی حرارت بردارید و اجازه دهید خنک شود.",
                "برای سرو، مقداری شربت را با آب سرد و یخ ترکیب کنید."
            ),
            ingredients = listOf(
                Ingredients("آب", "۲", IngredientUnit.CUP),
                Ingredients("شکر", "۱", IngredientUnit.CUP),
                Ingredients("عرق بهارنارنج", "نصف", IngredientUnit.CUP),
                Ingredients("گلاب", "۲", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "۱", IngredientUnit.TEASPOON),
                Ingredients("یخ", "۴", IngredientUnit.PIECE)
            ),
            spices = listOf(
                Spices("هل", "۲", IngredientUnit.PIECE)
            )
        ),

        recipe(
            id = 115,
            image = Res.drawable.food6,
            title = "آب هندوانه",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "هندوانه را پوست بگیرید و هسته‌های آن را جدا کنید.",
                "گوشت هندوانه را به قطعات کوچک تقسیم کنید.",
                "هندوانه را داخل مخلوط‌کن بریزید.",
                "آبلیمو و چند تکه یخ اضافه کنید.",
                "مواد را مخلوط کنید تا کاملاً یکدست شوند.",
                "در صورت تمایل نوشیدنی را از صافی عبور دهید.",
                "آب هندوانه را سرد سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("هندوانه بدون هسته", "۳", IngredientUnit.CUP),
                Ingredients("آبلیمو", "۱", IngredientUnit.TABLESPOON),
                Ingredients("یخ", "۵", IngredientUnit.PIECE)
            ),
            spices = listOf()
        ),

        recipe(
            id = 116,
            image = Res.drawable.food1,
            title = "اسموتی انبه",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "انبه را پوست بگیرید و هسته آن را جدا کنید.",
                "گوشت انبه را به قطعات کوچک تقسیم کنید.",
                "انبه را همراه ماست و شیر داخل مخلوط‌کن بریزید.",
                "عسل و چند تکه یخ اضافه کنید.",
                "مواد را مخلوط کنید تا بافتی نرم و یکدست ایجاد شود.",
                "اسموتی را داخل لیوان بریزید و سرد سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("انبه", "۱", IngredientUnit.PIECE),
                Ingredients("ماست یونانی", "نصف", IngredientUnit.CUP),
                Ingredients("شیر", "نصف", IngredientUnit.CUP),
                Ingredients("عسل", "۱", IngredientUnit.TABLESPOON),
                Ingredients("یخ", "۴", IngredientUnit.PIECE)
            ),
            spices = listOf(
                Spices("هل", "یک چهارم", IngredientUnit.TEASPOON)
            )
        )
    )

    // 9. غذاهای گیاهی — 12 غذا
    val vegetarianRecipes = listOf(
        recipe(
            id = 117,
            image = Res.drawable.food1,
            title = "کوکو سبزی",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "سبزی کوکو شامل جعفری، گشنیز، شوید و تره را پاک کرده و ریز خرد کنید.",
                "تخم‌مرغ‌ها را داخل کاسه بشکنید و با نمک و فلفل هم بزنید.",
                "سبزی خردشده، گردو و زرشک را به تخم‌مرغ اضافه کنید.",
                "مواد را کاملاً مخلوط کنید تا ترکیبی یکدست ایجاد شود.",
                "مقداری روغن داخل تابه بریزید و اجازه دهید گرم شود.",
                "مایه کوکو را داخل تابه پخش کنید و درب آن را بگذارید.",
                "پس از سرخ شدن یک طرف، کوکو را برگردانید تا طرف دیگر نیز طلایی شود.",
                "کوکو سبزی را برش بزنید و همراه نان و سبزی تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("سبزی کوکو خردشده", "۳", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۴", IngredientUnit.PIECE),
                Ingredients("گردوی خردشده", "۲", IngredientUnit.TABLESPOON),
                Ingredients("زرشک", "۲", IngredientUnit.TABLESPOON),
                Ingredients("آرد", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 118,
            image = Res.drawable.food2,
            title = "کشک بادمجان",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "بادمجان‌ها را پوست بگیرید و از طول برش دهید.",
                "بادمجان‌ها را با کمی روغن سرخ کنید تا کاملاً نرم شوند.",
                "پیازها را خلالی خرد کرده و در تابه تفت دهید.",
                "سیر خردشده را به پیاز اضافه کنید و کمی تفت دهید.",
                "بادمجان‌های سرخ‌شده را به مواد اضافه کنید و با گوشت‌کوب له کنید.",
                "نعناع خشک را در کمی روغن تفت دهید.",
                "کشک را با مقداری آب رقیق کرده و به بادمجان اضافه کنید.",
                "مواد را چند دقیقه روی حرارت ملایم قرار دهید.",
                "کشک بادمجان را با نعناع داغ و پیازداغ تزیین کنید."
            ),
            ingredients = listOf(
                Ingredients("بادمجان", "۵", IngredientUnit.PIECE),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("سیر", "۴", IngredientUnit.PIECE),
                Ingredients("کشک", "۱", IngredientUnit.CUP),
                Ingredients("گردوی خردشده", "۳", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۴", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نعناع خشک", "۲", IngredientUnit.TABLESPOON),
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 119,
            image = Res.drawable.food3,
            title = "میرزا قاسمی",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "بادمجان‌ها را روی شعله یا داخل فر کباب کنید تا پوست آن‌ها کاملاً بسوزد.",
                "بادمجان‌ها را داخل ظرف دربسته قرار دهید تا کمی خنک شوند.",
                "پوست سوخته بادمجان‌ها را جدا کرده و گوشت آن‌ها را ساطوری کنید.",
                "گوجه‌فرنگی‌ها را پوست گرفته و خرد کنید.",
                "سیر خردشده را با کمی روغن تفت دهید.",
                "زردچوبه و گوجه‌فرنگی را اضافه کنید و اجازه دهید آب گوجه کشیده شود.",
                "بادمجان ساطوری‌شده را اضافه کرده و مواد را مخلوط کنید.",
                "تخم‌مرغ‌ها را اضافه کنید و هم بزنید تا کاملاً بپزند.",
                "میرزا قاسمی را با نان تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("بادمجان", "۴", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "۳", IngredientUnit.PIECE),
                Ingredients("سیر", "۵", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 120,
            image = Res.drawable.food4,
            title = "دلمه برگ مو",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "برنج و لپه را جداگانه بشویید و نیم‌پز کنید.",
                "پیاز را خرد کرده و با کمی روغن تفت دهید.",
                "سبزی دلمه شامل جعفری، شوید، تره و نعناع را خرد کنید.",
                "برنج، لپه، سبزی، پیازداغ و زرشک را با هم مخلوط کنید.",
                "نمک، فلفل و ادویه را به مواد اضافه کنید.",
                "برگ‌های مو را چند دقیقه در آب جوش قرار دهید تا نرم شوند.",
                "مقداری از مواد را وسط هر برگ قرار دهید و آن را بپیچید.",
                "دلمه‌ها را کنار هم داخل قابلمه بچینید.",
                "آب، آبلیمو و کمی شکر را مخلوط کرده و روی دلمه‌ها بریزید.",
                "دلمه‌ها را حدود یک ساعت روی حرارت ملایم بپزید."
            ),
            ingredients = listOf(
                Ingredients("برگ مو", "۴۰", IngredientUnit.PIECE),
                Ingredients("برنج", "۱", IngredientUnit.CUP),
                Ingredients("لپه", "نصف", IngredientUnit.CUP),
                Ingredients("سبزی دلمه", "۲", IngredientUnit.CUP),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("زرشک", "۲", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "۳", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 121,
            image = Res.drawable.food5,
            title = "عدسی",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "عدس را پاک کرده و چند بار با آب بشویید.",
                "پیاز را نگینی خرد کرده و در قابلمه با روغن تفت دهید.",
                "زردچوبه را اضافه کنید و کمی هم بزنید.",
                "عدس را همراه آب به قابلمه اضافه کنید.",
                "سیب‌زمینی را پوست گرفته و نگینی خرد کنید.",
                "سیب‌زمینی را به عدس اضافه کنید.",
                "اجازه دهید مواد حدود ۴۵ دقیقه با حرارت ملایم بپزند.",
                "رب گوجه‌فرنگی را با کمی روغن تفت دهید و به عدسی اضافه کنید.",
                "نمک و فلفل را اضافه کرده و اجازه دهید غذا جا بیفتد.",
                "عدسی را با آبلیمو و نان تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("عدس", "۲", IngredientUnit.CUP),
                Ingredients("سیب‌زمینی", "۲", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۱", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "۲", IngredientUnit.TABLESPOON),
                Ingredients("آب", "۵", IngredientUnit.CUP)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 122,
            image = Res.drawable.food6,
            title = "خوراک لوبیا چیتی",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "لوبیا چیتی را از شب قبل در آب خیس کنید.",
                "لوبیا را همراه آب تازه داخل قابلمه بریزید.",
                "اجازه دهید لوبیا روی حرارت ملایم بپزد.",
                "پیاز را نگینی خرد کرده و تفت دهید.",
                "رب گوجه‌فرنگی و زردچوبه را به پیاز اضافه کنید.",
                "قارچ‌های خردشده را جداگانه تفت دهید.",
                "مخلوط پیاز و قارچ را به لوبیای پخته اضافه کنید.",
                "سیب‌زمینی نگینی را اضافه کنید.",
                "اجازه دهید خوراک حدود ۲۰ دقیقه دیگر بپزد و جا بیفتد.",
                "خوراک لوبیا را با آبلیمو و نان تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("لوبیا چیتی", "۲", IngredientUnit.CUP),
                Ingredients("قارچ", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("سیب‌زمینی", "۲", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۲", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 123,
            image = Res.drawable.food1,
            title = "کوکو سیب‌زمینی",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "سیب‌زمینی‌ها را آب‌پز کنید تا کاملاً نرم شوند.",
                "پوست سیب‌زمینی‌ها را جدا کرده و آن‌ها را رنده یا له کنید.",
                "تخم‌مرغ‌ها را به سیب‌زمینی اضافه کنید.",
                "پیاز رنده‌شده و آب‌گرفته را به مواد اضافه کنید.",
                "نمک، فلفل و زردچوبه را اضافه کرده و مواد را مخلوط کنید.",
                "مقداری روغن داخل تابه بریزید و گرم کنید.",
                "از مایه کوکو بردارید و به شکل دلخواه فرم دهید.",
                "کوکوها را در روغن سرخ کنید تا هر دو طرف طلایی شوند.",
                "کوکو سیب‌زمینی را همراه خیارشور و گوجه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("سیب‌زمینی", "۴", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("آرد", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۴", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 124,
            image = Res.drawable.food2,
            title = "املت گوجه‌فرنگی",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "گوجه‌فرنگی‌ها را بشویید و ریز خرد کنید.",
                "مقداری روغن داخل تابه بریزید و گرم کنید.",
                "گوجه‌فرنگی‌ها را اضافه کنید و تفت دهید تا آب آن‌ها کشیده شود.",
                "نمک، فلفل و زردچوبه را اضافه کنید.",
                "تخم‌مرغ‌ها را داخل کاسه بشکنید و کمی هم بزنید.",
                "تخم‌مرغ‌ها را به گوجه اضافه کنید.",
                "مواد را به‌آرامی هم بزنید تا تخم‌مرغ‌ها بپزند.",
                "املت را همراه نان تازه و سبزی خوردن سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوجه‌فرنگی", "۴", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("روغن", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 125,
            image = Res.drawable.food3,
            title = "قارچ شکم‌پر",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "قارچ‌های درشت را بشویید و ساقه آن‌ها را جدا کنید.",
                "ساقه قارچ، فلفل دلمه‌ای و پیاز را ریز خرد کنید.",
                "پیاز را در تابه تفت دهید تا نرم شود.",
                "ساقه قارچ و فلفل دلمه‌ای را اضافه کنید.",
                "پنیر پیتزا و جعفری خردشده را به مواد اضافه کنید.",
                "داخل قارچ‌ها را با مخلوط آماده‌شده پر کنید.",
                "قارچ‌ها را داخل ظرف مخصوص فر بچینید.",
                "در دمای ۱۸۰ درجه حدود ۱۵ تا ۲۰ دقیقه بپزید.",
                "قارچ شکم‌پر را گرم سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("قارچ درشت", "۸", IngredientUnit.PIECE),
                Ingredients("پنیر پیتزا", "۱", IngredientUnit.CUP),
                Ingredients("فلفل دلمه‌ای", "۱", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("جعفری خردشده", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("آویشن", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 126,
            image = Res.drawable.food4,
            title = "خوراک بادمجان و گوجه",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "بادمجان‌ها را پوست گرفته و به صورت حلقه‌ای برش دهید.",
                "بادمجان‌ها را با کمی روغن سرخ کنید.",
                "پیاز را خلالی خرد کرده و در تابه تفت دهید.",
                "سیر خردشده را اضافه کنید.",
                "گوجه‌فرنگی‌ها را حلقه‌ای برش دهید.",
                "بادمجان و گوجه را به صورت لایه‌ای داخل تابه بچینید.",
                "نمک، فلفل و زردچوبه را اضافه کنید.",
                "درب تابه را بگذارید و اجازه دهید مواد با حرارت ملایم بپزند.",
                "خوراک را با جعفری تازه تزیین و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("بادمجان", "۳", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "۳", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("سیر", "۳", IngredientUnit.PIECE),
                Ingredients("جعفری", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 127,
            image = Res.drawable.food5,
            title = "سالاد الویه گیاهی",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "سیب‌زمینی و هویج را آب‌پز کنید.",
                "نخودفرنگی را بپزید تا نرم شود.",
                "سیب‌زمینی و هویج را پس از خنک شدن نگینی خرد کنید.",
                "خیارشور را ریز خرد کنید.",
                "تمام مواد را داخل کاسه بزرگی بریزید.",
                "سس مایونز، آبلیمو، نمک و فلفل را اضافه کنید.",
                "مواد را به‌آرامی مخلوط کنید تا سس به همه قسمت‌ها برسد.",
                "سالاد را حداقل یک ساعت داخل یخچال قرار دهید.",
                "سالاد الویه گیاهی را سرد سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("سیب‌زمینی", "۳", IngredientUnit.PIECE),
                Ingredients("هویج", "۲", IngredientUnit.PIECE),
                Ingredients("نخودفرنگی", "۱", IngredientUnit.CUP),
                Ingredients("خیارشور", "۴", IngredientUnit.PIECE),
                Ingredients("سس مایونز", "نصف", IngredientUnit.CUP),
                Ingredients("آبلیمو", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 128,
            image = Res.drawable.food6,
            title = "خوراک سبزیجات",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "هویج، کدو، فلفل دلمه‌ای و سیب‌زمینی را بشویید و خرد کنید.",
                "پیاز را خلالی خرد کرده و با کمی روغن تفت دهید.",
                "هویج و سیب‌زمینی را به پیاز اضافه کنید.",
                "چند دقیقه مواد را تفت دهید.",
                "کدو و فلفل دلمه‌ای را اضافه کنید.",
                "قارچ خردشده را به سبزیجات اضافه کنید.",
                "رب گوجه‌فرنگی را با کمی آب مخلوط کرده و داخل تابه بریزید.",
                "نمک، فلفل و ادویه‌ها را اضافه کنید.",
                "درب تابه را بگذارید و اجازه دهید سبزیجات با حرارت ملایم بپزند.",
                "خوراک را با جعفری تازه تزیین و گرم سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("هویج", "۲", IngredientUnit.PIECE),
                Ingredients("کدو سبز", "۲", IngredientUnit.PIECE),
                Ingredients("سیب‌زمینی", "۲", IngredientUnit.PIECE),
                Ingredients("فلفل دلمه‌ای", "۱", IngredientUnit.PIECE),
                Ingredients("قارچ", "۱۵۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("آویشن", "۱", IngredientUnit.TEASPOON)
            )
        )
    )

    // 10. صبحانه — 10 غذا
    val breakfastRecipes = listOf(
        recipe(
            id = 129,
            image = Res.drawable.food1,
            title = "پنکیک ساده",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "آرد، شکر و بیکینگ‌پودر را داخل کاسه مخلوط کنید.",
                "تخم‌مرغ، شیر و وانیل را در ظرف دیگری هم بزنید.",
                "مواد تر را به مواد خشک اضافه کنید.",
                "مواد را هم بزنید تا مایه‌ای یکدست و بدون گلوله ایجاد شود.",
                "تابه نچسب را کمی چرب کرده و روی حرارت ملایم قرار دهید.",
                "مقداری از مایه را داخل تابه بریزید.",
                "وقتی روی پنکیک حباب ایجاد شد، آن را برگردانید.",
                "طرف دیگر را نیز طلایی کنید.",
                "پنکیک‌ها را با عسل و میوه تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("آرد سفید", "۱", IngredientUnit.CUP),
                Ingredients("شیر", "۱", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۱", IngredientUnit.PIECE),
                Ingredients("شکر", "۲", IngredientUnit.TABLESPOON),
                Ingredients("بیکینگ‌پودر", "۱", IngredientUnit.TEASPOON),
                Ingredients("کره ذوب‌شده", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 130,
            image = Res.drawable.food2,
            title = "فرنچ تست",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "تخم‌مرغ‌ها را داخل یک کاسه بشکنید.",
                "شیر، شکر و وانیل را اضافه کرده و هم بزنید.",
                "نان تست‌ها را یکی‌یکی داخل مخلوط تخم‌مرغ قرار دهید.",
                "اجازه دهید دو طرف نان به مواد آغشته شود.",
                "کره را داخل تابه روی حرارت ملایم ذوب کنید.",
                "نان‌ها را داخل تابه قرار دهید.",
                "هر طرف را چند دقیقه سرخ کنید تا طلایی شود.",
                "فرنچ تست را با عسل، دارچین و میوه تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("نان تست", "۴", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("شیر", "نصف", IngredientUnit.CUP),
                Ingredients("شکر", "۱", IngredientUnit.TABLESPOON),
                Ingredients("کره", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON),
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 131,
            image = Res.drawable.food3,
            title = "املت قارچ و پنیر",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "قارچ‌ها را بشویید و به صورت ورقه‌ای خرد کنید.",
                "کره را داخل تابه ذوب کنید.",
                "قارچ‌ها را اضافه کرده و تفت دهید تا آب آن‌ها کشیده شود.",
                "تخم‌مرغ‌ها را داخل کاسه شکسته و هم بزنید.",
                "تخم‌مرغ را به قارچ‌ها اضافه کنید.",
                "نمک و فلفل را اضافه کنید.",
                "وقتی تخم‌مرغ کمی خودش را گرفت، پنیر را روی آن بریزید.",
                "درب تابه را بگذارید تا پنیر ذوب شود.",
                "املت را گرم و همراه نان تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("قارچ", "۱۵۰", IngredientUnit.GRAM),
                Ingredients("پنیر پیتزا", "نصف", IngredientUnit.CUP),
                Ingredients("کره", "۱", IngredientUnit.TABLESPOON),
                Ingredients("شیر", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("آویشن", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 132,
            image = Res.drawable.food4,
            title = "اوتمیل موز و عسل",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "جو دوسر پرک را داخل قابلمه بریزید.",
                "شیر را به جو دوسر اضافه کنید.",
                "قابلمه را روی حرارت ملایم قرار دهید.",
                "مواد را مرتب هم بزنید تا جو دوسر نرم و غلیظ شود.",
                "موز را حلقه‌حلقه خرد کنید.",
                "وقتی اوتمیل به غلظت دلخواه رسید، آن را داخل کاسه بریزید.",
                "موز، عسل و گردو را روی آن قرار دهید.",
                "اوتمیل را گرم سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("جو دوسر پرک", "نصف", IngredientUnit.CUP),
                Ingredients("شیر", "۱", IngredientUnit.CUP),
                Ingredients("موز", "۱", IngredientUnit.PIECE),
                Ingredients("عسل", "۱", IngredientUnit.TABLESPOON),
                Ingredients("گردو", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("دارچین", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 133,
            image = Res.drawable.food5,
            title = "کرپ صبحانه",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "تخم‌مرغ را داخل کاسه بشکنید و هم بزنید.",
                "شیر و کره ذوب‌شده را اضافه کنید.",
                "آرد را کم‌کم اضافه کرده و مخلوط کنید.",
                "مواد را هم بزنید تا مایه‌ای رقیق و یکدست ایجاد شود.",
                "تابه نچسب را کمی چرب کنید.",
                "مقداری از مایه را داخل تابه بریزید و تابه را بچرخانید.",
                "وقتی لبه‌های کرپ از تابه جدا شد، آن را برگردانید.",
                "طرف دیگر را نیز کمی بپزید.",
                "کرپ را با عسل، شکلات یا میوه دلخواه پر کرده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("آرد سفید", "۱", IngredientUnit.CUP),
                Ingredients("شیر", "۱", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("کره ذوب‌شده", "۲", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 134,
            image = Res.drawable.food6,
            title = "سوسیس و تخم‌مرغ",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "سوسیس‌ها را به صورت حلقه‌ای برش دهید.",
                "مقداری روغن داخل تابه بریزید.",
                "سوسیس‌ها را اضافه کرده و سرخ کنید.",
                "گوجه‌فرنگی را خرد کرده و به سوسیس اضافه کنید.",
                "اجازه دهید گوجه کمی نرم شود.",
                "تخم‌مرغ‌ها را داخل تابه بشکنید.",
                "نمک و فلفل را اضافه کنید.",
                "درب تابه را بگذارید تا تخم‌مرغ‌ها بپزند.",
                "غذا را با نان تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("سوسیس", "۲", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "۲", IngredientUnit.PIECE),
                Ingredients("روغن", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 135,
            image = Res.drawable.food1,
            title = "نان تست آووکادو",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "آووکادو را از وسط نصف کرده و هسته آن را خارج کنید.",
                "گوشت آووکادو را داخل کاسه بریزید.",
                "آووکادو را با چنگال له کنید.",
                "آبلیمو، نمک و فلفل را اضافه کنید.",
                "نان‌های تست را داخل توستر یا تابه برشته کنید.",
                "مخلوط آووکادو را روی نان‌ها پخش کنید.",
                "تخم‌مرغ را به صورت نیمرو آماده کنید.",
                "نیمرو را روی نان قرار دهید.",
                "با گوجه گیلاسی و سبزی تازه تزیین و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("آووکادو", "۱", IngredientUnit.PIECE),
                Ingredients("نان تست", "۲", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "۱", IngredientUnit.PIECE),
                Ingredients("آبلیمو", "۱", IngredientUnit.TEASPOON),
                Ingredients("گوجه گیلاسی", "۴", IngredientUnit.PIECE)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 136,
            image = Res.drawable.food2,
            title = "پنیر و گردو با سبزی",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "پنیر را به قطعات کوچک تقسیم کنید.",
                "گردوها را کمی خرد کنید.",
                "سبزی خوردن را پاک کرده و بشویید.",
                "خیار و گوجه‌فرنگی را به صورت حلقه‌ای برش دهید.",
                "پنیر و گردو را داخل ظرف سرو قرار دهید.",
                "سبزی، خیار و گوجه را کنار آن بچینید.",
                "نان تازه را به قطعات دلخواه تقسیم کنید.",
                "صبحانه را همراه چای سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("پنیر سفید", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("گردو", "۵", IngredientUnit.PIECE),
                Ingredients("خیار", "۲", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "۲", IngredientUnit.PIECE),
                Ingredients("سبزی خوردن", "۱", IngredientUnit.CUP),
                Ingredients("نان", "۲", IngredientUnit.PIECE)
            ),
            spices = listOf()
        ),

        recipe(
            id = 137,
            image = Res.drawable.food3,
            title = "مافین تخم‌مرغ و سبزیجات",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "فر را روی دمای ۱۸۰ درجه سانتی‌گراد گرم کنید.",
                "فلفل دلمه‌ای و اسفناج را ریز خرد کنید.",
                "تخم‌مرغ‌ها را داخل کاسه بشکنید و هم بزنید.",
                "شیر و پنیر رنده‌شده را اضافه کنید.",
                "سبزیجات خردشده را به مواد اضافه کنید.",
                "قالب مافین را کمی چرب کنید.",
                "مایه را داخل قالب‌ها بریزید.",
                "قالب را حدود ۱۵ تا ۲۰ دقیقه داخل فر قرار دهید.",
                "پس از پخت و کمی خنک شدن، مافین‌ها را از قالب خارج کنید."
            ),
            ingredients = listOf(
                Ingredients("تخم‌مرغ", "۴", IngredientUnit.PIECE),
                Ingredients("اسفناج", "۱", IngredientUnit.CUP),
                Ingredients("فلفل دلمه‌ای", "نصف", IngredientUnit.PIECE),
                Ingredients("پنیر چدار", "نصف", IngredientUnit.CUP),
                Ingredients("شیر", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("آویشن", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 138,
            image = Res.drawable.food4,
            title = "حلیم گندم",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "گندم پوست‌کنده را از شب قبل در آب خیس کنید.",
                "گندم را همراه آب تازه داخل قابلمه بریزید.",
                "اجازه دهید گندم روی حرارت ملایم کاملاً نرم شود.",
                "گوشت را همراه پیاز و کمی آب در قابلمه جداگانه بپزید.",
                "گوشت پخته‌شده را ریش‌ریش کنید.",
                "گندم پخته را با گوشت‌کوب یا مخلوط‌کن کمی له کنید.",
                "گوشت ریش‌ریش‌شده را به گندم اضافه کنید.",
                "مواد را مرتب هم بزنید تا حلیم کشدار و غلیظ شود.",
                "نمک را اضافه کنید و چند دقیقه دیگر بپزید.",
                "حلیم را با دارچین، کنجد و کره سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گندم پوست‌کنده", "۲", IngredientUnit.CUP),
                Ingredients("گوشت گوسفندی", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("آب", "۸", IngredientUnit.CUP),
                Ingredients("کره", "۲", IngredientUnit.TABLESPOON),
                Ingredients("کنجد", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("دارچین", "۱", IngredientUnit.TABLESPOON)
            )
        ),

        recipe(
            id = 139,
            image = Res.drawable.food5,
            title = "عدسی با قارچ",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "عدس را بشویید و برای مدتی در آب خیس کنید.",
                "پیاز را نگینی خرد کرده و با روغن تفت دهید.",
                "زردچوبه را اضافه کنید.",
                "عدس را همراه آب داخل قابلمه بریزید.",
                "اجازه دهید عدس روی حرارت ملایم بپزد.",
                "قارچ‌ها را ورقه‌ای خرد کرده و در تابه جداگانه تفت دهید.",
                "قارچ را به عدس اضافه کنید.",
                "سیب‌زمینی رنده‌شده را اضافه کنید تا غذا غلیظ شود.",
                "نمک و فلفل را اضافه کرده و اجازه دهید غذا جا بیفتد.",
                "عدسی را همراه آبلیمو و نان سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("عدس", "۱", IngredientUnit.CUP),
                Ingredients("قارچ", "۱۵۰", IngredientUnit.GRAM),
                Ingredients("سیب‌زمینی", "۱", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("آبلیمو", "۱", IngredientUnit.TABLESPOON),
                Ingredients("آب", "۴", IngredientUnit.CUP)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 140,
            image = Res.drawable.food6,
            title = "سینی صبحانه انگلیسی",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "لوبیا پخته را همراه کمی سس گوجه داخل قابلمه گرم کنید.",
                "قارچ‌ها را ورقه‌ای خرد کرده و با کره تفت دهید.",
                "گوجه‌فرنگی را از وسط نصف کرده و در تابه گریل کنید.",
                "بیکن یا ژامبون را در تابه سرخ کنید.",
                "سوسیس‌ها را نیز جداگانه سرخ کنید.",
                "تخم‌مرغ را به صورت نیمرو آماده کنید.",
                "نان تست را برشته کنید.",
                "تمام مواد را در یک بشقاب بزرگ کنار هم بچینید.",
                "صبحانه را گرم سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("سوسیس", "۲", IngredientUnit.PIECE),
                Ingredients("لوبیا پخته", "نصف", IngredientUnit.CUP),
                Ingredients("قارچ", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("گوجه‌فرنگی", "۱", IngredientUnit.PIECE),
                Ingredients("نان تست", "۲", IngredientUnit.PIECE),
                Ingredients("ژامبون", "۲", IngredientUnit.PIECE)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 141,
            image = Res.drawable.food1,
            title = "گرانولا خانگی",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "فر را روی دمای ۱۶۰ درجه سانتی‌گراد گرم کنید.",
                "جو دوسر پرک را داخل کاسه بزرگی بریزید.",
                "گردو، بادام و تخمه آفتابگردان را خرد کنید.",
                "مغزها را به جو دوسر اضافه کنید.",
                "عسل و روغن را مخلوط کرده و روی مواد بریزید.",
                "دارچین را اضافه کنید و همه مواد را هم بزنید.",
                "مخلوط را روی سینی فر که کاغذ روغنی دارد پخش کنید.",
                "حدود ۲۰ تا ۲۵ دقیقه بپزید و در میانه پخت هم بزنید.",
                "پس از خنک شدن، کشمش را اضافه کنید.",
                "گرانولا را همراه شیر یا ماست سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("جو دوسر پرک", "۲", IngredientUnit.CUP),
                Ingredients("گردو", "نصف", IngredientUnit.CUP),
                Ingredients("بادام", "نصف", IngredientUnit.CUP),
                Ingredients("تخمه آفتابگردان", "۲", IngredientUnit.TABLESPOON),
                Ingredients("عسل", "۳", IngredientUnit.TABLESPOON),
                Ingredients("کشمش", "نصف", IngredientUnit.CUP),
                Ingredients("روغن", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("دارچین", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 142,
            image = Res.drawable.food2,
            title = "نیمرو با پنیر",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "مقداری کره یا روغن داخل تابه بریزید.",
                "تابه را روی حرارت ملایم قرار دهید.",
                "تخم‌مرغ‌ها را داخل تابه بشکنید.",
                "کمی نمک و فلفل اضافه کنید.",
                "پنیر خردشده را اطراف زرده‌ها بریزید.",
                "درب تابه را بگذارید تا سفیده‌ها بپزند و پنیر کمی ذوب شود.",
                "در صورت تمایل کمی آویشن روی تخم‌مرغ‌ها بپاشید.",
                "نیمرو را همراه نان تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("پنیر سفید", "۵۰", IngredientUnit.GRAM),
                Ingredients("کره", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("آویشن", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 143,
            image = Res.drawable.food3,
            title = "فرنی",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "آرد برنج را داخل قابلمه بریزید.",
                "شیر سرد را کم‌کم اضافه کنید و هم بزنید تا آرد کاملاً حل شود.",
                "قابلمه را روی حرارت ملایم قرار دهید.",
                "مواد را مرتب هم بزنید تا گلوله نشوند.",
                "شکر را اضافه کنید.",
                "گلاب را به مواد اضافه کنید.",
                "اجازه دهید فرنی به غلظت مناسب برسد.",
                "فرنی را داخل کاسه‌های سرو بریزید.",
                "پس از کمی خنک شدن با دارچین و خلال پسته تزیین کنید."
            ),
            ingredients = listOf(
                Ingredients("شیر", "۲", IngredientUnit.CUP),
                Ingredients("آرد برنج", "۲", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "۳", IngredientUnit.TABLESPOON),
                Ingredients("گلاب", "۲", IngredientUnit.TABLESPOON),
                Ingredients("خلال پسته", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("هل", "یک چهارم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 144,
            image = Res.drawable.food4,
            title = "حلیم بادمجان صبحانه",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "بادمجان‌ها را پوست گرفته و سرخ کنید.",
                "برنج را بشویید و همراه آب داخل قابلمه بپزید.",
                "گوشت را با پیاز و کمی آب بپزید.",
                "گوشت پخته‌شده را ریش‌ریش کنید.",
                "بادمجان‌های سرخ‌شده را له کنید.",
                "بادمجان و گوشت را به برنج اضافه کنید.",
                "کشک را اضافه کرده و مواد را مخلوط کنید.",
                "مواد را با حرارت ملایم بپزید و مرتب هم بزنید.",
                "پس از رسیدن به غلظت مناسب، غذا را با نعناع داغ و پیازداغ تزیین کنید."
            ),
            ingredients = listOf(
                Ingredients("بادمجان", "۳", IngredientUnit.PIECE),
                Ingredients("گوشت گوسفندی", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("برنج", "نصف", IngredientUnit.CUP),
                Ingredients("کشک", "نصف", IngredientUnit.CUP),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("نعناع خشک", "۱", IngredientUnit.TABLESPOON)
            )
        ),

        recipe(
            id = 145,
            image = Res.drawable.food5,
            title = "ساندویچ تخم‌مرغ",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "تخم‌مرغ‌ها را داخل قابلمه آب‌پز کنید.",
                "پس از خنک شدن، پوست تخم‌مرغ‌ها را جدا کنید.",
                "تخم‌مرغ‌ها را با چنگال له کنید.",
                "خیارشور را ریز خرد کنید.",
                "تخم‌مرغ، خیارشور و سس مایونز را مخلوط کنید.",
                "نمک و فلفل را اضافه کنید.",
                "مخلوط را روی نان ساندویچی پخش کنید.",
                "کاهو و گوجه‌فرنگی را اضافه کنید.",
                "ساندویچ را برش زده و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("نان ساندویچی", "۲", IngredientUnit.PIECE),
                Ingredients("خیارشور", "۲", IngredientUnit.PIECE),
                Ingredients("سس مایونز", "۲", IngredientUnit.TABLESPOON),
                Ingredients("کاهو", "۲", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "۱", IngredientUnit.PIECE)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 146,
            image = Res.drawable.food6,
            title = "املت اسفناج",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "اسفناج‌ها را پاک کرده و بشویید.",
                "اسفناج را خرد کنید.",
                "پیاز را نگینی خرد کرده و با روغن تفت دهید.",
                "اسفناج را اضافه کنید و اجازه دهید نرم شود.",
                "تخم‌مرغ‌ها را داخل کاسه بشکنید و هم بزنید.",
                "تخم‌مرغ را به اسفناج اضافه کنید.",
                "پنیر فتا را خرد کرده و روی مواد بریزید.",
                "درب تابه را بگذارید تا تخم‌مرغ‌ها بپزند.",
                "املت را گرم سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("اسفناج", "۲", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("پنیر فتا", "۵۰", IngredientUnit.GRAM),
                Ingredients("روغن", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("جوز هندی", "یک چهارم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 147,
            image = Res.drawable.food1,
            title = "وافل خانگی",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "آرد، شکر و بیکینگ‌پودر را داخل کاسه مخلوط کنید.",
                "تخم‌مرغ، شیر و کره ذوب‌شده را در ظرف دیگری هم بزنید.",
                "مواد تر را به مواد خشک اضافه کنید.",
                "مواد را مخلوط کنید تا مایه‌ای یکدست ایجاد شود.",
                "دستگاه وافل‌ساز را گرم کرده و کمی چرب کنید.",
                "مقداری از مایه را داخل دستگاه بریزید.",
                "درب دستگاه را ببندید و اجازه دهید وافل طلایی شود.",
                "وافل را با احتیاط خارج کنید.",
                "با عسل، توت‌فرنگی و خامه تزیین و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("آرد سفید", "۱", IngredientUnit.CUP),
                Ingredients("شیر", "۳", IngredientUnit.QUARTER_CUP),
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("شکر", "۲", IngredientUnit.TABLESPOON),
                Ingredients("کره ذوب‌شده", "۳", IngredientUnit.TABLESPOON),
                Ingredients("بیکینگ‌پودر", "۱", IngredientUnit.TEASPOON)
            ),
            spices = listOf(
                Spices("وانیل", "نصف", IngredientUnit.TEASPOON)
            )
        )
    )

    // 11. غذاهای دریایی — 9 غذا
    val seafoodRecipes = listOf(
        recipe(
            id = 148,
            image = Res.drawable.food1,
            title = "قلیه ماهی",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "ماهی را پاک کرده و به قطعات متوسط تقسیم کنید.",
                "سبزی قلیه شامل گشنیز و شنبلیله را ریز خرد کنید.",
                "پیاز را نگینی خرد کرده و در قابلمه تفت دهید.",
                "سیر خردشده را اضافه کنید و کمی تفت دهید.",
                "سبزی خردشده را اضافه کنید و اجازه دهید کاملاً سرخ شود.",
                "زردچوبه و فلفل را اضافه کنید.",
                "تمر هندی را با آب گرم مخلوط کرده و از صافی عبور دهید.",
                "عصاره تمر هندی را به سبزی اضافه کنید.",
                "ماهی را داخل قابلمه قرار دهید.",
                "اجازه دهید خورش حدود ۳۰ تا ۴۰ دقیقه با حرارت ملایم بپزد.",
                "قلیه ماهی را همراه برنج سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("ماهی بدون استخوان", "۵۰۰", IngredientUnit.GRAM),
                Ingredients("گشنیز", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("شنبلیله", "۵۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("سیر", "۵", IngredientUnit.PIECE),
                Ingredients("تمر هندی", "۱۰۰", IngredientUnit.GRAM),
                Ingredients("آب", "۲", IngredientUnit.CUP),
                Ingredients("روغن", "۴", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل قرمز", "۱", IngredientUnit.TEASPOON),
                Spices("نمک", "به مقدار لازم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 149,
            image = Res.drawable.food2,
            title = "ماهی سرخ‌شده",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "ماهی را پاک کرده و به قطعات دلخواه برش دهید.",
                "ماهی را با آبلیمو، نمک و فلفل مزه‌دار کنید.",
                "اجازه دهید ماهی حدود ۳۰ دقیقه در یخچال استراحت کند.",
                "آرد را با زردچوبه و پودر سیر مخلوط کنید.",
                "تکه‌های ماهی را داخل مخلوط آرد بغلتانید.",
                "روغن را داخل تابه گرم کنید.",
                "ماهی‌ها را داخل روغن قرار دهید.",
                "هر طرف را حدود ۵ تا ۷ دقیقه سرخ کنید تا طلایی و مغزپخت شوند.",
                "ماهی را روی دستمال قرار دهید تا روغن اضافی گرفته شود.",
                "با برش لیمو و سبزی تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("فیله ماهی", "۵۰۰", IngredientUnit.GRAM),
                Ingredients("آرد سفید", "نصف", IngredientUnit.CUP),
                Ingredients("آبلیمو", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۴", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 150,
            image = Res.drawable.food3,
            title = "میگو پلو",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "برنج را بشویید و برای مدتی در آب و نمک خیس کنید.",
                "میگوها را پاک کرده و رگ پشت آن‌ها را خارج کنید.",
                "پیاز را نگینی خرد کرده و در روغن تفت دهید.",
                "سیر خردشده را به پیاز اضافه کنید.",
                "میگوها را اضافه کرده و چند دقیقه تفت دهید.",
                "رب گوجه‌فرنگی و ادویه‌ها را اضافه کنید.",
                "سبزی پلویی خردشده را به مواد اضافه کنید.",
                "برنج را در آب جوش نیم‌پز کرده و آبکش کنید.",
                "برنج و مخلوط میگو را به صورت لایه‌ای داخل قابلمه بریزید.",
                "اجازه دهید پلو حدود ۴۰ دقیقه دم بکشد.",
                "میگو پلو را با لیموترش تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("میگو پاک‌شده", "۴۰۰", IngredientUnit.GRAM),
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("سیر", "۳", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۲", IngredientUnit.TABLESPOON),
                Ingredients("سبزی پلویی", "۱", IngredientUnit.CUP),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل قرمز", "نصف", IngredientUnit.TEASPOON),
                Spices("ادویه کاری", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 151,
            image = Res.drawable.food4,
            title = "میگو سوخاری",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "میگوها را پاک کرده و بشویید.",
                "میگو را با آبلیمو، نمک و فلفل مزه‌دار کنید.",
                "تخم‌مرغ‌ها را داخل کاسه شکسته و هم بزنید.",
                "آرد سفید و پودر سوخاری را در دو ظرف جداگانه بریزید.",
                "هر میگو را ابتدا داخل آرد بغلتانید.",
                "سپس آن را به تخم‌مرغ آغشته کنید.",
                "در مرحله آخر میگو را داخل پودر سوخاری بغلتانید.",
                "روغن را داخل قابلمه یا سرخ‌کن گرم کنید.",
                "میگوها را در روغن داغ سرخ کنید تا طلایی شوند.",
                "میگو سوخاری را با سس دلخواه و لیمو سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("میگو پاک‌شده", "۵۰۰", IngredientUnit.GRAM),
                Ingredients("آرد سفید", "نصف", IngredientUnit.CUP),
                Ingredients("پودر سوخاری", "۱", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("آبلیمو", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۲", IngredientUnit.CUP)
            ),
            spices = listOf(
                Spices("پودر سیر", "۱", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 152,
            image = Res.drawable.food5,
            title = "تن ماهی با سیب‌زمینی",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "سیب‌زمینی‌ها را پوست گرفته و نگینی خرد کنید.",
                "سیب‌زمینی را در آب و نمک بپزید تا نرم شود.",
                "پیاز را نگینی خرد کرده و در تابه تفت دهید.",
                "سیر خردشده را اضافه کنید.",
                "تن ماهی را طبق دستور روی بسته‌بندی حرارت دهید.",
                "روغن اضافی تن ماهی را جدا کنید.",
                "تن ماهی را به پیاز و سیر اضافه کنید.",
                "سیب‌زمینی پخته را به مواد اضافه کنید.",
                "آبلیمو و ادویه‌ها را اضافه کرده و مخلوط کنید.",
                "مواد را چند دقیقه روی حرارت ملایم قرار دهید.",
                "غذا را با جعفری خردشده تزیین و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("تن ماهی", "۱", IngredientUnit.PIECE),
                Ingredients("سیب‌زمینی", "۳", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("سیر", "۲", IngredientUnit.PIECE),
                Ingredients("آبلیمو", "۱", IngredientUnit.TABLESPOON),
                Ingredients("جعفری", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 153,
            image = Res.drawable.food6,
            title = "ماهی شکم‌پر",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "ماهی را پاک کرده و داخل شکم آن را کاملاً تمیز کنید.",
                "ماهی را با نمک، فلفل و آبلیمو مزه‌دار کنید.",
                "پیاز را نگینی خرد کرده و تفت دهید.",
                "سیر خردشده و سبزی معطر شامل گشنیز و جعفری را اضافه کنید.",
                "گردوی خردشده، رب انار و زرشک را به مواد اضافه کنید.",
                "مواد را چند دقیقه تفت دهید تا طعم‌ها ترکیب شوند.",
                "داخل شکم ماهی را با مواد آماده‌شده پر کنید.",
                "دهانه شکم ماهی را با خلال دندان یا نخ مخصوص آشپزی ببندید.",
                "ماهی را داخل سینی فر چرب‌شده قرار دهید.",
                "روی ماهی کمی روغن و آبلیمو بمالید.",
                "در دمای ۱۸۰ درجه حدود ۴۵ تا ۶۰ دقیقه بپزید تا کاملاً مغزپخت شود."
            ),
            ingredients = listOf(
                Ingredients("ماهی کامل", "۱", IngredientUnit.PIECE),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("سیر", "۴", IngredientUnit.PIECE),
                Ingredients("گشنیز خردشده", "۱", IngredientUnit.CUP),
                Ingredients("جعفری خردشده", "نصف", IngredientUnit.CUP),
                Ingredients("گردوی خردشده", "نصف", IngredientUnit.CUP),
                Ingredients("رب انار", "۲", IngredientUnit.TABLESPOON),
                Ingredients("زرشک", "۲", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 154,
            image = Res.drawable.food1,
            title = "خوراک میگو و سبزیجات",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "میگوها را پاک کرده و بشویید.",
                "کدو، هویج و فلفل دلمه‌ای را به قطعات کوچک خرد کنید.",
                "پیاز را خلالی خرد کرده و در تابه تفت دهید.",
                "سیر خردشده را اضافه کنید.",
                "هویج را اضافه کرده و چند دقیقه تفت دهید.",
                "کدو و فلفل دلمه‌ای را به مواد اضافه کنید.",
                "میگوها را اضافه کرده و مواد را مخلوط کنید.",
                "سس سویا و آبلیمو را اضافه کنید.",
                "مواد را روی حرارت نسبتاً زیاد تفت دهید تا میگوها کاملاً بپزند.",
                "کنجد و جعفری خردشده را اضافه کنید.",
                "خوراک را گرم و همراه برنج یا نان سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("میگو پاک‌شده", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("کدو سبز", "۱", IngredientUnit.PIECE),
                Ingredients("هویج", "۱", IngredientUnit.PIECE),
                Ingredients("فلفل دلمه‌ای", "۱", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("سیر", "۲", IngredientUnit.PIECE),
                Ingredients("سس سویا", "۲", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "۱", IngredientUnit.TABLESPOON),
                Ingredients("کنجد", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "۱", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 155,
            image = Res.drawable.food2,
            title = "ماهی کبابی",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "ماهی را پاک کرده و سطح آن را چند برش کم‌عمق بزنید.",
                "آبلیمو، روغن زیتون، سیر خردشده و ادویه‌ها را مخلوط کنید.",
                "ماهی را به مواد آغشته کنید.",
                "اجازه دهید ماهی حدود ۳۰ دقیقه مزه‌دار شود.",
                "گریل یا تابه گریل را از قبل گرم کنید.",
                "ماهی را روی گریل قرار دهید.",
                "هر طرف را متناسب با ضخامت ماهی بپزید.",
                "در طول پخت کمی از مخلوط آبلیمو و روغن روی ماهی بمالید.",
                "وقتی گوشت ماهی مات شد و به‌راحتی با چنگال جدا شد، آن را از حرارت بردارید.",
                "ماهی کبابی را با لیموترش و سبزی تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("ماهی کامل یا فیله", "۵۰۰", IngredientUnit.GRAM),
                Ingredients("آبلیمو", "۳", IngredientUnit.TABLESPOON),
                Ingredients("روغن زیتون", "۲", IngredientUnit.TABLESPOON),
                Ingredients("سیر", "۳", IngredientUnit.PIECE),
                Ingredients("لیموترش", "۱", IngredientUnit.PIECE)
            ),
            spices = listOf(
                Spices("پاپریکا", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 156,
            image = Res.drawable.food3,
            title = "سوپ میگو",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "میگوها را پاک کرده و به قطعات کوچک تقسیم کنید.",
                "پیاز را نگینی خرد کرده و در قابلمه تفت دهید.",
                "سیر خردشده را اضافه کنید.",
                "هویج و کرفس را خرد کرده و به پیاز اضافه کنید.",
                "مواد را چند دقیقه تفت دهید.",
                "آب یا آب سبزیجات را به قابلمه اضافه کنید.",
                "اجازه دهید سبزیجات حدود ۱۵ دقیقه بپزند.",
                "میگوها را اضافه کنید.",
                "ذرت و جعفری خردشده را به سوپ اضافه کنید.",
                "اجازه دهید سوپ چند دقیقه دیگر بپزد تا میگوها کاملاً پخته شوند.",
                "آبلیمو و ادویه‌ها را اضافه کرده و سوپ را گرم سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("میگو پاک‌شده", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("هویج", "۲", IngredientUnit.PIECE),
                Ingredients("کرفس", "۱", IngredientUnit.STALK),
                Ingredients("ذرت", "نصف", IngredientUnit.CUP),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("سیر", "۲", IngredientUnit.PIECE),
                Ingredients("آب", "۵", IngredientUnit.CUP),
                Ingredients("جعفری", "۲", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("آویشن", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 157,
            image = Res.drawable.food4,
            title = "پاستا با میگو",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "پاستا را در آب جوش و نمک بپزید و سپس آبکش کنید.",
                "میگوها را پاک کرده و خشک کنید.",
                "سیر را ریز خرد کنید.",
                "کره را داخل تابه ذوب کرده و سیر را کمی تفت دهید.",
                "میگوها را اضافه کنید و چند دقیقه بپزید تا کاملاً صورتی و مغزپخت شوند.",
                "خامه را اضافه کرده و حرارت را ملایم کنید.",
                "پنیر پارمزان را به سس اضافه کنید.",
                "فلفل سیاه و جعفری خردشده را اضافه کنید.",
                "پاستای آبکش‌شده را داخل تابه بریزید.",
                "مواد را مخلوط کنید تا سس به تمام پاستا برسد.",
                "پاستا را گرم و همراه پنیر پارمزان سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("پاستا", "۲۵۰", IngredientUnit.GRAM),
                Ingredients("میگو پاک‌شده", "۲۵۰", IngredientUnit.GRAM),
                Ingredients("خامه", "نصف", IngredientUnit.CUP),
                Ingredients("کره", "۲", IngredientUnit.TABLESPOON),
                Ingredients("سیر", "۳", IngredientUnit.PIECE),
                Ingredients("پنیر پارمزان", "نصف", IngredientUnit.CUP),
                Ingredients("جعفری", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("آویشن", "نصف", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 158,
            image = Res.drawable.food5,
            title = "ماهی با سس لیمو و کره",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "فیله ماهی را با دستمال خشک کنید.",
                "روی ماهی نمک و فلفل بپاشید.",
                "مقداری روغن زیتون داخل تابه گرم کنید.",
                "فیله‌ها را داخل تابه قرار دهید و هر طرف را حدود ۴ تا ۵ دقیقه بپزید.",
                "ماهی را از تابه خارج کرده و کنار بگذارید.",
                "کره را داخل همان تابه ذوب کنید.",
                "سیر خردشده را اضافه کرده و کمی تفت دهید.",
                "آبلیمو و جعفری خردشده را به سس اضافه کنید.",
                "سس را روی ماهی بریزید.",
                "ماهی را همراه سبزیجات بخارپز یا برنج سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("فیله ماهی", "۴۰۰", IngredientUnit.GRAM),
                Ingredients("کره", "۳", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "۲", IngredientUnit.TABLESPOON),
                Ingredients("سیر", "۲", IngredientUnit.PIECE),
                Ingredients("جعفری خردشده", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن زیتون", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("پاپریکا", "نصف", IngredientUnit.TEASPOON)
            )
        )
    )

    // 12. غذاهای سنتی — 16 غذا
    val traditionalRecipes = listOf(

        recipe(
            id = 148,
            image = Res.drawable.food1,
            title = "آبگوشت",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "نخود و لوبیا را از شب قبل خیس کنید.",
                "گوشت، نخود، لوبیا و پیاز را داخل قابلمه بریزید.",
                "زردچوبه و فلفل را اضافه کنید و چند لیوان آب بریزید.",
                "اجازه دهید مواد با حرارت ملایم بپزند تا گوشت و حبوبات کاملاً نرم شوند.",
                "سیب‌زمینی و گوجه‌فرنگی را اضافه کنید.",
                "رب گوجه‌فرنگی و نمک را اضافه کرده و اجازه دهید آبگوشت جا بیفتد.",
                "پس از پخت کامل، آب آبگوشت را جدا کرده و مواد باقی‌مانده را بکوبید."
            ),
            ingredients = listOf(
                Ingredients("گوشت گوسفندی با استخوان", "۴۰۰", IngredientUnit.GRAM),
                Ingredients("نخود", "نصف", IngredientUnit.CUP),
                Ingredients("لوبیا سفید", "نصف", IngredientUnit.CUP),
                Ingredients("سیب‌زمینی", "۳", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "۲", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "به مقدار لازم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 149,
            image = Res.drawable.food2,
            title = "کشک بادمجان",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "بادمجان‌ها را پوست بگیرید و از طول برش دهید.",
                "بادمجان‌ها را سرخ کنید یا با کمی روغن در فر بپزید.",
                "پیاز را خلالی خرد کرده و سرخ کنید.",
                "سیر خردشده را اضافه کرده و کمی تفت دهید.",
                "بادمجان‌ها را به همراه زردچوبه و فلفل به مواد اضافه کنید.",
                "بادمجان‌ها را با گوشت‌کوب له کنید.",
                "کشک را اضافه کرده و چند دقیقه روی حرارت ملایم بپزید.",
                "با نعناع داغ، پیاز داغ و گردو تزیین کنید."
            ),
            ingredients = listOf(
                Ingredients("بادمجان", "۵", IngredientUnit.PIECE),
                Ingredients("کشک", "۱", IngredientUnit.CUP),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("سیر", "۴", IngredientUnit.PIECE),
                Ingredients("گردو خردشده", "نصف", IngredientUnit.CUP),
                Ingredients("روغن", "۴", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نعناع خشک", "۲", IngredientUnit.TABLESPOON),
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "به مقدار لازم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 150,
            image = Res.drawable.food3,
            title = "میرزاقاسمی",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "بادمجان‌ها را روی شعله یا داخل فر کباب کنید تا کاملاً نرم شوند.",
                "پوست بادمجان‌ها را جدا کرده و گوشت آن‌ها را ساطوری کنید.",
                "گوجه‌فرنگی‌ها را پوست گرفته و خرد کنید.",
                "سیر را خرد کرده و با روغن تفت دهید.",
                "زردچوبه را اضافه کنید و سپس گوجه‌فرنگی را داخل تابه بریزید.",
                "بادمجان را اضافه کرده و اجازه دهید آب اضافی مواد تبخیر شود.",
                "تخم‌مرغ‌ها را اضافه کرده و هم بزنید تا کاملاً بپزند."
            ),
            ingredients = listOf(
                Ingredients("بادمجان", "۴", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "۳", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("سیر", "۵", IngredientUnit.PIECE),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "به مقدار لازم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 151,
            image = Res.drawable.food4,
            title = "کوفته تبریزی",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "لپه را بپزید تا نرم شود.",
                "برنج را نیم‌پز کرده و آبکش کنید.",
                "گوشت چرخ‌کرده، لپه، برنج و سبزی کوفته را با هم مخلوط کنید.",
                "پیاز رنده‌شده و ادویه‌ها را اضافه کرده و مواد را خوب ورز دهید.",
                "از مواد مقداری بردارید و داخل آن آلو، زرشک و گردو قرار دهید.",
                "کوفته‌ها را به شکل گرد و بزرگ فرم دهید.",
                "پیاز را تفت دهید و رب گوجه‌فرنگی و آب اضافه کنید.",
                "کوفته‌ها را با احتیاط داخل سس قرار دهید.",
                "با حرارت ملایم بپزید تا کوفته‌ها کاملاً مغزپخت شوند."
            ),
            ingredients = listOf(
                Ingredients("گوشت چرخ‌کرده", "۵۰۰", IngredientUnit.GRAM),
                Ingredients("لپه", "۱", IngredientUnit.CUP),
                Ingredients("برنج", "نصف", IngredientUnit.CUP),
                Ingredients("سبزی کوفته", "۱", IngredientUnit.CUP),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("آلو بخارا", "۶", IngredientUnit.PIECE),
                Ingredients("گردو", "نصف", IngredientUnit.CUP),
                Ingredients("زرشک", "۲", IngredientUnit.TABLESPOON),
                Ingredients("رب گوجه‌فرنگی", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "به مقدار لازم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 152,
            image = Res.drawable.food5,
            title = "دلمه برگ مو",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "برنج و لپه را جداگانه نیم‌پز کنید.",
                "پیاز را خرد کرده و با گوشت چرخ‌کرده تفت دهید.",
                "سبزی دلمه خردشده، برنج و لپه را اضافه کنید.",
                "رب گوجه‌فرنگی و ادویه‌ها را اضافه کرده و مواد را مخلوط کنید.",
                "برگ‌های مو را چند دقیقه در آب جوش قرار دهید تا نرم شوند.",
                "مقداری از مواد را وسط هر برگ قرار دهید و آن را بپیچید.",
                "دلمه‌ها را منظم داخل قابلمه بچینید.",
                "آب، آب‌لیمو و کمی شکر را مخلوط کرده و روی دلمه‌ها بریزید.",
                "با حرارت ملایم بپزید تا برگ‌ها نرم و مواد داخل دلمه کاملاً پخته شوند."
            ),
            ingredients = listOf(
                Ingredients("برگ مو", "۳۰", IngredientUnit.PIECE),
                Ingredients("گوشت چرخ‌کرده", "۲۵۰", IngredientUnit.GRAM),
                Ingredients("برنج", "نصف", IngredientUnit.CUP),
                Ingredients("لپه", "نصف", IngredientUnit.CUP),
                Ingredients("سبزی دلمه", "۱", IngredientUnit.CUP),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۱", IngredientUnit.TABLESPOON),
                Ingredients("آب‌لیمو", "۳", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "۱", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "به مقدار لازم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 153,
            image = Res.drawable.food6,
            title = "کله‌جوش",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "پیاز را خلالی خرد کرده و در روغن سرخ کنید.",
                "زردچوبه را اضافه کرده و کمی تفت دهید.",
                "گردوی خردشده را به پیاز اضافه کنید.",
                "کشک را با مقداری آب رقیق کرده و داخل قابلمه بریزید.",
                "مواد را روی حرارت ملایم هم بزنید تا گرم و یکدست شوند.",
                "نعناع خشک را جداگانه در روغن تفت دهید.",
                "نعناع داغ را به کله‌جوش اضافه کرده و پس از چند دقیقه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("کشک", "۲", IngredientUnit.CUP),
                Ingredients("گردو", "نصف", IngredientUnit.CUP),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نعناع خشک", "۲", IngredientUnit.TABLESPOON),
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "به مقدار لازم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 154,
            image = Res.drawable.food1,
            title = "اشکنه",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "پیاز را خرد کرده و در روغن تفت دهید.",
                "شنبلیله خشک را اضافه کرده و کمی تفت دهید.",
                "زردچوبه و آرد را اضافه کرده و هم بزنید.",
                "چند لیوان آب داخل قابلمه بریزید و اجازه دهید بجوشد.",
                "سیب‌زمینی خردشده را اضافه کنید.",
                "پس از نرم شدن سیب‌زمینی، تخم‌مرغ‌ها را داخل قابلمه بشکنید.",
                "اجازه دهید تخم‌مرغ‌ها کاملاً بپزند و اشکنه جا بیفتد."
            ),
            ingredients = listOf(
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("سیب‌زمینی", "۲", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("آرد", "۱", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("شنبلیله خشک", "۱", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "به مقدار لازم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 155,
            image = Res.drawable.food2,
            title = "آش رشته",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "نخود و لوبیا را از شب قبل خیس کرده و جداگانه بپزید.",
                "عدس را بشویید و همراه آب داخل قابلمه بریزید.",
                "نخود و لوبیای پخته را به عدس اضافه کنید.",
                "پیاز را خلالی خرد کرده و سرخ کنید.",
                "سبزی آش خردشده را به قابلمه اضافه کنید.",
                "پس از پخت سبزی، رشته آش را اضافه کنید.",
                "اجازه دهید رشته‌ها نرم شوند و آش به غلظت مناسب برسد.",
                "کشک، نعناع داغ و پیاز داغ را برای تزیین استفاده کنید."
            ),
            ingredients = listOf(
                Ingredients("نخود", "نصف", IngredientUnit.CUP),
                Ingredients("لوبیا چیتی", "نصف", IngredientUnit.CUP),
                Ingredients("عدس", "نصف", IngredientUnit.CUP),
                Ingredients("سبزی آش", "۵۰۰", IngredientUnit.GRAM),
                Ingredients("رشته آش", "۲۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۳", IngredientUnit.PIECE),
                Ingredients("کشک", "۱", IngredientUnit.CUP),
                Ingredients("روغن", "۴", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نعناع خشک", "۲", IngredientUnit.TABLESPOON),
                Spices("نمک", "به مقدار لازم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 156,
            image = Res.drawable.food3,
            title = "باقلاقاتق",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "باقالی رشتی را پوست گرفته و بشویید.",
                "سیر را خرد کرده و با روغن یا کره کمی تفت دهید.",
                "شوید خشک و زردچوبه را اضافه کنید.",
                "باقالی را داخل قابلمه بریزید و کمی تفت دهید.",
                "آب اضافه کنید و اجازه دهید باقالی‌ها نرم شوند.",
                "تخم‌مرغ‌ها را داخل قابلمه بشکنید.",
                "درب قابلمه را بگذارید تا تخم‌مرغ‌ها کاملاً بپزند."
            ),
            ingredients = listOf(
                Ingredients("باقالی رشتی", "۲", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("سیر", "۴", IngredientUnit.PIECE),
                Ingredients("شوید خشک", "۲", IngredientUnit.TABLESPOON),
                Ingredients("روغن یا کره", "۳", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "به مقدار لازم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 157,
            image = Res.drawable.food4,
            title = "شله‌قلمکار",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "گندم، نخود، لوبیا و عدس را از قبل خیس کنید.",
                "گوشت را با پیاز و زردچوبه بپزید تا کاملاً نرم و مغزپخت شود.",
                "حبوبات را جداگانه بپزید.",
                "گندم را با آب داخل قابلمه بپزید تا کاملاً نرم شود.",
                "حبوبات پخته را به گندم اضافه کنید.",
                "گوشت پخته را ریش‌ریش کرده و به آش اضافه کنید.",
                "سبزی آش را خرد کرده و داخل قابلمه بریزید.",
                "مواد را مرتب هم بزنید تا آش غلیظ و کشدار شود.",
                "با پیاز داغ و نعناع داغ تزیین کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت گوسفندی", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("گندم پوست‌کنده", "۱", IngredientUnit.CUP),
                Ingredients("نخود", "نصف", IngredientUnit.CUP),
                Ingredients("لوبیا چیتی", "نصف", IngredientUnit.CUP),
                Ingredients("عدس", "نصف", IngredientUnit.CUP),
                Ingredients("سبزی آش", "۴۰۰", IngredientUnit.GRAM),
                Ingredients("پیاز", "۳", IngredientUnit.PIECE),
                Ingredients("روغن", "۴", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "به مقدار لازم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 158,
            image = Res.drawable.food5,
            title = "ته‌چین گوشت",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "گوشت را با پیاز، زردچوبه و فلفل بپزید تا کاملاً نرم و مغزپخت شود.",
                "گوشت پخته را ریش‌ریش یا خرد کنید.",
                "ماست، زرده تخم‌مرغ و زعفران را مخلوط کنید.",
                "برنج را کمی زنده‌تر از حالت معمول آبکش کنید.",
                "برنج را با مخلوط ماست و زعفران ترکیب کنید.",
                "نیمی از برنج را در قابلمه چرب‌شده بریزید.",
                "گوشت را روی برنج پخش کرده و باقی برنج را اضافه کنید.",
                "قابلمه را روی حرارت ملایم قرار دهید تا ته‌چین کاملاً بپزد و طلایی شود."
            ),
            ingredients = listOf(
                Ingredients("برنج", "۳", IngredientUnit.CUP),
                Ingredients("گوشت گوسفندی", "۳۰۰", IngredientUnit.GRAM),
                Ingredients("ماست چکیده", "۱", IngredientUnit.CUP),
                Ingredients("زرده تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("پیاز", "۱", IngredientUnit.PIECE),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM),
                Ingredients("روغن", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زعفران دم‌کرده", "۳", IngredientUnit.TABLESPOON),
                Spices("زردچوبه", "نصف", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "به مقدار لازم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 159,
            image = Res.drawable.food6,
            title = "کوفته برنجی",
            chefName = "ترانه شریفی",
            cookingSteps = listOf(
                "برنج را نیم‌پز کرده و آبکش کنید.",
                "لپه را بپزید تا نرم شود.",
                "گوشت چرخ‌کرده را با برنج، لپه و سبزی معطر مخلوط کنید.",
                "پیاز رنده‌شده و ادویه‌ها را اضافه کرده و مواد را خوب ورز دهید.",
                "از مواد کوفته‌های گرد درست کنید.",
                "پیاز را تفت دهید و رب گوجه‌فرنگی و آب اضافه کنید.",
                "کوفته‌ها را با احتیاط داخل سس قرار دهید.",
                "با حرارت ملایم بپزید تا کوفته‌ها کاملاً مغزپخت شوند."
            ),
            ingredients = listOf(
                Ingredients("گوشت چرخ‌کرده", "۴۰۰", IngredientUnit.GRAM),
                Ingredients("برنج", "نصف", IngredientUnit.CUP),
                Ingredients("لپه", "نصف", IngredientUnit.CUP),
                Ingredients("سبزی معطر", "۱", IngredientUnit.CUP),
                Ingredients("پیاز", "۲", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "به مقدار لازم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 160,
            image = Res.drawable.food1,
            title = "آش دوغ",
            chefName = "سارا محمدی",
            cookingSteps = listOf(
                "نخود را از شب قبل خیس کرده و بپزید.",
                "برنج را بشویید و همراه کمی آب داخل قابلمه بریزید.",
                "سبزی آش خردشده را اضافه کنید.",
                "نخود پخته را به مواد اضافه کنید.",
                "دوغ را به‌آرامی اضافه کرده و مرتب هم بزنید تا نبرد.",
                "آش را روی حرارت ملایم بپزید تا برنج نرم و مواد یکدست شوند.",
                "سیر و نعناع را تفت دهید و برای تزیین استفاده کنید."
            ),
            ingredients = listOf(
                Ingredients("دوغ", "۱", IngredientUnit.LITER),
                Ingredients("نخود", "۱", IngredientUnit.CUP),
                Ingredients("برنج", "نصف", IngredientUnit.CUP),
                Ingredients("سبزی آش", "۴۰۰", IngredientUnit.GRAM),
                Ingredients("سیر", "۳", IngredientUnit.PIECE),
                Ingredients("روغن", "۲", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نعناع خشک", "۲", IngredientUnit.TABLESPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "به مقدار لازم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 161,
            image = Res.drawable.food2,
            title = "خوراک بادمجان گیلانی",
            chefName = "نگار رضایی",
            cookingSteps = listOf(
                "بادمجان‌ها را پوست گرفته و از طول برش دهید.",
                "بادمجان‌ها را در تابه سرخ کنید تا نرم و طلایی شوند.",
                "سیر را خرد کرده و با روغن تفت دهید.",
                "گوجه‌فرنگی خردشده را اضافه کنید.",
                "رب گوجه‌فرنگی و ادویه‌ها را اضافه کرده و اجازه دهید سس غلیظ شود.",
                "بادمجان‌های سرخ‌شده را داخل سس قرار دهید.",
                "در قابلمه را بگذارید و اجازه دهید مواد با حرارت ملایم جا بیفتند."
            ),
            ingredients = listOf(
                Ingredients("بادمجان", "۴", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "۳", IngredientUnit.PIECE),
                Ingredients("سیر", "۴", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "۱", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "۴", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "به مقدار لازم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 162,
            image = Res.drawable.food3,
            title = "باقالی‌قاتق با تخم‌مرغ",
            chefName = "الناز کریمی",
            cookingSteps = listOf(
                "باقالی رشتی را پوست گرفته و بشویید.",
                "سیر خردشده را در کره یا روغن کمی تفت دهید.",
                "شوید خشک و زردچوبه را اضافه کنید.",
                "باقالی را اضافه کرده و کمی تفت دهید.",
                "آب اضافه کنید و اجازه دهید باقالی‌ها کاملاً نرم شوند.",
                "تخم‌مرغ‌ها را روی مواد بشکنید.",
                "درب قابلمه را بگذارید تا تخم‌مرغ‌ها کاملاً ببندند و بپزند."
            ),
            ingredients = listOf(
                Ingredients("باقالی رشتی", "۲", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "۳", IngredientUnit.PIECE),
                Ingredients("سیر", "۴", IngredientUnit.PIECE),
                Ingredients("شوید خشک", "۲", IngredientUnit.TABLESPOON),
                Ingredients("کره", "۳۰", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "به مقدار لازم", IngredientUnit.TEASPOON)
            )
        ),

        recipe(
            id = 163,
            image = Res.drawable.food4,
            title = "ترش‌تره",
            chefName = "مریم احمدی",
            cookingSteps = listOf(
                "سبزی ترش‌تره را پاک کرده و ریز خرد کنید.",
                "سیر را خرد کرده و با روغن و زردچوبه تفت دهید.",
                "سبزی خردشده را اضافه کنید و کمی تفت دهید.",
                "برنج را شسته و همراه کمی آب به سبزی اضافه کنید.",
                "اجازه دهید مواد بپزند تا سبزی نرم و برنج کاملاً له شود.",
                "آب‌غوره یا آب نارنج را اضافه کنید.",
                "تخم‌مرغ‌ها را داخل قابلمه بشکنید و هم بزنید تا کاملاً بپزند.",
                "پس از جا افتادن خوراک، آن را با کته سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("سبزی ترش‌تره", "۵۰۰", IngredientUnit.GRAM),
                Ingredients("برنج", "نصف", IngredientUnit.CUP),
                Ingredients("سیر", "۵", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "۲", IngredientUnit.PIECE),
                Ingredients("آب‌غوره", "نصف", IngredientUnit.CUP),
                Ingredients("روغن", "۳", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("زردچوبه", "۱", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "نصف", IngredientUnit.TEASPOON),
                Spices("نمک", "به مقدار لازم", IngredientUnit.TEASPOON)
            )
        )
    )

    // دسته‌بندی‌های اصلی
    // این لیست را بعد از تعریف لیست غذاها قرار بده.
    val categoryRecipe = listOf(
        CategoryRecipe(
            id = 1,
            image = Res.drawable.food1,
            title = "خورشت‌ها",
            recipeCount = 24,
            recipeList = stewRecipes
        ),
        CategoryRecipe(
            id = 2,
            image = Res.drawable.food3,
            title = "غذاهای سنتی",
            recipeCount = 36,
            recipeList = traditionalRecipes
        ),
        CategoryRecipe(
            id = 3,
            image = Res.drawable.food2,
            title = "دسرها",
            recipeCount = 18,
            recipeList = dessertRecipes
        ),
        CategoryRecipe(
            id = 4,
            image = Res.drawable.food1,
            title = "کیک و شیرینی",
            recipeCount = 22,
            recipeList = cakeRecipes
        ),
        CategoryRecipe(
            id = 5,
            image = Res.drawable.food4,
            title = "غذاهای فوری",
            recipeCount = 15,
            recipeList = fastFoodRecipes
        ),
        CategoryRecipe(
            id = 6,
            image = Res.drawable.food2,
            title = "پلو و چلو",
            recipeCount = 28,
            recipeList = riceRecipes
        ),
        CategoryRecipe(
            id = 7,
            image = Res.drawable.food5,
            title = "غذاهای نونی",
            recipeCount = 20,
            recipeList = breadRecipes
        ),
        CategoryRecipe(
            id = 8,
            image = Res.drawable.food6,
            title = "سالادها",
            recipeCount = 12,
            recipeList = saladRecipes
        ),
        CategoryRecipe(
            id = 9,
            image = Res.drawable.food2,
            title = "نوشیدنی‌ها",
            recipeCount = 14,
            recipeList = drinkRecipes
        ),
        CategoryRecipe(
            id = 10,
            image = Res.drawable.food3,
            title = "غذاهای گیاهی",
            recipeCount = 16,
            recipeList = vegetarianRecipes
        ),
        CategoryRecipe(
            id = 11,
            image = Res.drawable.food4,
            title = "صبحانه",
            recipeCount = 19,
            recipeList = breakfastRecipes
        ),
        CategoryRecipe(
            id = 12,
            image = Res.drawable.food6,
            title = "غذاهای دریایی",
            recipeCount = 11,
            recipeList = seafoodRecipes
        )
    )
}