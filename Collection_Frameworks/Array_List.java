package Collection_Frameworks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add at last
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //ddd in between
        list.add(1,1);
        System.out.println(list);

        // get element
        int element = list.get(2); // 2 is index
        System.out.println(element);

        // set element
        list.set(0,4);
        System.out.println(list);

        // remove element
        list.remove(3);
        System.out.println(list);

        // length
        System.out.println(list.size());

        // printing using loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // sorting
        Collections.sort(list); // sort in ascending order
        System.out.println(list);

        // contains
        System.out.println(list.contains(2));

        // clear
//        list.clear();



        // adding arraylist
//        ArrayList<Integer> list_2 = new ArrayList<>();
//        list_2.add(0);
//        list_2.add(2);
//        list_2.add(3);
//        list.addAll(1,list_2);
////        list.addAll(list_2);
//        System.out.println(list);


        // Iterator
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
    }
}
