package ru.ssau.tk.sashapractice.Practice.taskForExam;

import javax.swing.*;
import java.awt.*;

public class Graphic extends JFrame {
    private JTextField textField;

    private Graphic() {
        textField = new JTextField(15);
        JButton reverseButton = new JButton("reverse");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        reverseButton.addActionListener(event -> textField.setText(new StringBuffer(textField.getText()).reverse().toString()));
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(textField);
        contents.add(reverseButton);
        setContentPane(contents);
        setSize(400, 130);
    }

    public static void main(String[] args) {
        Graphic window = new Graphic();
        window.setVisible(true);
    }
}
