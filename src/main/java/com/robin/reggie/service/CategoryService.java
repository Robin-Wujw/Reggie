package com.robin.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.robin.reggie.entity.Category;

/**
 * @Auther: RobinWu
 * @Date: 2023/2/16 16:22
 * @Description:
 **/
public interface CategoryService extends IService<Category> {
    public void remove(Long ids);
}
