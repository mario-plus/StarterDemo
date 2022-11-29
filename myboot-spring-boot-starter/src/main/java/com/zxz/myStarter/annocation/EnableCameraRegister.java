package com.zxz.myStarter.annocation;


import com.zxz.myStarter.register.AutoRegisterCamera;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({AutoRegisterCamera.class})
public @interface EnableCameraRegister {
}
