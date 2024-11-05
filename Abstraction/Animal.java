package Abstraction;

public abstract class Animal {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sayHello();

    public void sleep() {
        System.out.println("zzz...");
    }
}