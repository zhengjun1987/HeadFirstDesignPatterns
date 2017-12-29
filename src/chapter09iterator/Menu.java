package chapter09iterator;

import java.util.Iterator;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/29 16:27
 */
public interface Menu {
    Iterator<MenuItem> createIterator();
}
