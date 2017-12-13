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
        onSubmit: function () {
            var ra = $("input[type='radio']:checked").val();
            if (ra == null) {
                $.messager.alert('确认', '请选择您的身份!','info');
                return false;
            }
        },
        success: function (data) {
            if (data == "OK") {
                window.location.href = "home/index.do";
                return false;
            }
            $.messager.alert('确认', '账号或密码错误','info');
            $("#validateCode").val("");
            $("#password").val("");
        }
    });
}
function showValidate() {
    $("#pic").attr("src", "validate?method=getValidateCode&" + Math.random());
}

