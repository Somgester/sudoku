import java.util.*;
import java.io.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;


public class SudokuClass extends JPanel {

    private class Tile {
        int x;
        int y;

        public Tile(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    int width;
    int height;
    int tileSize = 66;
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
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g) {
        // grids on the board
        // x1,y1,x2,y2
        for (int i = 0; i < width / tileSize; i++) {
            g.drawLine(i * tileSize, 0, i * tileSize, height);
            g.drawLine(0, i * tileSize, width, i * tileSize);
            g.setColor(Color.BLACK);
        }
    }
    public static void main(String[] args)
    {
        // Use the Tile constructor
        SudokuClass sudokuClass = new SudokuClass(500, 500);
        Tile tile = sudokuClass.new Tile(66, 66);
        
    }
}