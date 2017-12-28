package chapter08;

import javax.swing.*;
import java.awt.*;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/28 17:28
 */
public class MyFrame extends JFrame {
    public MyFrame(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,30);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String s = "叱咤风云!!!";
        g.drawString(s,100,100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("设计模式");
    }
}
