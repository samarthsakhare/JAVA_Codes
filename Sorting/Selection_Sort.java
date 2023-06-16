package Sorting;

public class Selection_Sort {
    public static void main(String[] args){
        int arr[] = {7,8,3,1,2};
        System.out.print("Array before sorting is ");
        for (int i:arr
        ) {
            System.out.print(" "+i);
        }
        System.out.println();


        for(int i=0;i<arr.length;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.print("Array after sorting is ");
        for (int i:arr
        ) {
            System.out.print(" "+i);
        }

    }
}
