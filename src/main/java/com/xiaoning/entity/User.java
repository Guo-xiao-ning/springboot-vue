package com.xiaoning.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data   //lombok插件，就这样一个注解就包含了get set toString函数 （它还有很多玩法，可自行去搜索）
@TableName(value = "sys_user") //为了确认数据库名
@ToString
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;//有TableId注解后id名字终于可以不一一对应了
    private String username;
    @JsonIgnore
    private String password;
    private String nickname;
    private String email;
    private String phone;
    private String address;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "avatar_url")//指定数据库的字段名称
    private String avatar;
}
