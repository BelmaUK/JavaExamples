package SecondRepl_it;

import java.util.*;

public class A22_Shopping_List_1 {

    /*

In this assignment you will write a program to create a shopping list and prices.

You will use Scanner object and ask user to enter 3 items followed by its price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Create a Scanner object named scan.

Execution flow with example:

-Display prompt "Enter Item1 and its price:"
Tomatoes
5.5

-Display prompt "Enter Item2 and its price:"
Cheese
3.5

-Display prompt "Enter Item3 and its price:"
Apples
6.3

-calculate totalPrice for all items

-build the report variable by concatenating Strings and double values:

"Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3"
"Total price: 15.3"


     */



    public static void main(String[] args) {
        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Item1 and its price:");
        item1=input.next();
        price1=input.nextDouble();

        System.out.println("Enter Item2 and its price:");
        item2=input.next();
        price2=input.nextDouble();

        System.out.println("Enter Item3 and its price:");
        item3=input.next();

        price3=input.nextDouble();


        totalPrice=price1+price2+price3;

        System.out.println("Item1: " + item1 + " Price: " + price1 + ", " + "Item2: " + item2 +
                " Price: " + price2 + ", " + "Item3: " + item3 + " Price: " + price3 );
        System.out.println("Total price: " + totalPrice);
    }

}
