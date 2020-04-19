package FirstRepl_it;

import java.util.*;

public class A15_PrintVariable_6 {

    /*
Given an integer variable i and a floating-point variable f, that have already been given values, write a statement that writes both of their values to console in the following format:

i=value-of-i f=value-of-f

Ex:
Assume i = 9 and f = 33.4

Output should be:
i=9 f=33.4

     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        float f=scan.nextFloat();
        System.out.println("i="+ i + " f="+ f);



    }







}
