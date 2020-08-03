package decoratormode;

/**
 * @Date 2020/7/31 16:06
 **/
public class AbstractDecorator  extends ABattercake  {
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }
    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
