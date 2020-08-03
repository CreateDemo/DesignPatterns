package strategymode;

/**
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
