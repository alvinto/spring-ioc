<%--
  Created by IntelliJ IDEA.
  User: alvin
  Date: 2016/5/8
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="org.springframework.web.context.support.ServletContextResource" %>
<%@page import="org.springframework.core.io.Resource" %>
<%@page import="org.springframework.web.util.WebUtils" %>
<%
  //文件资源路径是以相对于web应用根路径方式表示
  Resource resource = new ServletContextResource(application,"WEB-INF/jsp/jspConfig.txt");
  out.print(resource.getFilename()+"<br/>");
  out.print(WebUtils.getTempDir(application).getAbsolutePath());
%>
<html>
<head>
    <title>ServletContextResource</title>
</head>
<body>

</body>
</html>
