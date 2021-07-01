package com.faas.controller;

import com.alibaba.fastjson.JSON;
import com.faas.entity.ImageDTO;
import com.faas.mapper.ImageMapper;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jianmiao.xu
 * @date 2021/6/22
 */
@RestController
public class ImageController {

    @Resource
    private ImageMapper imageMapper;

    @RequestMapping("index")
    public String test() {

        ImageDTO imageDTO = imageMapper.loadById(1L);
        return JSON.toJSONString(imageDTO);
    }
}