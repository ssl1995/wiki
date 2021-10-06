package com.jiawa.wiki.service;

import com.jiawa.wiki.req.EbookQueryReq;
import com.jiawa.wiki.resp.EbookQueryResp;

import java.util.List;

/**
 * @author SongShengLin
 * @date 2021/10/6 5:05 下午
 * @description
 */
public interface EbookService {
    List<EbookQueryResp> getList(EbookQueryReq req);
}
