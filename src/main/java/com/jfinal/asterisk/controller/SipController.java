
package com.jfinal.asterisk.controller;

import java.io.IOException;

import org.asteriskjava.manager.AuthenticationFailedException;
import org.asteriskjava.manager.TimeoutException;

import com.jfinal.aop.Before;
import com.jfinal.aop.Clear;
import com.jfinal.asterisk.service.SipService;
import com.jfinal.asterisk.util.SipUtil;
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
	public  void index() throws IllegalStateException, IOException, AuthenticationFailedException, TimeoutException{ 
	setAttr("ss","./WEB-INF/Templatelibrary/Taglibrary.vm");

	SipService service = enhance(SipService.class);
	boolean sipstute = false;
	SipUtil sipUtil=getBean(SipUtil.class);
	String j="3333";
	setAttr("h", j);
	service.SipConfig(sipUtil,sipstute);
	System.out.println(sipstute+":sipstute999999999");
		render("sip.html");
			}
	

}
