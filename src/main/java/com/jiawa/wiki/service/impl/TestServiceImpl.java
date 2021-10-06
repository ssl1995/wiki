package com.jiawa.wiki.service.impl;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.mapper.TestMapper;
import com.jiawa.wiki.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author SongShengLin
 * @date 2021/10/6 4:04 下午
 * @description Service：也叫服务层，业务层；需要实现接口，添加@Service
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;


    @Override
    public List<Test> getList() {
        return testMapper.getList();
    }
}
