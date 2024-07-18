package cn.itcast.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @projectName:cloud
 * @see:cn.itcast.user.config
 * @author:db
 * @createTime:2024/7/15 15:29
 * @version:1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "pattern")
public class PatternProperties {
    private String dateformat;
    private String envSharedValue;
}
