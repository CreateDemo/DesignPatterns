package strategymode;

/**
 * @Description TODO
 * @ClassName PrizeSendContext@Description TODO
 * @Author xiaofeng
 * @copyright Copyright (C) 2019 SHEIN, Inc. All right reserved. <br>
 * @company 南京领添科技有限公司
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
