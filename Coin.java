package Coin;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * Author: Ian Nielsen
 * Date: October 10th 2011
 * Flips a coin every two seconds.
 */
public class Coin {
    public Image heads;
    public Image tails;
    
    public Coin(){
        heads = (new ImageIcon("heads.gif")).getImage();
        tails = (new ImageIcon("tails.gif")).getImage();
    }
    
    public void draw(Graphics g, int x, int y){
        g.drawImage(tails, x, y, null);
        g.drawImage(heads, x, y, null);
    }
    
}
