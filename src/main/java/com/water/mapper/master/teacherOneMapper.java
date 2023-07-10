package com.water.mapper.master;

import com.water.model.TeacherOne;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface teacherOneMapper {
    int deleteByPrimaryKey(String tId);

    int insert(TeacherOne record);

    int insertSelective(TeacherOne record);

    TeacherOne selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TeacherOne record);

    int updateByPrimaryKey(TeacherOne record);
}