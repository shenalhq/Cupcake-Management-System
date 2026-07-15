package SweetCupcake_Management_System;


import java.io.*;

public class FileManager {
    private String filename;

    public FileManager(String filename) {
        this.filename = filename;
    }

    public void saveToFile(Cupcake cupcake) throws IOException {
        try (FileWriter writer = new FileWriter(filename, true);
             BufferedWriter bw = new BufferedWriter(writer)) {
            bw.write(cupcake.toCSV());
            bw.newLine();
        }
    }

    public void saveCashierToFile(String data) throws IOException {
        try (FileWriter writer = new FileWriter("Cashiers.txt", true);
             BufferedWriter bw = new BufferedWriter(writer)) {
            bw.write(data);
            bw.newLine();
        }
    }
}
