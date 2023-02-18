package com.robin.reggie.controller;

import com.robin.reggie.service.DishFlavorService;
import com.robin.reggie.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 菜品管理
 * @Auther: RobinWu
 * @Date: 2023/2/18 15:28
 * @Description:
 **/
@RestController
@RequestMapping("/dish")
public class DishController {
    @Autowired
    private DishService dishService;

    @Autowired
    private DishFlavorService dishFlavorService;
     
}
