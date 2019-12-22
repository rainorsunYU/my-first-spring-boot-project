package com.wxwyz.mapper;

import com.wxwyz.model.Business;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BusinessMapper {

    List<Business> queryAllBusiness();

    Business queryOneBusiness(String username);
}
