//This program is to find out 3 nos which can be form triplets so that we can get zero by adding them.

package functional_programs;

import java.util.Scanner;

public class AddsToZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int arrayLength = scan.nextInt();
        int[] a = new int[arrayLength];
        int[] array = addToArray(arrayLength, a, scan);
        scan.close();
        int count = getTriplets(arrayLength, array);
        System.out.println();
        System.out.println("Number of distinct triplets : " + count);
    }

    public static int[] addToArray(int arrayLength, int[] array, Scanner scan) {
        System.out.println("Enter the value for array");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    private static int getTriplets(int arrayLength, int[] array) {
        int count = 0;
        for (int j = 0; j < arrayLength - 2; j++) {
            for (int k = j + 1; k < arrayLength - 1; k++) {
                for (int l = k + 1; l < arrayLength; l++) {
                    if (array[j] + array[k] + array[l] == 0) {
                        System.out.println(array[j] + " + " + array[k] + " + " + array[l] + " = 0");
                        count++;
                    }
                }
            }
        }
        return count;
    }
}