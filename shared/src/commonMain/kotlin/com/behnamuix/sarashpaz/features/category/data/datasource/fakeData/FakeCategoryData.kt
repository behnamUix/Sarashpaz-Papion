package com.behnamuix.sarashpaz.features.category.data.datasource.fakeData

import com.behnamuix.sarashpaz.features.category.domain.model.CategoryRecipe
import com.behnamuix.sarashpaz.features.category.domain.model.RecipeModel
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.IngredientUnit
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Ingredients
import com.behnamuix.sarashpaz.features.home.domain.model.recipe.Spices
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
        title:String,
        cookingSteps:List<String>,
        chefName: String,
        ingredients: List<Ingredients>,
        spices: List<Spices>
    ) = RecipeModel(
        id = id,
        image = image,
        title = title,
        cookingSteps=cookingSteps,
        chefName = chefName,
        ingredients=ingredients,
        spices=spices

    )

    val allRecipe=listOf(

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