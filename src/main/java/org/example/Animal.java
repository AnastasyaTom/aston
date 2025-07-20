package org.example;

public abstract class Animal {
    private String name;
    private int run;
    private int swim;
    private static int count;

    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public static void setCount(int count) {
        Animal.count = count;
    }

    public void animalRun(int range) {
        System.out.println(name + " пробежал " + run + " м. ");
    }

    public void animalSwim() {
        System.out.println(name + " проплыл " + swim + " м.");
    }

    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
