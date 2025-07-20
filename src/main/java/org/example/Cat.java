package org.example;

public class Cat extends Animal {
    private static int count;
    private int food;
    private int appetit;
    private boolean full;

    public Cat(String name, int run, int swim, int food, int appetit, boolean full) {
        super(name, run, swim);
        this.food = food;
        this.appetit = appetit;
        this.full = full;
    }
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Cat.count = count;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getAppetit() {
        return appetit;
    }

    public void setAppetit(int appetit) {
        this.appetit = appetit;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public Cat() {
        count++;
    }

    public void runCat(int range) {
        if (range >= 0 && range <= 200) {
            System.out.println(getName() + " пробежал " + range + " м");
        } else {
            System.out.println(getName() + " не может пробежать больше 200 м");
        }
    }
    public void swimCat(int range) {
        System.out.println("Плавать не умеет");
    }

    public static void main(String[] args) {

    Cat[] allCats = new Cat[4];
    allCats[0] = new Cat("Барсик", 5, 0, 5, 10, false);
    allCats[1] = new Cat("Снежок", 30, 2, 10, 15, false);
    allCats[2] = new Cat("Мурзик", 10, 1, 6, 10, false);
    allCats[3] = new Cat("Чернышка", 45, 0, 10, 5, false);
    }
    public void eatCat(int food, int appetit){
        if (food >=0 && food<appetit){
            System.out.println("Кот не кушал и голод "+ (full=false));
        }else{
            System.out.println("Кот поел и голод " + (full=true));
        }


    }

}




