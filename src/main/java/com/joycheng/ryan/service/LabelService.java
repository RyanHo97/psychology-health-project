package com.joycheng.ryan.service;

import com.joycheng.ryan.entity.Label;

import java.util.List;

public interface LabelService {

    int deleteByPrimaryKey(Integer id);

    int insert(Label record);

    Label selectByPrimaryKey(Integer id);

    List<Label> selectAll();

    int updateByPrimaryKey(Label record);
}
