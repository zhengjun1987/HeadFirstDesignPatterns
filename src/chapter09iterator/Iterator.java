package chapter09iterator;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/29 15:14
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
