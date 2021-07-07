package com.delong.springmvc.annotation;

import com.delong.springmvc.model.User;
import com.sun.istack.internal.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/param")
public class ParamController
{
    @GetMapping("/get")
    public String get(HttpServletRequest request)
    {
        int id = 100;
        //如何把值在paramResult.jsp上显示
        request.setAttribute("my_id", id);

        return "paramResult";
    }

    @GetMapping("/get2")
    public String get2(int id, HttpServletRequest request)
    {
        //如何把值在paramResult.jsp上显示
        request.setAttribute("my_id2", id);

        return "paramResult";
    }

    @GetMapping("/get3")
    public String get3(int id, String name, HttpServletRequest request)
    {
        //如何把值在paramResult.jsp上显示
        request.setAttribute("my_id3", id);
        request.setAttribute("my_name3", name);

        return "paramResult";
    }

    @GetMapping("/get4")
    public String get4(@RequestParam int id, @RequestParam String name, HttpServletRequest request)
    {
        //如何把值在paramResult.jsp上显示
        request.setAttribute("my_id4", id);
        request.setAttribute("my_name4", name);

        return "paramResult";
    }

    @GetMapping("/get5")
    public String get5(@RequestParam(name = "ids", required = false) String id, @RequestParam(value = "uname", required = false) String name, HttpServletRequest request)
    {
        //如何把值在paramResult.jsp上显示
        request.setAttribute("my_id5", id);
        request.setAttribute("my_name5", name);

        return "paramResult";
    }

    @GetMapping("/get6")
    public String get6(User user, HttpServletRequest request)
    {
        request.setAttribute("user", user);
        return "paramResult";
    }

    @GetMapping("/get7")
    public String get7(User user, Map<String, User> map)
    {
        //通过打印结果可以看到key的值就是类型的名称，名称首字母小写
        System.out.println(map.toString());
        return "paramResult";
    }

    @GetMapping("/get8")
    public String get8(User user, Map<String, User> map)
    {
        map.put("u", user);
        //通过打印结果可以看到key的值就是类型的名称，名称首字母小写
        System.out.println(map.toString());
        return "paramResult";
    }

    @GetMapping("/get9")
    public String get9(User user, Model model)
    {
        //在paramResult.jsp中显示结果时，默认值是类名的首字母小写
        model.addAttribute(user);
        return "paramResult";
    }

    @GetMapping("/get10")
    public String get10(User user, Model model)
    {
        //在paramResult.jsp中显示结果时，默认值是类名的首字母小写
        model.addAttribute("my_user", user);
        return "paramResult";
    }

    @GetMapping("/get11")
    public String get11(Model model)
    {
        final User user1 = new User(111, "aaa");
        final User user2 = new User(222, "bbb");
        final User user3 = new User(333, "ccc");
        final User user4 = new User(444, "ddd");

        final List<User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

//        model.addAttribute(users);
        model.addAttribute("userList", users);

//        System.out.println(model.toString());

        return "paramResult";
    }

    @GetMapping("/get12")
    public String get12(Model model)
    {
        final User user1 = new User(111, "aaa");
        final User user2 = new User(222, "bbb");
        final User user3 = new User(333, "ccc");
        final User user4 = new User(444, "ddd");

        final Map<String, User> map = new HashMap<>();
        map.put("u1", user1);
        map.put("u2", user2);
        map.put("u3", user3);
        map.put("u4", user4);


        model.addAttribute(map);
//        model.addAttribute("hashMap", map);


        System.out.println(model.toString());

        return "paramResult";
    }

    @GetMapping("/get13")
    public String get13(Model model)
    {
        final User user1 = new User(111, "aaa");
        final User user2 = new User(222, "bbb");
        final User user3 = new User(333, "ccc");
        final User user4 = new User(444, "ddd");

        final Map<String, User> map = new HashMap<>();
        map.put("u1", user1);
        map.put("u2", user2);
        map.put("u3", user3);
        map.put("u4", user4);

        model.addAttribute("userMap", map);

//        System.out.println(model.toString());

        return "paramResult";
    }

    @GetMapping("/get14")
    public String get14(@ModelAttribute("mapUser") HashMap<String,User> map)
    {
        final User user1 = new User(111, "aaa");
        final User user2 = new User(222, "bbb");
        final User user3 = new User(333, "ccc");
        final User user4 = new User(444, "ddd");

        map.put("u1", user1);
        map.put("u2", user2);
        map.put("u3", user3);
        map.put("u4", user4);

        return "paramResult";
    }


    @GetMapping("/get15/{ids}/{name}")
    public String get15(@PathVariable(name="ids", required = false) String id, @PathVariable(required = false) String name, Model model)
    {
        final User user = new User(Integer.parseInt(id), name);

        System.out.println("user = " + user);

        model.addAttribute(user);

        System.out.println(model.toString());

        return "paramResult";
    }


}
