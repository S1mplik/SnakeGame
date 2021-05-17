package com.company;
import javax.swing.JFrame;
import java.awt.*;

public class Main {

    public Main() {

        JFrame frame = new JFrame();
        Screen screen = new Screen();

        frame.add(screen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Snake");
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new Main();
    }
}

