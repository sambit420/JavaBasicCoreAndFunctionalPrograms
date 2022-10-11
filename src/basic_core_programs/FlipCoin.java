package basic_core_programs;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
     int heads=0;
     int tails=0;
     int count=0;
     double randum=0.0;
        System.out.println("please enter the number");
        Scanner n= new Scanner(System.in);
        int flips=n.nextInt();
        while (count<=flips) {
            randum =Math.random();
            System.out.println(count + " " + randum);
            if (randum < 0.5) {
                heads++;
                System.out.println("heads");

            } else {
                tails++;
                System.out.println("tails");

            }
            count++;
        }
        System.out.println();
        System.out.println("number of heads:"+heads);
        System.out.println("number of tails:"+tails);
        double headspercent = (double)heads/flips*100;
        double tailspercent = (double)tails/flips*100;
        System.out.println("percent of heads:"+headspercent);
        System.out.println("percent of tails:"+tailspercent);



    }
}
