package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product = new Product("сыр", "05.02.2025", "МСЗ", "РБ", 19, true);
        product.info();

        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Readmy 16 Pro", "05.05.2025",
                "Xiaomi Communication Co", "China", 2200, true);
        productsArray[2] = new Product("Apple iPhone 16", "15.04.2025",
                "Apple Inc", "China", 3099, false);
        productsArray[3] = new Product("Redmi Note 14 Pro + 5G", "01.12.2024",
                "Xiaomi Communication Co", "China", 1549, false);
        productsArray[4] = new Product("Huawei nova Y72S", "01.01.2024",
                "Huawei Device Co.", "China", 449, true);

        productsArray[2].info();
    }

}