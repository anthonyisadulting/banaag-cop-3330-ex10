package base;

import java.util.Scanner;

public class app {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the price of item 1:");
        String item1 = in.nextLine();
        int i1 = Integer.parseInt(item1);

        System.out.print("Enter the quantity of item 1:");
        String quantity1 = in.nextLine();
        int q1 = Integer.parseInt(quantity1);


        System.out.print("Enter the price of item 2:");
        String item2 = in.nextLine();
        int i2 = Integer.parseInt(item2);

        System.out.print("Enter the quantity of item 2:");
        String quantity2 = in.nextLine();
        int q2 = Integer.parseInt(quantity2);


        System.out.print("Enter the price of item 3:");
        String item3 = in.nextLine();
        int i3 = Integer.parseInt(item3);

        System.out.print("Enter the quantity of item 3:");
        String quantity3 = in.nextLine();
        int q3 = Integer.parseInt(quantity3);

        double subtotal = (i1*q1) + (i2*q2) + (i3*q3);

        double tax = subtotal * 0.055;

        double total = subtotal + tax;

        System.out.println("Subtotal: $"+ subtotal);
        System.out.println("Tax: $"+ tax);
        System.out.println("Total: $"+ total);













        System.out.print("");








    }


}
