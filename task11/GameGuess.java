package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import static javax.swing.JOptionPane.showMessageDialog;

public class GameGuess extends JFrame {
    JTextField jTextField = new JTextField();
    JButton button = new JButton();
    Random random = new Random();
    int num,count, result;
    String text;
    public GameGuess(){
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20,20));
        jTextField.setPreferredSize(new Dimension(300,70));
        button.setPreferredSize(new Dimension(150, 60));
        jTextField.setHorizontalAlignment(0);
        jTextField.setFont(new Font("TimesNewRoman",Font.BOLD,30));
        button.setFont(new Font("TimesNewRoman",Font.BOLD,28));
        button.setText("Ввод");
        createNumber();
        button.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                guess();
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        add(jTextField);
        add(button);
    }
    private void createNumber() {
        count = 3;
        num = random.nextInt(20);
    }
    private void guess(){
        text = jTextField.getText();
        try{
            result = Integer.parseInt(text);
        }
        catch (NumberFormatException ex){
            jTextField.setText("");
            showMessageDialog(null,"this is not number!");
            return;
        }
        if (result<num){
            count--;
            showMessageDialog(null, "Загаданное число больше \n Попыток осталось " + count);
        }
        else if (result>num){
            count--;
            showMessageDialog(null, "Загаданное число меньше \n Попыток осталось "+count);
        }
        else{
            showMessageDialog(null,"Вы отгадали число");
            createNumber();
        }
        if (count==0){
            showMessageDialog(null,"Попытки кончились");
            createNumber();
        }
    }
    public static void main(String[] args){
        GameGuess gg = new GameGuess();
        gg.setVisible(true);
        gg.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
