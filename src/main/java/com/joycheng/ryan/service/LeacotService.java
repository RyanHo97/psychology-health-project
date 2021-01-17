package com.joycheng.ryan.service;

import com.joycheng.ryan.entity.Leacot;

import java.util.List;

public interface LeacotService {
    boolean deleteByPrimaryKey(Integer id);

    boolean insert(Leacot record);

    Leacot selectByPrimaryKey(Integer id);

    List<Leacot> selectAll(int page, int limit);

    List<Leacot> selectByList();

    boolean updateByPrimaryKey(Leacot record);

    int count();

    List<Leacot> selectByKeyWord(Integer page, Integer limit, String keyword1);
}
