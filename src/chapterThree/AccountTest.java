package chapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Account myAccount = new Account();
//
//        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
//        System.out.println("Please enter the name: ");
//        String name = input.nextLine();
//        myAccount.setName(name);
//        System.out.println();
//
//        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

//        System.out.printf("account1 name is: %s%n", account1.getName());
//        System.out.printf("account2 name is: %s%n", account2.getName());
//        System.out.printf("%s balance: $%.2f%n", account1.getName(),
//                account1.getBalance());
//        System.out.printf("%s balance: $%.2f%n", account2.getName(),
//                account2.getBalance());
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter deposit amount for account1: ");
//        double depositAmount = input.nextDouble();
//        System.out.printf("%nadding %.2f to account1 balance%n%n",
//                depositAmount);
//        account1.deposit(depositAmount);
//
//        System.out.printf("%s balance: $%.2f%n", account1.getName(),
//                account1.getBalance());
//        System.out.printf("%s balance: $%.2f%n", account2.getName(),
//                account2.getBalance());
//
//        System.out.print("Enter deposit amount for account2: ");
//        depositAmount = input.nextDouble();
//        System.out.printf("%nadding %.2f to account2 balance%n%n",
//                depositAmount);
//        account2.deposit(depositAmount);

//        System.out.printf("%s balance: $%.2f%n", account1.getName(),
//                account1.getBalance());
//        System.out.printf("%s balance: $%.2f%n", account2.getName(),
//                account2.getBalance());


        System.out.printf("%s balance: $%.2f%n", account1.getName(),
                account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(),
                account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter withdraw amount for account1: ");
        double withdraw = input.nextDouble();
        System.out.printf("%nsubtracting %.2f to account1 balance%n%n",
                withdraw);
        account1.withdraw(withdraw);

        System.out.printf("%s balance: $%.2f%n", account1.getName(),
                account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(),
                account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        withdraw = input.nextDouble();
        System.out.printf("%nsubtracting %.2f to account2 balance%n%n",
                withdraw);
        account2.withdraw(withdraw);

        System.out.printf("%s balance: $%.2f%n", account1.getName(),
                account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(),
                account2.getBalance());


    }
}
