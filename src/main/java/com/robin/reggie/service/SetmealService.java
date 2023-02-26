package com.robin.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.robin.reggie.dto.SetmealDto;
import com.robin.reggie.entity.Setmeal;

import java.util.List;

/**
 * @Auther: RobinWu
 * @Date: 2023/2/16 17:56
 * @Description:
 **/
public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐同时删除套餐与菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);
}
