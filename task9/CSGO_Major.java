package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CSGO_Major extends JFrame {
    JPanel[] panel = new JPanel[3];
    JButton button1 = new JButton("NAVI");
    JButton button2 = new JButton("G2");
    JLabel label1 = new JLabel("Result 0 X 0");
    JLabel label2 = new JLabel("Last Scorer: N/A");
    JLabel label3 = new JLabel("Winner: DRAW");

    int navi=0;
    int g2 = 0;
    public CSGO_Major(){
        super("Game: NAVI vs. G2");//name of application
        setSize(500,450);
        setLayout(new GridLayout(1,3));//form of table

        for (int i=0;i< panel.length;i++){
            panel[i]=new JPanel();
            panel[i].setBackground(Color.YELLOW);
            add(panel[i]);
        }
        panel[0].setLayout(new BorderLayout());
        panel[0].add(button1, BorderLayout.CENTER);
        panel[2].setLayout(new BorderLayout());
        panel[2].add(button2, BorderLayout.CENTER);
        panel[1].setLayout(new FlowLayout());
        panel[1].add(label1);
        panel[1].add(label2);
        panel[1].add(label3);

        button1.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
             navi++;
             label1.setText("Result: "+navi +" X "+g2);
             label2.setText("Last Scorer: NAVI");
             if (navi>g2)
                 label3.setText("Winner: NAVI");
             else if (navi<g2)
                 label3.setText("Winner: G2");
             else
                 label3.setText("DRAW");
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        button2.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                g2++;
                label1.setText("Result: "+navi +" X "+g2);
                label2.setText("Last Scorer: G2");
                if (navi>g2)
                    label3.setText("Winner: NAVI");
                else if (navi<g2)
                    label3.setText("Winner: G2");
                else
                    label3.setText("DRAW");
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
    }
    public static void main(String[] args){
        new CSGO_Major().setVisible(true);
    }
}
