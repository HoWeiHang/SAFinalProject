<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Insert Article</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/jquery.validate.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row">
			<br>
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<form method="post" action="insertNews" id="insertForm">
					<div class="form-group">
					    <label for="title">標題</label>
						<input type="text" class="form-control" id="title" name="title" placeholder="標題">
				  	</div>
				  	<div class="form-group">
					    <label for="issuePerson">發布人員</label>
						<input type="text" class="form-control" id="issuePerson" name="issuePerson" placeholder="標題">
				  	</div>
				  	<div class="form-group">
					    <label for="articleCategory.id">時程項目</label>
				  		<select class="form-control" id="articleCategory.id" name="articleCategory.id">
				  		<c:forEach items="${articleCategoryList}" var="articleCategory">
					  		<option value="${articleCategory.id}">
					  			${articleCategory.name}
				  			</option>
				  		</c:forEach>
						</select>
				  	</div>
				  	<div class="form-group">
					    <label for="test.category">測驗項目</label>
				  		<select class="form-control" id="test.category" name="test.category">
				  		<c:forEach items="${testCategoryList}" var="testCategory">
					  		<option value="test.category">
					  			${testCategory.category}
				  			</option>
				  		</c:forEach>
						</select>
				  	</div>
				  	<div class="form-group">
					    <label for="content">內容</label>
				  		<textarea class="form-control" rows="3" id="content" name="content"></textarea>
				  	</div>
					<button type="submit" class="btn btn-primary">新增</button>
				</form>
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script> 
	<script src="js/jquery.validate.js"></script>
	<script src="js/additional-methods.js"></script>
	<script src="js/messages_zh_TW.js"></script>
	<script>
	$("#insertForm").validate({
		rules:{
			title:"required",
			content:"required"
		}
	});
	</script>
</body>
</html>