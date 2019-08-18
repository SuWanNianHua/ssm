<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<%
String path=request.getContextPath();
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link style="text/css" rel="stylesheet"
	href="<%=path%>/css/bootstrap.css">
<script type="text/javascript" src="<%=path%>/js/jquery-1.12.4.js"></script>

<script type="text/javascript">
	function nextpage(p){
		document.getElementById("fm1").action="<%=path %>/selectview"+"?pageNum="+p;
		document.getElementById("fm1").submit();
		}

</script>
</head>
<body>
<div class="container">

		<br> <br>

		<div class="table-responsive">

			<form id="fm1" class="form-horizontal" action="#" method="post">
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">名字</label>
					<div class="col-sm-5">
						<input type="text" class="form-control" id="inputEmail3"
							placeholder="输入名字" name="name" value="${user2.name }">
					</div>
					<div class="col-sm-5">
						<button type="submit" class="btn btn-default">搜索</button>
						<button type="button" class="btn btn-default"
							onclick="location.href='<%=path%>/addview'">增加</button>
					</div>
				</div>


			</form>

			<table
				class="table table-condensed table-hover table-bordered table-striped">

				<tr>
					<td>序号</td>
					<td>名字</td>
					<td>地址</td>
					<td>性别</td>
					<td>爱好</td>
					<td>图片</td>
					<td>操作</td>
				</tr>

				<c:forEach items="${user2list}" var="v" varStatus="vs">
					<tr>
						<td>${vs.count}</td>
						<td>${v.name }</td>
						<td>${v.address2.city }</td>
						<td><c:if test="${v.sex==0 }">男</c:if>
						<c:if test="${v.sex==1 }">女</c:if>
						 </td>
						<td>${v.love }</td>
						<td><img class="img-thumbnail" alt=""
							style="width: 100px;height: 100px"
							src="<%=path %>/img/${v.uploadpath }"></td>
						<td><button type="button" class="btn btn-info"
								onclick="location.href='<%=path%>/updateview?id=${v.id}'">修改</button>
							<button type="button" onclick="location.href='<%=path%>/deleteuser?id=${v.id }'" class="btn btn-danger">删除</button></td>
					</tr>
				</c:forEach>
			</table>
			<div style="text-align: center;">
				<nav aria-label="Page navigation">
				<ul class="pagination">
					<li><a href="javascript:void(0)" aria-label="Previous" onclick="nextpage(1)"> <span
							aria-hidden="true">首页</span>
					</a></li>

					<c:forEach items="${pageInfo.getNavigatepageNums()}" var="v">
						<c:choose>
							<c:when test="${v==pageInfo.pageNum}">
								<li><a href="javascript:void(0)"  onclick="nextpage(${v})" style="background-color: #5bc0de;">${v }</a></li>
							</c:when>
							<c:otherwise>
								<li><a href="javascript:void(0)"  onclick="nextpage(${v})">${v }</a></li>
							</c:otherwise>
						</c:choose>
					</c:forEach>

					<li><a  onclick="nextpage(${pageInfo.pages})" href="javascript:void(0)" aria-label="Next"> <span
							aria-hidden="true">末页</span>
					</a></li>
				</ul>
				</nav>


			</div>
		</div>

	</div>

</body>
</html>