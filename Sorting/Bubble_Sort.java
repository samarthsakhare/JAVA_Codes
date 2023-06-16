package Sorting;

public class Bubble_Sort {
    public static void main(String[] args){
        int arr[] = {7,8,3,1,2};
        System.out.print("Array before sorting is ");
        for (int i:arr
             ) {
            System.out.print(" "+i);
        }
        System.out.println();


        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Array after sorting is ");
        for (int i:arr
        ) {
            System.out.print(" "+i);
        }

    }
}
