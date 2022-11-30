package com.zxz.client;

import com.zxz.myStarter.annocation.EnableCameraRegister;
import com.zxz.myStarter.annocation.EnableComputerRegister;
import com.zxz.myStarter.annocation.EnablePhoneRegister;
import com.zxz.myStarter.register.AutoConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * @author zxz
 * @date 2022年11月25日 14:59
 */
@EnableCameraRegister
@EnablePhoneRegister
@EnableComputerRegister
@Import({AutoConfigProperties.class})
@SpringBootApplication
@EnableScheduling
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class);
    }
}
