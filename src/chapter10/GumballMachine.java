package chapter10;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/4 14:30
 */
public class GumballMachine {
    //    public static final int SOLD_OUT = 0;
//    public static final int NO_QUATER = 1;
//    public static final int HAS_QUATER = 2;
//    public static final int SOLD = 3;
//
//    int state = SOLD_OUT;
    MachineState machineState;

    MachineState noQuarterState;
    MachineState hasQuarterState;
    MachineState soldState;
    MachineState soldOutState;
    MachineState winnerState;

    int count = 0;

    public void setMachineState(MachineState machineState) {
        this.machineState = machineState;
    }

    public GumballMachine(int count) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0) {
//            state = NO_QUATER;
            machineState = noQuarterState;
        }
    }

    public MachineState getHasQuarterState() {
        return hasQuarterState;
    }

    public MachineState getNoQuarterState() {
        return noQuarterState;
    }

    public MachineState getSoldOutState() {
        return soldOutState;
    }

    public MachineState getSoldState() {
        return soldState;
    }

    public MachineState getWinnerState() {
        return winnerState;
    }

    void insertQuarter() {
//        switch (state) {
//            case SOLD_OUT:
//                System.out.println(MyUtils.getCurrentTime() + "You cannot insert a quarter,sold out!");
//                break;
//            case NO_QUATER:
//                state = HAS_QUATER;
//                System.out.println(MyUtils.getCurrentTime() + "A quarter inserted!");
//                break;
//            case HAS_QUATER:
//                System.out.println(MyUtils.getCurrentTime() + "You cannot insert another quarter");
//                break;
//            case SOLD:
//                System.out.println(MyUtils.getCurrentTime() + "Please wait!");
//                break;
//        }

        machineState.insertQuarter();
    }

    void ejectQuarter() {
//        switch (state) {
//            case SOLD_OUT:
//                System.out.println(MyUtils.getCurrentTime() + "No quarter inserted!");
//                break;
//            case NO_QUATER:
//                System.out.println(MyUtils.getCurrentTime() + "No quarter inserted!");
//                break;
//            case HAS_QUATER:
//                System.out.println(MyUtils.getCurrentTime() + "Quater returned!");
//                state = NO_QUATER;
//                break;
//            case SOLD:
//                System.out.println(MyUtils.getCurrentTime() + "No quarter inserted!");
//                break;
//        }
        machineState.ejectQuarter();
    }

    void turnCrank() {
//        switch (state) {
//            case SOLD_OUT:
//                System.out.println(MyUtils.getCurrentTime() + "No quarter inserted!");
//                break;
//            case NO_QUATER:
//                System.out.println(MyUtils.getCurrentTime() + "A quarter inserted first!");
//                break;
//            case HAS_QUATER:
//                System.out.println(MyUtils.getCurrentTime() + "You turned!");
//                state = SOLD;
//                dispense();
//                break;
//            case SOLD:
//                System.out.println(MyUtils.getCurrentTime() + "No more Candy!");
//                break;
//        }
        machineState.turnCrank();
        machineState.dispense();
    }

    void dispense() {
//        switch (state) {
//            case SOLD_OUT:
//                System.out.println(MyUtils.getCurrentTime() + "No gumball dispensed!");
//                break;
//            case NO_QUATER:
//                System.out.println(MyUtils.getCurrentTime() + "A quarter inserted first!");
//                break;
//            case HAS_QUATER:
//                System.out.println(MyUtils.getCurrentTime() + "No gumball dispensed!");
//                break;
//            case SOLD:
//                System.out.println(MyUtils.getCurrentTime() + "A gumball coming!");
//                count--;
//                if (count == 0) {
//                    System.out.println(MyUtils.getCurrentTime() + "Oops,out of gumballs!");
//                    state = SOLD_OUT;
//                } else {
//                    state = NO_QUATER;
//                }
//                break;
//        }
    }

    void release() {
        if (count > 0) {
            System.out.println(MyUtils.getCurrentTime() + "Gumball released!");
            count--;
        }
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + machineState.getClass().getSimpleName() +
                ", count=" + count +
                '}';
    }
}
