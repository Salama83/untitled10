package kg.megacome.service;

import kg.megacome.models.*;
import kg.megacome.models.enums.Measure;
import kg.megacome.models.enums.ProductCategory;
import product.Alcohol;
import product.Milk;
import product.Sugar;
import product.Water;

public class OperationImpl implements Operation {
    Sugar sugar = new Sugar("Сахар", 61, Measure.KG, ProductCategory.DAIRY);
    Alcohol bread = new Alcohol("Алкоголь", 61, Measure.PSC, ProductCategory.BAKERY);
    Milk milk = new Milk("Молоко", 71, Measure.LI, ProductCategory.DAIRY);
    Water water = new Water("Вода", 71, Measure.LI, ProductCategory.DRINKABLES);

    Product[] products = {sugar, milk, bread, water};
    Cashier Нурс = new Cashier("Айдар", "Cashier1", 19);
    Cashier Айдар = new Cashier("Нурс", "Cashier2", 20);
    Cashier[] cashiers = {Айдар, Нурс};


    @Override
    public Receipt getReceipt(Order order) {

        return null;
    }

    @Override
    public Cashier getCashier(String name) {
        return null;
    }

    @Override
    public void getCategory() {
        for (ProductCategory item : ProductCategory.values()) {
            System.out.println(item.name());
        }
    }

    @Override
    public Product[] getProductByCategory(String category) {
        Product[] result = new Product[10];
        for(int i=0;i<products.length; i++){
            if(products[i].getProductCategory().equals(ProductCategory.valueOf(category))) {
                result[i] = products[i];;
            }
        }
        return result;
    }

    @Override
    public Product[] getInfo(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getName() + " " + products[i].getCost());
            }
        }
        return null;
    }

    @Override
    public Product getProductByName(String productName) {
        for (Product item : products) {
            if (productName.equals(item.getName())) {
                return item;
            }

        }
        return null;
    }

    @Override
    public Cashier getCashierByName(String cashier) {
        for (Cashier item : cashiers) {
            if (item.getName().equals(cashier))
                return item;
            System.out.println(item.getName());
        }

        return null;
    }
}



