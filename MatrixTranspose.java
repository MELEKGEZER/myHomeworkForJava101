public class MatrixTranspose {
    public static void main(String[] args) {
        // Örnek matrisi tanımlayalım
        int[][] matrix = {
            {2, 3, 4},
            {5, 6, 4}
        };

        // Matrisin boyutlarını alalım
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Transpoz matrisi oluşturalım
        int[][] transpose = new int[cols][rows];

        // Matrisin transpozunu alalım
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Matrisi ve transpozunu ekrana yazdıralım
        System.out.println("Matris:");
        printMatrix(matrix);
        System.out.println("\nTranspoze:");
        printMatrix(transpose);
    }

    // Matrisi ekrana yazdıran yardımcı bir yöntem
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
