package com.company;
import com.company.SudokuPieces;

/**
 * Created by Pawel on 03-05-16.
 */
import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

        import javax.swing.JButton;
        import javax.swing.JPanel;

public class Board extends JPanel implements ActionListener{

    public static final int HEIGHT = 500;
    public static final int WIDTH = 500;
//    private JButton greenButton;
//    private JButton blueButton;
//    private JButton redButton;
    private JButton [][] pieces = new JButton [9][9];
    private static int licznik;

    public Board() {
        licznik = 0;
        for ( int i = 0; i < 9; i++ )
            for ( int j = 0; j < 9; j++ )
            {
                pieces [i][j] = new JButton( Integer.toString( 0 ) );
//                licznik++;
            }
//        greenButton = new JButton("Green");
//        blueButton = new JButton("Blue");
//        redButton = new JButton("Red");

//        greenButton.addActionListener(this);
//        blueButton.addActionListener(this);
//        redButton.addActionListener(this);

        setLayout(new GridLayout(9,9));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        for ( int i = 0; i < 9; i++ )
        {
            for ( int j = 0; j < 9; j++)
            {
                pieces[i][j].addActionListener(this);
                add(pieces[i][j]);
            }
        }
//        add(greenButton);
//        add(blueButton);
//        add(redButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        ((JButton)source).setText( Integer.toString( licznik ) );
        licznik++;
//        if(source == greenButton)
//        {
//            greenButton.setText("Basia " + licznik);
//            licznik +=1;
//        }
////            setBackground(Color.GREEN);
//
//        else if(source == blueButton)
//            setBackground(Color.BLUE);
//
//        else if(source == redButton)
//            setBackground(Color.RED);
    }
}