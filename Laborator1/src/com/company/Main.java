package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        float sum = 0;
        int x = Integer.parseInt(JOptionPane.showInputDialog("Cate numere exista?"));

        for (int i = 0; i < x; i++)
        {

            sum = sum + Integer.parseInt(JOptionPane.showInputDialog("Introduceti numarul "+(i+1)));

        }

        JOptionPane.showMessageDialog(null,"Media artimetica este "+sum/x);


    }
}
