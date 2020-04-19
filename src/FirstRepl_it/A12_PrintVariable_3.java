package FirstRepl_it;

import java.util.Scanner;

public class A12_PrintVariable_3 {

    /*
    Two variables, num and cost have been declared and given values:
    num is an integer and cost is a double.
    Write a single statement that prints num and cost.
    Print both values (num first, then cost), separated by a space on a single line. Do not output any thing else.
   */

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        double cost=in.nextDouble();

        System.out.println(num+" "+cost);


    }




}
