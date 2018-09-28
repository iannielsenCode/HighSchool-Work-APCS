package Coin;


import java.util.Timer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Author: Ian Nielsen
 * Date: October 10th 2011
 * Tester class for the coin class.
 */

public class CoinTest extends JPanel {

    public CoinTest(Image a, Image b){
        a = (new ImageIcon("heads.gif")).getImage();
        b = (new ImageIcon("tails.gif")).getImage();
    }
    
    public void paint(Graphics g){
        super.paint(g);
    }
    
    public void actionPerformed(ActionEvent e){
        repaint();
    }
    
    public static void main(String[] args){
        JFrame window = new JFrame("Graphics Demo");
        window.setBounds(300, 300, 200, 150);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Coin coin = new Coin();
        CoinTest panel = new CoinTest(coin.heads, coin.tails);
        panel.setBackground(Color.WHITE);  // the default color is light gray
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
        Timer d = new Timer();}
}
