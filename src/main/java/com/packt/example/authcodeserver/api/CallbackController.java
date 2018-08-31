package com.packt.example.authcodeserver.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CallbackController {

    @RequestMapping("/callback")
    public ResponseEntity<String> callback(HttpServletRequest request) {
        System.out.println(request.getQueryString());
        return ResponseEntity.ok(request.getQueryString());
    }

}
