package com.mssoft.smt.mapper;

import com.mssoft.smt.model.StudentScoreInfo;
import com.mssoft.smt.model.StudentScoreInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentScoreInfoMapper {
    long countByExample(StudentScoreInfoExample example);

    int deleteByExample(StudentScoreInfoExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(StudentScoreInfo record);

    int insertSelective(StudentScoreInfo record);

    List<StudentScoreInfo> selectByExample(StudentScoreInfoExample example);

    StudentScoreInfo selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") StudentScoreInfo record, @Param("example") StudentScoreInfoExample example);

    int updateByExample(@Param("record") StudentScoreInfo record, @Param("example") StudentScoreInfoExample example);

    int updateByPrimaryKeySelective(StudentScoreInfo record);

    int updateByPrimaryKey(StudentScoreInfo record);
}