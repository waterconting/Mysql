package com.water.controller.service;

import com.water.mapper.cluster.teacherTwoMapper;
import com.water.model.TeacherTwo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author ZY
 * @Date 2023/7/5 17:49
 */
@Service
public class TwoService {
    @Resource
    private teacherTwoMapper teacherTwoMapper;

    public TeacherTwo get() {
        TeacherTwo teacher = teacherTwoMapper.selectByPrimaryKey("03");
        return teacher;
    }
}
