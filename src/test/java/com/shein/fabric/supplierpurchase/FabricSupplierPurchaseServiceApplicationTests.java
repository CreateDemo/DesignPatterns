package com.shein.fabric.supplierpurchase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import strategymode.PrizeSendContext;
import strategymode.PrizeSendStrategyFactory;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FabricSupplierPurchaseServiceApplicationTests {

    @Test
    public void test() {
        PrizeSendContext sendContext = new PrizeSendContext();
        sendContext.setPrizeSendStrategy(PrizeSendStrategyFactory.getPrizeSendStrategy("money"));
        sendContext.executePrizeSendStrategy();
    }

}
