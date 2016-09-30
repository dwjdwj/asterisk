/**
	 * Asterisk Login*
	 * Data  2016/09/22
	 * @param source
	 * @return 过滤后的字符串
	 */

package com.jfinal.asterisk.service;
import java.io.IOException; 

import org.asteriskjava.manager.AuthenticationFailedException; 
import org.asteriskjava.manager.ManagerConnection; 
import org.asteriskjava.manager.ManagerConnectionFactory; 
import org.asteriskjava.manager.TimeoutException;

import com.jfinal.asterisk.service.SipService;
import com.jfinal.asterisk.util.SipUtil; 
//asterisk 登录
public class AsteriskLogin 
{ 
public static ManagerConnection managerConnection; 
public static ManagerConnectionFactory factory; 

public  static ManagerConnection AsteriskManager() throws IllegalStateException, IOException, AuthenticationFailedException, TimeoutException {
//factory = new ManagerConnectionFactory("192.168.1.177",5038, "admin", "111");
	factory = new ManagerConnectionFactory("192.168.1.246",5038, "admin", "111");
managerConnection = factory.createManagerConnection(); 
managerConnection.login();
System.out.println("登陆成功========================");

return managerConnection;
	
}

} 

