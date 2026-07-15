package SweetCupcake_Management_System;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CupcakeManager {
    private FileManager fileManager;
    private DefaultTableModel tableModel;

    public CupcakeManager(FileManager fileManager, DefaultTableModel tableModel) {
        this.fileManager = fileManager;
        this.tableModel = tableModel;
    }

    public void addCupcake(Cupcake cupcake) {
        try {
            fileManager.saveToFile(cupcake);
            tableModel.addRow(cupcake.toArray());
            JOptionPane.showMessageDialog(null, "Cupcake Added Successfully");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving data to file");
        }
    }
}