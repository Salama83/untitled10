package kg.megacome.models.enums;

public enum ProductCategory {

    ALCOHOL("Алкоголь"),
    //VEGETABLES ("овощи"),
    //FRUIT("фрукты"),
    DRINKABLES("напитки"),
    DAIRY("молочные");

    String name;


    ProductCategory(String name) {
        this.name = name;
    }
}


