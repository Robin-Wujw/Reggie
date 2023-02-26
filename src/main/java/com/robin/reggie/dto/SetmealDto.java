package com.robin.reggie.dto;

import com.robin.reggie.entity.Setmeal;
import com.robin.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
