package Inheritance;

public class Animal {

    private String name;
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("This Animal Eats Food:");
    }

    public void sayHello() {
        System.out.println("...");
    }
}