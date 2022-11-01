package p0074;

import java.util.Scanner;

public class GetInput {

    Scanner sc = new Scanner(System.in);

    public int inputChoice() {
        int choice;
        do {
            choice = getInt("Choice", 1, 4);
            break;
        } while (true);
        return choice;
    }

    public int[][] inputMatrix1(String msg) {
        System.out.println(msg);
        int row, col;
        do {
            //enter row of matrix
            System.out.print("Enter Row Matrix 1:");
            row = getInt("Row number", 1, Integer.MAX_VALUE);
            break;
        } while (true);
        do {
            //enter column of matrix
            System.out.print("Enter Column Matrix 2:");
            col = getInt("Column number", 1, Integer.MAX_VALUE);
            break;
        } while (true);
        int[][] matrix = new int[row][col];
        //first loop to access to the row position in matrix
        for (int i = 0; i < row; i++) {
            //second loop to access to the column position in matrix
            for (int j = 0; j < col; j++) {
                do {
                    System.out.print("Enter Matrix1" + "[" + (i + 1) + "]" + "[" + (j + 1) + "]:");
                    String val = sc.nextLine();
                    //check if value of matrix is a digit
                    try {
                        Integer.parseInt(val);
                    } catch (NumberFormatException e) {
                        System.out.println("Value of matrix is digit");
                        continue;
                    }
                    matrix[i][j] = Integer.parseInt(val);
                    break;
                } while (true);
            }
        }
        return matrix;
    }

    public int[][] inputMatrix2(int[][] matrix1, int choice) {
        int row, col;
        if (choice == 3) {
            do {
                //enter row of matrix
                System.out.print("Enter Row Matrix 2:");
                row = getInt("Row number", 1, Integer.MAX_VALUE);
                //check if row of matrix 2 is equal to column of matrix 1 or not
                if (row != matrix1[0].length) {
                    System.out.println("Row number of matrix2 must be equal to column number of matrix 1. Please re-enter");
                    continue;
                }
                break;
            } while (true);
            do {
                //enter column of matrix
                System.out.print("Enter Column Matrix 2:");
                col = getInt("Column number", 1, Integer.MAX_VALUE);
                break;
            } while (true);
        } else {
            do {
                //enter row of matrix
                System.out.print("Enter Row Matrix 2:");
                row = getInt("Row number", 1, Integer.MAX_VALUE);
                //check if row of matrix 2 is equal to row of matrix 1 or not
                if (row != matrix1.length) {
                    System.out.println("Row number of matrix2 must be equal to row number of matrix 1. Please re-enter");
                    continue;
                }
                break;
            } while (true);
            do {
                //enter column of matrix
                System.out.print("Enter Column Matrix 2:");
                col = getInt("Column number", 1, Integer.MAX_VALUE);
                //check if column of matrix 2 is equal to column of matrix 1 or not
                if (col != matrix1[0].length) {
                    System.out.println("Column number of matrix2 must be equal to Column number of matrix 1. Please re-enter");
                    continue;
                }
                break;
            } while (true);
        }
        int[][] matrix = new int[row][col];
        //first loop to access to the row position in matrix
        for (int i = 0; i < row; i++) {
            //second loop to access to the column position in matrix
            for (int j = 0; j < col; j++) {
                do {
                    System.out.print("Enter Matrix1" + "[" + (i + 1) + "]" + "[" + (j + 1) + "]:");
                    String val = sc.nextLine();
                    //check if value of matrix is a digit
                    try {
                        Integer.parseInt(val);
                    } catch (NumberFormatException e) {
                        System.out.println("Value of matrix is digit");
                        continue;
                    }
                    matrix[i][j] = Integer.parseInt(val);
                    break;
                } while (true);
            }
        }
        return matrix;
    }

    public int getInt(String msg, int min, int max) {
        int output;
        String input;
        do {
            input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println(msg + " can't be empty. Please re-enter");
                continue;
            } else {
                try {
                    double result = Double.parseDouble(input);
                    //check if input is a decimal number & notify user if it is not    
                    if ((int) result != result) {
                        System.out.println(msg + " must be a decimal number. Please re-enter");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println(msg + " can't contains special character. Please re-enter");
                    continue;
                }
            }
            output = Integer.parseInt(input);
            if (output < min || output > max) {
                System.out.println(msg + " must be in range [" + min + "," + max + "]. Please re-enter");
                continue;
            }
            break;
        } while (true);
        return output;
    }
}
