package com.example.demo.mapper;

import com.example.demo.userBean.CodeBook;

public interface CodeBookDao {
    int deleteByPrimaryKey(Long id);

    int insert(CodeBook record);

    int insertSelective(CodeBook record);

    CodeBook selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CodeBook record);

    int updateByPrimaryKey(CodeBook record);
}