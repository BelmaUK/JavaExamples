package SecondRepl_it;


import java.util.*;

public class A29_IfStatementBiggestNumber {
/*

using an if statement check which int is bigger a or b, and then output:
"number(a or b) is bigger".

for example:
a=1
b=2

output:
2 is bigger

a=5
b=7

output:
7 is bigger

 */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if(a>b){
            System.out.println(a +" is bigger");
        }

        if(b>a){
            System.out.println(b +" is bigger");
        }

    }

}
