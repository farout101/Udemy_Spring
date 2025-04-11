package net.farout;

@FunctionalInterface
interface  A {
    void show(int i);
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A() {
            public void show(int i) {
                System.out.println("Value of i is: " + i);
            }
        };
    }
}
