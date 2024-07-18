package cn.itcast.feign.clients;

import cn.itcast.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description:
 * @projectName:cloud
 * @see:cn.itcast.order.clients
 * @author:db
 * @createTime:2024/7/15 18:58
 * @version:1.0
 */
@FeignClient(value = "userservice")
public interface UserClient {

    @GetMapping("/user/{id}")
    User findByID(@PathVariable("id") Long id);
}
