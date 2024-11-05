package Inheritance;

import Humans.Child;
import Humans.GrandParents;
import Humans.Parents;

public class Test {
    public static void main(String[] args) {
//       Student student = new Student();
//       student.setAge(-16);
//        System.out.println(student.getAge());

//         BankAccount bankAccount = new BankAccount();
//         bankAccount.deposit(-10);
//         bankAccount.withdraw(10);
//         bankAccount.deposit(100);
//         bankAccount.withdraw(10);
//
//        System.out.println(bankAccount.getBalance());



//          CONSTRUCTOR

//        Student student = new Student("Rai", 1, 13);
//        System.out.println(student.getAge());
//

//        Inheritance

//        Dog dog = new Dog();
//
//        dog.setAge(3);
//        dog.setName("BOB");
//        dog.eat();
//        dog.sayHello();
//

//        Multi Level Inheritance
//
//        Child child = new Child();
//        child.setName("Mum");
//        child.setAge(12);
//        System.out.println(child.getName());
//        System.out.println(child.getAge());
//
//
//
//        Parents parents = new Parents();
//        parents.setName("NIn");
//        parents.setAge(32);
//        System.out.println(parents.getAge());
//        System.out.println(parents.getName());
//
//
//        GrandParents grandParents = new GrandParents();
//        System.out.println(grandParents.getAge());


//      Polymorphism:

        Animal myAnimal = new Animal();
        myAnimal.sayHello();


        Animal dog = new Dog();  // UP Casting
        dog.sayHello();

        Animal cat = new cat();
        cat.sayHello();

        Dog myDog = (Dog) dog;  // Down Casting
  }
}
