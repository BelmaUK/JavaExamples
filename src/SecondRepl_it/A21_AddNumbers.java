

package SecondRepl_it;

import java.util.*;

public class A21_AddNumbers {


    /*
In this assignment you will create a Scanner object and ask user to enter 3 number inputs.

-Declare integer variables num1, num2, num3, sum.

-Create a Scanner object named scan.

-Display prompt "Enter 3 numbers:"

-Using scanner object let user input 3 numbers

-Add 3 numbers and assign to sum variable

-Print "Sum of numbers: ValueOfSum"

     */

        public static void main(String[] args) {

            Scanner input= new Scanner(System.in);

            int num1, num2, num3, Sum;
            System.out.println ("Enter 3 numbers:");
            num1=input.nextInt();
            num2=input.nextInt();
            num3=input.nextInt();
            Sum = num1 + num2 + num3;
            System.out.println("Sum of numbers: "+ Sum);
        }
}
