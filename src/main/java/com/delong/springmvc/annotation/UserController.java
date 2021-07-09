package com.delong.springmvc.annotation;

import com.delong.springmvc.model.User;
import lombok.RequiredArgsConstructor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    private final Log log = LogFactory.getLog(UserController.class);

    @RequestMapping("/print")
    public String printUser() {
        System.out.println("print user method is executed");
        log.debug("bigdata--------------sunfei....");
        return "userResult";
    }

    @RequestMapping("/get")
    public ModelAndView getUserInfo() {
        User user = new User(110, "big-data");

        ModelAndView modelAndView = new ModelAndView("userResult");
        modelAndView.addObject("user", user);
//        modelAndView.setViewName("userResult");
        return modelAndView;
    }

    @GetMapping("/add")
    public String addUserInfo() {
        return "addUser";
    }

    @PostMapping("/add")
    public String addUserInfo(@ModelAttribute User user) {
        log.info(user);

        return "addUserResult";
    }
}
