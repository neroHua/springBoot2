package com.nero.dao;

import com.nero.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    User findById(@Param(value = "id") Long id);

}
