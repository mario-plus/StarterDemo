package com.zxz.client;

import com.zxz.myStarter.api.CameraService;
import com.zxz.myStarter.api.PhoneService;

import com.zxz.myStarter.register.AutoConfigProperties;
import com.zxz.myStarter.service.ComputerServiceImpl;
import com.zxz.myStarter.service.RecordServiceImpl;
import com.zxz.myStarter.service.RecordServiceImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author zxz
 * @date 2022年11月25日 15:01
 */
@Component
public class ClientStart {

    @Autowired
    ComputerServiceImpl computerService;

    @Autowired
    RecordServiceImpl recordService;

    @Autowired
    RecordServiceImpl2 recordServiceImpl2;

    @Autowired
    CameraService cameraService;

    @Autowired
    PhoneService phoneService;

    @Autowired
    AutoConfigProperties autoConfigProperties;

    @PostConstruct
    public void init() {
        autoConfigProperties.sayHello();

        computerService.calculate();

        recordService.record();
        recordServiceImpl2.record();
        if (cameraService == null) {
            System.out.println("注入失败");
        } else {
            cameraService.photo();
        }

        if (phoneService == null) {
            System.out.println("注入失败");
        } else {
            phoneService.phone();
        }
    }
}
