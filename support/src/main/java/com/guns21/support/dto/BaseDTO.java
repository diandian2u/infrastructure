package com.guns21.support.dto;

import lombok.Data;

import java.io.*;
import java.util.Date;

/**
 * @author jliu
 */
@Data
public class BaseDTO implements Serializable {
    private String id;
    private Date createTime;
    private Date updateTime;
}
