package com.jfinal.asterisk.controller;

import java.io.IOException;

import org.asteriskjava.manager.AuthenticationFailedException;
import org.asteriskjava.manager.TimeoutException;

import com.jfinal.asterisk.service.SipService;
import com.jfinal.asterisk.util.SipUtil;
import com.jfinal.core.Controller;

public class SipController extends Controller{
	public void index() throws IllegalStateException, IOException, AuthenticationFailedException, TimeoutException{ 
		System.out.println("uuuuuuuuuuuuuuuu");
		setAttr("ss","./WEB-INF/Templatelibrary/Taglibrary.vm");
		
	
		sip1();
		render("sip.html");
			}
	Object  sip1() throws IllegalStateException, IOException, AuthenticationFailedException, TimeoutException {
		//SipService u=new SipService();
		SipUtil sipUtil=getBean(SipUtil.class);
		return SipService._setAttr(sipUtil);	
	}

}
