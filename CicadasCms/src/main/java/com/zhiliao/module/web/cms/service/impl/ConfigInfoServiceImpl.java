package com.zhiliao.module.web.cms.service.impl;

import com.zhiliao.mybatis.mapper.ConfigInfoMapper;
import com.zhiliao.mybatis.model.ConfigInfo;
import com.zhiliao.module.web.cms.service.ConfigInfoService;
import com.zhiliao.component.generator.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by çç¡ on 2020/04/30.
 */
@Service
public class ConfigInfoServiceImpl extends AbstractService<ConfigInfo> implements ConfigInfoService {

    @Autowired
    private ConfigInfoMapper configInfoMapper;

}
