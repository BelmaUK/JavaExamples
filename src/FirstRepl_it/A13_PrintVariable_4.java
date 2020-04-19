package FirstRepl_it;

import java.util.Scanner;


import java.util.*;


public class A13_PrintVariable_4 {

   /*

Assume that word is a String variable and already has a value.
Write a statement to display the message "Today's Word-Of-The-Day is: " followed by the value of word.
The message and the value of word should appear together, on  a single line.

Ex:

Today's Word-Of-The-Day is:Java

    */

    public static void main(String[] args) {


        Scanner input =new Scanner(System. in);
        String word=input.nextLine();

        System.out.println("Today's Word-Of-The-Day is:" + word);



    }


}
