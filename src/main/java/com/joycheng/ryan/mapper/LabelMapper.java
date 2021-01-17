package com.joycheng.ryan.mapper;

import com.joycheng.ryan.entity.Label;

import java.util.List;

public interface LabelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Label record);

    Label selectByPrimaryKey(Integer id);

    List<Label> selectAll();

    int updateByPrimaryKey(Label record);
}