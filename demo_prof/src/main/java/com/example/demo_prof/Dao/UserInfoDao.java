package com.example.demo_prof.Dao;

import java.util.List;

import com.example.demo_prof.domain.UserInfoDto;

@Mapper
public interface UserInfoDao {
	
	public UserInfoDto getUserInfo(String uno); 
	public List<UserInfoDto> getUserInfoList();
	public int saveUserInfo(UserInfoDto userInfoDto );
	public int deleteUserInfo(String uno);
	
}
