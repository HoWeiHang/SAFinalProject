<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
 	<%@include file="header.jspf" %>
    <title>產品管理</title>
</head>
<body>
	<%@include file="navbar.jspf" %>
    <div class="container theme-showcase" role="main">
    
      <div class="jumbotron" >    
        <h1>產品管理系統</h1>
        <p class="lead">本系統為輔仁大學資訊管理學系之範例程式</p>
      </div>
	<div class="container">
		<div class="row">
			<br>
			<div class="col-md-12">
				<table class="table">
				  	<tr>
				  		<th>編號</th>
				  		<th>類別</th>
				  		<th>描述</th>
				  		<th>庫存量</th>
				  		<th>安全存量</th>
				  		<th>動作</th>
				  	</tr>
				  	<c:forEach items="${productList}" var="product">
					  	<tr>
					  		<td>${product.id}</td>
					  		<td>${product.category}</td>
					  		<td>${product.desc}</td>
					  		<td>${product.inventory}</td>
					  		<td>${product.reorderPoint}</td>
					  		<td>
					  			<a class="btn btn-default" href="createPO?id=${product.id}">進貨</a>
					  		</td>
					  	</tr>
				  	</c:forEach>
				</table>
			</div>
		</div>
	</div>

    </div><!-- /.container -->

	<%@include file="footer.jspf" %>

</body>
</html>
