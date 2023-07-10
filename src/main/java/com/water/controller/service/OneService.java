package com.water.controller.service;

import com.water.mapper.master.teacherOneMapper;
import com.water.model.TeacherOne;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author ZY
 * @Date 2023/7/5 16:24
 */
@Service
public class OneService {
    @Resource
    private teacherOneMapper teacherOneMapper;

    public TeacherOne get() {
        TeacherOne teacher = teacherOneMapper.selectByPrimaryKey("03");
        return teacher;
    }
}
