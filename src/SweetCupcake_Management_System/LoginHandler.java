package SweetCupcake_Management_System;

import javax.swing.JOptionPane;

public class LoginHandler {
    public static void handleLogin(String username, String password) {
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out username");
            return;
        }
        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out password");
            return;
        }

        User user = new User(username, password);
        UserRole role;

        if (username.equals("Cashier") && password.equals("c1234")) {
            role = new Cashier(user);
        } else if (username.equals("Manager") && password.equals("m1234")) {
            role = new Manager(user);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect username or password");
            return;
        }

        role.loginAction();
    }
}