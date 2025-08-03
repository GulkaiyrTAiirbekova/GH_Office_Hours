package April18;

class Animal{}
class Dog extends Animal {}
//extends = only once
//implements = can several times => Fly,jnjvm,vm
//interface  =>An interface is a completely "abstract class" that is used to group related methods with empty bodies:

public class ArrayListExample {
    public static void main (String [] args) {
        Dog dog = new Dog();

        //Both return true

        System.out.println(dog instanceof Dog); //true
        System.out.println(dog.instanceof Animal); //true

    }
}

public class Person {
    private String name;

    public Person(String name){
        this.name = name;

    }
}

public class Person2 {
    private String name;
    private int age;

    public Person2() {
        this("Unknown", 0);
    }
    public Person2(String name, int age) {
        this.name = name;
        this.age =age;
    }
}

public class Builder {
    private int value; //line39
}