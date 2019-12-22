package com.wxwyz.mapper;

import com.wxwyz.dto.UserEnterDTO;
import com.wxwyz.model.Enter;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface EnterMapper {

    List<UserEnterDTO> queryUserEnterJob(Integer userId);

    UserEnterDTO queryAEnterJob(Integer userId, Integer jobId);

    Integer insertAEnterJob(Enter enter);
}
