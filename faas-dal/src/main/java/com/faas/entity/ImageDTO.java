package com.faas.entity;

import lombok.Getter;
import lombok.Setter;
/**
 * (Image)实体类
 *
 * @author xjm
 * @since 2021-07-01 14:52:36
 */
@Setter
@Getter
public class ImageDTO  {
    
    
    private Long id;
    
    private String name;
    
    private String url;
    
    private Integer type;
    
    private Integer isDeleted;
    
    private String openId;


}