package strategymode;

/**
 * @Date 2020/7/30 16:20
 **/
public class InKindPrizeSendStrategy implements PrizeSendStrategy {
    @Override
    public String type() {
        return IN_KIND;
    }

    @Override
    public void doSend() {
        System.out.println("发放实物奖品");
    }
}
