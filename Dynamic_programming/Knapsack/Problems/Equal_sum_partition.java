package Dynamic_programming.Knapsack.Problems;

public class Equal_sum_partition {

    public static boolean isPossible(int arr[], int n, int sum){
        boolean t[][] = new boolean[n+1][sum+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0){
                    t[i][j] = false;
                }

                if (j==0){
                    t[i][j] = true;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][sum];
    }

    public static boolean isContains(int arr[]){
        int sum = 0;
        int n = arr.length;
        for (int a:arr
             ) {
            sum+=a;
        }

        if(sum%2!=0){
            return false;
        }

        return isPossible(arr, n, sum/2);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 6};
        System.out.println(isContains(arr));
    }
}
