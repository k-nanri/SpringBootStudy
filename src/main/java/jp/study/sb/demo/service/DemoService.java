package jp.study.sb.demo.service;

import org.springframework.http.ResponseEntity;

import jp.study.sb.demo.model.User;

public interface DemoService {

    ResponseEntity register(User user);

}
