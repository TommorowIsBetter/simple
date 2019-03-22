package com.plase.simple.mapper;

import java.util.List;

import com.plase.simple.model.SysUser;

public interface UserMapper {
	/**
	 * 
	 * @param id
	 * @return
	 * @Description 通过id查询用户
	 */
	SysUser selectById(Long id);
	/**
	 * 
	 * @return
	 * @Description 查询全部用户
	 */
	List<SysUser> selectAll();
}
