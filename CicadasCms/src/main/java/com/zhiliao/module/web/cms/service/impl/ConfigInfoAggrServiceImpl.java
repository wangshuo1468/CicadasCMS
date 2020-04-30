package com.zhiliao.module.web.cms.service.impl;

import com.zhiliao.mybatis.mapper.ConfigInfoAggrMapper;
import com.zhiliao.mybatis.model.ConfigInfoAggr;
import com.zhiliao.module.web.cms.service.ConfigInfoAggrService;
import com.zhiliao.component.generator.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by çç¡ on 2020/04/30.
 */
@Service
public class ConfigInfoAggrServiceImpl extends AbstractService<ConfigInfoAggr> implements ConfigInfoAggrService {

    @Autowired
    private ConfigInfoAggrMapper configInfoAggrMapper;

}
