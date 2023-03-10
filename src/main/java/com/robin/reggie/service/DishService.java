package com.robin.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.robin.reggie.dto.DishDto;
import com.robin.reggie.entity.Dish;
import org.springframework.stereotype.Service;


/**
 * @Auther: RobinWu
 * @Date: 2023/2/16 17:56
 * @Description:
 **/
public interface DishService extends IService<Dish> {
    //新增菜品，同时插入菜品对应的口味数据，需要擦欧总两张表:dish、dish_flavor
    public void saveWithFlavor(DishDto dishDto);
    //更新菜品信息、更新口味信息
    public void updateWithFlavor(DishDto dishDto);
    //根据id查询菜品信息和对应的口味信息
    public DishDto getByIdWithFlavor(Long id);
}
