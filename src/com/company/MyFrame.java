package com.company;
import javax.swing.*;
import java.awt.FlowLayout;


public class MyFrame extends JFrame {

    public MyFrame() {

        super("Sudoku 0.0.1.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocation(600,200);
        setLayout(new FlowLayout());

        JPanel board = new Board();
        add(board);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}