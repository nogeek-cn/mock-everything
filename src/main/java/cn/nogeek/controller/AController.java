package cn.nogeek.controller;


import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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


    /**
     * http://127.0.0.1:8080/say
     *
     * @return str
     */
    @GetMapping("/say")
    public String sayHello() {
        return aService.sayHello();
    }

    @GetMapping("/sayList")
    public List<String> sayList() {
        return aService.sayList();
    }

    @GetMapping("/sayMap")
    public Map<String, String> sayMap() {
        return aService.sayMap();
    }

    @GetMapping("/sayDemoList")
    public List<Demo> sayDemoList() {
        return aService.sayDemoList();
    }


}
