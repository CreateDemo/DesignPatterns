package strategymode;

/**
 * @Description TODO
 * @ClassName PrizeSendStrategy@Description TODO
 * @Author xiaofeng
 * @copyright Copyright (C) 2019 SHEIN, Inc. All right reserved. <br>
 * @company 南京领添科技有限公司
 * @Date 2020/7/30 15:56
 **/
public interface PrizeSendStrategy {

    String DEFAULT = "default";
    String MONEY = "money";
    String IN_KIND = "in_kind";
    String CALL_CHARGE = "call_charge";

    String type();

    void doSend();
}
