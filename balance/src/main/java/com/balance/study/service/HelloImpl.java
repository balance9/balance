package com.balance.study.service;

import java.util.Date;

public class HelloImpl implements IHello {
	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String sayHi() {

		return "��ǰʱ��:" + new Date() + " msg:" + msg;
	}
}
