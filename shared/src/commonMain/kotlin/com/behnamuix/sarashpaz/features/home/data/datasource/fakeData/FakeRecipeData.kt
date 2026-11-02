package com.behnamuix.sarashpaz.features.home.data.datasource.fakeData

import com.behnamuix.sarashpaz.features.home.domain.model.article.Article
import com.behnamuix.sarashpaz.features.home.domain.model.interviewCustomer.ChefCustomer
import com.behnamuix.sarashpaz.features.home.domain.model.interviewCustomer.QAChefCustomer
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Ingredients
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Recipe
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.RecipeDifficulty
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Spices
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.IngredientUnit
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
        ),
        Article(
            id = 5,
            image = Res.drawable.article7,
            title = "نقش پروتئین در سلامت بدن",
            subtitle = "با مصرف منابعی مانند تخم‌مرغ، حبوبات، ماهی و لبنیات به حفظ عضلات و ترمیم بافت‌ها کمک کنید."
        ),
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
            image = Res.drawable.food1,
            cookingSteps = listOf(
                "مرغ را با پیاز خردشده و کمی روغن تفت دهید تا سطح آن طلایی شود.",
                "زردچوبه، فلفل سیاه، نمک و رب گوجه‌فرنگی را اضافه کنید و چند دقیقه تفت دهید.",
                "دو لیوان آب جوش اضافه کنید و اجازه دهید مرغ با حرارت ملایم حدود ۴۵ تا ۶۰ دقیقه بپزد.",
                "برنج را بشویید، خیس کنید و در آب جوش نیم‌پز کنید؛ سپس آبکش کنید.",
                "برنج را با ته‌دیگ دلخواه دم کنید و حدود ۴۰ دقیقه روی حرارت ملایم بگذارید.",
                "زرشک را با کره و شکر تفت دهید و زعفران دم‌کرده را اضافه کنید.",
                "برنج زعفرانی و زرشک را روی برنج سفید بریزید و همراه مرغ سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "4", IngredientUnit.CUP),
                Ingredients("مرغ", "4", IngredientUnit.PIECE),
                Ingredients("زرشک", "100", IngredientUnit.GRAM),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("کره", "50", IngredientUnit.GRAM),
                Ingredients("رب گوجه‌فرنگی", "2", IngredientUnit.TABLESPOON),
                Ingredients("زعفران دم‌کرده", "3", IngredientUnit.TABLESPOON),
                Ingredients("شکر", "1", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "2", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.5", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food2,
            cookingSteps = listOf(
                "سینه مرغ را برش دهید و با روغن زیتون، آبلیمو و ادویه‌ها مزه‌دار کنید.",
                "مرغ را حدود ۳۰ دقیقه در یخچال استراحت دهید و کاهو را بشویید و خشک کنید.",
                "مرغ را در تابه گریل بپزید تا طلایی و کاملاً مغزپخت شود.",
                "نان تست را مکعبی خرد کنید و با کمی روغن زیتون و پودر سیر برشته کنید.",
                "سس مایونز، خردل، آبلیمو، سیر و پنیر پارمزان را مخلوط کنید.",
                "کاهو را با سس مخلوط کنید و مرغ برش‌خورده را روی آن قرار دهید.",
                "نان برشته و پنیر پارمزان را اضافه کرده و بلافاصله سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("سینه مرغ", "300", IngredientUnit.GRAM),
                Ingredients("کاهو", "1", IngredientUnit.PIECE),
                Ingredients("نان تست", "3", IngredientUnit.PIECE),
                Ingredients("سس مایونز", "4", IngredientUnit.TABLESPOON),
                Ingredients("پنیر پارمزان", "40", IngredientUnit.GRAM),
                Ingredients("روغن زیتون", "2", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON),
                Ingredients("خردل", "1", IngredientUnit.TEASPOON),
                Ingredients("سیر", "1", IngredientUnit.CLOVE)
            ),
            spices = listOf(
                Spices("نمک", "0.75", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "0.5", IngredientUnit.TEASPOON),
                Spices("آویشن", "0.5", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food3,
            cookingSteps = listOf(
                "لوبیا را از شب قبل خیس کنید و گوشت و پیاز را خرد کنید.",
                "پیاز را تفت دهید، گوشت را اضافه کنید و با ادویه‌ها تفت دهید.",
                "لوبیا را اضافه کنید و چند دقیقه همراه گوشت تفت دهید.",
                "سبزی قورمه را ریز خرد کنید و با روغن سرخ کنید.",
                "سبزی سرخ‌شده و آب جوش را به قابلمه اضافه کنید.",
                "لیموعمانی سوراخ‌شده و نمک را اضافه کنید و اجازه دهید خورش آرام بپزد.",
                "پس از نرم شدن گوشت و لوبیا، خورش را جا بیندازید و با برنج سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت خورشتی", "400", IngredientUnit.GRAM),
                Ingredients("سبزی قورمه", "500", IngredientUnit.GRAM),
                Ingredients("لوبیا قرمز", "150", IngredientUnit.GRAM),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("لیموعمانی", "4", IngredientUnit.PIECE),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "2", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food4,
            cookingSteps = listOf(
                "لپه را خیس کنید و گوشت و پیاز را خرد کنید.",
                "پیاز را تفت دهید، گوشت را اضافه کنید و با زردچوبه و فلفل تفت دهید.",
                "لپه و رب گوجه‌فرنگی را اضافه کنید و چند دقیقه تفت دهید.",
                "آب جوش اضافه کنید و اجازه دهید گوشت و لپه بپزند.",
                "لیموعمانی، نمک و دارچین را اضافه کنید و خورش را جا بیندازید.",
                "سیب‌زمینی را خلالی خرد کرده و در روغن سرخ کنید.",
                "خورش را با سیب‌زمینی سرخ‌شده روی آن سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت خورشتی", "400", IngredientUnit.GRAM),
                Ingredients("لپه", "150", IngredientUnit.GRAM),
                Ingredients("سیب‌زمینی", "3", IngredientUnit.PIECE),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "3", IngredientUnit.TABLESPOON),
                Ingredients("لیموعمانی", "3", IngredientUnit.PIECE),
                Ingredients("روغن", "5", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "2", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.5", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food3,
            cookingSteps = listOf(
                "پیاز را خرد کرده و با روغن تفت دهید.",
                "گوشت چرخ‌کرده را اضافه کنید و تا تغییر رنگ تفت دهید.",
                "رب گوجه‌فرنگی و ادویه‌ها را اضافه کنید و خوب تفت دهید.",
                "در صورت تمایل قارچ و فلفل دلمه‌ای اضافه کنید و سس را بپزید.",
                "ماکارونی را در آب جوش و نمک نیم‌پز کنید و آبکش کنید.",
                "ماکارونی و سس را به صورت لایه‌ای در قابلمه بریزید.",
                "درب قابلمه را بگذارید و اجازه دهید ماکارونی دم بکشد."
            ),
            ingredients = listOf(
                Ingredients("ماکارونی", "400", IngredientUnit.GRAM),
                Ingredients("گوشت چرخ‌کرده", "300", IngredientUnit.GRAM),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "3", IngredientUnit.TABLESPOON),
                Ingredients("فلفل دلمه‌ای", "1", IngredientUnit.PIECE),
                Ingredients("قارچ", "200", IngredientUnit.GRAM),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "2", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON),
                Spices("آویشن", "1", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "0.5", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food2,
            cookingSteps = listOf(
                "سبزی کوکو را پاک کنید، بشویید و ریز خرد کنید.",
                "تخم‌مرغ‌ها را در کاسه‌ای بشکنید و هم بزنید.",
                "سبزی، تخم‌مرغ و ادویه‌ها را مخلوط کنید.",
                "در صورت تمایل گردو و زرشک را اضافه کنید.",
                "تابه را با روغن گرم کنید و مایه کوکو را داخل آن بریزید.",
                "درب تابه را بگذارید تا یک طرف کوکو بپزد.",
                "کوکو را برگردانید تا طرف دیگر نیز طلایی شود."
            ),
            ingredients = listOf(
                Ingredients("سبزی کوکو", "400", IngredientUnit.GRAM),
                Ingredients("تخم‌مرغ", "5", IngredientUnit.PIECE),
                Ingredients("گردو", "50", IngredientUnit.GRAM),
                Ingredients("زرشک", "2", IngredientUnit.TABLESPOON),
                Ingredients("آرد", "1", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "0.5", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food3,
            cookingSteps = listOf(
                "مرغ را به قطعات یکسان برش دهید.",
                "پیاز، زعفران، آبلیمو، ماست و روغن زیتون را مخلوط کنید.",
                "مرغ را با مواد مرینیت مخلوط کرده و در یخچال قرار دهید.",
                "اجازه دهید مرغ حداقل دو ساعت مزه‌دار شود.",
                "تکه‌های مرغ را به سیخ بکشید.",
                "سیخ‌ها را روی منقل یا گریل بپزید و مرتب بچرخانید.",
                "در پایان کمی کره و زعفران روی جوجه‌ها بمالید و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("مرغ بدون استخوان", "1000", IngredientUnit.GRAM),
                Ingredients("پیاز", "3", IngredientUnit.PIECE),
                Ingredients("ماست", "4", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "4", IngredientUnit.TABLESPOON),
                Ingredients("روغن زیتون", "3", IngredientUnit.TABLESPOON),
                Ingredients("زعفران دم‌کرده", "3", IngredientUnit.TABLESPOON),
                Ingredients("کره", "30", IngredientUnit.GRAM)
            ),
            spices = listOf(
                Spices("نمک", "2", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "1", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "0.5", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food4,
            cookingSteps = listOf(
                "گوشت چرخ‌کرده با چربی مناسب را آماده کنید.",
                "پیاز را رنده کرده و آب آن را کاملاً بگیرید.",
                "گوشت، پیاز، نمک و فلفل را مخلوط کنید.",
                "مایه را حدود ۱۰ تا ۱۵ دقیقه ورز دهید و در یخچال استراحت دهید.",
                "گوشت را به شکل یکنواخت روی سیخ پهن کنید.",
                "سیخ‌ها را روی زغال گداخته قرار دهید و در ابتدا مرتب بچرخانید.",
                "کباب را پس از پخت کامل همراه گوجه کبابی و برنج سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت چرخ‌کرده مخلوط", "800", IngredientUnit.GRAM),
                Ingredients("پیاز", "300", IngredientUnit.GRAM),
                Ingredients("کره", "30", IngredientUnit.GRAM),
                Ingredients("گوجه‌فرنگی", "4", IngredientUnit.PIECE),
                Ingredients("سماق", "2", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "2", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "1", IngredientUnit.TEASPOON),
                Spices("سماق", "1", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food2,
            cookingSteps = listOf(
                "عدس را بشویید و بپزید تا نرم شود اما له نشود.",
                "برنج را خیس کرده و در آب جوش نیم‌پز کنید.",
                "برنج و عدس را جداگانه آبکش کنید.",
                "پیاز را سرخ کنید و کشمش را با کمی کره تفت دهید.",
                "برنج و عدس را به صورت لایه‌ای داخل قابلمه بریزید.",
                "دارچین و زعفران را اضافه کنید و برنج را دم کنید.",
                "عدس پلو را با پیازداغ و کشمش سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "3", IngredientUnit.CUP),
                Ingredients("عدس", "1", IngredientUnit.CUP),
                Ingredients("کشمش", "150", IngredientUnit.GRAM),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("کره", "30", IngredientUnit.GRAM),
                Ingredients("روغن", "3", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "2", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("دارچین", "1", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "0.5", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food4,
            cookingSteps = listOf(
                "لوبیا سبز را خرد کنید و چند دقیقه در آب جوش بپزید.",
                "پیاز را تفت دهید و گوشت را اضافه کنید.",
                "لوبیا سبز و ادویه‌ها را اضافه کنید و چند دقیقه تفت دهید.",
                "رب گوجه‌فرنگی و کمی آب اضافه کنید و اجازه دهید مواد بپزند.",
                "برنج را نیم‌پز کرده و آبکش کنید.",
                "برنج و مواد گوشتی را لایه‌لایه در قابلمه بریزید.",
                "زعفران اضافه کنید و لوبیا پلو را دم کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "3", IngredientUnit.CUP),
                Ingredients("گوشت چرخ‌کرده", "300", IngredientUnit.GRAM),
                Ingredients("لوبیا سبز", "400", IngredientUnit.GRAM),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "3", IngredientUnit.TABLESPOON),
                Ingredients("زعفران دم‌کرده", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "2", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.5", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food1,
            cookingSteps = listOf(
                "مرغ را با پیاز و ادویه بپزید و پس از خنک شدن ریش‌ریش کنید.",
                "برنج را نیم‌پز کرده و آبکش کنید.",
                "ماست، تخم‌مرغ، زعفران و روغن را مخلوط کنید.",
                "برنج را به مایه ماست اضافه کنید و آرام هم بزنید.",
                "نیمی از برنج را در قابلمه چرب‌شده فشرده کنید.",
                "مرغ را روی برنج پخش کنید و باقی برنج را روی آن بریزید.",
                "ته‌چین را با حرارت ملایم بپزید تا طلایی و برشته شود."
            ),
            ingredients = listOf(
                Ingredients("برنج", "3", IngredientUnit.CUP),
                Ingredients("مرغ", "500", IngredientUnit.GRAM),
                Ingredients("ماست چکیده", "2", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "3", IngredientUnit.PIECE),
                Ingredients("زعفران دم‌کرده", "4", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON),
                Ingredients("پیاز", "1", IngredientUnit.PIECE)
            ),
            spices = listOf(
                Spices("نمک", "2", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food2,
            cookingSteps = listOf(
                "نخود و لوبیا را از شب قبل خیس کنید و جداگانه بپزید.",
                "پیاز را سرخ کنید و بخشی از آن را برای تزئین کنار بگذارید.",
                "حبوبات پخته‌شده را با آب جوش داخل قابلمه بریزید.",
                "عدس و سبزی آش خردشده را اضافه کنید.",
                "نمک، فلفل و زردچوبه را اضافه کرده و اجازه دهید مواد بپزند.",
                "رشته آش را خرد کنید و داخل قابلمه بریزید.",
                "آش را با کشک، پیازداغ، سیرداغ و نعناع‌داغ سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("رشته آش", "300", IngredientUnit.GRAM),
                Ingredients("نخود", "100", IngredientUnit.GRAM),
                Ingredients("لوبیا", "100", IngredientUnit.GRAM),
                Ingredients("عدس", "100", IngredientUnit.GRAM),
                Ingredients("سبزی آش", "700", IngredientUnit.GRAM),
                Ingredients("پیاز", "4", IngredientUnit.PIECE),
                Ingredients("کشک", "300", IngredientUnit.GRAM),
                Ingredients("سیر", "5", IngredientUnit.CLOVE),
                Ingredients("روغن", "5", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "2", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "1", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1.5", IngredientUnit.TEASPOON),
                Spices("نعناع خشک", "2", IngredientUnit.TABLESPOON)
            )
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
            image = Res.drawable.food1,
            cookingSteps = listOf(
                "بادمجان‌ها را پوست بگیرید، نمک بزنید و پس از مدتی خشک کنید.",
                "بادمجان‌ها را سرخ کنید یا در فر کباب کنید.",
                "پیاز را سرخ کنید و بخشی از آن را برای تزئین کنار بگذارید.",
                "سیر و ادویه‌ها را به پیازداغ اضافه کنید.",
                "بادمجان را اضافه کرده و با گوشت‌کوب له کنید.",
                "کشک رقیق‌شده را اضافه کنید و چند دقیقه بپزید.",
                "با کشک، نعناع‌داغ، پیازداغ و گردو تزئین کنید."
            ),
            ingredients = listOf(
                Ingredients("بادمجان", "6", IngredientUnit.PIECE),
                Ingredients("کشک", "250", IngredientUnit.GRAM),
                Ingredients("پیاز", "3", IngredientUnit.PIECE),
                Ingredients("سیر", "4", IngredientUnit.CLOVE),
                Ingredients("گردو", "50", IngredientUnit.GRAM),
                Ingredients("نعناع خشک", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "5", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food2,
            cookingSteps = listOf(
                "بادمجان‌ها را روی شعله کباب کنید تا کاملاً نرم شوند.",
                "پوست سوخته بادمجان را جدا کرده و گوشت آن را خرد کنید.",
                "گوجه‌ها را پوست بگیرید و خرد یا رنده کنید.",
                "سیر را با روغن تفت دهید و زردچوبه اضافه کنید.",
                "گوجه را اضافه کنید و بپزید تا آب آن کم شود.",
                "بادمجان را اضافه کنید و مواد را با هم مخلوط کنید.",
                "تخم‌مرغ‌ها را اضافه کرده و پس از پخت کامل سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("بادمجان", "5", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "4", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "3", IngredientUnit.PIECE),
                Ingredients("سیر", "5", IngredientUnit.CLOVE),
                Ingredients("روغن", "3", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "0.5", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food3,
            cookingSteps = listOf(
                "پاچ‌باقالی را پاک کنید و بشویید.",
                "سیر را خرد کنید و با روغن یا کره تفت دهید.",
                "زردچوبه را اضافه کنید و سپس باقالی را داخل قابلمه بریزید.",
                "شوید را اضافه کرده و چند دقیقه تفت دهید.",
                "آب جوش اضافه کنید و اجازه دهید باقالی بپزد.",
                "نمک و فلفل را اضافه کنید و پخت را ادامه دهید.",
                "تخم‌مرغ‌ها را روی باقالی بشکنید و درب قابلمه را بگذارید تا بپزند."
            ),
            ingredients = listOf(
                Ingredients("پاچ‌باقالی", "500", IngredientUnit.GRAM),
                Ingredients("شوید خشک", "3", IngredientUnit.TABLESPOON),
                Ingredients("سیر", "5", IngredientUnit.CLOVE),
                Ingredients("تخم‌مرغ", "3", IngredientUnit.PIECE),
                Ingredients("کره", "40", IngredientUnit.GRAM),
                Ingredients("آب", "2", IngredientUnit.CUP)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food2,
            cookingSteps = listOf(
                "گردو را آسیاب کنید و پیاز را ریز خرد کنید.",
                "پیاز را تفت دهید و مرغ را اضافه کنید تا سطح آن کمی سرخ شود.",
                "گردوی آسیاب‌شده را اضافه کنید و چند دقیقه تفت دهید.",
                "آب سرد اضافه کنید و اجازه دهید گردو روی حرارت ملایم بپزد.",
                "رب انار را اضافه کنید و مواد را مخلوط کنید.",
                "برای طعم ملس در صورت تمایل کمی شکر اضافه کنید.",
                "خورش را چند ساعت آرام بپزید تا غلیظ و روغن‌انداخته شود."
            ),
            ingredients = listOf(
                Ingredients("مرغ", "4", IngredientUnit.PIECE),
                Ingredients("گردوی آسیاب‌شده", "400", IngredientUnit.GRAM),
                Ingredients("رب انار", "5", IngredientUnit.TABLESPOON),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("شکر", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "2", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "0.5", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food4,
            cookingSteps = listOf(
                "برگ‌های مو را بشویید و چند دقیقه در آب جوش نرم کنید.",
                "برنج و لپه را جداگانه نیم‌پز کنید.",
                "پیاز را تفت دهید و در صورت استفاده گوشت را اضافه کنید.",
                "برنج، لپه، سبزی خردشده و ادویه‌ها را اضافه کنید.",
                "مواد را داخل برگ مو بگذارید و برگ‌ها را محکم بپیچید.",
                "دلمه‌ها را منظم در قابلمه بچینید و یک بشقاب روی آن‌ها بگذارید.",
                "آب، روغن و چاشنی را اضافه کنید و دلمه‌ها را با حرارت ملایم بپزید."
            ),
            ingredients = listOf(
                Ingredients("برگ مو", "40", IngredientUnit.PIECE),
                Ingredients("برنج", "1", IngredientUnit.CUP),
                Ingredients("لپه", "150", IngredientUnit.GRAM),
                Ingredients("گوشت چرخ‌کرده", "300", IngredientUnit.GRAM),
                Ingredients("سبزی دلمه", "300", IngredientUnit.GRAM),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("آبلیمو", "3", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "3", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.5", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food1,
            cookingSteps = listOf(
                "سیب‌زمینی و پیاز را رنده کنید و آب اضافی آن‌ها را بگیرید.",
                "گوشت چرخ‌کرده را به سیب‌زمینی و پیاز اضافه کنید.",
                "تخم‌مرغ و ادویه‌ها را اضافه کنید.",
                "مواد را ورز دهید تا کاملاً یکدست شوند.",
                "مایه را به شکل کتلت‌های بیضی فرم دهید.",
                "کتلت‌ها را در روغن داغ سرخ کنید.",
                "پس از طلایی شدن هر دو طرف، روی دستمال روغن‌گیر قرار دهید و سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت چرخ‌کرده", "400", IngredientUnit.GRAM),
                Ingredients("سیب‌زمینی", "3", IngredientUnit.PIECE),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "1", IngredientUnit.PIECE),
                Ingredients("آرد سوخاری", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "5", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "0.5", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food5,
            cookingSteps = listOf(
                "نخود و لوبیا را از شب قبل خیس کنید.",
                "گوشت، حبوبات و پیاز را داخل قابلمه بریزید.",
                "زردچوبه، فلفل و آب را اضافه کنید و به جوش بیاورید.",
                "کف روی آب را بگیرید و اجازه دهید مواد آرام بپزند.",
                "سیب‌زمینی و گوجه‌فرنگی را اضافه کنید.",
                "نمک را اضافه کرده و پخت را تا نرم شدن کامل مواد ادامه دهید.",
                "آبگوشت را جداگانه سرو کنید و گوشت و حبوبات را بکوبید."
            ),
            ingredients = listOf(
                Ingredients("گوشت گوسفندی با استخوان", "600", IngredientUnit.GRAM),
                Ingredients("نخود", "100", IngredientUnit.GRAM),
                Ingredients("لوبیا سفید", "100", IngredientUnit.GRAM),
                Ingredients("سیب‌زمینی", "3", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "2", IngredientUnit.PIECE),
                Ingredients("پیاز", "2", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "1", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "2", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food6,
            cookingSteps = listOf(
                "برنج را بشویید و در صورت تمایل خیس کنید.",
                "پیاز را خرد کرده و با روغن تفت دهید.",
                "سیب‌زمینی را نگینی خرد کنید و به پیاز اضافه کنید.",
                "گوجه، رب و ادویه‌ها را اضافه کرده و تفت دهید.",
                "برنج را اضافه کنید و مقدار مناسبی آب جوش بریزید.",
                "وقتی آب برنج کشیده شد، حرارت را کم کنید.",
                "استانبولی را با دم‌کنی دم کنید و گرم سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("برنج", "3", IngredientUnit.CUP),
                Ingredients("گوجه‌فرنگی", "4", IngredientUnit.PIECE),
                Ingredients("سیب‌زمینی", "2", IngredientUnit.PIECE),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "2", IngredientUnit.TABLESPOON),
                Ingredients("روغن", "4", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "2", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "1", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food3,
            cookingSteps = listOf(
                "آرد، مخمر، شکر، نمک و آب ولرم را مخلوط کنید و خمیر بسازید.",
                "روغن زیتون را اضافه کرده و خمیر را ورز دهید.",
                "خمیر را بپوشانید و حدود یک ساعت استراحت دهید.",
                "رب گوجه را با روغن زیتون، سیر و ادویه‌ها برای سس مخلوط کنید.",
                "خمیر را باز کرده و داخل سینی فر قرار دهید.",
                "سس، پنیر، قارچ و مواد دلخواه را روی خمیر بریزید.",
                "در فر گرم‌شده با دمای ۲۰۰ تا ۲۲۰ درجه بپزید تا پنیر طلایی شود."
            ),
            ingredients = listOf(
                Ingredients("آرد", "400", IngredientUnit.GRAM),
                Ingredients("آب ولرم", "250", IngredientUnit.MILLILITER),
                Ingredients("مخمر فوری", "7", IngredientUnit.GRAM),
                Ingredients("شکر", "1", IngredientUnit.TEASPOON),
                Ingredients("روغن زیتون", "3", IngredientUnit.TABLESPOON),
                Ingredients("رب گوجه‌فرنگی", "3", IngredientUnit.TABLESPOON),
                Ingredients("پنیر پیتزا", "300", IngredientUnit.GRAM),
                Ingredients("قارچ", "200", IngredientUnit.GRAM),
                Ingredients("فلفل دلمه‌ای", "1", IngredientUnit.PIECE)
            ),
            spices = listOf(
                Spices("نمک", "1.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("آویشن", "1", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "0.5", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food5,
            cookingSteps = listOf(
                "گوشت چرخ‌کرده را با نمک و فلفل مخلوط کنید.",
                "گوشت را به دو قسمت تقسیم کرده و به شکل برگر فرم دهید.",
                "برگرها را حدود ۲۰ دقیقه در یخچال قرار دهید.",
                "تابه گریل را گرم کنید و برگرها را در آن بپزید.",
                "هر طرف برگر را بپزید تا سطح آن برشته و داخل آن کاملاً پخته شود.",
                "در صورت تمایل پنیر را روی برگر قرار دهید تا ذوب شود.",
                "نان را با سس، کاهو، گوجه، خیارشور و برگر آماده کنید."
            ),
            ingredients = listOf(
                Ingredients("گوشت چرخ‌کرده", "400", IngredientUnit.GRAM),
                Ingredients("نان همبرگر", "2", IngredientUnit.PIECE),
                Ingredients("پنیر چدار", "2", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "1", IngredientUnit.PIECE),
                Ingredients("کاهو", "2", IngredientUnit.PIECE),
                Ingredients("خیارشور", "2", IngredientUnit.PIECE),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("روغن", "1", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "1", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "0.5", IngredientUnit.TEASPOON),
                Spices("پودر پیاز", "0.5", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food6,
            cookingSteps = listOf(
                "پاستا را در آب جوش و نمک بپزید و آبکش کنید.",
                "مرغ را خرد کرده و با ادویه‌ها و کره تفت دهید.",
                "قارچ ورقه‌شده را اضافه کنید و اجازه دهید آب آن تبخیر شود.",
                "خامه و شیر را اضافه کنید و سس را آرام هم بزنید.",
                "پنیر پارمزان و فلفل را اضافه کنید.",
                "پاستا را داخل سس بریزید و مخلوط کنید.",
                "با پارمزان و جعفری خردشده سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("پاستا", "250", IngredientUnit.GRAM),
                Ingredients("سینه مرغ", "250", IngredientUnit.GRAM),
                Ingredients("قارچ", "200", IngredientUnit.GRAM),
                Ingredients("خامه", "200", IngredientUnit.MILLILITER),
                Ingredients("شیر", "100", IngredientUnit.MILLILITER),
                Ingredients("پنیر پارمزان", "50", IngredientUnit.GRAM),
                Ingredients("کره", "30", IngredientUnit.GRAM),
                Ingredients("سیر", "2", IngredientUnit.CLOVE)
            ),
            spices = listOf(
                Spices("نمک", "1.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.75", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "0.5", IngredientUnit.TEASPOON),
                Spices("آویشن", "0.5", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food5,
            cookingSteps = listOf(
                "پیاز را تفت دهید و گوشت چرخ‌کرده را اضافه کنید.",
                "قارچ و فلفل دلمه‌ای را اضافه کنید و تفت دهید.",
                "رب گوجه و ادویه‌ها را اضافه کرده و سس گوشت را آماده کنید.",
                "کره را آب کنید و آرد را کمی تفت دهید.",
                "شیر را کم‌کم اضافه کنید و هم بزنید تا سس بشامل غلیظ شود.",
                "ورقه لازانیا، سس گوشت، بشامل و پنیر را لایه‌لایه در ظرف بچینید.",
                "در فر ۱۸۰ درجه حدود ۳۰ تا ۴۰ دقیقه بپزید."
            ),
            ingredients = listOf(
                Ingredients("ورقه لازانیا", "250", IngredientUnit.GRAM),
                Ingredients("گوشت چرخ‌کرده", "400", IngredientUnit.GRAM),
                Ingredients("قارچ", "200", IngredientUnit.GRAM),
                Ingredients("فلفل دلمه‌ای", "1", IngredientUnit.PIECE),
                Ingredients("رب گوجه‌فرنگی", "3", IngredientUnit.TABLESPOON),
                Ingredients("پنیر پیتزا", "300", IngredientUnit.GRAM),
                Ingredients("شیر", "500", IngredientUnit.MILLILITER),
                Ingredients("آرد", "3", IngredientUnit.TABLESPOON),
                Ingredients("کره", "40", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE)
            ),
            spices = listOf(
                Spices("نمک", "2", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.75", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "0.5", IngredientUnit.TEASPOON),
                Spices("آویشن", "1", IngredientUnit.TEASPOON),
                Spices("پودر سیر", "0.5", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food6,
            cookingSteps = listOf(
                "پیاز را با کره تفت دهید تا نرم شود.",
                "قارچ ورقه‌شده را اضافه کنید و تفت دهید تا آب آن تبخیر شود.",
                "آرد را اضافه کنید و یک دقیقه تفت دهید.",
                "شیر و آب مرغ را به تدریج اضافه کنید و مرتب هم بزنید.",
                "نمک، فلفل و آویشن را اضافه کنید و اجازه دهید سوپ غلیظ شود.",
                "خامه را با کمی مایع گرم مخلوط کرده و به سوپ اضافه کنید.",
                "سوپ را با جعفری خردشده سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("قارچ", "400", IngredientUnit.GRAM),
                Ingredients("پیاز", "1", IngredientUnit.PIECE),
                Ingredients("کره", "40", IngredientUnit.GRAM),
                Ingredients("آرد", "3", IngredientUnit.TABLESPOON),
                Ingredients("شیر", "500", IngredientUnit.MILLILITER),
                Ingredients("آب مرغ", "500", IngredientUnit.MILLILITER),
                Ingredients("خامه", "100", IngredientUnit.MILLILITER),
                Ingredients("سیر", "2", IngredientUnit.CLOVE)
            ),
            spices = listOf(
                Spices("نمک", "1.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("آویشن", "0.5", IngredientUnit.TEASPOON),
                Spices("جوز هندی", "0.25", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food5,
            cookingSteps = listOf(
                "موز را با چنگال کاملاً له کنید.",
                "تخم‌مرغ، شیر و شکر را اضافه کرده و مخلوط کنید.",
                "آرد و بکینگ‌پودر را اضافه کنید و هم بزنید تا مایه یکدست شود.",
                "تابه نچسب را کمی چرب کنید و روی حرارت متوسط بگذارید.",
                "از مایه پنکیک داخل تابه بریزید و تا ایجاد حباب روی سطح صبر کنید.",
                "پنکیک را برگردانید و طرف دیگر را نیز بپزید.",
                "با موز برش‌خورده و عسل سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("موز", "2", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "2", IngredientUnit.PIECE),
                Ingredients("آرد", "1", IngredientUnit.CUP),
                Ingredients("شیر", "150", IngredientUnit.MILLILITER),
                Ingredients("شکر", "2", IngredientUnit.TABLESPOON),
                Ingredients("بکینگ‌پودر", "1", IngredientUnit.TEASPOON),
                Ingredients("کره", "20", IngredientUnit.GRAM),
                Ingredients("عسل", "2", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("دارچین", "0.5", IngredientUnit.TEASPOON),
                Spices("وانیل", "0.25", IngredientUnit.TEASPOON),
                Spices("نمک", "0.125", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food6,
            cookingSteps = listOf(
                "گوجه‌ها را خرد کنید و داخل تابه بریزید.",
                "اجازه دهید گوجه‌ها نرم شوند و آب اضافی آن‌ها تبخیر شود.",
                "روغن و ادویه‌ها را اضافه کنید و چند دقیقه تفت دهید.",
                "تخم‌مرغ‌ها را اضافه کنید و با گوجه مخلوط کنید.",
                "حرارت را کم کنید و اجازه دهید تخم‌مرغ‌ها بپزند.",
                "در صورت تمایل املت را کمی هم بزنید تا بافت یکدست شود.",
                "املت را همراه نان تازه سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("گوجه‌فرنگی", "4", IngredientUnit.PIECE),
                Ingredients("تخم‌مرغ", "3", IngredientUnit.PIECE),
                Ingredients("روغن", "2", IngredientUnit.TABLESPOON),
                Ingredients("رب گوجه‌فرنگی", "1", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "0.75", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.5", IngredientUnit.TEASPOON),
                Spices("زردچوبه", "0.5", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food5,
            cookingSteps = listOf(
                "خیار، گوجه و فلفل دلمه‌ای را بشویید و خرد کنید.",
                "پیاز قرمز را حلقه‌ای برش دهید.",
                "سبزیجات را با زیتون داخل کاسه بریزید.",
                "پنیر فتا را خرد کنید و روی سالاد قرار دهید.",
                "روغن زیتون، آبلیمو و ادویه‌ها را مخلوط کنید.",
                "سس را روی سالاد بریزید و آرام مخلوط کنید.",
                "سالاد را بلافاصله سرو کنید."
            ),
            ingredients = listOf(
                Ingredients("خیار", "2", IngredientUnit.PIECE),
                Ingredients("گوجه‌فرنگی", "3", IngredientUnit.PIECE),
                Ingredients("فلفل دلمه‌ای", "1", IngredientUnit.PIECE),
                Ingredients("پیاز قرمز", "1", IngredientUnit.PIECE),
                Ingredients("زیتون", "100", IngredientUnit.GRAM),
                Ingredients("پنیر فتا", "150", IngredientUnit.GRAM),
                Ingredients("روغن زیتون", "3", IngredientUnit.TABLESPOON),
                Ingredients("آبلیمو", "1", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("نمک", "0.5", IngredientUnit.TEASPOON),
                Spices("فلفل سیاه", "0.25", IngredientUnit.TEASPOON),
                Spices("پونه کوهی خشک", "1", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food6,
            cookingSteps = listOf(
                "فر را روی ۱۸۰ درجه گرم کنید و قالب را چرب کنید.",
                "تخم‌مرغ، شکر و وانیل را بزنید تا حجیم و روشن شود.",
                "روغن و شیر را اضافه کنید و مخلوط کنید.",
                "آرد، پودر کاکائو، بکینگ‌پودر و نمک را الک کنید.",
                "مواد خشک را در چند مرحله اضافه کنید و آرام هم بزنید.",
                "مایه را داخل قالب بریزید و حدود ۳۵ تا ۴۵ دقیقه بپزید.",
                "پس از خنک شدن از قالب خارج کنید و تزئین کنید."
            ),
            ingredients = listOf(
                Ingredients("آرد", "2", IngredientUnit.CUP),
                Ingredients("شکر", "1.5", IngredientUnit.CUP),
                Ingredients("تخم‌مرغ", "3", IngredientUnit.PIECE),
                Ingredients("شیر", "1", IngredientUnit.CUP),
                Ingredients("روغن مایع", "0.75", IngredientUnit.CUP),
                Ingredients("پودر کاکائو", "0.5", IngredientUnit.CUP),
                Ingredients("بکینگ‌پودر", "2", IngredientUnit.TEASPOON),
                Ingredients("وانیل", "0.5", IngredientUnit.TEASPOON)
            ),
            spices = listOf(
                Spices("نمک", "0.25", IngredientUnit.TEASPOON),
                Spices("دارچین", "0.25", IngredientUnit.TEASPOON)
            )
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
            image = Res.drawable.food5,
            cookingSteps = listOf(
                "قهوه غلیظ تهیه کنید و اجازه دهید کاملاً خنک شود.",
                "زرده تخم‌مرغ و شکر را روی بخار آب هم بزنید تا به دمای ایمن برسد.",
                "ماسکارپونه را به مخلوط اضافه کنید و هم بزنید تا کرمی شود.",
                "خامه سرد را جداگانه بزنید تا فرم بگیرد و سپس با کرم مخلوط کنید.",
                "بیسکویت‌ها را سریع در قهوه فرو ببرید و در کف ظرف بچینید.",
                "نیمی از کرم را روی بیسکویت‌ها پخش کنید و لایه دوم را اضافه کنید.",
                "باقی کرم را پخش کنید و دسر را حداقل شش ساعت در یخچال قرار دهید؛ سپس پودر کاکائو بپاشید."
            ),
            ingredients = listOf(
                Ingredients("پنیر ماسکارپونه", "500", IngredientUnit.GRAM),
                Ingredients("بیسکویت لیدی‌فینگر", "300", IngredientUnit.GRAM),
                Ingredients("خامه پرچرب", "300", IngredientUnit.MILLILITER),
                Ingredients("تخم‌مرغ", "4", IngredientUnit.PIECE),
                Ingredients("شکر", "100", IngredientUnit.GRAM),
                Ingredients("قهوه غلیظ", "300", IngredientUnit.MILLILITER),
                Ingredients("پودر کاکائو", "2", IngredientUnit.TABLESPOON)
            ),
            spices = listOf(
                Spices("وانیل", "0.5", IngredientUnit.TEASPOON),
                Spices("نمک", "0.125", IngredientUnit.TEASPOON)
            )
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
      cookingSteps: List<String>,
            ingredients: List<Ingredients>,
        image: DrawableResource,
        spices: List<Spices>
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
        steps = emptyList(),
        nutrition = null,
        tags = tags,
        rating = rating,
        ratingCount = ratingCount,
        isFavorite = false,
        isFeatured = isFeatured,
        createdAt = createdAt,
        updatedAt = createdAt,
        ingredients=ingredients,
        image = image,
        cookingSteps = cookingSteps,
        spices = spices
    )


}
