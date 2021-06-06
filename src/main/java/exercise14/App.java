package exercise14;

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String amountIn = in.nextLine();
        double amount = Double.parseDouble(amountIn);
        double total = amount;
        String phrase = ("The total is $");

        System.out.print("What is the state? ");
        String state = in.nextLine();

        if(state.equals("WI"))
        {
            double tax = amount * 5.5;
            tax = Math.ceil(tax)/100;
            total = amount + tax;
            total = Math.ceil(total * 100) / 100;

            phrase = String.format("The subtotal is $%.2f\nThe tax is $%.2f\n" + phrase, amount, tax);
        }

        phrase = String.format(phrase + "%.2f", total);
        System.out.println(phrase);
    }
}
