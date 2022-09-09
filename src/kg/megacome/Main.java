package kg.megacome;

import kg.megacome.models.*;
import kg.megacome.service.Operation;
import kg.megacome.service.OperationImpl;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Operation operation = new OperationImpl();
        byte answer = 0;

        System.out.println("Добро пожаловать! ");
        int count = 0;
        Detalis[] detalis = new Detalis[10];


        while (answer != 1) {
            System.out.println("Выберите категорию продуктов");
            operation.getCategory();
            String category = scanner.next();
            Product[] products = operation.getProductByCategory(category);
            operation.getInfo(products);
            System.out.println("Выберите продукт");
            String productName = scanner.next();
            Product product = operation.getProductByName(productName);
            System.out.println("Выберите количество");
            int amount = scanner.nextInt();
            System.out.println("Выберите скидку");
            int discount = scanner.nextInt();
            Detalis detail = new Detalis(product, amount, discount);

            detalis[count] = detail;

            System.out.println("Продолжить 1 - нет, 0 - да");

            answer = scanner.nextByte();
            count++;
        }
        for(Detalis item: detalis){
            if(item!=null)
                System.out.println(item);
        }

        System.out.println("Выберите кассира ");
        String cashier = scanner.next();
        Cashier res = operation.getCashierByName(cashier);
        Order order = new Order();
        order.setDetalis(detalis);
        order.setCashier(res);

        Receipt receipt = operation.getReceipt(order);

    }
}






