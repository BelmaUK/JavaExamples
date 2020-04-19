package SecondRepl_it;

import java.util.*;

public class A31_CoffeineOverDose {

    /*


Scientists estimate that roughly 10 grams of caffeine consumed at one time is a
lethal overdose.

Write a program with a variable that holds the number of milli-
grams of caffeine in a drink and outputs how many drinks it takes to kill a person.

A 12-ounce can of cola has approximately 34 mg of caffeine, while a 16-ounce cup
of coffee has approximately 160 mg of caffeine.

In one gram there are 1000 mg.

Please refer to the image above as an example and use any number of variables you want.
Dots mean a space in the image.

     */

    public static void main(String[] args) {



            System.out.println("Enter number of milligrams in drink:");

            Scanner scan = new Scanner (System.in);



            int countcafeinne= scan.nextInt();

            int maxcount=10000/countcafeinne;

            System.out.println("It would take about " + maxcount +" drinks for a lethal overdose." );




        }

    }


