package org.example;

public class Comparison {
    int c;
    int d;

    public String comparison (int c, int d) {
        if (c < d) {
            return ("c меньше d");
        } else if (c > d) {
            return ("c больше d");
        } else {
            return ("c равно d");
        }
    }
}
