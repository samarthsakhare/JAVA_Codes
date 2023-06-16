package Stack;

// BY this approach time complexcity O(n^2)

//public class Next_Greater_element {
//    public static void main(String[] args) {
//        int arr[] = {4,7,3,4,8,1};
//
//        for(int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//
//        for(int i=0;i<arr.length;i++){
//            boolean b = false;
//            int j = 0;
//            for(j=i;j<arr.length;j++){
//                if(arr[j]>arr[i]){
//                    b = true;
//                    break;
//                }
//            }
//            if(b){
//                arr[i] = arr[j];
//            }
//            else{
//                arr[i] = -1;
//            }
//        }
//
//        System.out.println();
//        for(int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//}




// BY using stack

import java.util.Stack;

public class Next_Greater_element {

    public static void N_G_Element(int arr[]){
        int result[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while (!s.isEmpty() && s.peek()<= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                result[i] = -1;
            }
            else{
                result[i] = s.peek();
            }
            s.push(arr[i]);
        }

        System.out.println();
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {4,7,3,4,8,1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        N_G_Element(arr);
    }
}