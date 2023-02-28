package com.robin.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.robin.reggie.entity.OrderDetail;
import com.robin.reggie.mapper.OrderDetailMapper;
import com.robin.reggie.service.OrderDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Auther: RobinWu
 * @Date: 2023/2/27 20:20
 * @Description:
 **/
@Slf4j
@Service
public class OrderDetailImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
