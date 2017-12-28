package chapter07;

import java.util.ArrayList;
import java.util.Enumeration;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/28 10:15
 */
public class EnumerableArrayList<T> extends ArrayList<T> implements Enumeration {
    private int index;

    @Override
    public boolean hasMoreElements() {
        return index < size();
    }

    @Override
    public Object nextElement() {
        if (!hasMoreElements()) {
            return null;
        }
        return get(index++);
    }

    public void clearEnumeration(){
        index = 0;
    }
}
