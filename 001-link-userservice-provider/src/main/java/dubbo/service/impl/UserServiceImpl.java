package dubbo.service.impl;

import dubbo.model.User;
import dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("lisi");
        user.setAge(23);
        return user;
    }
}
