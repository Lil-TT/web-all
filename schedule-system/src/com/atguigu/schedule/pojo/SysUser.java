package com.atguigu.schedule.pojo;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysUser implements Serializable {

    private Integer uid;
    private String username;
    private String userPwd;
}
