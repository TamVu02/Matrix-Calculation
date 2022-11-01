package p0074;

public class Calculate {

    public int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] add = new int[matrix1.length][matrix2[0].length];
        //first loop to access to the row position in matrix
        for (int i = 0; i < matrix1.length; i++) {
            //second loop to access to the column position in matrix
            for (int j = 0; j < matrix2[0].length; j++) {
                add[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return add;
    }

    public int[][] subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] sub = new int[matrix1.length][matrix2[0].length];
        //first loop to access to the row position in matrix
        for (int i = 0; i < matrix1.length; i++) {
            //second loop to access to the column position in matrix
            for (int j = 0; j < matrix2[0].length; j++) {
                sub[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return sub;
    }

    public int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] mul = new int[matrix1.length][matrix2[0].length];
        //first loop to access to the row position in matrix1
        for (int i = 0; i < matrix1.length; i++) {
            //second loop to access to the column position in matrix2
            for (int j = 0; j < matrix2[0].length; j++) {
                //third loop to access each element in row position in matrix1 and column position in matrix2
                for (int k = 0; k < matrix2.length; k++) {
                    mul[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return mul;
    }

}
