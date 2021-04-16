package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo{
    public static void main(String[] args){
        //Creating a HashSet object of type String.
        HashSet<String> hashSet = new HashSet<String>();

        //Adding values to hash set object.
        hashSet.add("John");
        hashSet.add("Julie");
        hashSet.add("Joe");
        hashSet.add("John");
        hashSet.add("Josh");
        hashSet.add("John");
        hashSet.add("Albert");
        hashSet.add("Ben");
        hashSet.add("Mosh");
        hashSet.add("Vicky");
        System.out.println("Hash Set is: " + hashSet);

        //Iterating through hash set using Iterator interface.
        Iterator<String> itr = hashSet.iterator();
        while (itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }

        //Removing value John from hash set.
        hashSet.remove("John");
        System.out.println("Set after removing John is: " + hashSet);

        //Verifying whether value John is in the hash set or not.
        if (hashSet.contains("John"))
            System.out.println("John is in the set.");
        else
            System.out.println("John is missing from the set");

        //Printing the size of hash set to console.
        System.out.println("Size of set is: " + hashSet.size());

        System.out.println();
        System.out.println();

        //Creating a TreeSet object of type String.
        TreeSet<String> treeSet = new TreeSet<String>();

        //Adding values to tree set object.
        treeSet.add("John");
        treeSet.add("Julie");
        treeSet.add("Joe");
        treeSet.add("John");
        treeSet.add("Josh");
        treeSet.add("John");
        treeSet.add("Albert");
        treeSet.add("Ben");
        treeSet.add("Mosh");
        treeSet.add("Vicky");
        System.out.println("Tree Set is: " + treeSet);

        //Iterating through tree set using Iterator interface.
        Iterator<String> itr_1 = treeSet.iterator();
        while (itr_1.hasNext()){
            String str = itr_1.next();
            System.out.println(str);
        }

        //Removing value Ben from tree set.
        treeSet.remove("Ben");
        System.out.println("Set after removing Ben is: " + treeSet);

        //Verifying whether value Mosh is in the tree set or not.
        if (treeSet.contains("Mosh"))
            System.out.println("Mosh is in the set.");
        else
            System.out.println("Mosh is missing from the set");

        //Printing the size of tree set to console.
        System.out.println("Size of set is: " + treeSet.size());
    }
}