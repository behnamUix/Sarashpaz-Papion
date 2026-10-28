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
    // 1. سالادها — 15 غذا
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
        recipe(10, Res.drawable.food4, "سالاد چغندر", "الناز کریمی"),
        recipe(11, Res.drawable.food5, "سالاد اندونزی", "مریم احمدی"),
        recipe(12, Res.drawable.food6, "سالاد مرغ گریل", "سارا محمدی"),
        recipe(13, Res.drawable.food1, "سالاد آووکادو", "نگار رضایی"),
        recipe(14, Res.drawable.food2, "سالاد نخود", "ترانه شریفی"),
        recipe(15, Res.drawable.food3, "سالاد کینوا", "الناز کریمی")
    )

    // 2. خورشت‌ها — 18 غذا
    val stewRecipes = listOf(
        recipe(16, Res.drawable.food1, "قورمه‌سبزی", "مریم احمدی"),
        recipe(17, Res.drawable.food2, "قیمه سیب‌زمینی", "ترانه شریفی"),
        recipe(18, Res.drawable.food3, "فسنجان", "سارا محمدی"),
        recipe(19, Res.drawable.food4, "خورشت بادمجان", "نگار رضایی"),
        recipe(20, Res.drawable.food5, "خورشت کرفس", "الناز کریمی"),
        recipe(21, Res.drawable.food6, "آلو اسفناج", "مریم احمدی"),
        recipe(22, Res.drawable.food1, "خورشت به‌آلو", "ترانه شریفی"),
        recipe(23, Res.drawable.food2, "خورشت آلو مسما", "سارا محمدی"),
        recipe(24, Res.drawable.food3, "خورشت قیمه بادمجان", "نگار رضایی"),
        recipe(25, Res.drawable.food4, "خورشت لوبیا سبز", "الناز کریمی"),
        recipe(26, Res.drawable.food5, "خورشت هویج", "مریم احمدی"),
        recipe(27, Res.drawable.food6, "خورشت مرغ و آلو", "ترانه شریفی"),
        recipe(28, Res.drawable.food1, "خورشت کدو", "سارا محمدی"),
        recipe(29, Res.drawable.food2, "خورشت غوره بادمجان", "نگار رضایی"),
        recipe(30, Res.drawable.food3, "خورشت ریواس", "الناز کریمی"),
        recipe(31, Res.drawable.food4, "خورشت به", "مریم احمدی"),
        recipe(32, Res.drawable.food5, "خورشت خلال کرمانشاهی", "ترانه شریفی"),
        recipe(33, Res.drawable.food6, "خورشت تره", "سارا محمدی")
    )

    // 3. دسرها — 12 غذا
    val dessertRecipes = listOf(
        recipe(34, Res.drawable.food1, "تیرامیسو", "نگار رضایی"),
        recipe(35, Res.drawable.food2, "کرم کارامل", "الناز کریمی"),
        recipe(36, Res.drawable.food3, "پاناکوتا", "ترانه شریفی"),
        recipe(37, Res.drawable.food4, "ژله میوه‌ای", "مریم احمدی"),
        recipe(38, Res.drawable.food5, "پودینگ شکلاتی", "سارا محمدی"),
        recipe(39, Res.drawable.food6, "چیزکیک", "نگار رضایی"),
        recipe(40, Res.drawable.food1, "فرنی", "الناز کریمی"),
        recipe(41, Res.drawable.food2, "شله‌زرد", "ترانه شریفی"),
        recipe(42, Res.drawable.food3, "بستنی خانگی", "مریم احمدی"),
        recipe(43, Res.drawable.food4, "موس شکلاتی", "سارا محمدی"),
        recipe(44, Res.drawable.food5, "پارفه میوه", "نگار رضایی"),
        recipe(45, Res.drawable.food6, "دسر بیسکوییتی", "الناز کریمی")
    )

    // 4. کیک و شیرینی — 16 غذا
    val cakeRecipes = listOf(
        recipe(46, Res.drawable.food1, "کیک شکلاتی", "سارا محمدی"),
        recipe(47, Res.drawable.food2, "کیک هویج", "نگار رضایی"),
        recipe(48, Res.drawable.food3, "کیک اسفنجی", "الناز کریمی"),
        recipe(49, Res.drawable.food4, "کیک ردولوت", "ترانه شریفی"),
        recipe(50, Res.drawable.food5, "کیک موزی", "مریم احمدی"),
        recipe(51, Res.drawable.food6, "کیک قهوه", "سارا محمدی"),
        recipe(52, Res.drawable.food1, "کیک یزدی", "نگار رضایی"),
        recipe(53, Res.drawable.food2, "براونی", "الناز کریمی"),
        recipe(54, Res.drawable.food3, "کاپ‌کیک", "ترانه شریفی"),
        recipe(55, Res.drawable.food4, "شیرینی نخودچی", "مریم احمدی"),
        recipe(56, Res.drawable.food5, "کیک پرتقالی", "سارا محمدی"),
        recipe(57, Res.drawable.food6, "کیک ردولوت کوچک", "نگار رضایی"),
        recipe(58, Res.drawable.food1, "کوکی شکلاتی", "الناز کریمی"),
        recipe(59, Res.drawable.food2, "نان خامه‌ای", "ترانه شریفی"),
        recipe(60, Res.drawable.food3, "شیرینی دانمارکی", "مریم احمدی"),
        recipe(61, Res.drawable.food4, "تارت میوه", "سارا محمدی")
    )

    // 5. غذاهای فوری — 14 غذا
    val fastFoodRecipes = listOf(
        recipe(62, Res.drawable.food1, "پیتزا پپرونی", "علی رضایی"),
        recipe(63, Res.drawable.food2, "همبرگر خانگی", "امیر محمدی"),
        recipe(64, Res.drawable.food3, "هات‌داگ", "محمد کریمی"),
        recipe(65, Res.drawable.food4, "ساندویچ مرغ", "علی رضایی"),
        recipe(66, Res.drawable.food5, "لازانیا", "امیر محمدی"),
        recipe(67, Res.drawable.food6, "سیب‌زمینی تنوری", "محمد کریمی"),
        recipe(68, Res.drawable.food1, "ناگت مرغ", "علی رضایی"),
        recipe(69, Res.drawable.food2, "ساندویچ کلاب", "امیر محمدی"),
        recipe(70, Res.drawable.food3, "پیتزا سبزیجات", "محمد کریمی"),
        recipe(71, Res.drawable.food4, "تاکوی مرغ", "علی رضایی"),
        recipe(72, Res.drawable.food5, "رپ مرغ", "امیر محمدی"),
        recipe(73, Res.drawable.food6, "پنینی ژامبون", "محمد کریمی"),
        recipe(74, Res.drawable.food1, "ماکارونی فوری", "علی رضایی"),
        recipe(75, Res.drawable.food2, "کوئسادیای مرغ", "امیر محمدی")
    )

    // 6. پلو و چلو — 17 غذا
    val riceRecipes = listOf(
        recipe(76, Res.drawable.food1, "زرشک‌پلو با مرغ", "مریم احمدی"),
        recipe(77, Res.drawable.food2, "باقالی‌پلو با گوشت", "ترانه شریفی"),
        recipe(78, Res.drawable.food3, "عدس‌پلو", "سارا محمدی"),
        recipe(79, Res.drawable.food4, "لوبیاپلو", "نگار رضایی"),
        recipe(80, Res.drawable.food5, "استانبولی‌پلو", "الناز کریمی"),
        recipe(81, Res.drawable.food6, "ته‌چین مرغ", "مریم احمدی"),
        recipe(82, Res.drawable.food1, "کلم‌پلو شیرازی", "ترانه شریفی"),
        recipe(83, Res.drawable.food2, "سبزی‌پلو با ماهی", "سارا محمدی"),
        recipe(84, Res.drawable.food3, "شیرین‌پلو", "نگار رضایی"),
        recipe(85, Res.drawable.food4, "مرصع‌پلو", "الناز کریمی"),
        recipe(86, Res.drawable.food5, "آلبالوپلو", "مریم احمدی"),
        recipe(87, Res.drawable.food6, "هویج‌پلو", "ترانه شریفی"),
        recipe(88, Res.drawable.food1, "کته گوجه", "سارا محمدی"),
        recipe(89, Res.drawable.food2, "رشته‌پلو", "نگار رضایی"),
        recipe(90, Res.drawable.food3, "ماش‌پلو", "الناز کریمی"),
        recipe(91, Res.drawable.food4, "کینوا پلو", "مریم احمدی"),
        recipe(92, Res.drawable.food5, "چلو گوشت", "ترانه شریفی")
    )

    // 7. غذاهای نونی — 11 غذا
    val breadRecipes = listOf(
        recipe(93, Res.drawable.food1, "کوکو سیب‌زمینی", "مریم احمدی"),
        recipe(94, Res.drawable.food2, "کتلت", "ترانه شریفی"),
        recipe(95, Res.drawable.food3, "فلافل ساندویچی", "علی رضایی"),
        recipe(96, Res.drawable.food4, "شامی کباب", "سارا محمدی"),
        recipe(97, Res.drawable.food5, "خوراک مرغ", "نگار رضایی"),
        recipe(98, Res.drawable.food6, "تخم‌مرغ و سوسیس", "امیر محمدی"),
        recipe(99, Res.drawable.food1, "نان سیر", "الناز کریمی"),
        recipe(100, Res.drawable.food2, "کشک بادمجان", "مریم احمدی"),
        recipe(101, Res.drawable.food3, "میرزاقاسمی", "ترانه شریفی"),
        recipe(102, Res.drawable.food4, "خوراک لوبیا", "علی رضایی"),
        recipe(103, Res.drawable.food5, "خوراک قارچ و پنیر", "سارا محمدی")
    )

    // 8. نوشیدنی‌ها — 13 غذا
    val drinkRecipes = listOf(
        recipe(104, Res.drawable.food1, "اسموتی توت‌فرنگی", "نگار رضایی"),
        recipe(105, Res.drawable.food2, "لیموناد", "مریم احمدی"),
        recipe(106, Res.drawable.food3, "شیک شکلات", "ترانه شریفی"),
        recipe(107, Res.drawable.food4, "آیس‌کافی", "سارا محمدی"),
        recipe(108, Res.drawable.food5, "شربت زعفران", "الناز کریمی"),
        recipe(109, Res.drawable.food6, "موهیتو", "نگار رضایی"),
        recipe(110, Res.drawable.food1, "اسموتی موز", "مریم احمدی"),
        recipe(111, Res.drawable.food2, "شیر موز", "ترانه شریفی"),
        recipe(112, Res.drawable.food3, "چای ماسالا", "سارا محمدی"),
        recipe(113, Res.drawable.food4, "هات‌چاکلت", "الناز کریمی"),
        recipe(114, Res.drawable.food5, "شربت بهارنارنج", "نگار رضایی"),
        recipe(115, Res.drawable.food6, "آب هندوانه", "مریم احمدی"),
        recipe(116, Res.drawable.food1, "اسموتی انبه", "ترانه شریفی")
    )

    // 9. غذاهای گیاهی — 12 غذا
    val vegetarianRecipes = listOf(
        recipe(117, Res.drawable.food1, "خوراک سبزیجات", "سارا محمدی"),
        recipe(118, Res.drawable.food2, "بادمجان شکم‌پر", "مریم احمدی"),
        recipe(119, Res.drawable.food3, "فلافل", "علی رضایی"),
        recipe(120, Res.drawable.food4, "برگر گیاهی", "امیر محمدی"),
        recipe(121, Res.drawable.food5, "خوراک قارچ", "ترانه شریفی"),
        recipe(122, Res.drawable.food6, "دلمه سبزیجات", "نگار رضایی"),
        recipe(123, Res.drawable.food1, "کوکوسبزی", "سارا محمدی"),
        recipe(124, Res.drawable.food2, "خوراک لوبیا", "مریم احمدی"),
        recipe(125, Res.drawable.food3, "عدسی", "ترانه شریفی"),
        recipe(126, Res.drawable.food4, "کشک کدو", "نگار رضایی"),
        recipe(127, Res.drawable.food5, "خوراک عدس و قارچ", "الناز کریمی"),
        recipe(128, Res.drawable.food6, "خوراک نخود و سبزیجات", "سارا محمدی")
    )

    // 10. صبحانه — 10 غذا
    val breakfastRecipes = listOf(
        recipe(129, Res.drawable.food1, "املت گوجه", "مریم احمدی"),
        recipe(130, Res.drawable.food2, "نیمرو", "ترانه شریفی"),
        recipe(131, Res.drawable.food3, "پنکیک", "نگار رضایی"),
        recipe(132, Res.drawable.food4, "فرنچ تست", "الناز کریمی"),
        recipe(133, Res.drawable.food5, "عدسی", "سارا محمدی"),
        recipe(134, Res.drawable.food6, "حلیم", "مریم احمدی"),
        recipe(135, Res.drawable.food1, "اوتمیل", "ترانه شریفی"),
        recipe(136, Res.drawable.food2, "صبحانه انگلیسی", "نگار رضایی"),
        recipe(137, Res.drawable.food3, "کرپ صبحانه", "سارا محمدی"),
        recipe(138, Res.drawable.food4, "تست آووکادو", "الناز کریمی")
    )

    // 11. غذاهای دریایی — 9 غذا
    val seafoodRecipes = listOf(
        recipe(139, Res.drawable.food1, "قلیه‌ماهی", "علی رضایی"),
        recipe(140, Res.drawable.food2, "ماهی شکم‌پر", "مریم احمدی"),
        recipe(141, Res.drawable.food3, "میگوپلو", "ترانه شریفی"),
        recipe(142, Res.drawable.food4, "ماهی کبابی", "سارا محمدی"),
        recipe(143, Res.drawable.food5, "میگو سوخاری", "امیر محمدی"),
        recipe(144, Res.drawable.food6, "سبزی‌پلو با ماهی", "نگار رضایی"),
        recipe(145, Res.drawable.food1, "خوراک میگو", "علی رضایی"),
        recipe(146, Res.drawable.food2, "ماهی سرخ‌شده", "مریم احمدی"),
        recipe(147, Res.drawable.food3, "خوراک ماهی با سبزیجات", "ترانه شریفی")
    )

    // 12. غذاهای سنتی — 16 غذا
    val traditionalRecipes = listOf(
        recipe(148, Res.drawable.food1, "آبگوشت", "مریم احمدی"),
        recipe(149, Res.drawable.food2, "کشک بادمجان", "ترانه شریفی"),
        recipe(150, Res.drawable.food3, "میرزاقاسمی", "سارا محمدی"),
        recipe(151, Res.drawable.food4, "کوفته تبریزی", "نگار رضایی"),
        recipe(152, Res.drawable.food5, "دلمه برگ مو", "الناز کریمی"),
        recipe(153, Res.drawable.food6, "کله‌جوش", "مریم احمدی"),
        recipe(154, Res.drawable.food1, "اشکنه", "ترانه شریفی"),
        recipe(155, Res.drawable.food2, "آش رشته", "سارا محمدی"),
        recipe(156, Res.drawable.food3, "باقلاقاتق", "نگار رضایی"),
        recipe(157, Res.drawable.food4, "شله‌قلمکار", "الناز کریمی"),
        recipe(158, Res.drawable.food5, "ته‌چین گوشت", "مریم احمدی"),
        recipe(159, Res.drawable.food6, "کوفته برنجی", "ترانه شریفی"),
        recipe(160, Res.drawable.food1, "آش دوغ", "سارا محمدی"),
        recipe(161, Res.drawable.food2, "خوراک بادمجان گیلانی", "نگار رضایی"),
        recipe(162, Res.drawable.food3, "باقالی‌قاتق با تخم‌مرغ", "الناز کریمی"),
        recipe(163, Res.drawable.food4, "ترش‌تره", "مریم احمدی")
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