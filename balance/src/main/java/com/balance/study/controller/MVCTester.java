package com.balance.study.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.balance.study.domain.User;

@Controller
public class MVCTester {
	@RequestMapping(value = "/mvc")
	@ResponseBody
	public Map<String, String> getUserData(@RequestBody User user) {
		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("sex", "male");
		personMap.put("age", "33");
		personMap.put("nickname", "david");
		personMap.put("userId", user.getUserId());
		return personMap;
	}
}
