package com.zxz.myStarter.register;

import com.zxz.myStarter.service.CameraServiceImpl;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zxz
 * @date 2022年11月25日 17:21
 */
public class AutoRegisterCamera implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition bd = new RootBeanDefinition();
        bd.setBeanClass(CameraServiceImpl.class);
        registry.registerBeanDefinition("cameraServiceImpl", bd);
    }
}
