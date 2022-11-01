package p0074;

public class Display {

    public void displayMenu() {
        System.out.print("=======Calculator program======"
                + "\n1. Addition Matrix"
                + "\n2. Subtraction Matrix"
                + "\n3.Multiplication Matrix"
                + "\n4. Quit"
                + "\nYour choice: ");
    }

    void displayResult(int[][] matrix1, int[][] matrix2, int[][] resultMatrix, int choice) {
        System.out.println("-------- Result --------");
        displayMatrix(matrix1);
        switch(choice){
            case 1:
                System.out.println("+");
                break;      
            case 2:
                System.out.println("-");
                break; 
            case 3:
                System.out.println("*");
                break; 
        }
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(resultMatrix);
        System.out.println("");
    }
    
    void displayMatrix(int[][] matrix){
        //first loop to access to the row position in matrix
        for (int i = 0; i < matrix.length; i++) {
            //second loop to access to the column position in matrix
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
