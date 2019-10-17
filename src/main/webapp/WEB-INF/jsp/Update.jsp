<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>form</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">    
	<style type="text/css">
		body{ font-family: 'Microsoft YaHei';}
		/*.panel-body{ padding: 0; }*/
	</style>
</head>
<body>
<div class="jumbotron">
	<div class="container">

  		<h3>——学生后台管理系统</h3>
  		
	</div>
</div>
<div class="container">
	<div class="main">
		<div class="row">
			<!-- 左侧内容 -->
			<div class="col-md-3">
				<div class="list-group">
					<a href="${pageContext.request.contextPath}/Main" class="list-group-item text-center ">学生列表</a>
					<a href="${pageContext.request.contextPath}/Add" class="list-group-item text-center ">新增学生</a>
					<a href="${pageContext.request.contextPath}/Update" class="list-group-item text-center active">修改学生</a>

				</div>
			</div>
			<!-- 右侧内容 -->
			<div class="col-md-9">
				<!-- 错误提示 -->

				<div id="sucess-info" style="display: none" class="alert alert-success alert-dismissible" role="alert">
					<button type="button" class="close" data-dismiss="alert"><span aria-hidden="false">&times;</span><span class="sr-only">Close</span></button>
					<strong>成功！</strong> 操作成功提示
				</div>
				<!-- 失败提示框 -->
				<div id="fail-info" style="display: none" class="alert alert-danger alert-dismissible" role="alert">
					<button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
					<strong>失败！</strong> 操作失败提示
				</div>
				<!-- 自定义内容 -->
				<div class="panel panel-default">
					<div class="panel-heading">修改学生信息</div>
					<div class="panel-body">
						<form action="/UpdateSubmit" method="post" class="form-horizontal" role="form">
							<div class="form-group">
								<label class="col-sm-2 control-label">学生编号</label>
								<div class="col-sm-5">
									<input type="text" name="sNumber" value="${param.sNumber}" class="form-control" placeholder="学生编号">
									<input hidden type="text" name="sId" value="${param.sId}">
								</div>
								<div class="col-sm-5">
									<p class="form-control-static text-danger">学生编号不能为空</p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">语文成绩</label>
								<div class="col-sm-5">
									<input type="text" name="sChineseScore" value="${param.sChineseScore}" class="form-control" placeholder="语文成绩">
								</div>
								<div class="col-sm-5">
									<p class="form-control-static text-danger">语文成绩不能为空</p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">英语成绩</label>
								<div class="col-sm-5">
									<input type="text" name="sEnglishScore"  value="${param.sEnglishScore}" class="form-control" placeholder="英语成绩">
								</div>
								<div class="col-sm-5">
									<p class="form-control-static text-danger">英语成绩不能为空</p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">数学成绩</label>
								<div class="col-sm-5">
									<input type="text" name="sMathScore"  value="${param.sMathScore}" class="form-control" placeholder="数学成绩">
								</div>
								<div class="col-sm-5">
									<p class="form-control-static text-danger">数学成绩不能为空</p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">班级</label>
								<div class="col-sm-5">
									<input type="text" name="sClass"  value="${param.sClass}" class="form-control" placeholder="班级">
								</div>
								<div class="col-sm-5">
									<p class="form-control-static text-danger">班级不能为空</p>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<button type="submit" class="btn btn-primary">修改</button>
								</div>
							</div>
						</form>

					</div>
				</div>
				
				
			</div>
		</div>
  	</div>
</div>
<!-- 尾部 -->
<div class="jumbotron" style=" margin-bottom:0;margin-top:105px;">
	<div class="container">
	<span>&copy; 2016 Saitmob</span>
	</div>
</div>

	<script src="js/jquery-3.1.0.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
<%
	System.out.println(response.getStatus()+"--------------status");
	if (response.getStatus()==200) {

	}else if(response.getStatus()==201){
		out.write("<script type=\"text/javascript\">\n" +
				"    window.onload=function(){\n" +
				"        showdiv();\n" +
				"       }</script>");
	}
	else {
		out.write("<script type=\"text/javascript\">\n" +
				"    window.onload=function(){\n" +
				"        offdiv();\n" +
				"       }</script>");
	}

%>


<script>


    function showdiv(){

    if(showdiv_display = document.getElementById('sucess-info').style.display=='none'){//如果show是隐藏的

        document.getElementById('sucess-info').style.display='block';//show的display属性设置为block（显示）
        document.getElementById('fail-info').style.display='none';//show的display属性设置为block（显示）
    }else{//如果show是显示的
        document.getElementById('fail-info').style.display='block';
        document.getElementById('show').style.display='none';//show的display属性设置为none（隐藏）

    }

}
function offdiv(){

   //如果show是显示的
        document.getElementById('fail-info').style.display='block';
        document.getElementById('sucess-info').style.display='none';//show的display属性设置为none（隐藏）



}
</script>

</body>
</html>