package com.wxwyz.service.userEnter.impl;

import com.wxwyz.dto.UserEnterDTO;
import com.wxwyz.mapper.EnterMapper;
import com.wxwyz.model.Enter;
import com.wxwyz.service.userEnter.IUserEnterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserEnterServiceImpl implements IUserEnterService {

    @Autowired
    private EnterMapper enterMapper;

    @Override
    public List<UserEnterDTO> queryAllUserEnterJob(Integer uid) {
        return enterMapper.queryUserEnterJob(uid);
    }

    @Override
    public UserEnterDTO queryAUserEnterJob(Integer uid, Integer jid) {
        return enterMapper.queryAEnterJob(uid,jid);
    }

    @Override
    public Integer insertAUserEnter(Enter enter) {
        return enterMapper.insertAEnterJob(enter);
    }
}
