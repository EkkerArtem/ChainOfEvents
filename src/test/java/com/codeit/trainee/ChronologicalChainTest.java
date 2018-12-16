package com.codeit.trainee;

import com.codeit.trainee.impl.ChronologicalChainImpl;
import org.junit.Assert;
import org.junit.Test;

public class ChronologicalChainTest {

    @Test
    public void SpeedTest() {
        int supposedRunTime = (1 * 60 + 15) * 1000;
        long start = System.currentTimeMillis();

        ChronologicalChain chain = new ChronologicalChainImpl();
        chain.start();

        long finish = System.currentTimeMillis();

        Assert.assertEquals(start, finish - supposedRunTime, 500);
    }
}