<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
  <h2>欢迎，${sessionScope.loginUser.uName}！！！</h2>
  <h3>身份：${loginUser.uIdentity} 登录</h3>

  <a href="${pageContext.request.contextPath}/logout.do">退出</a>
  </body>
</html>
