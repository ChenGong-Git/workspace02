package com.cg.service;

import com.cg.entity.User;

public interface UserService {
    /**
     *
     * @param user
     * @return
     * @throws Exception
     */
    User getLoginUser(User user)throws Exception;
}
