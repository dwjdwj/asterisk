/**
 * 
 */
/**
 * @author PC
 *
 */
package com.jfinal.asterisk.config;

import com.jfinal.asterisk.controller.AsteriskSipController;
import com.jfinal.asterisk.controller.SipController;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.render.ViewType;
import com.jfinal.asterisk.service.SipService;
public class JfinalConfig extends JFinalConfig {

	@Override
	public void configRoute(Routes me) {
		me.add("/hello",AsteriskSipController.class,"WEB-INF/");
		me.add("/sip",SipController.class,"WEB-INF/");
	}
	@Override
	public void configConstant(Constants me) {
		
		me.setDevMode(true);  
		me.setViewType(ViewType.VELOCITY);
	}

	@Override
	public void configHandler(Handlers arg0) {
		
	}

	@Override
	public void configInterceptor(Interceptors arg0) {
	

	}

	@Override
	public void configPlugin(Plugins arg0) {
	

	}


	  /*  public void main(String[] args) {
	        JFinal.start("src/main/webapp", 8080, "/", 10);
	    }*/
}
