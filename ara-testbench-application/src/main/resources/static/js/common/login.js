//登录文本框校验
function checking() {
	if ($("#uname").val().replace(/\ /g, '') == "") {
		$("#errorMsg").html($("#id_empty").val());
		$("#uname").focus();
		$("#message-error").show();
		return false;
	} else if ($("#upasswd").val().replace(/\ /g, '') == "") {
		$("#errorMsg").html($("#pw_empty").val());
		$("#upasswd").focus();
		$("#message-error").show();
		return false;
	}
	return true;
}

function checkLock(){
	if ($("#upasswd").val().replace(/\ /g, '') == "") {
		$("#errorMsg").html($("#pw_empty").val());
		$("#upasswd").focus();
		$("#errorMsg").css("color","#b94a48");
		return false;
	}else{
		return true;
	}
}


//頁面綁定Enter建
function BindEnter(obj) {
	if (obj.keyCode == 13) {
		$("#myform").submit();
		obj.returnValue = false;
	}
}