package com.zxz.myStarter.annocation;


import com.zxz.myStarter.register.PhoneImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({PhoneImportSelector.class})
public @interface EnablePhoneRegister {
}
