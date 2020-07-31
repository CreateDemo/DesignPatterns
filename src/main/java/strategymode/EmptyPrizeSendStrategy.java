package strategymode;

/**
 * @Description TODO
 * @ClassName EmptyPrizeSendStrategy@Description TODO
 * @Author xiaofeng
 * @copyright Copyright (C) 2019 SHEIN, Inc. All right reserved. <br>
 * @company 南京领添科技有限公司
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
