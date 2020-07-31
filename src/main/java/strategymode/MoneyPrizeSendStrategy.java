package strategymode;

/**
 * @Description TODO
 * @ClassName MoneyPrizeSendStrategy@Description TODO
 * @Author xiaofeng
 * @copyright Copyright (C) 2019 SHEIN, Inc. All right reserved. <br>
 * @company 南京领添科技有限公司
 * @Date 2020/7/30 16:20
 **/
public class MoneyPrizeSendStrategy implements PrizeSendStrategy {
    @Override
    public String type() {
        return MONEY;
    }

    @Override
    public void doSend() {
        System.out.println("发放现金奖品");
    }
}
