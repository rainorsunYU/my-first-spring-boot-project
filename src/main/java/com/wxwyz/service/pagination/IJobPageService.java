package com.wxwyz.service.pagination;

import com.wxwyz.dto.BusinessAllInfoDTO;
import com.wxwyz.dto.JobPage2DTO;
import com.wxwyz.dto.JobPageDTO;
import com.wxwyz.model.PartTimeJob;

public interface IJobPageService {

    JobPageDTO queryAllJobByPagination(Integer page, Integer size);

    JobPage2DTO queryAllInfoJob(Integer page, Integer size);

    Integer insertOneJob(PartTimeJob job);

    BusinessAllInfoDTO queryOneBusinessJob(Integer jobId);

    Integer updateViews(Integer jobId);

    Integer updateApplicants(Integer jobId);

    Integer queryAJobApplicants(Integer jobId);

    Integer queryAJobNeedNumber(Integer jobId);

    JobPage2DTO queryOneBusJobInfo(Integer page, Integer size, Integer parentId);

    JobPage2DTO queryAllByClassify(Integer page,Integer size,String jobType);

    JobPage2DTO queryAllByClassify2(Integer page,Integer size,String jobType1,String jobType2,String jobType3);
}
