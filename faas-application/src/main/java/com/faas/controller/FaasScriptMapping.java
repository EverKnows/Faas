package com.faas.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jianmiao.xu
 * @date 2021/5/17
 */
@Slf4j
@RestController
public class FaasScriptMapping {

    @RequestMapping(path = "/home/index")
    public String index() {
        return "TEST";
    }
}