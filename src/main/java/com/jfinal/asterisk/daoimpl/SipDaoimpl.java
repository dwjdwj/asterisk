
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

/**
 * @author PC
 * 
 ** @version 
 */
public class SipDaoimpl { 
//Asterisk注册sip账号
	public static  SipService Sip(Object sipUtil,ManagerConnection managerConnection) throws IllegalStateException, IOException, AuthenticationFailedException, TimeoutException{
if(((SipUtil) sipUtil).getUsername()!=null&&((SipUtil) sipUtil).getSip()!=null){
		UpdateConfigAction muc = new UpdateConfigAction("sip.conf", "sip.conf", true); 
		ManagerResponse originateResponse; 
		muc.addCommand(muc.ACTION_NEWCAT, ((SipUtil) sipUtil).getUsername(),"type", "friend","" ); 
		muc.addCommand(muc.ACTION_APPEND, ((SipUtil) sipUtil).getUsername(),"type", ((SipUtil)sipUtil).getType(),"" ); 
		muc.addCommand(muc.ACTION_APPEND, ((SipUtil) sipUtil).getUsername(),"username",((SipUtil)sipUtil).getUsername(), null); 
		muc.addCommand(muc.ACTION_APPEND, ((SipUtil) sipUtil).getUsername(),"accountcode",((SipUtil)sipUtil).getAccountcode(), null); 
		muc.addCommand(muc.ACTION_APPEND, ((SipUtil) sipUtil).getUsername(),"secret",((SipUtil)sipUtil).getSecret(), null); 
		muc.addCommand(muc.ACTION_APPEND, ((SipUtil) sipUtil).getUsername(),"context",((SipUtil)sipUtil).getContext(), null); 
		muc.addCommand(muc.ACTION_APPEND, ((SipUtil) sipUtil).getUsername(),"host",((SipUtil)sipUtil).getHost(), null); 
		muc.addCommand(muc.ACTION_APPEND, ((SipUtil) sipUtil).getUsername(),"nat",((SipUtil)sipUtil).getNat(), null); 
		muc.addCommand(muc.ACTION_APPEND, ((SipUtil) sipUtil).getUsername(),"qualify",((SipUtil)sipUtil).getQualify(), null); 
		muc.addCommand(muc.ACTION_APPEND,((SipUtil) sipUtil).getUsername(), "canreinvite", ((SipUtil)sipUtil).getCanreinvite(), null);
		muc.addCommand(muc.ACTION_APPEND, ((SipUtil) sipUtil).getUsername(), "callgroup", ((SipUtil)sipUtil).getCallgroup(), null); 
		muc.addCommand(muc.ACTION_APPEND,((SipUtil) sipUtil).getUsername(), "pickupgroup", ((SipUtil)sipUtil).getPickupgroup(), null); 
		muc.addCommand(muc.ACTION_APPEND, ((SipUtil) sipUtil).getUsername(),"setvar", ((SipUtil)sipUtil).getSetvar(), null); 
		muc.addCommand(muc.ACTION_APPEND, ((SipUtil) sipUtil).getUsername(), "calllimit",((SipUtil)sipUtil).getCalllimit(), null); 
		muc.getReload(); 
		originateResponse = managerConnection.sendAction(muc); 

		CommandAction commandAction = new CommandAction("sip show users"); 
		CommandResponse response= (CommandResponse) managerConnection.sendAction(commandAction); 
		for (String line : response.getResult() ) 
		{ 
		System.out.println(line); 
		} 
}

			return null;
	
	}
	 
//----------------------------------------------------------------------------------


	
}
