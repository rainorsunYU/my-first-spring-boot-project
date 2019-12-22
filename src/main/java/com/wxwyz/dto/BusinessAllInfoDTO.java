package com.wxwyz.dto;

import com.wxwyz.model.PartTimeJob;
import lombok.Data;

@Data
public class BusinessAllInfoDTO {

    private Integer id;

    private String nickname;

    private String avatars;

    private Integer comments=0;

    private String phone;

    private PartTimeJob partTimeJob;

}
