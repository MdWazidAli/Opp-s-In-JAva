package Encapsulation;

public class Student {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid Age");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int rollNumber;
    private int age;



//    CONSTRUCTOR

//    public void student(String name, int rollNumber, int age) {
//        this.age = age;
//        this.name = name;
//        this.rollNumber = rollNumber;
//    }
}
