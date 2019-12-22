package com.wxwyz.service.pagination.impl;

import com.wxwyz.dto.BusinessAllInfoDTO;
import com.wxwyz.dto.JobPage2DTO;
import com.wxwyz.dto.JobPageDTO;
import com.wxwyz.mapper.PartTimeJobMapper;
import com.wxwyz.model.PartTimeJob;
import com.wxwyz.service.comment.impl.CommentServiceImpl;
import com.wxwyz.service.pagination.IJobPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class JobPageServiceImpl implements IJobPageService {

    @Autowired
    private PartTimeJobMapper partTimeJobMapper;

    @Autowired
    private CommentServiceImpl commentServiceImpl;

    @Override
    public JobPageDTO queryAllJobByPagination(Integer page,Integer size) {
        JobPageDTO jobPageDTO = new JobPageDTO();
        jobPageDTO.setPage(page);
        jobPageDTO.setSize(size);
        jobPageDTO.setTotalRecord(partTimeJobMapper.queryAllJobCounter());
        List<PartTimeJob> partTimeJobs = partTimeJobMapper.queryAllJobByPagination(jobPageDTO.getOfferSet(),size);
        jobPageDTO.setList(partTimeJobs);
        return jobPageDTO;
    }

    @Override
    public JobPage2DTO queryAllInfoJob(Integer page, Integer size) {
//        PageHelper.startPage(page,size);
        JobPage2DTO jobPage2DTO = new JobPage2DTO();
        jobPage2DTO.setPage(page);
        jobPage2DTO.setSize(size);
        jobPage2DTO.setTotalRecord(partTimeJobMapper.queryAllJobCounter());
        List<BusinessAllInfoDTO> jobAllInfoDTOS = partTimeJobMapper.queryJobAllInfo(jobPage2DTO.getOfferSet(),size);
        jobPage2DTO.setList(jobAllInfoDTOS);
        return jobPage2DTO;
    }

    @Override
    public Integer insertOneJob(PartTimeJob job) {
        return partTimeJobMapper.insertOneJob(job);
    }

    @Override
    public BusinessAllInfoDTO queryOneBusinessJob(Integer jobId) {
        return partTimeJobMapper.queryOneBusinessJob(jobId);
    }

    @Override
    public Integer updateViews(Integer jobId) {
        return partTimeJobMapper.updateViews(jobId);
    }

    @Override
    public Integer updateApplicants(Integer jobId) {
        return partTimeJobMapper.updateApplicants(jobId);
    }

    @Override
    public Integer queryAJobApplicants(Integer jobId) {
        return partTimeJobMapper.queryJobApplicants(jobId);
    }

    @Override
    public Integer queryAJobNeedNumber(Integer jobId) {
        return partTimeJobMapper.queryJObNeedNumber(jobId);
    }

    @Override
    public JobPage2DTO queryOneBusJobInfo(Integer page, Integer size, Integer parentId) {
        JobPage2DTO jobPage2DTO = new JobPage2DTO();
        jobPage2DTO.setPage(page);
        jobPage2DTO.setSize(size);
        jobPage2DTO.setTotalRecord(partTimeJobMapper.queryJobCounterByParentId(parentId));
        List<BusinessAllInfoDTO> allInfoDTO = partTimeJobMapper.queryOneJobAllInfo(jobPage2DTO.getOfferSet(), size, parentId);
        jobPage2DTO.setList(allInfoDTO);
        return jobPage2DTO;
    }

    @Override
    public JobPage2DTO queryAllByClassify(Integer page, Integer size, String jobType) {
        JobPage2DTO jobPage2DTO = new JobPage2DTO();
        jobPage2DTO.setPage(page);
        jobPage2DTO.setSize(size);
        jobPage2DTO.setTotalRecord(partTimeJobMapper.queryAllJobCounter());
        List<BusinessAllInfoDTO> jobAllInfoDTOS = partTimeJobMapper.queryJobClassify(jobPage2DTO.getOfferSet(),size,jobType);
        jobPage2DTO.setList(jobAllInfoDTOS);
        return jobPage2DTO;
    }

    @Override
    public JobPage2DTO queryAllByClassify2(Integer page, Integer size, String jobType1, String jobType2, String jobType3) {
        JobPage2DTO jobPage2DTO = new JobPage2DTO();
        jobPage2DTO.setPage(page);
        jobPage2DTO.setSize(size);
        jobPage2DTO.setTotalRecord(partTimeJobMapper.queryAllJobCounter());
        List<BusinessAllInfoDTO> jobAllInfoDTOS = partTimeJobMapper.queryJobClassify2(jobPage2DTO.getOfferSet(),size,jobType1,jobType2,jobType3);
        jobPage2DTO.setList(jobAllInfoDTOS);
        return jobPage2DTO;
    }
}
