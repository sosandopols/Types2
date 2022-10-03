package com.company;

import javax.swing.*;

public class Convert {
    public static void main(String[] args) {
        String sBin = JOptionPane.showInputDialog("Enter a binary number");
        int n = Integer.parseInt(sBin, 2);
        String sDec = Integer.toString(n);
        JOptionPane.showMessageDialog(null, String.format("Decinal: %d, sDec"));
    }
}
