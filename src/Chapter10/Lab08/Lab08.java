package Chapter10.Lab08;

import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {
        System.out.println("=== Lab 08 ===");
        try ( Scanner sc = new Scanner(System.in);) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String pwd = sc.nextLine();

            System.out.print("Enter balance: ");
            double balance = sc.nextDouble();

            sc.nextLine();

            System.out.print("Enter the withdrawal amount: ");
            double amount = sc.nextDouble();

            BankAccount bc = new BankAccount(username, pwd, balance);
            bc.withDrawMoney(amount);

        } catch (Exception e) {
            System.out.printf("%s : %s\n", e.getClass().getName(), e.getMessage());
        } finally {
            System.out.println("Transaction completed");
        }
    }
}
