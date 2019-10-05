package com.test.springboard.dao.user;

import org.apache.ibatis.annotations.Mapper;

import com.test.springboard.vo.user.UserVO;

@Mapper
public interface UserDAO {
    public UserVO searchUser(UserVO userVO);

}
