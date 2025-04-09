public class Main {
    private static int SIZE_ROW = 10_000;
    private static int SIZE_COLUMN = 10_000;
    public static void main (String[] args) {
        // System.out.printf("Размер квадратной матрицы: %d", SIZE);
        System.out.printf("Размеры матрицы. Рядов: %d, колонок %d\n", SIZE_ROW, SIZE_COLUMN);
        int[][] ARRAY = new int[SIZE_ROW][SIZE_COLUMN];

        ARRAY = generator(SIZE_ROW, SIZE_COLUMN);

        int summ = summator(ARRAY);
        // System.out.println(Arrays.asList(ARRAY));
        // printer(ARRAY);

        System.out.printf("Summ is: %d", summ);
    }

    public static int summator (int[][] matrix) {
        int summ = 0;
        // LocalDateTime time = LocalDateTime.now();

        // System.out.println("Started at: " + time);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                summ += matrix[i][j];
            }
        }

        // time = LocalDateTime.now();
        // System.out.println("Finished at: " + time);

        return summ;
    }

    public static int[][] generator(int sizeRow, int sizeColumn) {
        System.out.printf("Generating matrix %d x %d size\n", sizeRow, sizeColumn);

        int[][] matrix = new int[sizeRow][sizeColumn];

        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeColumn; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }

        return matrix;
    }

    public static void printer(int[][] matrix) {
        int row = matrix.length;

        //Можно не вводить column для квадратной матрицы, т.к. SIZE_row = SIZE_column
        int column = matrix[0].length;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}