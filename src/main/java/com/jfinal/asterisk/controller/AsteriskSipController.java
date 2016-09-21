/**
 * 
 */
/**
 * @author PC
 *
 */
package com.jfinal.asterisk.controller;


import com.jfinal.asterisk.service.SipService;
import com.jfinal.core.Controller;


public class AsteriskSipController extends Controller{


public void index(){ 
setAttr("ss","./WEB-INF/Templatelibrary/Taglibrary.vm");
render("test.html");
	}

/*SipService  sip1() {
	SipService u=new SipService();
	u.put("sip", getPara("sip1"));
	u.put("secret1", getPara("secret1"));
	u.put("context", getPara("context1"));	
	return u._setAttr(u);	
}
*/

}
