package kg.megacome.models;

public class Order {
    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public Detalis[] getDetalis() {
        return detalis;
    }

    public void setDetalis(Detalis[] detalis) {
        this.detalis = detalis;
    }

    private Cashier cashier;
    private Detalis[] detalis;

}
