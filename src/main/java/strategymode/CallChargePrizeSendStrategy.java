package strategymode;

/**
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
