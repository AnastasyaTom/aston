package org.example;

public class Dog extends Animal{
    private static int count;
    public Dog (String name, int run, int swim) {
        super(name, run, swim);
    }
    public Dog() {
        count++;
    }
    public static int getCount() {
        return count;
    }

    public void runDog(int range) {

        if (range >=0 && range <= 500) {
            System.out.println(getName() + " пробежала " + range + " м");
        } else {
            System.out.println(getName() + " не может пробежать больше 500 м");
        }
    }

    public void swimDog(int range) {
        if (range >= 0 && range <= 10) {
            System.out.println(getName() + " проплыла " + range + " м");
        } else {
            System.out.println(getName() + " не может проплыть больше 10 м");
        }
    }
}
