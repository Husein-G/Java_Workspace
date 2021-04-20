package Collections.List;

import java.util.*;

public class arrayListDemo {
    public static void main (String[] args) {
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Adam");
        list.add("Monty");
        list.add("Lind");
        list.add("James");
        list.add("Bernie");
        list.add(3,"Russel");
        list.add("John");
        list.add(0,"John");
        System.out.println(list);
        list.add(0,"Speed");
        list.set(5,"Alex");
        System.out.println(list);
        list.add("Morris");
        System.out.println(list);
        list.remove(6);
        list.remove("John");
        System.out.println(list);
        list.remove("John");
        System.out.println(list);
        list.add("John");
        list.add("John");
        list.add("John");
        System.out.println(list);
        list.remove("John");
        System.out.println(list);
        list.remove("John");
        System.out.println(list);
        list.add(2,"John");
        System.out.println(list);
        list.remove("John");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(5));
        for (int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (String str : list ) {
            System.out.print(str + " ");
        }
    }
}