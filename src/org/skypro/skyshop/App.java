package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        Product apple = new Product("Яблоко", 45);
        Product banana = new Product("Банан", 32);
        Product tangerines = new Product("Мандарины", 38);
        Product grapefruit = new Product("Грейпфрут", 65);
        Product lemon = new Product("Лимон", 96);
        Product plum = new Product("Слива", 66);


        basket.addProduct(apple);
        basket.addProduct(banana);
        basket.addProduct(tangerines);
        basket.addProduct(grapefruit);
        basket.addProduct(lemon);
        basket.addProduct(plum);
        basket.printBasketContents();



        System.out.println("Общая стоимость :" + basket.getTotalCost());
        System.out.println("Есть ли продукт 'Яблоко': " + basket.containsProduct("Яблоко"));
        System.out.println("Есть ли продукт 'Банан': " + basket.containsProduct("Банан"));
        System.out.println("Есть ли продукт 'Лимон': " + basket.containsProduct("Лимон"));
        basket.clearBasket();

    }

}
