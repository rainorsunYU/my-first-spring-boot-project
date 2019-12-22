package com.wxwyz.service.user;

import com.wxwyz.model.Business;

import java.util.List;

public interface IBusinessService {

    List<Business> queryAllBusiness();

    Business queryOneBusiness(String username);

    Integer updateAJobState(Integer jobId, Integer state);

}
