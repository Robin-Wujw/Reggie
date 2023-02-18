package com.robin.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.robin.reggie.entity.Setmeal;
import com.robin.reggie.mapper.SetmealMapper;
import com.robin.reggie.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Auther: RobinWu
 * @Date: 2023/2/16 17:57
 * @Description:
 **/
@Slf4j
@Service
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService{
}
