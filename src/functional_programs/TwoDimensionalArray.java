package functional_programs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Type of Inputs: \n 1:Integer \n 2:Double \n 3:Boolean");
        int choice = scan.nextInt();
        System.out.println("Enter Number of Rows: ");
        int row = scan.nextInt();
        System.out.println("Enter Number of Columns: ");
        int column = scan.nextInt();

        String[][] numbers = new String[row][column];
        String[][] array = addToTwoDArray(choice, row, column, scan, numbers);
        scan.close();
        getArrayOutput(row, column, array);
    }

    public static String[][] addToTwoDArray(int choice, int row, int column, Scanner sc, String[][] numbers) {
        switch (choice) {
            case 1:
                System.out.println("Enter Integer Values: ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        numbers[i][j] = sc.next();
                    }
                }
                System.out.println("Integer array is: \t");
                break;
            case 2:
                System.out.println("Enter Double Values: ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        numbers[i][j] = sc.next();
                    }
                }
                System.out.println("Double array is: \t");
                break;
            case 3:
                System.out.println("Enter Boolean Values: ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        numbers[i][j] = sc.next();
                    }
                }
                System.out.println("Boolean array is: \t");
                break;
            default:
                System.out.println("Invalid Choice: Try Again!!!!");
        }
        return numbers;
    }

    private static void getArrayOutput(int row, int column, String[][] array) throws FileNotFoundException {
        FileOutputStream file = new FileOutputStream("2D_array.txt");
        PrintWriter p = new PrintWriter(file);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "  ");
                p.print(array[i][j] + "  ");
            }
            System.out.println(" \n ");
            p.println(" \n ");
        }
        p.close();
    }
}
