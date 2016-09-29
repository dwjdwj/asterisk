
package com.jfinal.asterisk.controller;

import java.io.IOException;

import org.asteriskjava.manager.AuthenticationFailedException;
import org.asteriskjava.manager.TimeoutException;

import com.jfinal.aop.Before;
import com.jfinal.aop.Clear;
import com.jfinal.asterisk.config.UrlConfig;
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
	setAttr("ss",UrlConfig.VM);

	SipService service = enhance(SipService.class);
	SipUtil sipUtil=getBean(SipUtil.class);

	service.SipConfig(sipUtil, false);
		render("sip.html");
			}
	

}
