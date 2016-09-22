package com.jfinal.asterisk.util;

import com.jfinal.plugin.activerecord.Model;

public class SipUtil extends Model<SipUtil>{
	public static final SipUtil me = new SipUtil();
private long ID;
private String username;//用户名
private String sip;//分机号
private String secret;//密码
private String context;//控制电话权限
private String type;//类型
private String accountcode;//用来填充“accountcode“领域的CDR（呼叫详细记录）
private String host;//用户的主机名,默认配置host=dynamic
private String nat;//改变了Asterisk的防火墙后面客户端的行为,忽略号码的联系信息，使用收到的包的地址信息
private String qualify;//qualify =yes|no|milliseconds。检查客户端是否可到达
private String canreinvite;//canreinvite =update|yes|no|nonat,重定向媒体
private String callgroup;//callgroup =num1,num2-num3。定义了此分机的电话组
private String pickupgroup;//同组可以接电话，按*8应用
private String setvar;//通道变量被设置为从该节点/用户的所有通话
private String calllimit;//同时呼叫的数量

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getAccountcode() {
	return accountcode;
}
public void setAccountcode(String accountcode) {
	this.accountcode = accountcode;
}
public String getHost() {
	return host;
}
public void setHost(String host) {
	this.host = host;
}
public String getNat() {
	return nat;
}
public void setNat(String nat) {
	this.nat = nat;
}
public String getQualify() {
	return qualify;
}
public void setQualify(String qualify) {
	this.qualify = qualify;
}
public String getCanreinvite() {
	return canreinvite;
}
public void setCanreinvite(String canreinvite) {
	this.canreinvite = canreinvite;
}
public String getCallgroup() {
	return callgroup;
}
public void setCallgroup(String callgroup) {
	this.callgroup = callgroup;
}
public String getPickupgroup() {
	return pickupgroup;
}
public void setPickupgroup(String pickupgroup) {
	this.pickupgroup = pickupgroup;
}
public String getSetvar() {
	return setvar;
}
public void setSetvar(String setvar) {
	this.setvar = setvar;
}

public String getCalllimit() {
	return calllimit;
}
public void setCalllimit(String calllimit) {
	this.calllimit = calllimit;
}
public long getID() {
	return ID;
}
public static SipUtil getMe() {
	return me;
}
public void setID(long iD) {
	ID = iD;
}
public String getSip() {
	return sip;
}
public void setSip(String sip) {
	this.sip = sip;
}
public String getSecret() {
	return secret;
}
public void setSecret(String secret) {
	this.secret = secret;
}
public String getContext() {
	return context;
}
public void setContext(String context) {
	this.context = context;
}
@Override
public String toString() {
	return "SipUtil [ID=" + ID + ", username=" + username + ", sip=" + sip + ", secret=" + secret + ", context="
			+ context + ", type=" + type + ", accountcode=" + accountcode + ", host=" + host + ", nat=" + nat
			+ ", qualify=" + qualify + ", canreinvite=" + canreinvite + ", callgroup=" + callgroup + ", pickupgroup="
			+ pickupgroup + ", setvar=" + setvar + ", calllimit=" + calllimit + "]";
}


}
