import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame jf = new JFrame("Sudoku");
        jf.setSize(boardWidth, boardHeight);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

        ImageIcon gameIcon = new ImageIcon(ClassLoader.getSystemResource("images/icon.png"));
            Image icon = gameIcon.getImage();
            jf.setIconImage(icon);

            // SudokuClass s = new SudokuClass(600, 600);
            // jf.add(s);
            // jf.pack();
            // s.requestFocus();
    }
}
