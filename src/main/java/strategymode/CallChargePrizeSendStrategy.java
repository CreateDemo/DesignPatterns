package strategymode;

/**
 * @Description TODO
 * @ClassName CallChargePrizeSendStrategy@Description TODO
 * @Author xiaofeng
 * @copyright Copyright (C) 2019 SHEIN, Inc. All right reserved. <br>
 * @company 南京领添科技有限公司
 * @Date 2020/7/30 16:19
 **/
public class CallChargePrizeSendStrategy implements  PrizeSendStrategy{

    @Override
    public String type() {
        return CALL_CHARGE;
    }

    @Override
    public void doSend() {
        System.out.println("发放话费奖品");
    }
}
