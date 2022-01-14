package dubbo.service.impl;

import dubbo.model.User;
import dubbo.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("zhangsan");
        return user;
    }

    @Override
    public Integer queryAllUserCount() {
        return 52;
    }
}
