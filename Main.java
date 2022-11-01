package p0074;

public class Main {

    public static void main(String[] args) {
        Display display = new Display();
        GetInput input = new GetInput();
        Calculate func = new Calculate();
        while (true) {
            //display menu
            display.displayMenu();
            //Users select an option
            int choice = input.inputChoice();
            //Perform function base on user's choice
            switch (choice) {
                case 1:
                    //prompt user input first matrix
                    int[][] matrix1 = input.inputMatrix1("-------- Addition --------");
                    //promt user input second matrix
                    int[][] matrix2 = input.inputMatrix2(matrix1,choice);
                    //calculate adding function
                    int[][] result = func.additionMatrix(matrix1, matrix2);
                    //display calculating result
                    display.displayResult(matrix1, matrix2, result, choice);

                    break;
                case 2:
                    //prompt user input first matrix
                    matrix1 = input.inputMatrix1("-------- Subtraction --------");
                    //promt user input second matrix
                    matrix2 = input.inputMatrix2(matrix1,choice);
                    //calculate substracting function
                    result = func.subtractionMatrix(matrix1, matrix2);
                    //display calculating result
                    display.displayResult(matrix1, matrix2, result, choice);
                    break;
                case 3:
                    //prompt user input first matrix
                    matrix1 = input.inputMatrix1("-------- Multiplication --------");
                    //promt user input second matrix
                    matrix2 = input.inputMatrix2(matrix1,choice);
                    //calculate multiplying function
                    result = func.multiplicationMatrix(matrix1, matrix2);
                    //display calculating result
                    display.displayResult(matrix1, matrix2, result, choice);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

}
