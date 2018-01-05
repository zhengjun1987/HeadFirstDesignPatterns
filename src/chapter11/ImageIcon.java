package chapter11;

import java.awt.*;
import java.net.URL;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/5 11:43
 */
public class ImageIcon implements Icon {
    URL imageUrl;
    String name;

    public ImageIcon(URL imageUrl, String name) {
        this.imageUrl = imageUrl;
        this.name = name;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int x, int y) {

    }
}
