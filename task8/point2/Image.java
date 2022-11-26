package ru.mirea.task8.point2;

import javax.swing.*;
import java.awt.*;

public class Image extends JComponent {
    public static void main(String[] args){
        JFrame jFrame = new JFrame("Image");
        jFrame.setSize(1100,800);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setLocation(450,300);
        jFrame.add(new Comp(args[0]));
    }
}

class Comp extends Image{
    private String str;
    Comp(String str){
        this.str=str;
    }
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        java.awt.Image img = new ImageIcon(str).getImage();
        g2.drawImage(img,10,10,null);
    }
}
