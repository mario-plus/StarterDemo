package com.zxz.myStarter.service;

import com.zxz.myStarter.api.HouseService;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zxz
 * @date 2022年11月29日 14:08
 */
public class HouseServiceImpl implements HouseService, ApplicationContextInitializer {
    public void initialize(ConfigurableApplicationContext applicationContext) {
        buildHouse();
    }

    public void buildHouse() {
        System.out.println("build house......");
    }
}
