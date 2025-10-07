import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
import java.util.ArrayList;

//For GUI code
public class BankGUI {
    private ArrayList<Bankaccount> accounts = new ArrayList<>();

    public BankGUI() {
        JFrame Frame = new JFrame("ABC Bank Select Menu");
        Frame.setSize(1000, 800);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setLayout(new GridLayout(5, 3));

        JButton CreateButton = new JButton("Create Account");
        JButton LoginButton = new JButton("Show Balance");
        JButton AddButton = new JButton("Add Balance");
        JButton WithdrawButton = new JButton("Withdraw Balance");
        JButton ExitButton = new JButton("Exit Menu");

        Frame.add(CreateButton);
        Frame.add(LoginButton);
        Frame.add(AddButton);
        Frame.add(WithdrawButton);
        Frame.add(ExitButton);

        CreateButton.addActionListener(e -> CreateAccount());
        LoginButton.addActionListener(e -> showBalance());
        AddButton.addActionListener(e -> Add());
        WithdrawButton.addActionListener(e -> Withdraw());
        ExitButton.addActionListener(e -> System.exit(0));

        Frame.setVisible(true);

    }

    private Bankaccount authenticate() {
        String name = JOptionPane.showInputDialog("Please enter your name.");
        String password = JOptionPane
                .showInputDialog("Please enter a password(4-digits PIN code) of your bank account.");
        return Bankaccount.Authenticate(accounts, name, password);
    }

    private void CreateAccount() {
        String name = JOptionPane.showInputDialog("Please enter your name.");
        String password = JOptionPane.showInputDialog("Please enter password(4-digits PIN code) of your bankaccount.");
        if (password.length() == 4) {
            Bankaccount bankacc = Bankaccount.CreateAccount(name, password);
            if (bankacc != null) {
                accounts.add(bankacc);
                JOptionPane.showMessageDialog(null,
                        "Welcome to ABC Bank, " + name + "! Your Account has been created successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Sorry,your account creation failed. Please try again.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sorry,your password is too short or long. Plase try again.");

        }
    }

    private void showBalance() {
        Bankaccount acc = authenticate();
        if (acc != null) {
            JOptionPane.showMessageDialog(null, acc.clientName + "'s balance is " + acc.clientbalance + " Yen.");
        } else {
            JOptionPane.showMessageDialog(null, "Sorry,login failed.");
        }
    }

    private void Add() {
        Bankaccount acc = authenticate();
        if (acc != null) {
            String amountsString = JOptionPane.showInputDialog("Please enter amount to deposit.");
            int amount = Integer.parseInt(amountsString);
            acc.Add(amount);
            JOptionPane.showMessageDialog(null,
                    "Depositing successful. Now " + acc.clientName + "'s balance is " + acc.clientbalance + " Yen.");

        } else {
            JOptionPane.showMessageDialog(null, "Sorry,Login failed. Please try again.");
        }
    }

    private void Withdraw() {
        Bankaccount acc = authenticate();
        if (acc != null) {
            String amountString = JOptionPane.showInputDialog("Please enter amount to withdraw.");
            int amount = Integer.parseInt(amountString);
            if (amount <= acc.clientbalance) {
                acc.Withdraw(amount);
                JOptionPane.showMessageDialog(null,
                        "Withdrawing successful. Now " + acc.clientName + "'s balance is " + acc.clientbalance
                                + " Yen.");
            } else {
                JOptionPane.showMessageDialog(null, "You don't have such money.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sorry,login failed. Please try again.");
        }
    }

}
