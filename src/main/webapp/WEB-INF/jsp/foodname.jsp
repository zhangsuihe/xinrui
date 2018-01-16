<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/taglib.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="${basePath}/layui/css/layui.css" rel="stylesheet"
          type="text/css" />
    <script type="text/javascript" src="${basePath}/layui/layui.js "></script>
    <title>Title</title>
</head>
<body>
<script>
    //一般直接写在一个js文件中
    layui.use(['layer', 'form'], function(){
        var layer = layui.layer
                ,form = layui.form;

        layer.msg('Hello World');
    });
</script>
${title}
</body>
</html>
