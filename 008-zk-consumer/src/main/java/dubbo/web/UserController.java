package dubbo.web;

import dubbo.model.User;
import dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:UserController
 * Package:com.bjpowernode.dubbo.web
 * Description:
 *
 * @date:2020/3/3 10:25
 * @author:蛙课网
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userDetail")
    public String userDetail(Model model,Integer id, String username) {
        User user = userService.queryUserById(id, username);
        model.addAttribute("user",user);
        return "userDetail";
    }
}
