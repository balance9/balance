/**
 * 
 */
package com.balance.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author duanp
 * 
 */
@Controller
public class Login {
	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("/login/login");
	}

	@RequestMapping(value = "/login/submit", method = RequestMethod.POST)
	public ModelAndView submit(
			@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {
		ModelAndView mv = new ModelAndView();
		if ("admin".equals(username) && "1".equals(password)) {
			mv.setViewName("/framework/main");
		} else {
			mv.setViewName("/login/login");
			mv.addObject("msg", "用户名或密码不正确，请重新输入。");
		}
		return mv;
	}
}
