package com.hongpro.spring.cloud.security.server.service.impl;

import com.hongpro.spring.cloud.security.server.domain.TbUser;
import com.hongpro.spring.cloud.security.server.mapper.TbUserMapper;
import com.hongpro.spring.cloud.security.server.service.TbUserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author zhangzihong
 * @data 2021/1/21 16:28
 */
@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUsername(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", username);
        return tbUserMapper.selectOneByExample(example);
    }
}
