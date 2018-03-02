package com.springbook.biz.user.impl;

import com.springbook.biz.user.UserVO;

public interface UserService {

	// CRUD 기능의 메소드 구현

	// 유저 조회
	UserVO getUser(UserVO vo);

}