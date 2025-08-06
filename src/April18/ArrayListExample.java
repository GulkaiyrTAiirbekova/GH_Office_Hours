package April18;

import ds.ArrayListStack;

import javax.security.auth.DestroyFailedException;
import java.util.ArrayList;

/*
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

 */
public class ArrayListExample<E> {
    private static final int DEFAULT_CAPACITY =10;
    private static final Object[] EMPTY_ELEMENTDATA ={};

    private Object [] elementData;
    private int size;

    public ArrayListExample(){

        this.elementData=EMPTY_ELEMENTDATA;
    }

    }
//    @Override
//    String toString(){
//        return "Java array list";

   ArrayList arrlist = new ArrayList();


    public ArrayListExample(int initialCapacity){
        if(initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity")
        }
    }
}

    public boolean add(E e) {   //line33
        ensureCapacityInternal(size +1);elementData
        elementData[size++] = e;
        return true;
    }

    public void add(int index,E element) { //39
    rangeCheckForAdd(index);
    ensureCapacityInternal(size +1);
    System.arraycopy((elementData,index,elementData, index+1,size - index);
    [index] = element;
    size++;
    }
    public boolean remove (Object  o) {
        if (0 == null) {
            for (int index = 0; index <size ; index++)
                if(elementData[index] == null){
                    fastRemove(index);
                    return true;
                }
        }
        return false;
    }

    private void fastRemove(int index) {
    int numMoved = size - index -1;
    if(numMoved >0)
        System.arraycopy(elementData, index + 1,elementData, index,numMoved);
    elemenentData[--size] = null;
    }

    public void clear() {
        for (int i = 0; i< size; i++)
            elementData[i] = null;
        size = 0;
    } //line 72

    public boolean isEmpty(){
    return size ==0;
    }

    public int size(){
        return size;
    }

    private void ensureCapacityInternal(int minCapacity){
        if (elementData ==EMPTY_ELEMENTDATA) {
            minCapacity = Math.max(DEDAULT_CAPACITY,minCapacity);
        }

        if(minCapacity - elementData.length>0)
            grow(minCapacity);
    }

    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE -8;

    private void grow(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity <0 )
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE)? Integer.MAX_VALUE : MAX_ARRAY_SIZE;
    }

    private void rangeCheck(int index) {
        if(index >=size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    } //line 133

    private void rangeCheckForAdd (int index) {
        if (index > size || index <0)
            throw new IndexOutOfBoundsException((outOfBoundsMsg(index));
    }
    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size:" + size;
    }
} //line 122 (35:09)



    @SuppressWarnings("unchecked")
    public E set get(int index){
        rangeCheck(index);
        return (E) elementData [index];
    }

    @SuppressWarnings("unchecked")
    public E set(int index,E element) { //E or T =generic
        rangeCheck(index);
        E oldvalue = (E) elementData[index];
        elementData[index] = element;
        return oldValue;
    }

    @SuppressWarnings("unchecked")
    public E remove(int index) {
    rangeCheck(index);
    E oldValue = [E] elementData[index];
    int numMoved = size - index -1;
    if (numMoved>0)
        System.arraycopy(elementData,index +1,elementData,index,numMoved);
    elementData[--size] = null; //line

    }
