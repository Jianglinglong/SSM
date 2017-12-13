<%--
  Created by IntelliJ IDEA.
  User: 姜玲珑
  Date: 2017/11/22
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/easyui.jspf" %>
<!DOCTYPE html>
<html>
<head>
    <title>欢迎</title>

</head>
<body class="easyui-layout" data-options="fit:true">
    <%--顶部--%>
    <div data-options="region:'north'" style="height:100px;">north</div>
    <%--底部--%>
    <div data-options="region:'south'" style="height:50px;">south</div>
    <%--<div data-options="region:'east',iconCls:'icon-reload',title:'East',split:true" style="width:100px;">east</div>--%>
    <%--左侧导航--%>
    <div data-options="region:'west'" style="width:200px;">
        <div id="menu"></div>
    </div>
    <div data-options="region:'center'"  >
        <div id="context" class="easyui-tabs" data-options="fit:true,narrow:true">
            <div title="主页" data-options="fit:true">
            </div>
        </div>
    </div>
<script type="text/javascript">
    $(function () {
        $.get('${basePath}/home/right',function(data){
            for (var i = 0 ; i < data.length ; i ++){
                var menu = data[i];
                if (menu.parentId!=100001){
                    var treeNode = "<li><a rel='${basePath}/"+menu.rightUrl+"'><span class='tree-title'>"+menu.rightName+"</span></a></li>";
                    $("#"+menu.parentId).append(treeNode);
                }else {
                    var div = "<div title='" + menu.rightName + "'><ul class='tree righttree' id='" + menu.rightId + "' ><ul></div>";
                    $("#menu").append(div);
                }
            }
            $("#menu").accordion({
                fit:true
            });
            $(".righttree").tree({
                onClick:function (node) {
                    var rel =$(node.target).find('a').attr('rel');
                    var exists = $("#context").tabs('exists',node.text);
                    if (exists){
                        $("#context").tabs('select',node.text);
                    }else {
                        $("#context").tabs('add',{
                            title:node.text,
                            closable:true,
                            href:rel
                        });
                    }
                }
            });
        });
    });
</script>
</body>
</html>
