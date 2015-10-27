/*
 * Project: ArrayListTest.java
 * Description: Playing with ArrayList
 * Author: Seunghoon Park
 * Date: 27th October, 2015
 */
 import java.util.ArrayList;
 public class ArrayListTest {
  public static printList(ArrayList a) {
    System.out.println("The list size is now: " + a.size() + "elements long.");
    System.out.print("[");
    for(int i = 0; i < a.size(); i++) {
     System.out.print(a.get(i) + ", ");
    } 
    System.out.print("]");
   }
  }
  public static void main(String args[]) {
    Arraylist<Integer> list = new Arraylist<Integer>;
    list.add(3);
    list.add(6);
    list.add(9);
    list.add(13);
    list.add(16);
    printList(list);
    list.remove(1);
    list.remove(3);
    list.add(19);
    list.add(23);
    list.add(2, 235);
    list.set(0, 17);
    printList(list);
  }
 }
