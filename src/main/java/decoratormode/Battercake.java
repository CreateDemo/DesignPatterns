package decoratormode;

/**
 * @Date 2020/7/31 16:04
 **/
public class Battercake extends ABattercake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
