package chapter09iterator;

import java.util.Iterator;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/29 15:15
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] menuItems;
    int position;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems != null && position < menuItems.length;
    }

    @Override
    public MenuItem next() {
        return hasNext()?menuItems[position++]:null;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("无法删除");
        }
        if (menuItems[position - 1] != null) {
            for (int i = position-1; i < menuItems.length - 1; i++) {
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length-1]=null;
        }
    }
}
