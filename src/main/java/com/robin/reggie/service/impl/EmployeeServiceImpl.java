package com.robin.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.robin.reggie.entity.Employee;
import com.robin.reggie.mapper.EmployeeMapper;
import com.robin.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @Author: Robin_Wujw
 * @Date: 2023-02-09 16:21
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {


}
