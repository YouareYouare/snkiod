<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录</title>
    <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
        function check() {
            var uname=$("#uName").val();
            var upassword = $("#uPassword").val();
            if(uname==""){
                alert("账号不能为空！！！");
                return false;
            }else if(upassword==""){
                alert("密码不能为空！！！");
                return false;
            }else {
                $.ajax({
                    type:"POST",
                    url:"${pageContext.request.contextPath}/login.do",
                    dataType:"json",
                    async:true,
                    data:{uName:uname,uPassword:upassword},
                    success:function (result) {
                        if(result==""||result==null){
                            alert("账号或密码错误！！！");
                            window.location.href="${pageContext.request.contextPath}/login.jsp";
                        }else {
                            // alert(result.uId);/*{"uId":3,"uCode":2,"uIdentity":"经理","uPassword":"123123","uName":"王二"}*/
                            window.location.href="${pageContext.request.contextPath}/index.jsp";
                        }
                    },
                    error:function () {
                        alert("出现异常，请稍后再试！！！");
                        window.location.href="${pageContext.request.contextPath}/login.jsp";
                    }
                })
            }
        }
    </script>
</head>
<body>
<%--${errorMsg}--%>
<form>
    <p>
        用户名：<input type="text" name="uName" id="uName"/>
    </p>
    <p>
        密码：<input type="password" name="uPassword" id="uPassword"/>
    </p>
    <p>
        <input type="button" value="登录" onclick="check()"/>
    </p>
</form>

</body>
</html>
