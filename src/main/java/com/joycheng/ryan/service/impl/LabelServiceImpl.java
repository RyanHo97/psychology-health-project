package com.joycheng.ryan.service.impl;

import com.joycheng.ryan.mapper.LabelMapper;
import com.joycheng.ryan.service.LabelService;
import com.joycheng.ryan.entity.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文章标签Service实现类
 */
@Service
public class LabelServiceImpl implements LabelService {
    @Autowired
    private LabelMapper labelMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return labelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Label record) {
        return labelMapper.insert(record);
    }

    @Override
    public Label selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<Label> selectAll() {
        return labelMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Label record) {
        return labelMapper.updateByPrimaryKey(record);
    }
}
