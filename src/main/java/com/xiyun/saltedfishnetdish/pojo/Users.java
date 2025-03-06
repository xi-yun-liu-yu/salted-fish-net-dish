package com.xiyun.saltedfishnetdish.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    private String userId;//系统内唯一用户标识

    private String username;//登录用户名（唯一）

    private String passwordHash;//BCrypt加密后的密码

    private String email;//绑定邮箱（用于找回密码）

    private Long storageLimit; // 存储配额（字节，默认1GB）

    private Long usedStorage;//已用存储空间（动态更新）

    private String userPermId;//用户权限id

    private LocalDateTime createdAt;//账户创建时间

}
