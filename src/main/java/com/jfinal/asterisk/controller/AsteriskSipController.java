/**
 * 
 */
/**
 * @author PC
 *
 */
package com.jfinal.asterisk.controller;

import com.jfinal.core.Controller;

public class AsteriskSipController extends Controller{

//首页面跳转	
public void index(){ 
setAttr("ss","./WEB-INF/Templatelibrary/Taglibrary.vm");
render("index.html");
	}

}
