package com.plase.simple.mapper;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import com.plase.simple.model.SysUser;

public class UserMapperTest extends BaseMapperTest{
@Test
public void testSelectById(){
	SqlSession sqlSession = getSqlSession();
	try{
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		SysUser user = userMapper.selectById(1l);
		System.out.println(user);
		Assert.assertNotNull(user);
		Assert.assertEquals("admin", user.getUserName());
	} finally {
		sqlSession.close();
	}
}

@Test
public void testSelectAll(){
	SqlSession sqlSession = getSqlSession();
	try {
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<SysUser> userList = userMapper.selectAll();
		Assert.assertNotNull(userList);
		Assert.assertTrue(userList.size() > 0);
	} finally {
		sqlSession.close();
	}
}
}
