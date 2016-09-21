package com.jfinal.asterisk.util;

import com.jfinal.plugin.activerecord.Model;

public class SipUtil extends Model<SipUtil>{
	public static final SipUtil me = new SipUtil();
private long ID;
private String sip;
private String secret;
private String context;
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
	return "SipUtil [ID=" + ID + ", sip=" + sip + ", secret=" + secret + ", context=" + context + "]";
}


}
