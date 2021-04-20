package Collections.List;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        list.add("Anuj");
        list.add("Gaurav");
        list.add("Harsh");
        list.add("Virat");
        list.add("Gaurav");
        list.add("Harsh");
        list.add("Amit");
        System.out.println("Initial list of elements: "+list);
        //Removing specific element from arraylist  
        list.remove("Vijay");
        System.out.println("After invoking remove(object) method: "+list);
        //Removing element on the basis of specific position  
        list.remove(0);
        System.out.println("After invoking remove(index) method: "+list);
        LinkedList<String> list2=new LinkedList<String>();
        list2.add("Ravi");
        list2.add("Hanumat");
        // Adding new elements to arraylist  
        list.addAll(list2);
        System.out.println("Updated list : "+list);
        //Removing all the new elements from arraylist
        list.removeAll(list2);
        System.out.println("After invoking removeAlist() method: "+list);
        //Removing first element from the list  
        list.removeFirst();
        System.out.println("After invoking removeFirst() method: "+list);
        //Removing first element from the list  
        list.removeLast();
        System.out.println("After invoking removeLast() method: "+list);
        //Removing first occurrence of element from the list  
        list.removeFirstOccurrence("Gaurav");
        System.out.println("After invoking removeFirstOccurrence() method: "+list);
        //Removing last occurrence of element from the list  
        list.removeLastOccurrence("Harsh");
        System.out.println("After invoking removeLastOccurrence() method: "+list);

        //Removing all the elements available in the list
        list.clear();
        System.out.println("After invoking clear() method: "+list);
        list.addFirst("Lokesh");
        System.out.println("After invoking addFirst(E e) method: "+list);
        //Adding an element at the last position
        list.addLast("Harsh");
        System.out.println("After invoking addLast(E e) method: "+list);
        Iterator i=list.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}