package cn.itcast.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @description:
 * @projectName:cloud
 * @see:cn.itcast.order.config
 * @author:db
 * @createTime:2024/7/18 10:22
 * @version:1.0
 */
public class DefualtConfiguration {

    @Bean
    public Logger.Level logLevel() {
        return Logger.Level.BASIC;
    }
}
