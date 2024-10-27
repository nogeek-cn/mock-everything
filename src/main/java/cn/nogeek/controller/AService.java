package cn.nogeek.controller;

import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.List;
import java.util.Map;

/***
 *
 *
 * @author <a href="mailto:">notOnlyGeek</a>
 * @date 2024/10/21  下午10:41
 */
@Service
public class AService {

    public String sayHello() {
        return "noGeek.cn";
    }

    public List<String> sayList() {
        return null;
    }

    public Map<String, String> sayMap() {
        return null;
    }

    public List<Demo> sayDemoList() {
        return null;
    }
}
