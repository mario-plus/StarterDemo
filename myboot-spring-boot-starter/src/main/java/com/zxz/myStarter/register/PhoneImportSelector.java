package com.zxz.myStarter.register;

import com.zxz.myStarter.service.PhoneServiceImpl;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zxz
 * @date 2022年11月25日 17:46
 */
public class PhoneImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{PhoneServiceImpl.class.getName()};
    }
}
