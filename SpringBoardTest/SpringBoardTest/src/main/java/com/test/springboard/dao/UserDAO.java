package com.test.springboard.dao;

import org.apache.ibatis.annotations.Mapper;

import com.test.springboard.vo.UserVO;

@Mapper
public interface UserDAO {
    public UserVO searchUser(UserVO userVO);

}
