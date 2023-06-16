package Hashing;
import java.util.*;

// Majority occurrence element

//public class Questions_On_Hashing {
//    public static void main(String[] args) {
//        int []nums = {1, 2, 5, 3, 1, 3, 1, 5, 1};
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for(int i=0;i< nums.length;i++){
//            if(map.containsKey(nums[i])){
//                map.put(nums[i],map.get(nums[i])+1);
//            }
//            else{
//                map.put(nums[i], 1);
//            }
//        }
//
//        int l = nums.length;
//        for(int keys: map.keySet()){
//            int v = map.get(keys);
//            int f = l/3;
//            if(f<v){
//                System.out.println(keys + " " + map.get(keys));
//            }
//        }
//    }
//}




// Union of two Arrays

//public class Questions_On_Hashing {
//
//    public static int union(int arr1[], int arr2[]){
//        HashSet<Integer> set = new HashSet<>();
//
//        for(int i=0;i< arr1.length;i++){
//            set.add(arr1[i]);
//        }
//
//        for(int i=0;i< arr2.length;i++){
//            set.add(arr2[i]);
//        }
//
//        return set.size();
//    }
//
//    public static void main(String[] args) {
//        int arr1[] = {1, 2, 3, 4};
//        int arr2[] = {3, 4, 5, 6};
//
//        System.out.println(union(arr1, arr2));
//    }
//}



//Intersection od two arrays

//public class Questions_On_Hashing {
//
//    public static ArrayList<Integer> intersection(int arr1[], int arr2[]){
//        ArrayList<Integer> a = new ArrayList<>();
//        HashSet<Integer> set = new HashSet<>();
//        int count = 0;
//        for(int i=0;i< arr1.length;i++){
//            set.add(arr1[i]);
//        }
//
//        for(int i=0;i< arr2.length;i++){
//            if(set.contains(arr2[i])){
//                count++;
//                a.add(arr2[i]);
//                set.remove(arr2[i]);
//
//                if(set.isEmpty()){
//                    break;
//                }
//            }
//        }
//
//        return a;
//    }
//
//    public static void main(String[] args) {
//        int arr1[] = {7,3,9,4};
//        int arr2[] = {6,3,2,9,4};
//
//        System.out.println(intersection(arr1,arr2));
//    }
//}



// Find itinerary from tickets

//public class Questions_On_Hashing {
//
//    public static void itinerary(HashMap<String,String> map){
//        ArrayList<String> path = new ArrayList<>();
//        HashMap<String, String> newMap = new HashMap<>();
//
//        for(String keys : map.keySet()){
//            newMap.put(map.get(keys), keys);
//        }
//
//        String start = "";
//        for(String key : map.keySet()){
//            if(!newMap.containsKey(key)){
//                start = key;
//                break;
//            }
//        }
//
//        path.add(start);
//
//        while (!map.isEmpty()){
//            String s = map.get(start);
//            path.add(s);
//            map.remove(start);
//            start = s;
//        }
//
//        System.out.println(path);
//    }
//
//    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("Chennai","Bengaluru");
//        map.put("Mumbai","Delhi");
//        map.put("Goa","Chennai");
//        map.put("Delhi","Goa");
//
//        itinerary(map);
//    }
//}

public class Questions_On_Hashing {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";

        System.out.println(s1.compareTo(s2));
    }
}


