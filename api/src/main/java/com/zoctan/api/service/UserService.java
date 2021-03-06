package com.zoctan.api.service;

import com.zoctan.api.core.service.Service;
import com.zoctan.api.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

/**
 * @author Zoctan
 * @date 2018/5/27
 */
public interface UserService extends Service<User> {
    @Override
    void save(User user);

    List<User> findAllUserWithRole();

    @Override
    void update(User user);

    User findDetailBy(String column, Object param);

    User findDetailByUsername(String username) throws UsernameNotFoundException;

    /**
     * 更新用户登录时间
     *
     * @param username 用户名
     */
    void updateLastLoginTimeByUsername( String username);

    boolean verifyPassword(String rawPassword, String encodedPassword);
}
