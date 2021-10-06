package com.jiawa.wiki.service.impl;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.service.EbookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author SongShengLin
 * @date 2021/10/6 5:23 下午
 * @description
 */
@Service
public class EbookServiceImpl implements EbookService {
    @Resource
    private EbookMapper ebookMapper;

    @Override
    public List<Ebook> getList() {
        return ebookMapper.selectByExample(null);
    }
}
