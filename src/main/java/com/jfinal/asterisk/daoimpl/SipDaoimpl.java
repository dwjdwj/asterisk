package com.jfinal.asterisk.daoimpl;

import java.io.IOException;

import org.asteriskjava.manager.AuthenticationFailedException;
import org.asteriskjava.manager.ManagerConnection;
import org.asteriskjava.manager.TimeoutException;
import org.asteriskjava.manager.action.CommandAction;
import org.asteriskjava.manager.action.UpdateConfigAction;
import org.asteriskjava.manager.response.CommandResponse;
import org.asteriskjava.manager.response.ManagerResponse;

import com.jfinal.asterisk.service.SipService;
import com.jfinal.asterisk.util.SipUtil;

public class SipDaoimpl { 
	public static  SipService Sip(SipUtil sipUtil,ManagerConnection managerConnection) throws IllegalStateException, IOException, AuthenticationFailedException, TimeoutException{
		System.out.println(managerConnection+"========================ppppppppp=========");
		System.out.println(sipUtil.getSip()+":zia");

		UpdateConfigAction muc = new UpdateConfigAction("sip.conf", "sip.conf", true); 
		ManagerResponse originateResponse; 
	System.out.println("进入···");
		//UpdateConfigAction.ACTION_NEWCAT, "test", null, null, null); 
		muc.addCommand(muc.ACTION_NEWCAT, sipUtil.getSip(), "type", "friend","" ); 

		muc.addCommand(muc.ACTION_APPEND, sipUtil.getSip(),"type","friend", null); 

		muc.addCommand(muc.ACTION_APPEND, sipUtil.getSip(), "secret", "111", null); 

		muc.addCommand(muc.ACTION_APPEND, sipUtil.getSip(), "context", "default", null); 

		muc.addCommand(muc.ACTION_APPEND, sipUtil.getSip(), "host", "dynamic", null); 
		muc.addCommand(muc.ACTION_APPEND, sipUtil.getSip(), "dtmfmode", "rfc2833", null); 

		muc.addCommand(muc.ACTION_APPEND,sipUtil.getSip(), "compensate", "yes", null); 
		muc.addCommand(muc.ACTION_APPEND, sipUtil.getSip(), "callerid", "2233", null); 
		muc.getReload(); 
		System.out.println(muc.getAttributes());
		originateResponse = managerConnection.sendAction(muc); 

		CommandAction commandAction = new CommandAction("sip show users"); 
		CommandResponse response= (CommandResponse) managerConnection.sendAction(commandAction); 
		for (String line : response.getResult() ) 
		{ 
		System.out.println(line); 
		} 

			return null;
	
	}
	 
//----------------------------------------------------------------------------------


	
}
