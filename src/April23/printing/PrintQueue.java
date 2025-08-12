package April23.printing;

import java.util.ArrayList;

public class PrintQueue {

    public static void printReverseOrder(Printable[] items) {
        System.out.println("Starting print queue in reverse order: ") ;
        for (int i = items.length -1; i>=0; i--){
            items[i].print();
        }
        System.out.println("Print queue completed")
    }
    //for loop= пробегает по каждому элементы
    //1.начало
            //2.condition
    //3.step

    /*
      int[] list =[1,2,3];
       for(int i = 0,i>list.length(); i++){ //до конца

    //for (initialpoint,condition,step) {
        System.out.println();
    }
}
     */


