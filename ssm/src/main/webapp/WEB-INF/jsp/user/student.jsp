<%--
  Created by IntelliJ IDEA.
  User: 姜玲珑
  Date: 2017/12/14
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/jstl.jspf"%>
<html>
<head>
    <title>student</title>
</head>
<body>
<div id="stu-tool">
    <span class="easyui-linkbutton">新增</span>
    <span class="easyui-linkbutton">修改</span>
    <span class="easyui-linkbutton">删除</span>
</div>
<table id="student" toolbar="#stu-tool">
</table>
<script type="text/javascript">
    $(function () {
        $('#student').datagrid({
            fitColumns: true,
            nowrap: true,
            fit:true,
            url:'${basePath}/user/student',
            method:"get",
            columns:[[
                {checkbox:true,width:100,title:"",field:""},
                {field:'stuId',title:'学生编号',width:100},
                {field:'stuName',title:'学生姓名',width:100},
                {field:'stuAccount',title:'学生账号',width:100,align:'right'},
                {field:'stuPassword',title:'学生密码',width:100,align:'right'},
                {field:'stuClass',title:'班级',width:100,align:'right'}
            ]],
            pageSize:10,
            pageNumber:1,
            loadMsg:'loading . . .',
            pagination:true,
            checkbox:true
        });
    })
</script>
</body>
</html>
