package com.example.demo.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/packages")
public class packageApi {

    @GetMapping("/{id}")
    public WebResponse state(@PathVariable("id") Integer id) {

        /*
        * dao操作
        */
        if (1==1) {
            return new WebResponse();
        }


        return new WebResponse();
    }

}


class WebResponse {
    private Integer code;
    private String message;
    private Object data;
}