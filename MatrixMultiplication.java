class MatrixMultiplication {
    static int matC[][] = new int[3][3];
    static int matA[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
    static int matB[][] = { { 2, 3, 2 }, { 4, 5, 1 }, { 7, 8, 6 } };
    static int index = 0;

    static class Worker implements Runnable {
        int i;

        Worker(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    matC[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }
    }

    public static void matrixMultiplication() throws InterruptedException {
        Thread[] threads = new Thread[3];

        for (int i = 0; i < 3; i++) {
            threads[i] = new Thread(new Worker(index++));
            threads[i].start();
        }

        for (int i = 0; i < 3; i++) {
            threads[i].join();
        }
    }

    public static void main(String[] args) throws InterruptedException{

        matrixMultiplication();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matC[i][j] + " ");

            }
            System.out.println();
        }
    }

}

