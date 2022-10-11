package basic_core_programs;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("enter the year");
        Scanner r = new Scanner(System.in);
        int y = r.nextInt();
        if (y >= 1000 && y <= 9999)
        {

            if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
            {
                System.out.println("Leap Year");
            }
            else
            {
                System.out.println("Not Leap Year");
            }
        }
            else

            System.out.println("provide a  valid calender Year");

        }

    }

