package chapter10;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/4 17:06
 */
public class SoldOutState implements MachineState {

    private final GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println(MyUtils.getCurrentTime() + "You cannot insert a quarter,sold out!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println(MyUtils.getCurrentTime() + "No quarter inserted!");
    }

    @Override
    public void turnCrank() {
        System.out.println(MyUtils.getCurrentTime() + "No quarter inserted!");
    }

    @Override
    public void dispense() {
        System.out.println(MyUtils.getCurrentTime() + "No gumball dispensed!");
    }
}
