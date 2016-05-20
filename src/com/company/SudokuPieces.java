package com.company;

import javax.swing.*;

/**
 * Created by Pawel on 03-05-16.
 */
public class SudokuPieces extends JButton{
    int licznik;

    SudokuPieces ()
    {
        licznik = 0;
    }
    SudokuPieces ( String s)
    {
        super.setText(s);
    }

    @Override
    public void setText(String s) {
        super.setText(s+ "Boo!");
    }

}
