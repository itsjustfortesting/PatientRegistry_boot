package com.mmalz.patientregistry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

//    @Autowired
//    private UsersService usersService;

    @RequestMapping("/")
    public String showHome() {
        return "welcome";
    }

//    @RequestMapping("/newuserform")
//    public String showNewUserForm(Model model) {
//        model.addAttribute("users", new Users());
//        return "login/newuserform";
//    }
//
//    @PostMapping("/adduser")
//    public String addNewUser(@Valid @ModelAttribute("users") Users user, BindingResult bindingResult, Model model) {
//        if (bindingResult.hasErrors()) {
//            return "login/newuserform";
//        } else {
//            try {
//                usersService.addUser(user);
//            } catch (HibernateException e) {
//                e.printStackTrace();
//                user.setPassword(null);
//                model.addAttribute("formerror", "Blah");
//                return "login/newuserform";
//            }
//            return "redirect:login";
//        }
//    }
}
