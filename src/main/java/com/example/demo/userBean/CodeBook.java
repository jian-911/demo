package com.example.demo.userBean;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * code_book
 * @author 
 */
@Data
public class CodeBook implements Serializable {
    /**
     * 物理主键
     */
    private Long id;

    /**
     * 业务类型
     */
    private String info;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;

    private static final long serialVersionUID = 1L;
}