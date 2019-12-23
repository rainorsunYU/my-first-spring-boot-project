package com.wxwyz.dto;

import com.wxwyz.model.Enter;
import lombok.Data;

@Data
public class UserEnterJobDTO {

    private Integer jobId;
    private String jobTitle;
    private String jobType;
    private Integer jobViews;
    private Enter enter;

}
