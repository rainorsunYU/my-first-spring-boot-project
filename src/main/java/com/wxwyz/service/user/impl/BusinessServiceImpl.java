package com.wxwyz.service.user.impl;

import com.wxwyz.mapper.BusinessMapper;
import com.wxwyz.mapper.PartTimeJobMapper;
import com.wxwyz.model.Business;
import com.wxwyz.service.user.IBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BusinessServiceImpl implements IBusinessService {

    @Autowired
    private BusinessMapper businessMapper;

    @Autowired
    private PartTimeJobMapper partTimeJobMapper;

    @Override
    public List<Business> queryAllBusiness() {
        return businessMapper.queryAllBusiness();
    }

    @Override
    public Business queryOneBusiness(String username) {
        return businessMapper.queryOneBusiness(username);
    }

    @Override
    public Integer updateAJobState(Integer jobId, Integer state) {
        return partTimeJobMapper.updateAJobState(jobId, state);
    }
}
