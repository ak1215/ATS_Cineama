package ch.tbz.m226a.payment;
import ch.tbz.m226a.cinema.IncorrectOptionException;

import java.util.Scanner;

/**
 * This class is for all the PAyment methods. You are able to chooose a method of paying.
 */
public class Payment {
    /**
     * You hava over here some option and you can choose to pay.
     */
    public void chosePaymentMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What payment method would you like to use: \n 1.Credit Card \n 2.TWINT \n 3.PayPal");
        String chosenOption = sc.nextLine();

        switch (chosenOption) {
            case "1":
                payWithCard();
                break;
            case "2":
                payWithTWINT();
                break;
            case "3":
                paymentWithPaypal();
                break;
        }
    }

    /**
     * If you choose pay with Card u will be over here.
     */
    public void payWithCard() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lastname: ");
        String userName = sc.nextLine();
        System.out.print("Enter your card number: ");
        String cardNumber = sc.nextLine();
        System.out.print("Enter your CVS code: ");
        String code = sc.nextLine();
        System.out.println("Your details " + "\n" + "Your lastname: " + userName
                + "\n" + "Your card number: " + cardNumber
                + "\n" + "Your CVS code: " + code);
        System.out.print("Are all your details correct? [y/n] \n");
        String decision = sc.nextLine();

        try {
            if (decision.equals("y")) {
                System.out.print("Your payment was successful. Have a nice day !");
            } else if (decision.equals("n")) {
                System.out.print("Let's try again \n");
                payWithCard();
            }
        }catch (IncorrectOptionException err){
            throw new IncorrectOptionException("Please choose a correct option");
        }
    }

    /**
     * If you choose pay with TWINT u will be over here.
     */
    public void payWithTWINT() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Scan the following QR code: \n");
        System.out.print(" QR CODE COMES HERE \n \n");
        System.out.print("Did it work? [y/n]");
        String decision = sc.nextLine();
        if (decision.equals("y")) {
            System.out.print("Your payment was successful. Have a nice day !");
        } else if (decision.equals("n")) {
            System.out.print("Let's try again \n");
            payWithTWINT();
        }
    }

    /**
     * If you choose pay with Paypal u will be over here.
     */
    public void paymentWithPaypal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your account number: ");
        String accNum = sc.nextLine();
        System.out.print("Is the following account number correct:" + accNum + " [y/n] \n");
        String decision = sc.nextLine();
        try {
            if (decision.equals("y")) {
                System.out.print("Your payment was successful. Have a nice day !");
            } else if (decision.equals("n")) {
                System.out.print("Let's try again \n");
                payWithCard();
            }
        }catch (IncorrectOptionException err){
            throw new IncorrectOptionException("Please choose a correct option");
        }
    }
}
