package org.example;

public class Product {
    private String title;
    private String date;
    private String manufacturer;
    private String country;
    private int price;
    private boolean booking;

    public Product (String title, String date, String manufacturer, String country, int price,
                    boolean booking){
        this.title = title;
        this.date = date;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.booking = booking;
    }
    public void info(){
        System.out.println("Наименование товара: " + title + " Дата производства: " + date
                + " Производитель: " + manufacturer + " Страна производства: " + country + " Цена: "
                + price + " Бронь товара: " + booking);
    }
    // Задание 2
    public static void main(String[] args) {
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
    }
}