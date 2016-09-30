
package com.jfinal.asterisk.controller;

import java.io.IOException;

import org.asteriskjava.manager.AuthenticationFailedException;
import org.asteriskjava.manager.ManagerConnection;
import org.asteriskjava.manager.TimeoutException;

import com.jfinal.aop.Before;
import com.jfinal.aop.Clear;
import com.jfinal.asterisk.config.UrlConfig;
import com.jfinal.asterisk.service.AsteriskLogin;
import com.jfinal.asterisk.service.SipService;
import com.jfinal.asterisk.util.SipUtil;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.tx.Tx;

/**
 * @author PC
 * 
 ** @version 
 */

public class SipController extends Controller{
	//SIP注册页面

	@SuppressWarnings("static-access")
	@ActionKey("/sip")
	public  void index() throws IllegalStateException, IOException, AuthenticationFailedException, TimeoutException{ 
	//setAttr("ss",UrlConfig.VM);

	//SipService service = enhance(SipService.class);
	SipUtil sipUtil=getBean(SipUtil.class);
	AsteriskLogin service1 = enhance(AsteriskLogin.class);
	//SipService.Sip(sipUtil,service1.AsteriskManager());
setAttr("result",SipService.Sip(sipUtil,service1.AsteriskManager()));//如果是2代表没有借成功  
	renderJson();
			}
	@ActionKey("/sipadd")
	public  void SipAdd() throws IllegalStateException, IOException, AuthenticationFailedException, TimeoutException{ 
		setAttr("ss",UrlConfig.VM);
			render("sip.html");
				}

}
