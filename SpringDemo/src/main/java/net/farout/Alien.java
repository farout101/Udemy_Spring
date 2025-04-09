package net.farout;

public class Alien {

    int age;
    Laptop laptop;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Alien () {
        System.out.println("Alien constructor");
    }

    public void code() {
        System.out.println("Alien code");
    }

    public Laptop getLaptop() {
        return laptop;
    }
}
