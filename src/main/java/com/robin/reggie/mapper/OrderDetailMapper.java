package com.robin.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.robin.reggie.entity.OrderDetail;
import com.robin.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: RobinWu
 * @Date: 2023/2/27 20:15
 * @Description:
 **/
@Mapper
public interface OrderDetailMapper extends BaseMapper<OrderDetail> {
}
