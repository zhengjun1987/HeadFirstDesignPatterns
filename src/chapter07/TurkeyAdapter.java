package chapter07;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/27 17:13
 */
public class TurkeyAdapter implements Duck {
    private WildTurkey wildTurkey;

    public TurkeyAdapter(WildTurkey wildTurkey) {
        this.wildTurkey = wildTurkey;
    }

    @Override
    public void quack() {
        wildTurkey.gobble();
    }

    @Override
    public void fly() {
        wildTurkey.fly();
    }
}
