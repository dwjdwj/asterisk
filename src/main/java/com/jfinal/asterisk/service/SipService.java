package com.jfinal.asterisk.service;

import java.io.IOException;

import org.asteriskjava.manager.AuthenticationFailedException;
import org.asteriskjava.manager.ManagerConnection;
import org.asteriskjava.manager.TimeoutException;

import com.jfinal.asterisk.daoimpl.AsteriskLogin;
import com.jfinal.asterisk.daoimpl.SipDaoimpl;
import com.jfinal.asterisk.service.SipService;
import com.jfinal.asterisk.util.SipUtil;


public class SipService {


public static  Object _setAttr(SipUtil sipUtil ) throws IllegalStateException, IOException, AuthenticationFailedException, TimeoutException {	System.out.println(sipUtil);

System.out.println("======================");

	ManagerConnection managerConnection = null;

	return AsteriskLogin.AsteriskManager(sipUtil);	
}
public static Object sipUtil(SipUtil sipUtil, ManagerConnection managerConnection) throws IllegalStateException, IOException, AuthenticationFailedException, TimeoutException {

System.out.println(sipUtil+"------------------");
System.out.println(sipUtil+":88"+managerConnection+":PmanagerConnection");
	return SipDaoimpl.Sip(sipUtil, managerConnection);
}
public static void main(String[] args) throws Exception 
{ 
	SipService s = new SipService();
s._setAttr(null);
}

}
