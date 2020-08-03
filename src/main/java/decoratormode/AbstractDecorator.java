package decoratormode;

/**
 * @Description TODO
 * @ClassName AbstractDecorator@Description TODO
 * @Author xiaofeng
 * @copyright Copyright (C) 2019 SHEIN, Inc. All right reserved. <br>
 * @company 南京领添科技有限公司
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
