package FirstRepl_it;

import java.util.*;

public class A14_PrintVariable_5 {

 /*
first and second are already declared and given values.
Write a single statement that will print the message "first is " followed by the value of first, and then a space,
followed by "second = ", followed by the value of second.
Ex:
first is 55 second = 123
*/

    public static void main(String[] args) {
        //Scanner object
        Scanner scan = new Scanner (System.in);
        //declared and given values
        int first=scan.nextInt();
        int second=scan.nextInt();
        System.out.println("first is "+ first+" second = "+ second);

    }





}
