package com.robin.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.robin.reggie.entity.ShoppingCart;
import com.robin.reggie.mapper.ShoppingCartMapper;
import com.robin.reggie.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Auther: RobinWu
 * @Date: 2023/2/27 18:40
 * @Description:
 **/
@Service
@Slf4j
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
