import java.util.*;
import java.io.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;


public class SudokuClass extends JPanel {


    public SudokuClass(int width, int height)
    {
        //set up the game
        setPreferredSize(new Dimension(width, height));
        setFocusable(true);
        requestFocus();
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_ESCAPE) {
                    System.exit(0);
                }
            }
        });
    }

    public static void main(String[] args)
    {
        
    }
}