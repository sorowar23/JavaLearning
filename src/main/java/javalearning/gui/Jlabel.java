package javalearning.gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Jlabel {


    public static void main(String[] args) {

        JFrame frame = new JFrame("label");
        Border border = BorderFactory.createLineBorder(Color.green,3);
        // create a label to display text
        JLabel label = new JLabel();
        // add text to label
        label.setText("Bro do you even code?");
        label.setForeground(Color.green);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setFont(new Font("MV Boli", Font.PLAIN,20));
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.VERTICAL);
        // create a panel
       // JPanel panel = new JPanel();
        // add label to panel
      //  panel.add(label);


        // add panel to frame
        frame.add(label);
        // set the size of frame
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }
}
