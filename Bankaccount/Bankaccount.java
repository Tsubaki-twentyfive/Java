import java.util.ArrayList;
//import java.util.Scanner;

public class Bankaccount {
    public String clientName;
    public int clientbalance;
    public String clientpassword;
    private ArrayList<Bankaccount> accounts;

    Bankaccount(String name, int balance, String password) {
        this.clientName = name;
        this.clientbalance = balance;
        this.clientpassword = password;
        this.accounts = new ArrayList<>();
    }

    public ArrayList<Bankaccount> getAccount() {
        return accounts;
    }

    public String getPassword() {
        return clientpassword;
    }

    public static Bankaccount CreateAccount(String name, String password) {
        if (name == null || name.isEmpty()) {
            // System.out.println("Something error has occured.");
            return null;
        } else if (password.length() < 4 || 4 < password.length()) {
            // System.out.println("Your password is too short/long.");
            return null;
        } else {
            Bankaccount newAccount = new Bankaccount(name, 0, password);
            // accountList.add(newAccount);
            // System.out.println(name + "'s account is created.");
            return newAccount;
        }
    }

    /*
     * For CLI
     * public static Bankaccount Authenticate(ArrayList<Bankaccount> accounts,
     * Scanner scanner) {
     * System.out.println("Hello,please enter your name.");
     * String AuthenticateName = scanner.next();
     * System.out.println("Please enter your password(PIN code).");
     * String AuthenticatePassword = scanner.next();
     * for (Bankaccount acc : accounts) {
     * if (acc.clientName.equals(AuthenticateName) &&
     * acc.clientpassword.equals(AuthenticatePassword)) {
     * System.out.println("Login successful.");
     * return acc;
     * }
     * }
     * return null;
     * }
     */
    // For GUI
    public static Bankaccount Authenticate(ArrayList<Bankaccount> accounts, String name, String password) {
        for (Bankaccount acc : accounts) {
            if (acc.clientName.equals(name) && acc.clientpassword.equals(password)) {
                return acc;
            }
        }
        return null;
    }

    public void Withdraw(int WithdrawAmount) {
        if (WithdrawAmount <= clientbalance) {
            clientbalance -= WithdrawAmount;
            // System.out.println("After withdrawing:" + clientbalance);
        } else {
            // System.out.println("You don't have such money.");
        }
    }

    public void Add(int PlusAmount) {
        if (PlusAmount <= 0) {
            // System.out.println("You have to enter a positive number.");
        } else {
            clientbalance += PlusAmount;
            // System.out.println("After adding" + clientbalance);
        }

    }

    public void showBalance() {
        // System.out.println(clientName + "'s deposit is " + clientbalance + "Yen.");
    }

    public void showError() {
        // System.out.println("Something error has occured!");
    }

    public void showMessage() {
        // System.out.println("Hello," + clientName + "!");
    }
}
