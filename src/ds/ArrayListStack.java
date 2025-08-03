package ds;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayListStack <T> {

    private final ArrayList<T> list;
//Конструктор
    public ArrayListStack(){
        list = new ArrayList<>();
    }

    public void push(T item){
        list.add(item);
    }
    public boolean isEmpty(){
        return list.isEmpty(); //line39
    }

    public T pop(){  //pop->return
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return list.remove(list.size() -1);
    }  //in case pop will return [-2] element ->(list.size() -2)

    public T peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return list.get(list.size() -1);
    }

    public int size(){
        list.clear();
    }

    @Override
    public String toString(){
        return list.toString();
    }


}
