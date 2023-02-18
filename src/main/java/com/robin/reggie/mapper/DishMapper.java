package com.robin.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.robin.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: RobinWu
 * @Date: 2023/2/16 17:54
 * @Description:
 **/
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
