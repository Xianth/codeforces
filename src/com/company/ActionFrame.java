package com.company;

/**
 * Created by Pawel on 03-05-16.
 */

import javax.swing.*;
import com.company.Board;

public class ActionFrame extends JFrame {

    public ActionFrame() {
        super("Test akcji");

        JPanel buttonPanel = new Board();
        add(buttonPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}