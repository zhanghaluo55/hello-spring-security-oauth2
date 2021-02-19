package com.hongpro.spring.cloud.security.server.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * TODO
 *
 * @author zhangzihong
 * @data 2021/1/21 16:08
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
