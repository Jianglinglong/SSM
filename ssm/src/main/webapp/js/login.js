$(function () {
    var but_submit = document.getElementById("but_submit");
    but_submit.onmouseover = function () {
        but_submit.style.backgroundColor = "#0096e6";
        but_submit.style.color = "#ccc";
    }
    but_submit.onmouseout = function () {
        but_submit.style.backgroundColor = "#009999";
        but_submit.style.color = "#fff";
    }
});
var times = false;
function login() {
    $("#login").form('submit', {
        url: "login/login.do",
        onSubmit: function () {
            var dis = $("#validateBox").css("display");
            if (dis == "none") {
                $("#validateCode").attr("value", "*/*/*");
            }
            var password = $("#password").val();
            password = $.md5(password);
            $("#password").val(password);
            var ra = $("input[type='radio']:checked").val();
            if (ra == null) {
                $.messager.alert('确认', '请选择您的身份!','info');
                return false;
            }
        },
        success: function (data) {
            var messge = "";
            if (data == "OK") {
                window.location.href = "test/index.do";
            } else if (data == "NO") {
                messge = '您输入的账户或密码有误!';
            } else if (data == "NV") {
                times = true;
                messge = '验证码有误，请重新输入!';
            } else if (data == "NVY") {
                $("#validateBox").css("display", "block");
                messge = '您输入的账户或密码有误!';
                times = true;
            }
            $.messager.alert('确认', messge + data,'info');
            $("#validateCode").val("");
            $("#password").val("");
            if (times) {
                showValidate();
            }
        }
    });
}
function showValidate() {
    $("#pic").attr("src", "validate?method=getValidateCode&" + Math.random());
}

