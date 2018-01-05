package chapter11;

import java.awt.*;
import java.net.URL;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/5 11:44
 */
public class ImageProxy implements Icon {
    URL url;
    ImageIcon imageIcon;
    private boolean retriving;

    public ImageProxy(URL url) {
        this.url = url;
    }

    @Override
    public int getWidth() {
        return imageIcon == null ? 800 : imageIcon.getWidth();
    }

    @Override
    public int getHeight() {
        return imageIcon == null ? 800 : imageIcon.getHeight();
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(component,graphics,x,y);
        } else {
            graphics.drawString("Loading...",x+300,y+100);
            if (!retriving){
                retriving = true;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        imageIcon = new ImageIcon(url,"CD Cover");
                        component.repaint();
                    }
                }).start();
            }
        }
    }

}
