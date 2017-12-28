package chapter08;

import chapter01.MyUtils;

import java.applet.Applet;
import java.awt.*;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/28 17:32
 */
public class MyApplet extends Applet {

    private String message;

    @Override
    public void init() {
        message = "Hello,World!I'm alive!";
        repaint();
    }

    @Override
    public void start() {
        message = "Now I'm starting...";
        repaint();
    }

    @Override
    public void stop() {
        message = "Oh! I'm being stopped...";
        repaint();
    }

    @Override
    public void destroy() {
        System.out.println(MyUtils.getCurrentTime() + "MyApplet.destroy  " + "");
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message,5,15);
    }

    public static void main(String[] args) {
        MyApplet myApplet = new MyApplet();
    }
}
