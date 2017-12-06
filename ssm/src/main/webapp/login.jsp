<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8"/>
    <title>登陆界面</title>
    <link rel="stylesheet" type="text/css" href="${basePath }/css/login.css"/>
    <%@include file="/common/easyui.jspf" %>
    <style type="text/css">
        ::-webkit-input-placeholder { /* WebKit browsers */
            　　color: #fff;
        }

        :-moz-placeholder { /* Mozilla Firefox 4 to 18 */
            　　color: #fff;
        }

        ::-moz-placeholder { /* Mozilla Firefox 19+ */
            　　color: #fff;
        }

        :-ms-input-placeholder { /* Internet Explorer 10+ */
            color: #fff;
        }

        :-webkit-autofill {
            /*
            -webkit-box-shadow: 0 0 0px 1000px rgba(106, 185, 188, 1)  inset;
            -webkit-text-fill-color: #333;
            */
            transition: background-color 5000s ease-in-out 0s;
            -webkit-text-fill-color: #fff;
        }

        .messager-body {
            font-size: 16px;
        }

        .messager-body :nth-child(2) {
            margin: 27px auto;
            font-family: "Microsoft Yahei";
        }

        .messager-icon {
            margin-top: 10px;
            margin-left: 20px;
        }
    </style>
    <script src="${basePath}/js/login.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<div class="login_box">
    <form method="post" id="login">
        <div class="in_text">
            <span class="icon"><i class="iconfont">&#xe63b;</i></span>
            <input type="text" name="account" id="account" class="in_box" placeholder="用户名"/>
        </div>
        <div class="in_text">
            <span class="icon"><i class="iconfont">&#xe66c;</i></span>
            <input type="password" name="password" id="password" class="in_box" placeholder="用户密码"/>
        </div>
        <div class="in_check">
            <span style="cursor: default;">请选择您的身份：</span>
            <input type="radio" name="user" id="teacher" value="tea"/><label for="teacher">教师</label> &nbsp;&nbsp;
            <input type="radio" name="user" id="student" value="stu"/><label for="student">学生</label>
        </div>
        <div class="in_text" id="validateBox" style="display:none;">
            <span><input type="text" name="validateCode" id="validateCode" class="in_box" placeholder="请输入验证码"
                         maxlength="4"/></span>
            <span style="position: absolute;right: 1px;">
                <img onclick="showValidate();" id="pic" title="看不清楚,点击图片刷新" src="" align="top"
                     style="height: 104%;border-radius: 0 10px 10px 0px;margin-top: -1px;margin-right: -2px;"/>
            </span>
        </div>

        <div class="in_check">
            <a href="javascript:login();" class="but_submit" id="but_submit">登&nbsp;&nbsp;陆</a>
        </div>
    </form>
</div>
</body>
</html>