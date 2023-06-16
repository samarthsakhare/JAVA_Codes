package Hashing;
import java.util.HashSet;
import java.util.Iterator;

//HashSet :- It is unordered set and contains unique values.

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Adding element
        set.add(1);
        set.add(5);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(2);

        // Searching
//        System.out.println(set.contains(2));
//        System.out.println(set.contains(5));

        //For printing all set
//        System.out.println(set);

        // Delete
//        set.remove(1);

//        System.out.println(set);

        //Size
//        System.out.println(set.size());


         // Iterator
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
