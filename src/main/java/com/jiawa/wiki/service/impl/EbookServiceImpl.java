package com.jiawa.wiki.service.impl;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.domain.EbookExample;
import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.req.EbookQueryReq;
import com.jiawa.wiki.resp.EbookQueryResp;
import com.jiawa.wiki.service.EbookService;
import com.jiawa.wiki.util.CopyUtil;
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
    public List<EbookQueryResp> getList(EbookQueryReq req) {
        EbookExample ebookExample = new EbookExample();
        ebookExample.createCriteria().andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        // 使用泛型封装工具类，复制domain和指定返回值给前端
        return CopyUtil.copyList(ebookList, EbookQueryResp.class);
    }
}
