package SecondRepl_it;

import java.util.Scanner;

public class A34_VehicleRecall {
/*
SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017.

In this assignment you will write a program that will find vehicle for recall.
-Create a scanner object
-Create int variable named vehicleYear

-Display prompt: "Enter vehicle's year:"
input: 1996

 if the value of modelYear does fall within the four recall ranges, display output:
"Your vehicle needs to be recalled!"

Otherwise, display message:
"Your vehicle is fine, enjoy!"

 */
public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);

    System.out.println("Enter vehicle's year:");
    int modelyear=scan.nextInt();

    if((1998>=modelyear && modelyear>=1995) ||

            (modelyear==2002) || (modelyear==2001)||

            (2006>modelyear && modelyear>2004)  ||

            (2017>modelyear && modelyear>2015) )
    {
        System.out.println("Your vehicle needs to be recalled!");

    } else {
        System.out.println("Your vehicle is fine, enjoy!");
    }
}






}
