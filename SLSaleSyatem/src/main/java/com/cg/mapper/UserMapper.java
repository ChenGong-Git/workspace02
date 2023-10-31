package com.cg.mapper;

import com.cg.entity.User;

public interface UserMapper {

    /**
     *
     * @param user
     * @return
     * @throws Exception
     */
    User getLoginUser(User user)throws Exception;
}
