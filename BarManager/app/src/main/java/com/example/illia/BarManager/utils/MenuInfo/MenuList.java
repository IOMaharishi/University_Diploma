package com.example.illia.BarManager.utils.MenuInfo;

/**
 * Created by wwwmu on 24.01.2016.
 */
public class MenuList {

    static private String champagne [] = {"Каберне Совиньон","Рислинг Келлерберг","Маркез де Рискаль белое","Кристал"};
    static private String vodka [] = {"Горилка","Русский Стандарт Голд","Русский Стандарт Премиум","Флагман"};
    static private String beer [] = {"Баклер","Бочкарёв светлое","Невское","Хугарден"};
    static private String vine [] = {"Российское полусладкое","Вдова Клико","Новосветское","Хугарден"};

    static private String coffee [] = {"Доппио",
            "Капучино",
            "Латте",
            "Эспрессо"};

    static private String tee [] = {"Самовар",
            "Смесь травянная",
            "Чай зеленый",
            "Чай черный"};

    static private String juice [] = {"Морс брусничный",
            "Морс клюквенный",
            "Валио персиковый",
            "Нико томатный"};

    static private String main_food [] = {"Говядина",
            "Пельмени",
            "Пожарская котлета",
            "Стейк из семги",
            "Судак на пару",
            "Стейк рибай",
            "Филе миньон",
            "Шашлык из баранины",
            "Шашлык из свинины"};

    static private String salat [] = {"Винегрет",
            "Оливье",
            "Салат из судака",
            "Селедь под шубой"};

    static private String soups [] = {"Борщ украинский",
            "Крем-суп из белых грибов",
            "Куриная лапша",
            "Солянка мясная",
            "Уха"};

    static private String desserts [] = { "Мороженое ванильное",
            "Мороженое сливочное",
            "Мороженое шоколадное",
            "Мороженое крем-брюле"};


    public static String[] getChampagne() {
        return champagne;
    }

    public static String[] getVodka() {
        return vodka;
    }

    public static String[] getBeer() {
        return beer;
    }

    public static String[] getVine() {
        return vine;
    }

    public static String[] getCoffee() {
        return coffee;
    }

    public static String[] getTee() {
        return tee;
    }

    public static String[] getJuice() {
        return juice;
    }

    public static String[] getMain_food() {
        return main_food;
    }

    public static String[] getSalat() {
        return salat;
    }

    public static String[] getSoups() {
        return soups;
    }

    public static String[] getDesserts() {
        return desserts;
    }
}
