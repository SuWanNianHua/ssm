<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link style="text/css" rel="stylesheet"
	href="<%=path%>/css/bootstrap.css">
<script type="text/javascript" src="<%=path%>/js/jquery-1.12.4.js"></script>

<style type="text/css">
.commonbor {
	border-radius: 0px
}
</style>

<script type="text/javascript">
$(function(){
	var num='${user.love}'.split(",");
	for (var i=0;i<num.length;i++){
	    $("#love input[value="+num[i]+"]").attr("checked","checked");
	}

})
</script>

</head>
<body>
	<div class="container">

		<br> <br>
		<div style="width: 400px; margin: 0px auto;">
			<form class="form-horizontal" action="<%=path%>/updateuser"
				method="post" enctype="multipart/form-data">
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">名字</label>
					<div class="col-sm-10">
						<input class="form-control commonbor" name="name" value="${user.name }"
							placeholder="输入名字">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">地址</label>
					<div class="col-sm-10">
						<select name="address" class="form-control commonbor">
							${addressStr }
						</select>
					</div>
				</div>

				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">性别</label>
					<div class="col-sm-10">
						<label>
						<input type="radio" value="0" name="sex" <c:if test="${user.sex==0 }">checked="checked"</c:if> >男
						</label>
						
							 <input id="sexwm" type="radio" value="1" name="sex" <c:if test="${user.sex==1 }">checked="checked"</c:if>>
							 <label for="sexwm">女</label>
							
					</div>
				</div>

				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">爱好</label>
					<div class="col-sm-10" id="love">
						<input name="love" value="吃" type="checkbox">吃
						<input name="love" value="喝" type="checkbox">喝
					</div>
				</div>

				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">图片</label>
					<div class="col-sm-10">
						<img alt="头像"  src="<%=path %>/img/${user.uploadpath}">
						<input type="file" name="upl" >
					</div>
				</div>


				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
					<input type="hidden" value="${user.id}" name="id" />
						<button type="submit" class="btn btn-primary commonbor">修&nbsp;&nbsp;&nbsp;&nbsp;改</button>
					</div>
				</div>
			</form>
		</div>


	</div>
</body>
</html>