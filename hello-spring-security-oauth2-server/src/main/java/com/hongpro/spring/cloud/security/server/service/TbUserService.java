package com.hongpro.spring.cloud.security.server.service;

import com.hongpro.spring.cloud.security.server.domain.TbUser;

/**
 * TODO
 *
 * @author zhangzihong
 * @data 2021/1/21 16:27
 */
public interface TbUserService {
    TbUser getByUsername(String username);
}
