package com.balance.study.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.balance.study.service.IHello;

@WebServlet(name = "HelloServlet", urlPatterns = { "/hello" })
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 2801654413247618244L;
	private IHello hello;

	// private TestService userService = null;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// ����1,ʹ�ô�ͳ��ʽȥ����beans.xml,ÿ������ʱ����
		// ApplicationContext applicationContext = new
		// ClassPathXmlApplicationContext("beans.xml");

		// ����2,ʹ�ü������ķ�ʽ����beans.xml,��һ������ʱ��ͼ��ؼ�����,�����μ���,���Ч��
		// ApplicationContext applicationContext = (ApplicationContext)
		// this.getServletContext().getAttribute("SpringApplicationContext");

		// ����3,ʹ��spring�Դ�ļ�����ȥ����beans.xml
		// ApplicationContext applicationContext = (ApplicationContext)
		// this.getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		// ʹ��webapplicationcontextutils�����������Ժܷ���Ļ�ȡApplicationContext,ֻ��Ҫ����servletContext
		ApplicationContext applicationContext = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext());

		// hello = applicationContext.getBean(IHello.class);
		// String sayHi = hello.sayHi();
		// System.err.println("sayHi:" + sayHi);
		// resp.setContentType("text/html;charset=utf-8");
		// resp.getWriter().write("<h2>" + sayHi + "</h2>");

		// userService = (TestService)
		// applicationContext.getBean("userService");
		// List<User> lstUsers = userService.getAllUser();
		// req.setAttribute("lstUsers", lstUsers);
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
}
