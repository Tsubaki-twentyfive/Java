//import java.util.Scanner;
//import java.util.ArrayList;

public class BankMain {
    public static void main(String[] args) {
        // Bankaccount MyAccount = new Bankaccount("Dummy", 1000, "1234");
        // Scanner scanner = new Scanner(System.in);
        // ArrayList<Bankaccount> accountList = new ArrayList<>();
        new BankGUI();
        // Upper; for GUI
        /*
         * Following; for CLI
         * 
         * int i = 0;
         * while (i == 0) {
         * try {
         * System.out.println("Hello, please select your operation.");
         * System.out.println("1:Show deposit");
         * System.out.println("2:Add deposit");
         * System.out.println("3:Withdraw deposit");
         * System.out.println("4:Create Account");
         * System.out.println("0:Exit");
         * int input = scanner.nextInt();
         * 
         * switch (input) {
         * case 1: {
         * Bankaccount Login = Bankaccount.Authenticate(accountList, scanner);
         * if (Login != null) {
         * Login.showMessage();
         * Login.showBalance();
         * break;
         * } else {
         * MyAccount.showError();
         * break;
         * }
         * }
         * 
         * case 2: {
         * Bankaccount Login = Bankaccount.Authenticate(accountList, scanner);
         * if (Login != null) {
         * Login.showMessage();
         * System.out.println("Please enter a number how much you want to deposit.");
         * int MyaddDeposit = scanner.nextInt();
         * Login.Add(MyaddDeposit);
         * break;
         * } else {
         * MyAccount.showError();
         * break;
         * }
         * }
         * case 3: {
         * Bankaccount Login = Bankaccount.Authenticate(accountList, scanner);
         * if (Login != null) {
         * Login.showMessage();
         * System.out.println("Please enter a number how much you want to deposit.");
         * int MyWithdrawDeposit = scanner.nextInt();
         * Login.Withdraw(MyWithdrawDeposit);
         * break;
         * } else {
         * MyAccount.showError();
         * }
         * }
         * case 4: {
         * System.out.println("Hello,please enter your name.");
         * String createName = scanner.next();
         * // ease to read
         * System.out.println("Please enter your password(4-digits PIN code).");
         * String CreatePassword = scanner.next();
         * // ease to read
         * Bankaccount newAcc = Bankaccount.CreateAccount(createName, CreatePassword);
         * if (newAcc != null) {
         * accountList.add(newAcc);
         * } else {
         * MyAccount.showError();
         * }
         * break;
         * }
         * case 0: {
         * System.out.println("Have a nice day!");
         * i = 1;
         * }
         * default: {
         * if (i == 1) {
         * break;
         * } else {
         * System.out.println("Something error has occured!");
         * }
         * }
         * break;
         * 
         * }
         * Thread.sleep(3000);
         * } catch (InterruptedException e) {
         * 
         * e.printStackTrace();
         * }
         * 
         * }
         * scanner.close();
         */ }
}
