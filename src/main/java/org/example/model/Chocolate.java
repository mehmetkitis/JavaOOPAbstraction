package org.example.model;

public class Chocolate extends ProductForSale{
    private String variety;

    public Chocolate(String type, double price, String description, String variety) {
        super(type, price, description);
        this.variety = variety;
    }

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }



    @Override
    public void showDetails() {
        System.out.println(getType());
        System.out.println(getPrice());
        System.out.println(getDescription());
        System.out.println(this.variety);
    }
}
