package com.wxwyz.dto;

import com.wxwyz.model.Enter;
import lombok.Data;

@Data
public class UserEnterDTO {

    private Integer userId;
    private String userName;
    private String avatars;
    private String realName;
    private String nickname;
    private String phone;
    private Enter enter;
}
