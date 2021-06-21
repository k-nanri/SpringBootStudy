package jp.study.sb.demo.controll;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.study.sb.demo.model.User;
import jp.study.sb.demo.service.DemoService;

@RestController
public class DemoController {
    
    private final DemoService service;
    
    public DemoController(DemoService service) {
        this.service = service;
    }
    
    @PostMapping("/register")
    public void register(User user) {
        
        ResponseEntity response = this.service.register(user);
    }

}

