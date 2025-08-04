package April18;

import ds.ArrayListStack;

class Animal{}
class Dog extends Animal {}
//extends = only once
//implements = can several times => Fly,jnjvm,vm
//interface  =>An interface is a completely "abstract class" that is used to group related methods with empty bodies:

public class Main {
    public static void main (String [] args) {
        Dog dog = new Dog();

        //Both return true

        System.out.println(dog instanceof Dog); //true
        System.out.println(dog.instanceof Animal); //true

    }
}

public class Person {
    private String name;
    private String title = "Nim"; //by default for all other the same

    public Person(String name){
        this.name = name;
        this.title = title

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

    public Builder setValue(int  value) {
        this.value = value;
        return this;
    }
}

public class Animal {
    private String type;

    public Animal (String type) {
        this.type = type;
    }
}

public class Dog extends Animal {
    private String breed;

    public Dog (String breed){
       // super("Dog"); method from parent class and then it's own method
        this.breed = breed;
    }
}

public class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

public class Circle extends Shape{
    @Override //Переопределяем parent class
    public void draw(){
        super.draw();
        System.out.println("Drawing a circle");
    }
}
Circle cir =  new Circle();
cir draw(); //вызовется shape and drawing

public class ArrayListExample<E> {
    private static final int DEFAULT_CAPACITY =10;
    private static final Object[] EMPTY_ELEMENTDATA ={};

    private Object [] elementData;
    private int size;

    public ArrayListExample(){
        this.elementData=EMPTY_ELEMENTDATA;
    }

    public ArrayListExample(int initialCapacity){
        if(initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity")
        }
    }
}(20:45 min)