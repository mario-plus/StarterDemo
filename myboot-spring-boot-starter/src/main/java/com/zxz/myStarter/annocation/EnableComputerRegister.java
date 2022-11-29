package com.zxz.myStarter.annocation;

import com.zxz.myStarter.service.ComputerServiceImpl;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;


@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({ComputerServiceImpl.class})
public @interface EnableComputerRegister {
}
