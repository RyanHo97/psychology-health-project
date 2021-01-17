package com.joycheng.ryan.mapper;

import com.joycheng.ryan.entity.Topic;

import java.util.List;

public interface TopicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Topic record);

    Topic selectByPrimaryKey(Integer id);

    List<Topic> selectAll();

    int updateByPrimaryKey(Topic record);

    int count();

    List<Topic> selectByKeyWord(String keyword1);
}