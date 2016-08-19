package com.sss.sinar.service;

import java.util.List;

import com.sss.sinar.model.UserInfo;

/**  
 * 创建时间：2016-8-17 下午5:15:03  
 * @author sinar  
 * @version 2.2  
 */

public interface UserService {

	UserInfo getUserById(int id);
	
	List<UserInfo> getUsers();
	
	int insert(UserInfo userInfo);
}
