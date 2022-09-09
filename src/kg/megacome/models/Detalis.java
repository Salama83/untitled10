package kg.megacome.models;

public class Detalis {
    private String product;
    private double amount;
    private double discount;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Detalis(Product product, double amount, double discount) {
        this.product = String.valueOf(product);
        this.amount = amount;
        this.discount = discount;


    }
    }



