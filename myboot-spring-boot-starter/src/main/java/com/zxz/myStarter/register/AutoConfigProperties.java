package com.zxz.myStarter.register;

import com.zxz.myStarter.service.PropertiesServiceImpl;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author zxz
 * @date 2022年11月29日 17:24
 */

public class AutoConfigProperties {

    @Value("${zxz.name}")
    private String name;

    @Value("${zxz.age}")
    private int age;

    @Value("${zxz.sex}")
    private String sex;

    public void sayHello() {
        new PropertiesServiceImpl().sayHello(name, age, sex);
    }
}
