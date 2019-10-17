<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>#026 - Double slider Sign in/up Form - Desktop Only</title>

<!--图标样式--> 
<link rel='stylesheet'
	href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.7.2/css/all.min.css'>

<link rel="stylesheet" href="css/style.css">


</head>

<body>

	<h2>简单的两个 #1: 登录/注册 表单</h2>
	<div class="container" id="container">
		<div class="form-container sign-up-container">
			<form action="/registerPage" method="post">
				<h1>注册</h1>
				<div class="social-container">
					<a href="#" class="social"><i class="fab fa-facebook-f"></i></a> <a
						href="#" class="social"><i class="fab fa-google-plus-g"></i></a> <a
						href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
				</div>
				<input type="text" name="tnumber" placeholder="工号" /> 
				<input type="text" name="tname" placeholder="名称" /> 
				<input type="password" name="tpassword" placeholder="密码" />
				<input type="text" name="tclass" placeholder="所带班级（格式如：计算机类176）" /> 
				<input type="text" name="minvitationcode" placeholder="管理员授权码" />
				<button name="">注册</button>
			</form>
		</div>
		<div class="form-container sign-in-container">
			<form action="/loginPage" method="post">
				<h1>登录</h1>
				<div class="social-container">
					<a href="#" class="social"><i class="fab fa-facebook-f"></i></a> <a
						href="#" class="social"><i class="fab fa-google-plus-g"></i></a> <a
						href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
				</div>
				 <input type="text" name="tnumber" placeholder="账号" /> <input
					type="password" name="tpassword" placeholder="密码" /> <a href="#">忘记密码？</a>
				<button>登录</button>
			</form>
		</div>
		<div class="overlay-container">
			<div class="overlay">
				<div class="overlay-panel overlay-left">
					<h1>欢迎回来！</h1>
					<p>请您先登录的个人信息，进行操作。</p>
					<button class="ghost" id="signIn">登录</button>
				</div>
				<div class="overlay-panel overlay-right">
					<h1>你好老师！</h1>
					<p>输入您的个人信息进行注册。</p>
					<button class="ghost" id="signUp">注册</button>
				</div>
			</div>
		</div>
	</div>

	<footer>
		<p>版权声明</p>
	</footer>



	<script src="js/index.js"></script>




</body>

</html>
