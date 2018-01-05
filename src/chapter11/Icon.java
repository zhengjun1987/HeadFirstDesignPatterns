package chapter11;

import java.awt.*;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/5 11:42
 */
public interface Icon {
    int getWidth();
    int getHeight();
    void paintIcon(Component component,Graphics graphics,int x,int y);
}
