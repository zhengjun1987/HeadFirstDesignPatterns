package chapter02;

import chapter01.MyUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/22
 * Project:HeadFirstDesignPatterns
 */
public class SwingObserverExample {

    private JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    private void go() {
        jFrame = new JFrame();
        JButton jButton = new JButton("Should I do it?");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(MyUtils.getCurrentTime() +"勿以恶小而为之");
            }
        });
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(MyUtils.getCurrentTime() +"Come on,just do it!");
            }
        });

        jFrame.getContentPane().add(BorderLayout.CENTER,jButton);
    }
}
