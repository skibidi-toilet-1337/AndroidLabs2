package com.example.mycity.data

import com.example.mycity.R

/*
локальный источник гайда по городу в оперативной памяти.
источники фото хранятся в res/drawable.
*/

class LocalMyCityRepository : MyCityRepository {

    override fun getCategories(): List<Category> = categories

    private companion object {

        val categories = listOf(
            Category(
                id = "restaurants",
                title = "Рестораны",
                subtitle = "Гастрономические впечатления",
                description = "От сибирской кухни до грузинских и итальянских блюд — места, ради которых стоит планировать вечер.",
                imageRes = R.drawable.r_hachapuri,
                places = listOf(
                    Place(
                        id = "korchma",
                        categoryId = "restaurants",
                        name = "Корчма «Южный дворик»",
                        imageRes = R.drawable.r_korchma,
                        shortDescription = "Южнорусская кухня в уютной корчме",
                        description = "Просторная корчма на Красноармейской с щедрыми порциями и домашней атмосферой. В меню — борщ, вареники, запечённое мясо и блюда, приготовленные по южнорусским рецептам.",
                        address = "Красноармейская, 144",
                        workingHours = "12:00–00:00",
                        rating = 4.8f,
                        tags = listOf("Русская кухня", "Большие порции", "Для семьи")
                    ),
                    Place(
                        id = "mariko",
                        categoryId = "restaurants",
                        name = "Хачапури Марико",
                        imageRes = R.drawable.r_hachapuri,
                        shortDescription = "Грузинская кухня и хачапури из печи",
                        description = "Ресторан, где готовят настоящие хачапури, хинкали и шашлык по грузинским рецептам. Тёплый интерьер и гостеприимный сервис делают его хорошим выбором для семейного ужина.",
                        address = "Красноармейская, 144А",
                        workingHours = "11:00–23:00",
                        rating = 4.8f,
                        tags = listOf("Грузинская кухня", "Хинкали", "Хачапури")
                    ),
                    Place(
                        id = "zaboy",
                        categoryId = "restaurants",
                        name = "Забой",
                        imageRes = R.drawable.r_zaboy,
                        shortDescription = "Сибирская кухня и мясо на огне",
                        description = "Один из самых известных ресторанов Кемерова, оформленный в стиле шахтёрской Кузбасса. Здесь подают сибирские закуски, мясо на гриле и десерты, а вечерами звучит живая музыка.",
                        address = "бульвар Строителей, 21",
                        workingHours = "10:00–01:00",
                        rating = 4.7f,
                        tags = listOf("Сибирская кухня", "Мясо на огне", "Живая музыка")
                    ),
                    Place(
                        id = "grill42",
                        categoryId = "restaurants",
                        name = "Гриль-бар 42",
                        imageRes = R.drawable.r_grill42,
                        shortDescription = "Стейки и гриль на проспекте Ленина",
                        description = "Современный гриль-бар с открытой кухней и большим выбором мяса. Сюда приходят за сочными стейками, бургерами и крафтовым пивом в компании друзей.",
                        address = "проспект Ленина, 90/2",
                        workingHours = "12:00–00:00",
                        rating = 4.6f,
                        tags = listOf("Стейки", "Гриль", "Крафтовое пиво")
                    ),
                    Place(
                        id = "syrovarnya",
                        categoryId = "restaurants",
                        name = "Сыроварня",
                        imageRes = R.drawable.r_syrovarnya,
                        shortDescription = "Итальянская кухня и собственные сыры",
                        description = "Ресторан на бульваре Строителей с пастой, пиццей и сырами собственного производства. Просторный зал и летняя веранда подходят и для делового обеда, и для долгого ужина.",
                        address = "бульвар Строителей, 16",
                        workingHours = "12:00–00:00",
                        rating = 4.7f,
                        tags = listOf("Итальянская кухня", "Сыры", "Веранда")
                    )
                )
            ),
            Category(
                id = "parks",
                title = "Парки",
                subtitle = "Воздух и прогулки",
                description = "Городские сады, сосновый бор и набережная Томи — зелёные пространства для прогулок, пикников и отдыха в любое время года.",
                imageRes = R.drawable.p_chudes,
                places = listOf(
                    Place(
                        id = "park_chudes",
                        categoryId = "parks",
                        name = "Парк Чудес",
                        imageRes = R.drawable.p_chudes,
                        shortDescription = "Главный городской сад с аттракционами",
                        description = "Исторический городской сад в центре Кемерова с колесом обозрения, каруселями и тенистыми аллеями. Летом здесь работают фонтаны и открытые кафе, а зимой заливают каток.",
                        address = "улица Кирова, 4",
                        workingHours = "10:00–22:00",
                        rating = 4.8f,
                        tags = listOf("Аттракционы", "Колесо обозрения", "Для детей")
                    ),
                    Place(
                        id = "sosnovy_bor",
                        categoryId = "parks",
                        name = "Сосновый бор",
                        imageRes = R.drawable.p_sosnovy,
                        shortDescription = "Сосновый лес с видом на город",
                        description = "Большой лесной массив на правом берегу Томи, любимый жителями для прогулок и лыжных тренировок. С обзорных площадок открывается панорама Кемерова и долины реки.",
                        address = "Сосновый бульвар, Рудничный район",
                        workingHours = "Круглосуточно",
                        rating = 4.9f,
                        tags = listOf("Лес", "Панорама", "Лыжные трассы")
                    ),
                    Place(
                        id = "park_pobedy",
                        categoryId = "parks",
                        name = "Парк Победы имени Жукова",
                        imageRes = R.drawable.p_pobedy,
                        shortDescription = "Мемориальный парк на Притомском проспекте",
                        description = "Парк, посвящённый победе в Великой Отечественной войне, с монументами, аллеями и тихими уголками для прогулок. Отсюда открывается вид на Томь и городские кварталы.",
                        address = "улица Красноармейская",
                        workingHours = "Круглосуточно",
                        rating = 4.8f,
                        tags = listOf("Мемориал", "Прогулки", "Вид на Томь")
                    ),
                    Place(
                        id = "pritomskaya",
                        categoryId = "parks",
                        name = "Притомская набережная",
                        imageRes = R.drawable.p_pritomskaya,
                        shortDescription = "Прогулочная зона вдоль реки Томь",
                        description = "Благоустроенная набережная с широкой аллеей, скамейками и скульптурами. Вечером здесь особенно приятно гулять, любуясь огнями города и мостом через Томь.",
                        address = "Притомская набережная",
                        workingHours = "Круглосуточно",
                        rating = 4.8f,
                        tags = listOf("Набережная", "Закаты", "Прогулки")
                    ),
                    Place(
                        id = "voloshinoy",
                        categoryId = "parks",
                        name = "Комсомольский парк имени Веры Волошиной",
                        imageRes = R.drawable.p_voloshinoy,
                        shortDescription = "Зелёный парк в Ленинском районе",
                        description = "Уютный парк с ухоженными газонами, детскими площадками и спортивными зонами. Местные жители приходят сюда на утренние пробежки и семейные прогулки выходного дня.",
                        address = "проспект Ленина, 91/2",
                        workingHours = "08:00–23:00",
                        rating = 4.6f,
                        tags = listOf("Спорт", "Детские площадки", "Для семьи")
                    )
                )
            ),
            Category(
                id = "coffee",
                title = "Кофейни",
                subtitle = "Кофе на каждый день",
                description = "Места, где можно начать утро с капучино, поработать с ноутбуком или встретиться с друзьями за десертом.",
                imageRes = R.drawable.c_podorozhnik,
                places = listOf(
                    Place(
                        id = "podorozhnik",
                        categoryId = "coffee",
                        name = "Подорожник",
                        imageRes = R.drawable.c_podorozhnik,
                        shortDescription = "Доступная кофейня в центре города",
                        description = "Сеть доступных кофеен с быстрым обслуживанием и понятным меню. Здесь удобно взять кофе с собой, перекусить выпечкой или позавтракать перед прогулкой по центру.",
                        address = "улица Кирова, 37А",
                        workingHours = "07:00–22:00",
                        rating = 4.5f,
                        tags = listOf("Кофе с собой", "Недорого", "Выпечка")
                    ),
                    Place(
                        id = "coffeelike",
                        categoryId = "coffee",
                        name = "Coffee Like",
                        imageRes = R.drawable.c_coffeelike,
                        shortDescription = "Кофе и десерты в ТРЦ «Лапландия»",
                        description = "Небольшая кофейня в торговом центре с классическими напитками и сезонными новинками. Удобная остановка после шопинга или перед сеансом в кино.",
                        address = "Октябрьский проспект, 34",
                        workingHours = "09:00–22:00",
                        rating = 4.4f,
                        tags = listOf("В торговом центре", "Кофе с собой", "Десерты")
                    ),
                    Place(
                        id = "bulochnaya",
                        categoryId = "coffee",
                        name = "Булочная-кондитерская № 1",
                        imageRes = R.drawable.c_bulochnaya,
                        shortDescription = "Свежая выпечка и кофе на Советском",
                        description = "Уютная булочная-кондитерская с круассанами, пирожными и свежим хлебом. Аромат выпечки и спокойная атмосфера делают её хорошим местом для неспешного завтрака.",
                        address = "Советский проспект, 42",
                        workingHours = "08:00–21:00",
                        rating = 4.7f,
                        tags = listOf("Выпечка", "Завтраки", "Десерты")
                    ),
                    Place(
                        id = "zavtra_kat",
                        categoryId = "coffee",
                        name = "«Завтра, Кать»",
                        imageRes = R.drawable.c_zavtra,
                        shortDescription = "Сытные завтраки и хороший кофе",
                        description = "Кафе с домашними завтраками, сырниками и большими порциями кофе. Сюда приходят, чтобы спокойно начать день или встретиться с друзьями за поздним завтраком.",
                        address = "Советский проспект, 43",
                        workingHours = "08:00–22:00",
                        rating = 4.6f,
                        tags = listOf("Завтраки весь день", "Сырники", "Уютно")
                    ),
                    Place(
                        id = "travelers",
                        categoryId = "coffee",
                        name = "Traveler's Coffee",
                        imageRes = R.drawable.c_travelers,
                        shortDescription = "Кофейня с собственной обжаркой",
                        description = "Просторная кофейня на Весенней с зерном собственной обжарки и большим выбором десертов. Хорошее место для встречи, работы с ноутбуком или прогулки по историческому центру.",
                        address = "улица Весенняя, 16",
                        workingHours = "07:00–23:00",
                        rating = 4.6f,
                        tags = listOf("Свежая обжарка", "Работа с ноутбуком", "Центр города")
                    )
                )
            ),
            Category(
                id = "cinema",
                title = "Кинотеатры",
                subtitle = "Большой экран",
                description = "От исторических залов до современных мультиплексов — выбирайте место под настроение и формат фильма.",
                imageRes = R.drawable.k_yubileyny,
                places = listOf(
                    Place(
                        id = "yubileyny",
                        categoryId = "cinema",
                        name = "Юбилейный",
                        imageRes = R.drawable.k_yubileyny,
                        shortDescription = "Киноцентр на проспекте Ленина",
                        description = "Один из главных кинотеатров города с несколькими залами и удобными креслами. Здесь проходят премьеры, детские показы и вечерние сеансы в формате 3D.",
                        address = "проспект Ленина, 91",
                        workingHours = "10:00–00:00",
                        rating = 4.7f,
                        tags = listOf("Премьеры", "3D", "Парковка")
                    ),
                    Place(
                        id = "kosmos",
                        categoryId = "cinema",
                        name = "Космос",
                        imageRes = R.drawable.k_kosmos,
                        shortDescription = "Кинотеатр с большими залами",
                        description = "Кинотеатр на улице 50 лет Октября с просторными залами и качественным звуком. Помимо новинок проката здесь показывают мультфильмы и семейное кино.",
                        address = "улица 50 лет Октября, 28",
                        workingHours = "10:00–01:00",
                        rating = 4.6f,
                        tags = listOf("Большие залы", "Мультфильмы", "Игровая зона")
                    ),
                    Place(
                        id = "kuzbasskino",
                        categoryId = "cinema",
                        name = "Кузбасскино",
                        imageRes = R.drawable.k_kuzbasskino,
                        shortDescription = "Городской киноцентр с фестивалями",
                        description = "Киноцентр в центре Кемерова, где проходят премьеры, фестивали и специальные показы. Помимо коммерческого кино здесь можно увидеть авторские фильмы и документальные картины.",
                        address = "Советский проспект, 4А",
                        workingHours = "10:00–23:00",
                        rating = 4.5f,
                        tags = listOf("Фестивали", "Авторское кино", "Центр города")
                    ),
                    Place(
                        id = "planeta",
                        categoryId = "cinema",
                        name = "Планета Кино Променад 2",
                        imageRes = R.drawable.k_planeta,
                        shortDescription = "Мультиплекс в ТРК «Променад 2»",
                        description = "Современный мультиплекс на третьем этаже торгово-развлекательного комплекса. Удобные кресла, большой выбор сеансов и возможность совместить кино с шопингом и ужином.",
                        address = "проспект Химиков, 39",
                        workingHours = "10:00–01:00",
                        rating = 4.6f,
                        tags = listOf("Мультиплекс", "В торговом центре", "Удобные кресла")
                    ),
                    Place(
                        id = "starmax",
                        categoryId = "cinema",
                        name = "STARMAX",
                        imageRes = R.drawable.k_starmax,
                        shortDescription = "Кинотеатр в ТРЦ «ЛетоСити»",
                        description = "Кинотеатр с современным оборудованием и несколькими залами в торговом центре на Московском проспекте. Здесь удобно смотреть блокбастеры всей семьёй и совмещать сеанс с прогулкой по ТЦ.",
                        address = "Московский проспект, 19",
                        workingHours = "10:00–00:00",
                        rating = 4.5f,
                        tags = listOf("Блокбастеры", "Для семьи", "В торговом центре")
                    )
                )
            ),
            Category(
                id = "malls",
                title = "Торговые центры",
                subtitle = "Шопинг и развлечения",
                description = "Места, где можно совместить покупки с обедом, кино и прогулкой — от центральных галерей до больших торгово-развлекательных комплексов.",
                imageRes = R.drawable.m_laplandia,
                places = listOf(
                    Place(
                        id = "laplandia",
                        categoryId = "malls",
                        name = "ТРЦ «Лапландия»",
                        imageRes = R.drawable.m_laplandia,
                        shortDescription = "Крупный торговый центр на Октябрьском",
                        description = "Один из самых известных торговых центров Кемерова с магазинами одежды, электроникой, кафе и развлечениями. Удобная парковка и близость к центру делают его популярным местом для шопинга.",
                        address = "Октябрьский проспект, 34",
                        workingHours = "10:00–21:00",
                        rating = 4.6f,
                        tags = listOf("Магазины", "Парковка", "Фудкорт")
                    ),
                    Place(
                        id = "grinvich",
                        categoryId = "malls",
                        name = "ТРК «Гринвич»",
                        imageRes = R.drawable.m_grinvich,
                        shortDescription = "Торгово-развлекательный комплекс у ФПК",
                        description = "Большой комплекс с магазинами, кинотеатром и кафе на Молодёжном проспекте. Сюда удобно приезжать всей семьёй: помимо шопинга здесь есть развлечения для детей.",
                        address = "Молодёжный проспект, 2",
                        workingHours = "10:00–22:00",
                        rating = 4.5f,
                        tags = listOf("Кинотеатр", "Развлечения", "Для семьи")
                    ),
                    Place(
                        id = "tc_ya",
                        categoryId = "malls",
                        name = "ТЦ «Я»",
                        imageRes = R.drawable.m_ya,
                        shortDescription = "Торговый центр в центре города",
                        description = "Торговый центр на Кузнецком проспекте с магазинами, кафе и услугами. Удобное расположение и парковка рядом делают его хорошим вариантом для быстрых покупок.",
                        address = "Кузнецкий проспект, 33Б",
                        workingHours = "10:00–21:00",
                        rating = 4.4f,
                        tags = listOf("Центр города", "Парковка", "Кафе")
                    ),
                    Place(
                        id = "kontinent",
                        categoryId = "malls",
                        name = "РК «Континент»",
                        imageRes = R.drawable.m_kontinent,
                        shortDescription = "Развлекательный комплекс на Советском",
                        description = "Комплекс на Советском проспекте, где под одной крышей собраны магазины, кафе и развлечения. Хорошее место, чтобы провести вечер с семьёй или встретиться с друзьями.",
                        address = "Советский проспект, 26",
                        workingHours = "10:00–22:00",
                        rating = 4.3f,
                        tags = listOf("Развлечения", "Кафе", "Для семьи")
                    ),
                    Place(
                        id = "raduga",
                        categoryId = "malls",
                        name = "ТРЦ «Радуга»",
                        imageRes = R.drawable.m_raduga,
                        shortDescription = "Торговый центр на проспекте Шахтёров",
                        description = "Просторный торговый центр с большим выбором магазинов, супермаркетом и фудкортом. Светлый атриум и удобная парковка делают его популярным у жителей северной части города.",
                        address = "проспект Шахтёров, 54",
                        workingHours = "10:00–21:00",
                        rating = 4.5f,
                        tags = listOf("Супермаркет", "Фудкорт", "Парковка")
                    )
                )
            )
        )
    }
}
