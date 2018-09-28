package Chomp;

// This is the Fortune Teller applet

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.AudioClip;

public class FortuneTeller extends JApplet
    implements ActionListener
{
  private String[] fortunes={"You day will be great.","Your day will be bad"
          + ".","You will win the lottery.", "You will win new car."};
  private JTextField display;
  private AudioClip ding;

  public void init()
  {
    ding = getAudioClip(getDocumentBase(), "ding.wav");

    display = new JTextField("  Press \"Next\" to see your fortune...", 30);
    display.setBackground(Color.WHITE);
    display.setEditable(false);

    JButton go = new JButton("Next");
    go.addActionListener(this);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(display);
    c.add(go);
  }

  public void actionPerformed(ActionEvent e)
  {
    ding.play();
    int a;
    if(Math.random() < .25){
        a = 0;
    }
    else if((Math.random() >= .25) && (Math.random() < .50)){
        a = 1;
    }
    else if((Math.random() >= .50) && (Math.random() < .75)){
        a = 2;
    }    
    else{
        a = 3;
    }
    System.out.println(this.fortunes[a]);
  }
}

