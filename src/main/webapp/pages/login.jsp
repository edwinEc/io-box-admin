<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html lang="en" ng-app>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Getting Started: Serving Web Content</title>
    <script src="/js/angular/angular.min.js"></script>
    <script>
        function loginController($scope, $http) {
            $scope.loginForm = {};
            $scope.login = function() {
                $http.post('/login', $scope.loginForm).
                        success(function(data, status, headers, config) {
                            $scope.errorCode = "0";
                            $scope.errorMsg="用户名";

                            // this callback will be called asynchronously
                            // when the response is available
                        }).
                        error(function(data, status, headers, config) {
                            $scope.errorCode = "-1";
                            $scope.errorMsg="服务器异常";
                        });;
            }
        }
    </script>
</head>
<body>

<form novalidate  ng-submit="login()" method="post" name="login-form" id="login-form"  ng-controller="loginController">
    <div class="panel panel-default login-panel">
        <div class="panel-heading">后台管理系统</div>
        <div class="panel-body">
            <div class="input-group">
                <span class="input-group-addon"><em class="glyphicon glyphicon-user"></em></span>
                <input type="text" class="form-control" placeholder="用户名" id="login-user"   ng-model="loginForm.username" required>
            </div>
            <div class="input-group">
                <span class="input-group-addon"><em class="glyphicon glyphicon-lock"></em></span>
                <input type="text" class="form-control" placeholder="密码" id="login-pass" ng-model="loginForm.password" required>
            </div>
            <div>
                <button type="submit" class="btn btn-primary btn-block" id="login-button">登陆</button>
            </div>
            <div class="alert alert alert-danger" role="alert" id="login-warning" ng-show="errorCode">{{errorMsg}}</div>
        </div>
    </div>
     <pre>
        {{loginForm}}
    </pre>
</form>



<link href="/css/bootstrap/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
    *{margin:0 auto;}
    .login-panel{width:40%;}
    .panel-body div{margin:10px;}
    #login-form input.ng-invalid.ng-dirty {background-color: #FA787E;}
    #login-form input.ng-valid.ng-dirty {background-color: #78FA89;}
</style>
<script src="/js/jquery/jquery.min.js"></script>
<script src="/js/bootstrap/bootstrap.min.js"></script>
</body>
</html>