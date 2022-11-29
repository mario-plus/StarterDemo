package com.zxz.myStarter.service;

import com.zxz.myStarter.api.PropertiesService;

/**
 * @author zxz
 * @date 2022年11月29日 17:14
 */

public class PropertiesServiceImpl implements PropertiesService {

    public void sayHello(String name, int age, String sex) {
        System.out.println("my name is " + name + ",age = " + age + ",sex = " + sex);
    }

}
