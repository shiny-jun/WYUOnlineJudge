package com.zoctan.api.service.impl;

import com.zoctan.api.mapper.FavoriteProblemMapper;
import com.zoctan.api.model.FavoriteProblem;
import com.zoctan.api.service.FavoriteProblemService;
import com.zoctan.api.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* Created by Zoctan on 2018/04/09.
*/
@Service
@Transactional
@SuppressWarnings("SpringJavaAutowiringInspection")
public class FavoriteProblemServiceImpl extends AbstractService<FavoriteProblem> implements FavoriteProblemService {
    @Resource
    private FavoriteProblemMapper favoriteProblemMapper;

}
