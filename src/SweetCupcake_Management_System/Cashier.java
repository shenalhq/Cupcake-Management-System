package SweetCupcake_Management_System;

import javax.swing.JOptionPane;

public class Cashier extends UserRole {
    public Cashier(User user) {
        super(user);
    }

    @Override
    public void loginAction() {
        JOptionPane.showMessageDialog(null, "Login Successful as Cashier");
        CashierFrame cashierFrame = new CashierFrame();
        cashierFrame.setVisible(true);
    }
}