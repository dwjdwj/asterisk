/**
 * 
 */
/**
 * @author PC
 *
 */
package com.jfinal.asterisk.controller;

import com.jfinal.asterisk.config.UrlConfig;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class AsteriskSipController extends Controller{

//首页面跳转
@ActionKey("/index")
public void index(){ 
setAttr("ss",UrlConfig.VM);
render("index.html");
	}

}
