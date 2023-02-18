package com.robin.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.robin.reggie.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: RobinWu
 * @Date: 2023/2/16 16:22
 * @Description:
 **/
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
