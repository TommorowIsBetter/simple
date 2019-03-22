package com.plase.simple.model;

import java.util.Date;

import lombok.Data;
@Data
public class SysRole {
	private Long id;
	private String roleName;
	private Long enabled;
	private Long createBy;
	private Date createTime;
}
