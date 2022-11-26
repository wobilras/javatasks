package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Welcome extends JFrame {
private String[][] arr = new String[][]{{"","NORTH",""},
    {"WEST","CENTER","EAST"},
        {"","SOUTH",""}};
private String[] collsHeader = new String[]{"","",""};
public Welcome(){
    super("Счастливого путешествия в ");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400,180);
    setVisible(true);
    setLocationRelativeTo(null);
    JTable table = new JTable(arr, collsHeader);
    table.setShowGrid(true);
    table.setRowHeight(50);
    table.setShowGrid(true);
    table.setGridColor(Color.BLACK);
    table.setRowSelectionAllowed(false);

    table.addMouseListener(new MouseListener() {
        public void mouseClicked(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {
            if (table.isColumnSelected(1)==true && table.isRowSelected(0)== true)
                JOptionPane.showMessageDialog(Welcome.this,"Добро пожаловать в Киев");
            if (table.isColumnSelected(0)==true && table.isRowSelected(1)== true)
                JOptionPane.showMessageDialog(Welcome.this,"Добро пожаловать в Берлин");
            if (table.isColumnSelected(1)==true && table.isRowSelected(1)== true)
                JOptionPane.showMessageDialog(Welcome.this,"Добро пожаловать в Москву");
            if (table.isColumnSelected(2)==true && table.isRowSelected(1)== true)
                JOptionPane.showMessageDialog(Welcome.this,"Добро пожаловать в Владивосток");
            if (table.isColumnSelected(1)==true && table.isRowSelected(2)== true)
                JOptionPane.showMessageDialog(Welcome.this,"Добро пожаловать в Сингапур");
        }
        public void mouseExited(MouseEvent e) {}
    });
    Container container = this.getContentPane();
    container.add(table);
}
public static void main(String[] args){
    new Welcome();
}
}
