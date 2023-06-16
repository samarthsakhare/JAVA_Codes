package Dynamic_programming.Knapsack.Problems;

public class subset_sum_problem {

    public static boolean isContains(int n, int sum, int arr[]){
        boolean t[][] = new boolean[n+1][sum+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0){
                    t[i][j] = false;
                }
                if (j == 0) {
                    t[i][j] = true;
                }
            }
        }

        for(int i=1;i<n+1;i++) {
            for (int j = 1; j < sum + 1; j++) {
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

    public static void main(String[] args) {
        int arr[] = {2, 6, 3, 4};
        int sum = 5;
        int n = 4;
        System.out.println(isContains(n, sum, arr));
    }
}
