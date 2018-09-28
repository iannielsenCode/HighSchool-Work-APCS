package SortMethods;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 * @author Ian Nielsen
 */
public class SpringScene {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,700);
        final Spring a = new Spring();
        frame.setLayout(new FlowLayout());
        JButton myButton = new JButton("Change Sky Color");
        myButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                a.z[0] = (int)(Math.random() * 255);
                a.z[1] = (int)(Math.random() * 255);
                a.z[2] = (int)(Math.random() * 255);
            }
        });
        JButton myButton2 = new JButton("Pause");
        myButton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                a.timer.stop();
            }
        });
        JButton myButton3 = new JButton("Resume");
        myButton3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                a.timer.start();
            }
        });
                
        frame.add(myButton);
        frame.add(myButton2);
        frame.add(myButton3);
        a.setPreferredSize(new Dimension(1000,700));
        frame.add(a);
        frame.setVisible(true);
    }
}

class Spring extends JComponent{
    int count = 0;
    double x = 20.0;
    int y = 20;
    int[] z = {65,105,225};
    int[] w = {225,225,225};
    TimerListener t1 = new TimerListener();
    Timer timer = new Timer(50, t1);
    TimerListener2 t2 = new TimerListener2();
    Timer timer2 = new Timer(50, t2);
    Shape s1 = new Rectangle2D.Double(0, 0, 1000, 500);
    MyMouseListener m = new MyMouseListener();
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        this.addMouseListener(m);
        this.addMouseMotionListener(m);
        g2.setColor(new Color(z[0],z[1],z[2]));
        g2.draw(s1);
        g2.fill(s1);
        Shape s3 = new Ellipse2D.Double(x, y, 90, 90);
        g2.setColor(Color.yellow);
        g2.draw(s3);
        g2.fill(s3);
        Shape s2 = new Rectangle2D.Double(0, 500, 1000, 200);
        g2.setColor(Color.green);
        g2.draw(s2);
        g2.fill(s2);
        Shape s4 = new Rectangle2D.Double(200, 300, 100, 300);
        g2.setColor(new Color(91,51,23));
        g2.draw(s4);
        g2.fill(s4);
        Shape s5 = new Ellipse2D.Double(100,100,200,200);
        g2.setColor(Color.green);
        g2.draw(s5);
        g2.fill(s5);
        Shape s6 = new Ellipse2D.Double(200,100,200,200);
        g2.setColor(Color.green);
        g2.draw(s6);
        g2.fill(s6);
        Shape s7 = new Ellipse2D.Double(100,200,200,200);
        g2.setColor(Color.green);
        g2.draw(s7);
        g2.fill(s7);
        Shape s8 = new Ellipse2D.Double(200,200,200,200);
        g2.setColor(Color.green);
        g2.draw(s8);
        g2.fill(s8);
        Shape s9 = new Rectangle2D.Double(550, 300, 300, 300);
        g2.setColor(Color.red);
        g2.draw(s9);
        g2.fill(s9);
        int[] d = {500, 900, 700};
        int[] e = {300, 300, 100};
        Shape s10 = new Polygon(d,e,3);
        g2.setColor(new Color(91,51,23));
        g2.draw(s10);
        g2.fill(s10);
        Shape s11 = new Rectangle2D.Double(650,450,100,150);
        g2.setColor(new Color(91,51,23));
        g2.draw(s11);
        g2.fill(s11);
        Shape s12 = new Rectangle2D.Double(575,350,50,50);
        g2.setColor(new Color(w[0],w[1],w[2]));
        g2.draw(s12);
        g2.fill(s12);
        Shape s13 = new Rectangle2D.Double(775,350,50,50);
        g2.setColor(new Color(w[0],w[1],w[2]));
        g2.draw(s13);
        g2.fill(s13);
        
        if(count < 200){
         timer.start();
         count++;
        }
        else{
         timer2.start();
        }
    }
    
   
    class TimerListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            x += 4.8;
            y += 2;
            if(z[0] > 0)
                z[0]--;
            if(z[1] > 0)
                z[1]--;
            if(z[2] > 0)
                z[2]--;
            if((z[0] == 0) && (z[1] == 0) && (z[2] == 0))  
                w[2] = 0;
            repaint();
        }
    }
    
    class TimerListener2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            x = 20.0;
            y = 20;
            if(z[0] < 65)
                z[0]++;
            if(z[1] < 105)
                z[1]++;
            if(z[2] < 255)
                z[2]++;
            
        }
    }
    
    class MyMouseListener extends MouseAdapter{
        private boolean b = true;
        public void mouseClicked(MouseEvent e){
            if(b == true){
                w[0] = 255;
                w[1] = 255;
                w[2] = 0;
                b = false;
            }
            else{
                w[0] = 255;
                w[1] = 255;
                w[2] = 255;
                b = true;
            }
        }
    }
}

