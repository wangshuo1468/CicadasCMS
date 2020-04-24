package com.zhiliao.module.web.system.service.impl;

import com.github.pagehelper.PageInfo;
import com.zhiliao.module.web.system.service.TCmsAdminKeyService;
import com.zhiliao.mybatis.mapper.TCmsAdminKeyMapper;
import com.zhiliao.mybatis.model.TCmsAdminKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author王硕
 * @site QQ:1468282838
 * @company wang/wangshuo/王硕/WangShuo
 * @create 2020-04-24 16:16
 */
@Service
public class TCmsAdminKeyServiceImpl implements TCmsAdminKeyService {
    @Autowired
    TCmsAdminKeyMapper mapper;

    @Override
    public String save(TCmsAdminKey pojo) {
        return null;
    }

    @Override
    public String update(TCmsAdminKey pojo) {
        return null;
    }

    @Override
    public String delete(Integer[] ids) {
        return null;
    }

    @Override
    public TCmsAdminKey findById(Integer id) {
        return null;
    }

    @Override
    public List<TCmsAdminKey> findList(TCmsAdminKey pojo) {
        return null;
    }

    @Override
    public List<TCmsAdminKey> findAll() {
        return  mapper.selectAll();
    }

    @Override
    public PageInfo<TCmsAdminKey> page(Integer pageNumber, Integer pageSize, TCmsAdminKey pojo) {
        return null;
    }

    @Override
    public PageInfo<TCmsAdminKey> page(Integer pageNumber, Integer pageSize) {
        return null;
    }
}
