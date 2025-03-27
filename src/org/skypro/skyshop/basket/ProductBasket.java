package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private static final Product[] products = new Product[5];

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        System.out.println("Невозможно добавить продукт");
    }


    public int getTotalCost() {
        int totalCost = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                totalCost += products[i].getPrice();
            }
            System.out.println("Итого: " + totalCost);
        }
        return totalCost;
    }

    public boolean containsProduct(String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getName().equals(name)) {
                return true;
            }
        }

        return false;
    }

    public void printBasketContents() {
        boolean isEmpty = true;
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName() + ": " + product.getPrice());
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("В корзине пусто");
        } else {
            int totalCost = getTotalCost();
            System.out.println("Итого: " + totalCost);
        }
    }

    public void clearBasket() {
        return;
    }
}









