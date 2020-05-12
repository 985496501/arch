package com.jinanluke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;


/**
 * spring-boot starter:
 * onStartup application.
 *
 * @author jinyun liu
 */
//@EnableAsync(proxyTargetClass = true)
//@EnableCaching
@SpringBootApplication
public class ArchApplication {
    public static void main(String[] args) {
        // delegate to 'run' method to start SpringApplication.
        // that all create the configurableApplicationContext.
        SpringApplication.run(ArchApplication.class, args);

        // way2:
        // SpringApplication.run(new Class[]{ArchApplication.class}, args);

        // way3:
//        new SpringApplication(ArchApplication.class).run(args);
//
//        new SpringApplication();
    }
}
