package strategymode;

/**
 * @Date 2020/7/30 16:22
 **/
public class PrizeSendContext {
    private PrizeSendStrategy prizeSendStrategy;
    public PrizeSendContext() {
    }

    public void setPrizeSendStrategy(PrizeSendStrategy prizeSendStrategy) {
        this.prizeSendStrategy = prizeSendStrategy;
    }

    public void executePrizeSendStrategy() {
        prizeSendStrategy.doSend();
    }
}
