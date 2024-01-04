package com.xiaoning.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoning.controller.dto.UserDTO;
import com.xiaoning.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 小宁
 * @since 2022-07-19
 */
public interface IUserService extends IService<User> {

    UserDTO login(UserDTO userDTO);

    User register(UserDTO userDTO);
}
