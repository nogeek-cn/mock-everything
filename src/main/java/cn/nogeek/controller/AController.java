package cn.nogeek.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/***
 *
 *
 * @author <a href="mailto:">notOnlyGeek</a>
 * @date 2024/10/21  下午10:40
 */
@RestController
public class AController {

    @Resource
    private AService aService;


    @GetMapping("/say")
    public String sayHello() {
        return aService.sayHello();
    }


}
