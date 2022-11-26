package ru.mirea.task8.point3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Animation extends Frame{
    private Image[] img=new Image[5];
    private int count;
    Animation (String s){
        super(s);
        MediaTracker tr =new MediaTracker(this);
        for (int i=0;i<5;i++){
            img[i]=getToolkit().getImage("C:\\Users\\54vov\\ideaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\point3\\image"+(i+1)+".gif");
            tr.addImage(img[i],0);
        }
        try{
            tr.waitForAll();
        }
        catch (InterruptedException ex){}
        setSize(300,500);
        setVisible(true);
    }
    public void paint(Graphics g){
        g.drawImage(img[count%5],0,0,this);
    }
    public void update(Graphics g){paint(g);}
    public void go(){
        while(count<1000){
            repaint();
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException ex){}
            count++;
        }
    }
    public static void main(String[] args){
        Animation anim_window=new Animation("Animation");
        anim_window.go();
        anim_window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
