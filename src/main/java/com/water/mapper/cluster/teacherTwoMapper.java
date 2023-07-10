package com.water.mapper.cluster;

import com.water.model.TeacherTwo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface teacherTwoMapper {
    int deleteByPrimaryKey(String tId);

    int insert(TeacherTwo record);

    int insertSelective(TeacherTwo record);

    TeacherTwo selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TeacherTwo record);

    int updateByPrimaryKey(TeacherTwo record);
}