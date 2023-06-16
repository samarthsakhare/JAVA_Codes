package Sorting;

public class Insertion_Sort {
    public static void main(String[] args){
        int arr[] = {7,8,3,1,2};
        System.out.print("Array before sorting is ");
        for (int i:arr
        ) {
            System.out.print(" "+i);
        }
        System.out.println();


        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        System.out.print("Array after sorting is ");
        for (int i:arr
        ) {
            System.out.print(" "+i);
        }
    }
}
