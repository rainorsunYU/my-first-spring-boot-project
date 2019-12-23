package com.wxwyz.service.userEnter;

import com.wxwyz.dto.EnterPageDTO;
import com.wxwyz.dto.UserEnterDTO;
import com.wxwyz.model.Enter;

import java.util.List;

public interface IUserEnterService{

    List<UserEnterDTO> queryAllUserEnterJob(Integer uid);

    UserEnterDTO queryAUserEnterJob(Integer uid, Integer jid);

    Integer insertAUserEnter(Enter enter);

    EnterPageDTO queryOneUserEnter(Integer page, Integer size, Integer uid);

    Integer deleteAEnterJob(Integer enter);
}
