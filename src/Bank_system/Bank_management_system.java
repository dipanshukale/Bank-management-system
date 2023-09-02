package Bank_system;

import java.util.Scanner;

public class Bank_management_system {

        public static void main(String[] args) {
            int choices;
            float balance, withdraw, deposit, amount;
            Scanner scan = new Scanner(System.in);

            System.out.println("Please Enter Your Account Balance : ");
            balance = scan.nextFloat();

            System.out.println("1 : Withdraw\n2 : Deposit\n ");
            System.out.println("Please Select An Options : ");
            choices = scan.nextInt();

            switch (choices) {
                case 1 -> {

                    System.out.println("Please Enter Your Withdraw Amount :");
                    withdraw = scan.nextFloat();

                    if (withdraw % 500 == 0) {
                        System.out.println("Your Withdraw Amount is " + withdraw);

                        if (withdraw > 30000) {
                            System.out.println("You Can't Withdraw Your Money.");
                        } else if (withdraw > balance) {

                            System.out.println("You have insufficient Balance");

                        } else {
                            System.out.println("Rupees" + " " + withdraw + " " + "Debited From Your Account.");

                            amount = balance - withdraw;
                            System.out.println("Your Account Balance is : " + amount);
                        }
                    } else {
                        System.out.println("In our bank There is only 500 & 2000 Notes Are available");
                    }
                }
                case 2 -> {
                    System.out.println("Enter your deposit Amount : ");
                    deposit = scan.nextFloat();

                    amount = balance + deposit;
                    System.out.println(amount + " Rupees deposit To Your Account . ");
                    System.out.println("Deposit Successful.");

                }
            }

        }
    }



