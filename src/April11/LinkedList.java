package April11;

import static sun.util.locale.LocaleUtils.isEmpty;

//type generic can be any type of value
public class LinkedList <T>{    //chose any type and then follow it <T>
    private static class Node <T>{
        T data;
        Node <T> next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }
//Переменные LinkedList ,
// В данном случае простая переменаая int
// и переменный объект Node - тк мы сами его ранее в классе создали(Node can be any name)
    private Node<T> head;
    private Node<T> tail;
    private int size;

//Конструктор LinkedList /we've created 2 consistance of this class = head, tail
    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
//boolean return False , if size !=0 and True when size = 0
    public boolean isEmpty(){
        return size ==0;
    }

// we need to add 77 using algorithms
//head              tail
//1 -4 -1000 -56 - 12  ->null -> 77 -> null
// tail.next = 77
//     tail = 77

    // LinkedLIst
    // 5 million  users    which time is faster of adding Mike to each app?
    //5  users
    //ANSWER = there they same, because LinkedList doesn't look to the whole number, ONLY NEEDS the LAST one, (ex.instagram)
    public void add(T data) {
        Node <T> newNode = new Node<>(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else{
            tail.next = newNode;
            tail = newNode;
        }

        size++;   //size 2->3 after adding 77 => 4 -11 -77
    }

    public void add(int index,T data){
        if (index<0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index +" ,Size: " + size);
        }

        if (index ==size) {
            add(data);
            return;
        }

        Node<T> newNode = new Node <>(data);

        if (index == 0){
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
    }
//line74
    public T remove(int index){
        if (index<0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " +size);

        }

        T removeData;

        if (index==0){
            removeData = head.data;
            head = head.next;
            if(head==null){
                tail = null;
            }
        }else{
            Node<T> current = head;
            for(int i =0; i < index -1; i++){
                current = current.next;
            }

            removeData = current.next.data;

            if (current.next ==tail){
                tail = current;
            }

            current.next = current.next.next; //line99
        }

        size --;
        return removeData;
    }

    public T get(int index){
        if (index<0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<T> current = head;
        for (int i =0; i<index;i++){
            current = current.next;
        }

        return current.data;//line117
    }


    public void set(int index, T data){
        if(index<0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<T> current = head;
        for (int i = 0; i<index; i++){
            current = current.next;
        }

        T oldData = current.data;  //line 133
        current.data = data;

    }

    public int size(){
        return size;  //line 137
    }


    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    public int IndexOf(T data) {
        Node <T> current = head;
        int index = 0;

        while (current != null) {
            if ((data == null && current.data == null )) ||
                    (data != null && data.equals(current.data))) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;  //line 163
    }


    @Override   //override toString
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        Node <T> current = head;

        while (current !=null){
            sb.append(current.data);
            if (current.next != null){
                sb.append(", ");  //(2,3)
            }
            current = current.next;
        }

        sb.append("]");
        return sb.toString();
    }


    public void reverse(){
        if (head == null || head.next == null){
            return;
        }

        Node <T> prev = null;
        Node <T> current = head;
        Node <T> next = null;

        tail = head;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

}
