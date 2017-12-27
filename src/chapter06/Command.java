package chapter06;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/27 11:22
 */
public interface Command {
    void execute();
    void undo();
}
