package SweetCupcake_Management_System;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Sweet Cupcake Shop Application...");
        
        // Use SwingUtilities to ensure thread safety for GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                initializeApplication();
            }
        });
    }
    
    /**
     * Initialize and start the application
     */
    private static void initializeApplication() {
        try {
            // Set cross-platform Java look and feel
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            
            // Alternative: Set system look and feel
            // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
            // Set application-specific UI properties
            setUIFont(new javax.swing.plaf.FontUIResource("Calibri", java.awt.Font.PLAIN, 12));
            
        } catch (Exception e) {
            System.err.println("Error setting look and feel: " + e.getMessage());
            // Continue with default look and feel
        }
        
        // Create and show the login form
        showLoginForm();
    }
    
    /**
     * Display the login form to start user interaction
     */
    private static void showLoginForm() {
        try {
            LoginForm loginForm = new LoginForm();
            
            // Center the form on screen
            loginForm.setLocationRelativeTo(null);
            
            // Make form visible
            loginForm.setVisible(true);
            
            System.out.println("Login form displayed successfully");
            
        } catch (Exception e) {
            showErrorDialog("Failed to start application: " + e.getMessage());
            System.exit(1);
        }
    }
    
    /**
     * Display error message dialog
     */
    private static void showErrorDialog(String message) {
        JOptionPane.showMessageDialog(
            null,
            message,
            "Application Error",
            JOptionPane.ERROR_MESSAGE
        );
    }
    
    /**
     * Utility method to set font for all UI components
     */
    private static void setUIFont(javax.swing.plaf.FontUIResource f) {
        java.util.Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource) {
                UIManager.put(key, f);
            }
        }
    }
    
    /**
     * Application information method
     */
    public static String getAppInfo() {
        return "Sweet Cupcake Shop Management System v1.0\n" +
               "Developed using Java Swing\n" +
               "Supports: Cashier and Manager roles";
    }
}
    
