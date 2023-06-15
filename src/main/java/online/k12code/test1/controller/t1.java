package online.k12code.test1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 阿威
 * @Date 2023/6/15
 */
@RestController
public class t1 {
    @RequestMapping("/test")
    public String  test (){
        return "hello";
    }
}
