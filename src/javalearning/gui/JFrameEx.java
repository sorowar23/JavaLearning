package javalearning.gui;

import javax.swing.*;
import java.awt.*;

public class JFrameEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Title of Frame");
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        ImageIcon imgIcon = new ImageIcon();
        frame.setIconImage(imgIcon.getImage());

        frame.getContentPane().setBackground(new Color(104,104,104));

    }
}
