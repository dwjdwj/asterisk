
package com.jfinal.asterisk.controller;

import java.io.IOException;

import org.asteriskjava.manager.AuthenticationFailedException;
import org.asteriskjava.manager.TimeoutException;

import com.jfinal.asterisk.service.SipService;
import com.jfinal.asterisk.util.SipUtil;
import com.jfinal.core.Controller;

/**
 * @author PC
 * 
 ** @version 
 */
public class SipController extends Controller{
	//SIP注册页面
	public void index() throws IllegalStateException, IOException, AuthenticationFailedException, TimeoutException{ 
	setAttr("ss","./WEB-INF/Templatelibrary/Taglibrary.vm");
		SipConfig();
		render("sip.html");
			}
	Object  SipConfig() throws IllegalStateException, IOException, AuthenticationFailedException, TimeoutException {
		SipUtil sipUtil=getBean(SipUtil.class);
		return SipService._setAttr(sipUtil);	
	}

}
