package com.jiawa.wiki.service.impl;

import com.jiawa.wiki.domain.Demo;
import com.jiawa.wiki.mapper.DemoMapper;
import com.jiawa.wiki.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author SongShengLin
 * @date 2021/10/6 5:07 下午
 * @description
 */
@Service
public class DemoServerImpl implements DemoService {
    @Resource
    private DemoMapper demoMapper;

    @Override
    public List<Demo> getList() {
        // 可以将example看成where条件
        return demoMapper.selectByExample(null);
    }
}
