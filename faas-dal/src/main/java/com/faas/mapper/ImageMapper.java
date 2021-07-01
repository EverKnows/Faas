package com.faas.mapper;

import com.faas.entity.ImageDTO;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Image)表数据库访问层
 *
 * @author xjm
 * @since 2021-07-01 14:52:38
 */
public interface ImageMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ImageDTO loadById(Long id);


    /**
     * 新增数据
     *
     * @param imageDTO 实例对象
     * @return 影响行数
     */
    int insert(ImageDTO imageDTO);

  
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}