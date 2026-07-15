package SweetCupcake_Management_System;

import javax.swing.JOptionPane;

public class Manager extends UserRole {
    public Manager(User user) {
        super(user);
    }

    @Override
    public void loginAction() {
        JOptionPane.showMessageDialog(null, "Login Successful as Manager");
        ManagerFrame managerFrame = new ManagerFrame();
        managerFrame.setVisible(true);
    }
}
