package javalearning.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        {
            //Example - add
            hashSet.add("Train");
            hashSet.add("Bus");
            hashSet.add("Cars");
            hashSet.add("Bike");
            hashSet.add("Plane");
            //Example - size
            System.out.println("Hash Set Size:" + hashSet.size());
            System.out.println("Elements on Hash Set:" + hashSet);
            System.out.println("Does Set contain Bus? " + hashSet.contains("Bus1"));
            System.out.println("Is Hash Set Empty? :" + hashSet.isEmpty());
            //Example - remove
            hashSet.remove("Train");
            hashSet.remove("Plane");

            System.out.println("Elements on Hash Set After Remove:" + hashSet);
            //Iterator - Example
            Iterator item = hashSet.iterator();
            while(item.hasNext()){
                System.out.println(item.next());
            }

         //   HashSet<String> hashSet2 = new HashSet<>(hashSet);
            HashSet<String> hashSet2 =  (HashSet) hashSet.clone();
            hashSet.clear();
            System.out.println("Elements on Hash Set After Clear:"+hashSet);
            System.out.println("Elements on Hash Set 2 After Clone:" + hashSet2);

            // Creating a new cloned set

            // Cloning the set using clone() method

        }

    }
}