package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale chocolate = new Chocolate("dessert", 20.0,"good");
        ProductForSale cake = new Coke("drink",10.0,"bad");
        ProductForSale bread = new Bread("salty",5.0,"good");

        ProductForSale[] products = {chocolate,cake,bread};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(int i = 0 ; i<products.length; i++){
            products[i].showDetails();
        }
    }
}