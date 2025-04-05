public class inputData {
    //Тестовые входные данные в двумерном массиве размером SIZExSIZE
    private static int SIZE = 10;
    private static int maxInt = 100;
    private static int[][] testMas = new int[SIZE][SIZE];

    public static void createNewRandomData() {
        System.out.println("Creating new random data with size: " + SIZE + "x" + SIZE + " and maxInt: " + maxInt);
        testMas = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                testMas[i][j] = (int) (Math.random() * maxInt);
            }
        }
    }

    public static int[][] getTestMas() {
        String cell = "";
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // System.out.print("testMas[" + i + "][" + j + "] = " + testMas[i][j] + "; ");

                if (j == 0) {
                    System.out.print("|" + testMas[i][j] + " ");
                } else if (j == SIZE - 1) {
                    System.out.println(testMas[i][j] + "|");
                } else {
                    System.out.print(testMas[i][j] + " ");
                }
            }
        }
        return testMas;
    }
}
