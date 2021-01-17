package com.joycheng.ryan.service;

import com.joycheng.ryan.entity.Reply;

import java.util.List;

public interface ReplyService {

    boolean deleteByPrimaryKey(Integer id);

    boolean insert(Reply record);

    Reply selectByPrimaryKey(Integer id);

    List<Reply> selectAll();

    boolean updateByPrimaryKey(Reply record);
}
