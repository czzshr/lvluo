package com.netease;

import com.netease.urs.Main;
import org.junit.Test;

/**
 * @Author: chenzhongzheng
 * @Date: 2017-06-16
 * @Description:
 */
public class MainTest {


    @Test
    public void testMain() {
        Main.main(new String[]{"demoConsumerTask", "/Users/chenzhongzheng/URS/job-scripts/lvluo/lvluo-worker/src/test/resources/usernameList.txt", "index=2", "threadCount=2"});
    }

    @Test
    public void testThreadCount() {
        Main.main(new String[]{"demoConsumerTask", "/Users/chenzhongzheng/URS/job-scripts/lvluo/lvluo-worker/src/test/resources/usernameList.txt", "index=2", "threadCount=10"});
    }

    @Test
    public void testRateLimit() {
        Main.main(new String[]{"demoConsumerTask", "/Users/chenzhongzheng/URS/job-scripts/lvluo/lvluo-worker/src/test/resources/usernameList.txt", "index=2", "threadCount=10&qps=3"});

    }
}