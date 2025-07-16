package org.example;

public class park {
    private String name;
    private String time;
    private Attraction [] attraction;

    public class Attraction {
        private String name;
        private String time;
        private int price;


        public Attraction(String name, String time, int price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }
    }
    public static void main(String[] args) {
        Attraction[] attraction = new Attraction[5];
    }
}
