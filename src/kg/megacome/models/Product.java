package kg.megacome.models;

import kg.megacome.models.enums.Measure;
import kg.megacome.models.enums.ProductCategory;

public abstract class Product {
    private String name;
    private double cost;
    private Measure measure;
    private ProductCategory productCategory;

    public Product(String name, double cost, Measure measure, ProductCategory productCategory) {
        this.name = name;
        this.cost = cost;
        this.measure = measure;
        this.productCategory = productCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }




}
