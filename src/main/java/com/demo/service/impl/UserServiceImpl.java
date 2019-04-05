package com.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.model.dto.UserDTO;
import com.demo.service.UserService;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author haodong.zhao
 * @version 1.0. Added Time:2019/4/4 21:03
 */
@Service
public class UserServiceImpl implements UserService {

    private final static Map<Long, UserDTO> map = Maps.newHashMap();

    static {
        map.put(111L, new UserDTO(111L, "虹猫", 17));
        map.put(222L, new UserDTO(222L, "蓝兔", 17));
        map.put(333L, new UserDTO(333L, "莎莉", 17));
        map.put(444L, new UserDTO(444L, "逗逗", 17));
        map.put(555L, new UserDTO(555L, "大奔", 17));
        map.put(666L, new UserDTO(666L, "跳跳", 17));
        map.put(777L, new UserDTO(777L, "达达", 17));
    }

    /**
     * 通过id查找user
     * @param id id
     * @return user
     */
    @Override
    public UserDTO findById(Long id) {
        return map.get(id);
    }
}
