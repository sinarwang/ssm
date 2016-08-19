package com.sss.sinar.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sss.sinar.dao.UserInfoMapper;
import com.sss.sinar.model.UserInfo;
import com.sss.sinar.service.UserService;

/**
 * 创建时间：2016-8-17 下午5:22:59
 * 
 * @author sinar
 * @version 2.2
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public UserInfo getUserById(int id) {
		return userInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<UserInfo> getUsers() {
		return userInfoMapper.selectAll();
	}

	@Override
	public int insert(UserInfo userInfo) {
		
		int result = userInfoMapper.insert(userInfo);
		
		System.out.println(result);
		return result;
	}

}
