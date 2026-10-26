package com.behnamuix.sarashpaz.features.home.data.datasource.fakeData

import com.behnamuix.sarashpaz.features.home.domain.model.article.Article
import com.behnamuix.sarashpaz.features.home.domain.model.interviewCustomer.ChefCustomer
import com.behnamuix.sarashpaz.features.home.domain.model.interviewCustomer.QAChefCustomer
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Recipe
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.RecipeDifficulty
import org.jetbrains.compose.resources.DrawableResource
import sarashpaz.shared.generated.resources.Res
import sarashpaz.shared.generated.resources.article1
import sarashpaz.shared.generated.resources.article10
import sarashpaz.shared.generated.resources.article2
import sarashpaz.shared.generated.resources.article3
import sarashpaz.shared.generated.resources.article4
import sarashpaz.shared.generated.resources.article5
import sarashpaz.shared.generated.resources.article6
import sarashpaz.shared.generated.resources.article7
import sarashpaz.shared.generated.resources.article8
import sarashpaz.shared.generated.resources.article9
import sarashpaz.shared.generated.resources.food1
import sarashpaz.shared.generated.resources.food2
import sarashpaz.shared.generated.resources.food3
import sarashpaz.shared.generated.resources.food4
import sarashpaz.shared.generated.resources.food5
import sarashpaz.shared.generated.resources.food6
import sarashpaz.shared.generated.resources.chef1
import sarashpaz.shared.generated.resources.chef2
import sarashpaz.shared.generated.resources.chef3
import sarashpaz.shared.generated.resources.chef4
import sarashpaz.shared.generated.resources.chef5


object FakeRecipeData {

    val chefs = listOf(

        ChefCustomer(
            id = 1,
            name = "ترانه شریفی",
            imageUrl = Res.drawable.chef1,
            registeredAt = "۱۴۰۵/۰۷/۲۵",
            q_a = listOf(
                QAChefCustomer(
                    question = "اولین غذایی که به‌تنهایی پختید چه بود؟",
                    answer = "کتلت بود؛ کمی سوخته شد، اما خانواده همه‌اش را خوردند!"
                ),
                QAChefCustomer(
                    question = "برای یک شام سریع چه پیشنهادی دارید؟",
                    answer = "املت گوجه با نان تازه و سبزی خوردن؛ ساده، خوشمزه و اقتصادی."
                )
            )
        ),

        ChefCustomer(
            id = 2,
            name = "بهار فرهمند",
            imageUrl = Res.drawable.chef2,
            registeredAt = "۱۴۰۵/۰۷/۲۴",
            q_a = listOf(
                QAChefCustomer(
                    question = "چطور برنج ایرانی را خوش‌عطرتر می‌کنید؟",
                    answer = "برنج باکیفیت انتخاب می‌کنم و در مراحل پخت از کمی زعفران دم‌کرده استفاده می‌کنم."
                ),
                QAChefCustomer(
                    question = "برای جا افتادن خورش چه نکته‌ای مهم است؟",
                    answer = "حرارت ملایم و زمان کافی؛ نباید برای پخت خورش عجله کرد."
                ),
                QAChefCustomer(
                    question = "غذای مورد علاقه شما برای مهمانی چیست؟",
                    answer = "باقالی‌پلو با ماهیچه؛ هم ظاهر مجلسی دارد و هم عطر فوق‌العاده‌ای."
                )
            )
        ),

        ChefCustomer(
            id = 3,
            name = "آناهیتا نیک‌روش",
            imageUrl = Res.drawable.chef3,
            registeredAt = "۱۴۰۵/۰۷/۲۳",
            q_a = listOf(
                QAChefCustomer(
                    question = "چطور غذاهای سالم را خوشمزه می‌کنید؟",
                    answer = "از سبزی‌های تازه، آب‌لیمو، ادویه‌های معطر و روش‌های پخت کم‌روغن استفاده می‌کنم."
                ),
                QAChefCustomer(
                    question = "برای جایگزین کردن نمک چه پیشنهادی دارید؟",
                    answer = "آب‌لیمو، سیر، سبزی‌های معطر و ادویه‌هایی مثل پاپریکا می‌توانند طعم غذا را بهتر کنند."
                ),
                QAChefCustomer(
                    question = "کدام وعده غذایی را مهم‌تر می‌دانید؟",
                    answer = "به نظرم مهم است که تمام وعده‌ها متناسب با نیاز بدن و سبک زندگی تنظیم شوند."
                ),
                QAChefCustomer(
                    question = "برای تهیه سالاد متفاوت چه کار می‌کنید؟",
                    answer = "ترکیب بافت‌های مختلف مثل مغزها، سبزیجات تازه و یک سس خانگی ساده را دوست دارم."
                )
            )
        ),

        ChefCustomer(
            id = 4,
            name = "نگار رستگار",
            imageUrl = Res.drawable.chef4,
            registeredAt = "۱۴۰۵/۰۷/۲۲",
            q_a = listOf(
                QAChefCustomer(
                    question = "راز یک کباب آبدار چیست؟",
                    answer = "انتخاب گوشت مناسب، ورز دادن اصولی و کنترل حرارت هنگام پخت."
                ),
                QAChefCustomer(
                    question = "برای مزه‌دار کردن مرغ از چه موادی استفاده می‌کنید؟",
                    answer = "پیاز، زعفران، کمی آب‌لیمو و ادویه‌های متناسب با نوع غذا."
                ),
                QAChefCustomer(
                    question = "چه اشتباهی ممکن است کباب را خشک کند؟",
                    answer = "حرارت نامناسب و پخت بیش از اندازه از دلایل رایج خشک شدن کباب هستند."
                ),
                QAChefCustomer(
                    question = "اگر گوشت بوی نامطبوع داشته باشد چه می‌کنید؟",
                    answer = "از گوشت مشکوک استفاده نمی‌کنم؛ ادویه و مواد طعم‌دهنده نمی‌توانند گوشت فاسد را ایمن کنند."
                ),
                QAChefCustomer(
                    question = "چه غذایی را برای دورهمی دوستانه پیشنهاد می‌دهید؟",
                    answer = "جوجه‌کباب همراه گوجه کبابی، نان تازه و چند نوع مخلفات."
                )
            )
        ),

        ChefCustomer(
            id = 5,
            name = "پرنیان دادخواه",
            imageUrl = Res.drawable.chef5,
            registeredAt = "۱۴۰۵/۰۷/۲۱",
            q_a = listOf(
                QAChefCustomer(
                    question = "برای تزیین حرفه‌ای دسر چه پیشنهادی دارید؟",
                    answer = "از میوه تازه، کمی پودر پسته و ظرف مناسب استفاده می‌کنم تا ظاهر دسر شلوغ نشود."
                ),
                QAChefCustomer(
                    question = "چرا بعضی کیک‌ها بعد از پخت می‌خوابند؟",
                    answer = "باز کردن زودهنگام در فر، اندازه‌گیری اشتباه مواد یا پخت ناکافی می‌تواند علت باشد."
                ),
                QAChefCustomer(
                    question = "دسر محبوب شما برای فصل تابستان چیست؟",
                    answer = "چیزکیک یخچالی با میوه‌های فصل؛ چون سبک و خنک است و آماده‌سازی ساده‌ای دارد."
                )
            )
        )
    )

    val articles = listOf(
        Article(
            id = 1,
            image = Res.drawable.article2,
            title = "چطور یک بشقاب غذای سالم بسازیم؟",
            subtitle = "با ترکیب سبزیجات، پروتئین و غلات کامل، وعده‌هایی متعادل و مغذی آماده کنید."
        ),
        Article(
            id = 2,
            image = Res.drawable.article10,
            title = "اهمیت نوشیدن آب در طول روز",
            subtitle = "با نوشیدن آب کافی به حفظ انرژی، تمرکز و عملکرد بهتر بدن کمک کنید."
        ),
        Article(
            id = 3,
            image = Res.drawable.article8,
            title = "صبحانه سالم برای شروع یک روز پرانرژی",
            subtitle = "با انتخاب تخم‌مرغ، نان سبوس‌دار، میوه و مغزها روز خود را با انرژی آغاز کنید."
        ),
        Article(
            id = 4,
            image = Res.drawable.article1,
            title = "چگونه مصرف قند را کاهش دهیم؟",
            subtitle = "با جایگزین کردن میوه‌های تازه و کاهش نوشیدنی‌های شیرین، عادت‌های غذایی سالم‌تری بسازید."
        ),
        Article(
            id = 5,
            image = Res.drawable.article7,
            title = "نقش پروتئین در سلامت بدن",
            subtitle = "با مصرف منابعی مانند تخم‌مرغ، حبوبات، ماهی و لبنیات به حفظ عضلات و ترمیم بافت‌ها کمک کنید."
        ),
        Article(
            id = 6,
            image = Res.drawable.article9,
            title = "فواید مصرف روزانه میوه و سبزیجات",
            subtitle = "ویتامین‌ها، مواد معدنی و فیبر موجود در میوه‌ها و سبزیجات به حفظ سلامت عمومی بدن کمک می‌کنند."
        ),
        Article(
            id = 7,
            image = Res.drawable.article3,
            title = "تغذیه سالم برای داشتن خواب بهتر",
            subtitle = "با تنظیم زمان شام و پرهیز از وعده‌های سنگین نزدیک خواب، شرایط بهتری برای استراحت فراهم کنید."
        ),
        Article(
            id = 8,
            image = Res.drawable.article4,
            title = "چربی‌های مفید را بشناسید",
            subtitle = "با مصرف متعادل روغن زیتون، گردو، دانه‌ها و ماهی، چربی‌های مفید را در رژیم غذایی خود بگنجانید."
        ),
        Article(
            id = 9,
            image = Res.drawable.article5,
            title = "چطور عادت‌های غذایی سالم بسازیم؟",
            subtitle = "با برنامه‌ریزی وعده‌ها، توجه به اندازه سهم غذا و انتخاب مواد غذایی متنوع، تغذیه خود را بهبود دهید."
        ),
        Article(
            id = 10,
            image = Res.drawable.article6,
            title = "اهمیت فیبر در رژیم غذایی",
            subtitle = "غلات کامل، حبوبات، میوه‌ها و سبزیجات منابع خوبی از فیبر هستند و به عملکرد بهتر دستگاه گوارش کمک می‌کنند."
        )
    )
    val recipes = listOf(
        createRecipe(
            id = "1",
            title = "زرشک پلو با مرغ",
            description = "زرشک پلوی مجلسی با مرغ زعفرانی و برنج ایرانی",
            categoryId = "iranian",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 60,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,
            rating = 4.9,
            ratingCount = 245,
            isFeatured = true,
            createdAt = "1405-07-22",
            tags = listOf("مجلسی", "مرغ", "برنج"),
            image = Res.drawable.food1


        ),
        createRecipe(
            id = "2",
            title = "سالاد سزار",
            description = "سالاد سزار با مرغ گریل‌شده و سس مخصوص",
            categoryId = "salad",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 15,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,
            rating = 4.8,
            ratingCount = 198,
            isFeatured = true,
            createdAt = "1405-06-15",
            tags = listOf("سالاد", "مرغ", "سریع"),
            image = Res.drawable.food2
        ),
        createRecipe(
            id = "3",
            title = "قورمه سبزی",
            description = "خورش قورمه سبزی جاافتاده با لوبیا و گوشت",
            categoryId = "iranian",
            cuisine = "ایرانی",
            preparationTimeMinutes = 30,
            cookingTimeMinutes = 150,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,
            rating = 4.9,
            ratingCount = 312,
            isFeatured = true,
            createdAt = "1405-05-10",
            tags = listOf("خورش", "سنتی", "ناهار"),
            image = Res.drawable.food3
        ),
        createRecipe(
            id = "4",
            title = "قیمه سیب‌زمینی",
            description = "خورش قیمه ایرانی با لپه و سیب‌زمینی سرخ‌شده",
            categoryId = "iranian",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 100,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,
            rating = 4.7,
            ratingCount = 176,
            isFeatured = false,
            createdAt = "1405-04-01",
            tags = listOf("خورش", "گوشت", "ناهار"),
            image = Res.drawable.food4
        ),
        createRecipe(
            id = "5",
            title = "ماکارونی با گوشت",
            description = "ماکارونی با سس گوشت و ادویه‌های خوش‌عطر",
            categoryId = "pasta",
            cuisine = "ایرانی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 35,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,
            rating = 4.6,
            ratingCount = 154,
            isFeatured = false,
            createdAt = "1405-03-15",
            tags = listOf("ماکارونی", "گوشت", "خانوادگی"),
            image = Res.drawable.food3

        ),
        createRecipe(
            id = "6",
            title = "کوکو سبزی",
            description = "کوکو سبزی خوش‌رنگ با سبزی تازه و گردو",
            categoryId = "quick",
            cuisine = "ایرانی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 20,
            servings = 3,
            difficulty = RecipeDifficulty.EASY,
            rating = 4.5,
            ratingCount = 121,
            isFeatured = false,
            createdAt = "1405-02-20",
            tags = listOf("گیاهی", "سریع", "شام"),
            image = Res.drawable.food2
        ),
        createRecipe(
            id = "7",
            title = "جوجه کباب",
            description = "جوجه کباب زعفرانی با مرغ مزه‌دارشده",
            categoryId = "grill",
            cuisine = "ایرانی",
            preparationTimeMinutes = 40,
            cookingTimeMinutes = 25,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,
            rating = 4.9,
            ratingCount = 287,
            isFeatured = true,
            createdAt = "1405-01-10",
            tags = listOf("کباب", "مرغ", "گریل"),
            image = Res.drawable.food3
        ),
        createRecipe(
            id = "8",
            title = "کباب کوبیده",
            description = "کباب کوبیده با گوشت چرخ‌کرده و پیاز",
            categoryId = "grill",
            cuisine = "ایرانی",
            preparationTimeMinutes = 35,
            cookingTimeMinutes = 20,
            servings = 4,
            difficulty = RecipeDifficulty.HARD,
            rating = 4.9,
            ratingCount = 301,
            isFeatured = false,
            createdAt = "1404-12-20",
            tags = listOf("کباب", "گوشت", "مجلسی"),
            image = Res.drawable.food4
        ),
        createRecipe(
            id = "9",
            title = "عدس پلو",
            description = "عدس پلو با کشمش و پیازداغ",
            categoryId = "iranian",
            cuisine = "ایرانی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 45,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,
            rating = 4.5,
            ratingCount = 112,
            isFeatured = false,
            createdAt = "1404-12-01",
            tags = listOf("برنج", "گیاهی", "اقتصادی"),
            image = Res.drawable.food2
        ),
        createRecipe(
            id = "10",
            title = "لوبیا پلو",
            description = "لوبیا پلوی خانگی با گوشت و رب گوجه",
            categoryId = "iranian",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 50,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,
            rating = 4.7,
            ratingCount = 184,
            isFeatured = true,
            createdAt = "1404-11-15",
            tags = listOf("برنج", "گوشت", "ناهار"),
            image = Res.drawable.food4
        ),
        createRecipe(
            id = "11",
            title = "ته‌چین مرغ",
            description = "ته‌چین مرغ زعفرانی با ماست و برنج",
            categoryId = "iranian",
            cuisine = "ایرانی",
            preparationTimeMinutes = 30,
            cookingTimeMinutes = 75,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,
            rating = 4.8,
            ratingCount = 218,
            isFeatured = true,
            createdAt = "1404-11-01",
            tags = listOf("ته‌چین", "مرغ", "مجلسی"),
            image = Res.drawable.food1
        ),
        createRecipe(
            id = "12",
            title = "آش رشته",
            description = "آش رشته سنتی با حبوبات، سبزی و کشک",
            categoryId = "soup",
            cuisine = "ایرانی",
            preparationTimeMinutes = 35,
            cookingTimeMinutes = 100,
            servings = 6,
            difficulty = RecipeDifficulty.MEDIUM,
            rating = 4.8,
            ratingCount = 209,
            isFeatured = false,
            createdAt = "1404-10-15",
            tags = listOf("آش", "سنتی", "گیاهی"),
            image = Res.drawable.food2
        ),
        createRecipe(
            id = "13",
            title = "کشک بادمجان",
            description = "کشک بادمجان با نعناع‌داغ و پیازداغ",
            categoryId = "appetizer",
            cuisine = "ایرانی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 35,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,
            rating = 4.7,
            ratingCount = 168,
            isFeatured = false,
            createdAt = "1404-10-01",
            tags = listOf("پیش‌غذا", "بادمجان", "گیاهی"),
            image = Res.drawable.food1
        ),
        createRecipe(
            id = "14",
            title = "میرزاقاسمی",
            description = "غذای شمالی با بادمجان کبابی، گوجه و تخم‌مرغ",
            categoryId = "northern",
            cuisine = "گیلانی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 30,
            servings = 3,
            difficulty = RecipeDifficulty.EASY,
            rating = 4.9,
            ratingCount = 233,
            isFeatured = true,
            createdAt = "1404-09-15",
            tags = listOf("شمالی", "گیلانی", "بادمجان"),
            image = Res.drawable.food2
        ),
        createRecipe(
            id = "15",
            title = "باقالی قاتق",
            description = "خورش گیلانی با باقالی، شوید و تخم‌مرغ",
            categoryId = "northern",
            cuisine = "گیلانی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 35,
            servings = 3,
            difficulty = RecipeDifficulty.EASY,
            rating = 4.8,
            ratingCount = 191,
            isFeatured = false,
            createdAt = "1404-09-01",
            tags = listOf("شمالی", "گیلانی", "گیاهی"),
            image = Res.drawable.food3
        ),
        createRecipe(
            id = "16",
            title = "فسنجان",
            description = "خورش فسنجان با گردو و رب انار",
            categoryId = "iranian",
            cuisine = "ایرانی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 150,
            servings = 4,
            difficulty = RecipeDifficulty.HARD,
            rating = 4.9,
            ratingCount = 265,
            isFeatured = true,
            createdAt = "1404-08-15",
            tags = listOf("خورش", "گردو", "مجلسی"),
            image = Res.drawable.food2
        ),
        createRecipe(
            id = "17",
            title = "دلمه برگ مو",
            description = "دلمه برگ مو با سبزی معطر، برنج و لپه",
            categoryId = "iranian",
            cuisine = "ایرانی",
            preparationTimeMinutes = 45,
            cookingTimeMinutes = 60,
            servings = 5,
            difficulty = RecipeDifficulty.HARD,
            rating = 4.6,
            ratingCount = 126,
            isFeatured = false,
            createdAt = "1404-08-01",
            tags = listOf("دلمه", "سبزیجات", "سنتی"),
            image = Res.drawable.food4
        ),
        createRecipe(
            id = "18",
            title = "کتلت گوشت",
            description = "کتلت خانگی با گوشت چرخ‌کرده و سیب‌زمینی",
            categoryId = "quick",
            cuisine = "ایرانی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 25,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,
            rating = 4.6,
            ratingCount = 157,
            isFeatured = false,
            createdAt = "1404-07-15",
            tags = listOf("کتلت", "گوشت", "شام"),
            image = Res.drawable.food1
        ),
        createRecipe(
            id = "19",
            title = "آبگوشت",
            description = "آبگوشت سنتی با گوشت، نخود و لوبیا",
            categoryId = "iranian",
            cuisine = "ایرانی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 180,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,
            rating = 4.8,
            ratingCount = 202,
            isFeatured = true,
            createdAt = "1404-07-01",
            tags = listOf("سنتی", "گوشت", "ناهار"),
            image = Res.drawable.food5

        ),
        createRecipe(
            id = "20",
            title = "استانبولی پلو",
            description = "استانبولی پلو با برنج، گوجه و سیب‌زمینی",
            categoryId = "iranian",
            cuisine = "ایرانی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 40,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,
            rating = 4.4,
            ratingCount = 98,
            isFeatured = true,
            createdAt = "1404-06-15",
            tags = listOf("برنج", "اقتصادی", "سریع"),
            image = Res.drawable.food6
        ),
        createRecipe(
            id = "21",
            title = "پیتزای خانگی",
            description = "پیتزای خانگی با پنیر، قارچ و مواد دلخواه",
            categoryId = "fastfood",
            cuisine = "ایتالیایی",
            preparationTimeMinutes = 25,
            cookingTimeMinutes = 25,
            servings = 3,
            difficulty = RecipeDifficulty.MEDIUM,
            rating = 4.7,
            ratingCount = 176,
            isFeatured = true,
            createdAt = "1404-06-01",
            tags = listOf("پیتزا", "فست‌فود", "پنیر"),
            image = Res.drawable.food3
        ),
        createRecipe(
            id = "22",
            title = "همبرگر خانگی",
            description = "همبرگر خانگی با گوشت، پنیر و سبزیجات تازه",
            categoryId = "fastfood",
            cuisine = "آمریکایی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 15,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,
            rating = 4.5,
            ratingCount = 143,
            isFeatured = false,
            createdAt = "1404-05-15",
            tags = listOf("همبرگر", "فست‌فود", "گوشت"),
            image = Res.drawable.food5
        ),
        createRecipe(
            id = "23",
            title = "پاستا آلفردو",
            description = "پاستا با سس خامه‌ای، قارچ و مرغ",
            categoryId = "pasta",
            cuisine = "ایتالیایی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 25,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,
            rating = 4.8,
            ratingCount = 224,
            isFeatured = true,
            createdAt = "1404-05-01",
            tags = listOf("پاستا", "مرغ", "خامه"),
            image = Res.drawable.food6
        ),
        createRecipe(
            id = "24",
            title = "لازانیا",
            description = "لازانیای لایه‌ای با گوشت و پنیر پیتزا",
            categoryId = "pasta",
            cuisine = "ایتالیایی",
            preparationTimeMinutes = 30,
            cookingTimeMinutes = 40,
            servings = 4,
            difficulty = RecipeDifficulty.MEDIUM,
            rating = 4.7,
            ratingCount = 187,
            isFeatured = false,
            createdAt = "1404-04-15",
            tags = listOf("لازانیا", "گوشت", "پنیر"),
            image = Res.drawable.food5
        ),
        createRecipe(
            id = "25",
            title = "سوپ قارچ",
            description = "سوپ قارچ خامه‌ای مناسب پیش‌غذا",
            categoryId = "soup",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 30,
            servings = 4,
            difficulty = RecipeDifficulty.EASY,
            rating = 4.4,
            ratingCount = 87,
            isFeatured = true,
            createdAt = "1404-04-01",
            tags = listOf("سوپ", "قارچ", "پیش‌غذا"),
            image = Res.drawable.food6
        ),
        createRecipe(
            id = "26",
            title = "پنکیک موزی",
            description = "پنکیک نرم و شیرین با موز تازه",
            categoryId = "breakfast",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 10,
            cookingTimeMinutes = 15,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,
            rating = 4.6,
            ratingCount = 119,
            isFeatured = true,
            createdAt = "1404-03-15",
            tags = listOf("صبحانه", "موز", "شیرینی"),
            image = Res.drawable.food5
        ),
        createRecipe(
            id = "27",
            title = "املت گوجه",
            description = "املت ساده با گوجه‌فرنگی و تخم‌مرغ",
            categoryId = "breakfast",
            cuisine = "ایرانی",
            preparationTimeMinutes = 5,
            cookingTimeMinutes = 15,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,
            rating = 4.5,
            ratingCount = 134,
            isFeatured = false,
            createdAt = "1404-03-01",
            tags = listOf("صبحانه", "سریع", "تخم‌مرغ"),
            image = Res.drawable.food6

        ),
        createRecipe(
            id = "28",
            title = "سالاد یونانی",
            description = "سالاد تازه با خیار، گوجه، زیتون و پنیر فتا",
            categoryId = "salad",
            cuisine = "یونانی",
            preparationTimeMinutes = 15,
            cookingTimeMinutes = 0,
            servings = 2,
            difficulty = RecipeDifficulty.EASY,
            rating = 4.4,
            ratingCount = 92,
            isFeatured = false,
            createdAt = "1404-02-15",
            tags = listOf("سالاد", "گیاهی", "سریع"),
            image = Res.drawable.food5
        ),
        createRecipe(
            id = "29",
            title = "کیک شکلاتی",
            description = "کیک شکلاتی خانگی با بافت نرم و طعم غنی",
            categoryId = "dessert",
            cuisine = "بین‌المللی",
            preparationTimeMinutes = 20,
            cookingTimeMinutes = 40,
            servings = 8,
            difficulty = RecipeDifficulty.MEDIUM,
            rating = 4.8,
            ratingCount = 213,
            isFeatured = true,
            createdAt = "1404-02-01",
            tags = listOf("کیک", "شکلات", "دسر"),
            image = Res.drawable.food6
        ),
        createRecipe(
            id = "30",
            title = "تیرامیسو",
            description = "دسر ایتالیایی با قهوه، پنیر ماسکارپونه و بیسکویت",
            categoryId = "dessert",
            cuisine = "ایتالیایی",
            preparationTimeMinutes = 30,
            cookingTimeMinutes = 0,
            servings = 6,
            difficulty = RecipeDifficulty.MEDIUM,
            rating = 4.9,
            ratingCount = 241,
            isFeatured = true,
            createdAt = "1404-01-15",
            tags = listOf("دسر", "قهوه", "ایتالیایی"),
            image = Res.drawable.food5

        )
    )

    val slideShowRecipes = recipes
        .filter { it.isFeatured }
        .take(3)

    val popularRecipes = recipes


    val newestRecipes = recipes


    private fun createRecipe(
        id: String,
        title: String,
        description: String,
        categoryId: String,
        cuisine: String,
        preparationTimeMinutes: Int,
        cookingTimeMinutes: Int,
        servings: Int,
        difficulty: RecipeDifficulty,
        rating: Double,
        ratingCount: Int,
        isFeatured: Boolean,
        createdAt: String,
        tags: List<String>,

        image: DrawableResource
    ) = Recipe(
        id = id,
        title = title,
        description = description,
        imageUrl = "",
        categoryId = categoryId,
        cuisine = cuisine,
        preparationTimeMinutes = preparationTimeMinutes,
        cookingTimeMinutes = cookingTimeMinutes,
        servings = servings,
        difficulty = difficulty,
        ingredients = emptyList(),
        steps = emptyList(),
        nutrition = null,
        tags = tags,
        rating = rating,
        ratingCount = ratingCount,
        isFavorite = false,
        isFeatured = isFeatured,
        createdAt = createdAt,
        updatedAt = createdAt,


        image = image
    )


}
