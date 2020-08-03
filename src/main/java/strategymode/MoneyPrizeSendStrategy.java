package strategymode;

/**
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
