package strategymode;

/**
 * @Date 2020/7/30 16:21
 **/
public class EmptyPrizeSendStrategy implements PrizeSendStrategy {
    @Override
    public String type() {
        return DEFAULT;
    }

    @Override
    public void doSend() {
        System.out.println("不发奖");
    }
}
