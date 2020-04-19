package SecondRepl_it;

import java.util.*;

public class A30_SecondConvertor {


    /*


Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds.

-create a Scanner object
- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.

Example run:
Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);{
            int inputSeconds, hours, minutes, seconds;

            System.out.println("Enter seconds:");

            inputSeconds=scan.nextInt();

            hours=(inputSeconds-inputSeconds%3600)/3600;

            int remainingsecond=inputSeconds%3600;

            minutes= (remainingsecond-remainingsecond%60)/60;

            seconds=remainingsecond%60;

            System.out.println(hours + " hours"+ ", "+ minutes + " minutes"+ ", and " + seconds + " seconds");

        }

    }





}
