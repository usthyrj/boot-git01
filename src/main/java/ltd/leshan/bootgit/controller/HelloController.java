package ltd.leshan.bootgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description: TODO
 * @author: 闫荣君
 * @date: 2020/3/23  13:23
 */
@RestController
public class HelloController {

    @GetMapping("/info")
    public String info(){
        return "Hello World员工改的";
    }

    @GetMapping("/info2")
    public String info2(){
        return "info2";
    }
}
