package chapter09iterator;

import java.util.Calendar;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/3 16:07
 */
public class AlternatingDinerMenuIterator implements java.util.Iterator<MenuItem> {
    private int position;
    private MenuItem[] menuItems;

    public AlternatingDinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position]!=null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position +=2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("不支持删除功能!");
    }
}
