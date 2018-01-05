package chapter10;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/4 18:18
 */
public class WinnerState implements MachineState {
    private final MachineState soldState;
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        soldState = gumballMachine.getSoldState();
    }

    @Override
    public void insertQuarter() {
        soldState.insertQuarter();
    }

    @Override
    public void ejectQuarter() {
        soldState.ejectQuarter();
    }

    @Override
    public void turnCrank() {
        soldState.turnCrank();
    }

    @Override
    public void dispense() {
        System.out.println(MyUtils.getCurrentTime() + "YOU ARE A WINNER!You got two gumballs for your quarter!");
        gumballMachine.release();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setMachineState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.release();
            if (gumballMachine.getCount() == 0) {
                gumballMachine.setMachineState(gumballMachine.getSoldOutState());
            } else {
                gumballMachine.setMachineState(gumballMachine.getNoQuarterState());
            }
        }
    }
}
