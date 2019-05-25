package me.gaforov;

public class Main {

    public static void main(String[] args) {
        Account bobsAccount = new Account("1234567",0.00,"Bob Brown","bob.brown@gmail.com","310-123-1234");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.deposit(200);
        bobsAccount.withdrawal(150.35);
        bobsAccount.withdrawal(25.50);

        double testNum = 2.33564345;
        System.out.printf("New balance with only two decimals = %.2f", testNum);
    }
}