package com.example.wechat.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author limeiqi
 * @date 2020/1/19
 **/
@Controller
@RequestMapping("wechat")
public class OAuthController {

    @Value("${wechat.oauthUrl}")
    private String oauthUrl;


    @RequestMapping(value = "getCode", method = RequestMethod.GET)
    public String getCode() {
        return oauthUrl;
    }

}
