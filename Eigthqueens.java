public class Eigthqueens {
    static int count=0;
    static void printBoard(int arr[][]) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    static boolean isValid(int arr[][], int row, int column) {
        for (int i = column; i >= 0; i--) {
            if (arr[row][i] == 1) {
                return false;
            }
        }

        int i = row;
        int j = column;

        while (i >= 0 && j >= 0) {
            if (arr[i][j] == 1) {
                return false;
            } else {
                i--;
                j--;
            }
        }
        i = row;
        j = column;

        while (i < 8 && j >= 0) {
            if (arr[i][j] == 1) {
                return false;

            } else {
                i++;
                j--;
            }
        }

        return true;
    }

    static void eightQueens(int arr[][],int column)
    {
        if(column>=8) return;

        for(int i=0;i<8;i++)
        {
            if(isValid(arr, i, column))
            {
                arr[i][column]=1;

                if(column==7)
                {
                    printBoard(arr);
                    System.out.println();
                    System.out.println("--------------------------------");
                    System.out.println();
                    count++;
                }

                eightQueens(arr,column+1);
                arr[i][column]=0;
            }
        }
    }

    public static void main(String[] args)
    {
        int board[][]=new int[8][8];
        eightQueens(board, 0);
        System.out.println(count);
    }
}
