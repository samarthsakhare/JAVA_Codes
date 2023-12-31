package Dynamic_programming.Knapsack.Problems;

public class count_of_subset_sum {

    public static int count(int arr[], int sum, int n){
        int t[][] = new int[n+1][sum+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0){
                    t[i][j] = 0;
                }

                if(j==0){
                    t[i][j] = 1;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
               if(arr[i-1]<=j){
                   t[i][j] = t[i-1][j] + t[i-1][j-arr[i-1]];
               }
               else{
                   t[i][j] = t[i-1][j];
               }
            }
        }

        return t[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 8, 10, 4};
        int n = arr.length;
        int sum = 10;

        System.out.println(count(arr, sum, n));
    }
}
