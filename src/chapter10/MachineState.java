package chapter10;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/4 15:41
 */
public interface MachineState {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
