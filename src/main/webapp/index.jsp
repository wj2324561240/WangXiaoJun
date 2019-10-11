<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%-- 引入struts2 的标签库--%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
    <title>MywebApp_SSHTest</title>
</head>
<body>
    <%--  获取值栈中的user对象的uname值--%>
    用户名:<s:property value="user.uname"></s:property>
</body>
</html>
