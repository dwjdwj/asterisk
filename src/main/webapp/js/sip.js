//引入弹窗js
document.write("<script language=javascript src='js/alert.js'></script>");
//SipAdd
function tijao() {
	var username = document.getElementById("sipUtil.username").value;
	var sip = document.getElementById("sipUtil.sip").value;
	var secret = document.getElementById("sipUtil.secret").value;
	var type = document.getElementById("sipUtil.type").value;
	var host = document.getElementById("sipUtil.host").value;
	var context = document.getElementById("sipUtil.context").value;
	var nat = document.getElementById("sipUtil.nat").value;
	var qualify = document.getElementById("sipUtil.qualify").value;
	var canreinvite = document.getElementById("sipUtil.canreinvite").value;
	var pickupgroup = document.getElementById("sipUtil.pickupgroup").value;
	var calllimit = document.getElementById("sipUtil.calllimit").value;
	var callgroup = document.getElementById("sipUtil.callgroup").value;
	var accountcode = document.getElementById("sipUtil.accountcode").value;
	var setvar = document.getElementById("sipUtil.setvar").value;
	$.ajax({
		url : '/Asterisk-Jfinal/sip',// 跳转到 action
		async : false,
		data : {
			"sipUtil.username" : username,
			"sipUtil.sip" : sip,
			"sipUtil.secret" : secret,
			"sipUtil.type" : type,
			"sipUtil.context" : context,
			"sipUtil.host" : host,
			"sipUtil.qualify" : qualify,
			"sipUtil.canreinvite" : canreinvite,
			"sipUtil.accountcode" : accountcode,
			"sipUtil.pickupgroup" : pickupgroup,
			"sipUtil.setvar" : setvar
		},
		type : 'post',
		success : function(data) {
			var result = data.result;
			if (result == "Success") {
				alert("添加成功");
				 window.location.href = '../Asterisk-Jfinal/sipadd';
			} else {
				alert("添加失败");
				 window.location.href = '../Asterisk-Jfinal/sipadd';
			}
		},
	});

}
