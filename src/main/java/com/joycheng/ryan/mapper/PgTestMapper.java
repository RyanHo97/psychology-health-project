package com.joycheng.ryan.mapper;

import com.joycheng.ryan.entity.PgTest;

import java.util.List;

public interface PgTestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PgTest record);

    PgTest selectByPrimaryKey(Integer id);

    List<PgTest> selectAll();

    int updateByPrimaryKey(PgTest record);

    int count();

    List<PgTest> selectAllByKeyWord(String keyword1);
}