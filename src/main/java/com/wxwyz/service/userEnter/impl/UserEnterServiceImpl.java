package com.wxwyz.service.userEnter.impl;

import com.wxwyz.dto.EnterPageDTO;
import com.wxwyz.dto.UserEnterDTO;
import com.wxwyz.dto.UserEnterJobDTO;
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

    @Override
    public EnterPageDTO queryOneUserEnter(Integer page, Integer size, Integer uid) {
        EnterPageDTO pageDTO = new EnterPageDTO();
        pageDTO.setPage(page);
        pageDTO.setSize(size);
        pageDTO.setTotalRecord(enterMapper.queryOneUserEnterNum(uid));
        List<UserEnterJobDTO> enterJobDTOS = enterMapper.queryOneUserEnter(pageDTO.getOfferSet(), size, uid);
        pageDTO.setList(enterJobDTOS);
        return pageDTO;
    }

    @Override
    public Integer deleteAEnterJob(Integer enter) {
        return enterMapper.deleteAEnterJob(enter);
    }
}
