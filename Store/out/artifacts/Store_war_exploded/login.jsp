<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/24 0024
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>用户登录界面</title>
    <link href="css/loginCss.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>

</head>
<body>
<div id="contain">
    <div id="top">
        <img src="../img/tubiao.png" id="logo">
        <span>乐购小睿淘</span>
    </div>
    <div id="content">
        <div id="leftword">
            <span id="word01" class="leftWord">全国最大"互联网+购物"专业服务平台</span>
            <span id="word02" class="leftWord">覆盖:   全国20+省   </span>
            <span id="word03" class="leftWord">让每个人更好的用户体验</span>
        </div>
        <div id="login">
            <div id="studentLoginWorld">
                <span >用户登录</span>
            </div>
            <form id="loginForm" class="form-horizontal">
                <div class="form-group">
                    <label for="inputEmail3" class="col-sm-2 control-label">用户名</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="inputEmail3" placeholder="请输入用户名" name="username">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" id="inputPassword3" placeholder="请输入密码" name="password">
                    </div>
                </div>
                <div class="form-group">
                    <label for="code" class="col-sm-2 control-label">验证码</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="code" placeholder="请输入验证码" name="yanzhengma">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <div>
                            <button id="codeBtn" type="button">获取验证码</button><span id="codeSpan"></span><br>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default" style="background-color: #388E3C; color: snow;">登录</button>
                        <button type="button" class="btn btn-default" style="background-color: #388E3C; color: snow;">注册</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<script type="text/javascript" src="js/login.js"></script>
</body>
</html>
