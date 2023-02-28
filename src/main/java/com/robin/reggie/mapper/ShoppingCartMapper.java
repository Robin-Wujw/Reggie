package com.robin.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.robin.reggie.entity.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: RobinWu
 * @Date: 2023/2/27 18:38
 * @Description:
 **/
@Mapper
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {
}
