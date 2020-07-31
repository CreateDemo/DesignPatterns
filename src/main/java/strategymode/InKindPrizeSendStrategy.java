package strategymode;

/**
 * @Description TODO
 * @ClassName InKindPrizeSendStrategy@Description TODO
 * @Author xiaofeng
 * @copyright Copyright (C) 2019 SHEIN, Inc. All right reserved. <br>
 * @company 南京领添科技有限公司
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
