package com.robin.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.robin.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: RobinWu
 * @Date: 2023/2/21 21:54
 * @Description:
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
