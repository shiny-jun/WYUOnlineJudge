package com.zoctan.api.service.impl;

import com.zoctan.api.core.service.AbstractService;
import com.zoctan.api.mapper.ContestMapper;
import com.zoctan.api.databaseModel.Contest;
import com.zoctan.api.service.ContestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class ContestServiceImpl extends AbstractService<Contest> implements ContestService {
    @Resource
    private ContestMapper contestMapper;

}
