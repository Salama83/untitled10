package product;

import kg.megacome.models.Product;
import kg.megacome.models.enums.Measure;
import kg.megacome.models.enums.ProductCategory;

public class Milk extends Product {

    public Milk(String name, double cost, Measure measure, ProductCategory productCategory) {
        super(name, cost, measure, productCategory);
    }

}
