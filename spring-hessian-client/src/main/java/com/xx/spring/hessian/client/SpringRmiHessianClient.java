package com.xx.spring.hessian.client;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.xx.spring.hessian.server.service.IUserService;

public class SpringRmiHessianClient {

	public static void main(String[] args) throws MalformedURLException {
		
		String url = "http://localhost:8080/spring-hessian-server/user.service";
		HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
		IUserService userService = (IUserService) hessianProxyFactory.create(IUserService.class, url);
		System.err.println("远程调用的结果是：" + userService.getUser().getName() + "  " + userService.getUser().getPassword());
		
	}
	
}
