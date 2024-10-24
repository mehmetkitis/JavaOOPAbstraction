package org.example.model;

public class Bread extends ProductForSale{
    private String fresh;

    public Bread(String type, double price, String description, String fresh) {
        super(type, price, description);
        this.fresh = fresh;
    }

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(getType());
        System.out.println(getPrice());
        System.out.println(getDescription());
        System.out.println(this.fresh);
    }
}
