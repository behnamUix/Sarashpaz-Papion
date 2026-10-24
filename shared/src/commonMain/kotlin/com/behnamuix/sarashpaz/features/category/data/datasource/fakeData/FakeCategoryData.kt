package com.behnamuix.sarashpaz.features.category.data.datasource.fakeData

import com.behnamuix.sarashpaz.features.category.domain.model.CategoryRecipe
import com.behnamuix.sarashpaz.features.category.domain.model.RecipeModel
import org.jetbrains.compose.resources.DrawableResource
import sarashpaz.shared.generated.resources.Res
import sarashpaz.shared.generated.resources.food1
import sarashpaz.shared.generated.resources.food2
import sarashpaz.shared.generated.resources.food3
import sarashpaz.shared.generated.resources.food4
import sarashpaz.shared.generated.resources.food5
import sarashpaz.shared.generated.resources.food6


object FakeCategoryData {

    // برای جلوگیری از تکرار کد در ساخت آیتم‌های غذا
    private fun recipe(
        id: Int,
        image: DrawableResource,
        title: String,
        chefName: String
    ) = RecipeModel(
        id = id,
        image = image,
        title = title,
        chefName = chefName
    )

    // 1. سالادها
    val saladRecipes = listOf(
        recipe(1, Res.drawable.food1, "سالاد سزار", "ترانه شریفی"),
        recipe(2, Res.drawable.food2, "سالاد الویه", "مریم احمدی"),
        recipe(3, Res.drawable.food3, "سالاد شیرازی", "سارا محمدی"),
        recipe(4, Res.drawable.food4, "سالاد ماکارونی", "نگار رضایی"),
        recipe(5, Res.drawable.food5, "سالاد یونانی", "الناز کریمی"),
        recipe(6, Res.drawable.food6, "سالاد فصل", "ترانه شریفی"),
        recipe(7, Res.drawable.food1, "سالاد کلم", "مریم احمدی"),
        recipe(8, Res.drawable.food2, "سالاد تن ماهی", "سارا محمدی"),
        recipe(9, Res.drawable.food3, "سالاد اسفناج", "نگار رضایی"),
        recipe(10, Res.drawable.food4, "سالاد چغندر", "الناز کریمی")
    )

    // 2. خورشت‌ها
    val stewRecipes = listOf(
        recipe(11, Res.drawable.food1, "قورمه‌سبزی", "مریم احمدی"),
        recipe(12, Res.drawable.food2, "قیمه سیب‌زمینی", "ترانه شریفی"),
        recipe(13, Res.drawable.food3, "فسنجان", "سارا محمدی"),
        recipe(14, Res.drawable.food4, "خورشت بادمجان", "نگار رضایی"),
        recipe(15, Res.drawable.food5, "خورشت کرفس", "الناز کریمی"),
        recipe(16, Res.drawable.food6, "آلو اسفناج", "مریم احمدی"),
        recipe(17, Res.drawable.food1, "خورشت به‌آلو", "ترانه شریفی"),
        recipe(18, Res.drawable.food2, "خورشت آلو مسما", "سارا محمدی")
    )

    // 3. دسرها
    val dessertRecipes = listOf(
        recipe(19, Res.drawable.food1, "تیرامیسو", "نگار رضایی"),
        recipe(20, Res.drawable.food2, "کرم کارامل", "الناز کریمی"),
        recipe(21, Res.drawable.food3, "پاناکوتا", "ترانه شریفی"),
        recipe(22, Res.drawable.food4, "ژله میوه‌ای", "مریم احمدی"),
        recipe(23, Res.drawable.food5, "پودینگ شکلاتی", "سارا محمدی"),
        recipe(24, Res.drawable.food6, "چیزکیک", "نگار رضایی"),
        recipe(25, Res.drawable.food1, "فرنی", "الناز کریمی"),
        recipe(26, Res.drawable.food2, "شله‌زرد", "ترانه شریفی"),
        recipe(27, Res.drawable.food3, "بستنی خانگی", "مریم احمدی")
    )

    // 4. کیک و شیرینی
    val cakeRecipes = listOf(
        recipe(28, Res.drawable.food1, "کیک شکلاتی", "سارا محمدی"),
        recipe(29, Res.drawable.food2, "کیک هویج", "نگار رضایی"),
        recipe(30, Res.drawable.food3, "کیک اسفنجی", "الناز کریمی"),
        recipe(31, Res.drawable.food4, "کیک ردولوت", "ترانه شریفی"),
        recipe(32, Res.drawable.food5, "کیک موزی", "مریم احمدی"),
        recipe(33, Res.drawable.food6, "کیک قهوه", "سارا محمدی"),
        recipe(34, Res.drawable.food1, "کیک یزدی", "نگار رضایی"),
        recipe(35, Res.drawable.food2, "براونی", "الناز کریمی"),
        recipe(36, Res.drawable.food3, "کاپ‌کیک", "ترانه شریفی"),
        recipe(37, Res.drawable.food4, "شیرینی نخودچی", "مریم احمدی")
    )

    // 5. غذاهای فوری
    val fastFoodRecipes = listOf(
        recipe(47, Res.drawable.food1, "پیتزا پپرونی", "علی رضایی"),
        recipe(48, Res.drawable.food2, "همبرگر خانگی", "امیر محمدی"),
        recipe(49, Res.drawable.food3, "هات‌داگ", "محمد کریمی"),
        recipe(50, Res.drawable.food4, "ساندویچ مرغ", "علی رضایی"),
        recipe(51, Res.drawable.food5, "لازانیا", "امیر محمدی"),
        recipe(52, Res.drawable.food6, "سیب‌زمینی تنوری", "محمد کریمی"),
        recipe(53, Res.drawable.food1, "ناگت مرغ", "علی رضایی"),
        recipe(54, Res.drawable.food2, "ساندویچ کلاب", "امیر محمدی"),
        recipe(55, Res.drawable.food3, "پیتزا سبزیجات", "محمد کریمی")
    )

    // 6. پلو و چلو
    val riceRecipes = listOf(
        recipe(38, Res.drawable.food1, "زرشک‌پلو با مرغ", "مریم احمدی"),
        recipe(39, Res.drawable.food2, "باقالی‌پلو با گوشت", "ترانه شریفی"),
        recipe(40, Res.drawable.food3, "عدس‌پلو", "سارا محمدی"),
        recipe(41, Res.drawable.food4, "لوبیاپلو", "نگار رضایی"),
        recipe(42, Res.drawable.food5, "استانبولی‌پلو", "الناز کریمی"),
        recipe(43, Res.drawable.food6, "ته‌چین مرغ", "مریم احمدی"),
        recipe(44, Res.drawable.food1, "کلم‌پلو شیرازی", "ترانه شریفی"),
        recipe(45, Res.drawable.food2, "سبزی‌پلو با ماهی", "سارا محمدی"),
        recipe(46, Res.drawable.food3, "شیرین‌پلو", "نگار رضایی")
    )

    // 7. غذاهای نونی
    val breadRecipes = listOf(
        recipe(96, Res.drawable.food1, "کوکو سیب‌زمینی", "مریم احمدی"),
        recipe(97, Res.drawable.food2, "کتلت", "ترانه شریفی"),
        recipe(98, Res.drawable.food3, "فلافل ساندویچی", "علی رضایی"),
        recipe(99, Res.drawable.food4, "شامی کباب", "سارا محمدی"),
        recipe(100, Res.drawable.food5, "خوراک مرغ", "نگار رضایی"),
        recipe(101, Res.drawable.food6, "تخم‌مرغ و سوسیس", "امیر محمدی"),
        recipe(102, Res.drawable.food1, "نان سیر", "الناز کریمی")
    )

    // 8. نوشیدنی‌ها
    val drinkRecipes = listOf(
        recipe(73, Res.drawable.food1, "اسموتی توت‌فرنگی", "نگار رضایی"),
        recipe(74, Res.drawable.food2, "لیموناد", "مریم احمدی"),
        recipe(75, Res.drawable.food3, "شیک شکلات", "ترانه شریفی"),
        recipe(76, Res.drawable.food4, "آیس‌کافی", "سارا محمدی"),
        recipe(77, Res.drawable.food5, "شربت زعفران", "الناز کریمی"),
        recipe(78, Res.drawable.food6, "موهیتو", "نگار رضایی"),
        recipe(79, Res.drawable.food1, "اسموتی موز", "مریم احمدی"),
        recipe(80, Res.drawable.food2, "شیر موز", "ترانه شریفی")
    )

    // 9. غذاهای گیاهی
    val vegetarianRecipes = listOf(
        recipe(81, Res.drawable.food1, "خوراک سبزیجات", "سارا محمدی"),
        recipe(82, Res.drawable.food2, "بادمجان شکم‌پر", "مریم احمدی"),
        recipe(83, Res.drawable.food3, "فلافل", "علی رضایی"),
        recipe(84, Res.drawable.food4, "برگر گیاهی", "امیر محمدی"),
        recipe(85, Res.drawable.food5, "خوراک قارچ", "ترانه شریفی"),
        recipe(86, Res.drawable.food6, "دلمه سبزیجات", "نگار رضایی"),
        recipe(87, Res.drawable.food1, "کوکوسبزی", "سارا محمدی"),
        recipe(88, Res.drawable.food2, "خوراک لوبیا", "مریم احمدی")
    )

    // 10. صبحانه
    val breakfastRecipes = listOf(
        recipe(65, Res.drawable.food1, "املت گوجه", "مریم احمدی"),
        recipe(66, Res.drawable.food2, "نیمرو", "ترانه شریفی"),
        recipe(67, Res.drawable.food3, "پنکیک", "نگار رضایی"),
        recipe(68, Res.drawable.food4, "فرنچ تست", "الناز کریمی"),
        recipe(69, Res.drawable.food5, "عدسی", "سارا محمدی"),
        recipe(70, Res.drawable.food6, "حلیم", "مریم احمدی"),
        recipe(71, Res.drawable.food1, "اوتمیل", "ترانه شریفی"),
        recipe(72, Res.drawable.food2, "صبحانه انگلیسی", "نگار رضایی")
    )

    // 11. غذاهای دریایی
    val seafoodRecipes = listOf(
        recipe(89, Res.drawable.food1, "قلیه‌ماهی", "علی رضایی"),
        recipe(90, Res.drawable.food2, "ماهی شکم‌پر", "مریم احمدی"),
        recipe(91, Res.drawable.food3, "میگو پلو", "ترانه شریفی"),
        recipe(92, Res.drawable.food4, "ماهی کبابی", "سارا محمدی"),
        recipe(93, Res.drawable.food5, "میگو سوخاری", "امیر محمدی"),
        recipe(94, Res.drawable.food6, "سبزی‌پلو با ماهی", "نگار رضایی"),
        recipe(95, Res.drawable.food1, "خوراک میگو", "علی رضایی")
    )

    // 12. غذاهای سنتی
    val traditionalRecipes = listOf(
        recipe(56, Res.drawable.food1, "آبگوشت", "مریم احمدی"),
        recipe(57, Res.drawable.food2, "کشک بادمجان", "ترانه شریفی"),
        recipe(58, Res.drawable.food3, "میرزاقاسمی", "سارا محمدی"),
        recipe(59, Res.drawable.food4, "کوفته تبریزی", "نگار رضایی"),
        recipe(60, Res.drawable.food5, "دلمه برگ مو", "الناز کریمی"),
        recipe(61, Res.drawable.food6, "کله‌جوش", "مریم احمدی"),
        recipe(62, Res.drawable.food1, "اشکنه", "ترانه شریفی"),
        recipe(63, Res.drawable.food2, "آش رشته", "سارا محمدی"),
        recipe(64, Res.drawable.food3, "باقلاقاتق", "نگار رضایی")
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