package kg.megacome.service;

import kg.megacome.models.Receipt;
import kg.megacome.models.Cashier;
import kg.megacome.models.Order;
import kg.megacome.models.Product;

public interface Operation {
     Receipt getReceipt(Order order);
    Cashier getCashier(String name);

    void getCategory();

    Product[] getProductByCategory(String category);
    Product[] getInfo(Product[] products);

    Product getProductByName(String productName);
    Cashier getCashierByName(String cashier );

}


