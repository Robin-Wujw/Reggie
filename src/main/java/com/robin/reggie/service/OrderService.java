package com.robin.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.robin.reggie.entity.Orders;

/**
 * @Auther: RobinWu
 * @Date: 2023/2/27 20:18
 * @Description:
 **/
public interface OrderService extends IService<Orders> {
    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
