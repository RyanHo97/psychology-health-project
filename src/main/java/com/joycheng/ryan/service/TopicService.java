package com.joycheng.ryan.service;

import com.joycheng.ryan.entity.Topic;

import java.util.List;

public interface TopicService {
    boolean deleteByPrimaryKey(Integer id);

    boolean insert(Topic record);

    Topic selectByPrimaryKey(Integer id);

    List<Topic> selectAll(int page,int limit);
    List<Topic> selectByList();

    boolean updateByPrimaryKey(Topic record);


    int count();

    List<Topic> selectByKeyWord(Integer page, Integer limit, String keyword1);
}
