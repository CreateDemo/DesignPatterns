package strategymode;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date 2020/7/30 16:22
 **/
@Component
public class PrizeSendStrategyFactory implements ApplicationContextAware {
    private static final Map<String, PrizeSendStrategy> PRIZE_SEND_STRATEGY_MAP = new HashMap<>();

    public static PrizeSendStrategy getPrizeSendStrategy(String strategyKey) {
        return PRIZE_SEND_STRATEGY_MAP.getOrDefault(strategyKey, PRIZE_SEND_STRATEGY_MAP.get(PrizeSendStrategy.DEFAULT));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, PrizeSendStrategy> beans = applicationContext.getBeansOfType(PrizeSendStrategy.class);
        beans.values().forEach(bean -> PRIZE_SEND_STRATEGY_MAP.put(bean.type(), bean));
    }
}