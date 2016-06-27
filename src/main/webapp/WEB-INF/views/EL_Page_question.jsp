<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Question</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>

	<link rel="stylesheet" href="css/Test_main_content.css">
	<link rel="stylesheet" href="css/Footer.css">
	<link rel="stylesheet" href="css/EL_navbar.css">
</head>
<body>
<%@include  file="ELNavbar.jspf" %>
<div class="wrap"> 
    <div class="main_content">

      	<div class="main_content_down">
      		<div class="main_content_down_block">
      			<div class="main_content_down_block_title">
      				<p style="color:#478D01; font-size:24px; font-family: Microsoft JhengHei;">
      					問題解答
						<!--arrow-->
						<font color="#5EBF68"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font>
      				</p>
      			</div>

      			<div class="main_content_down_block_contain">
      			<!-- 以下的title answer要跑資料庫 -->
      			<!-- 考試簡介 -->
      			<div class="panel panel-success">
      			<div class="panel-heading">
      			考試簡介
      			</div>
      			<c:forEach items="${questionList_First}" var="question">
      			<div style="padding:10px 20px;">
      			<p><h4 style="color:#E07F00;"><b>Q：${question.questionName}</b></h4>
      			<pre style="background-color:#ffffff;border:0px">${question.questionContent}</pre></p>
      			</div>
      			</c:forEach>
      			</div>
      			
      			<!-- 應考相關 -->
      			<div class="panel panel-success">
      			<div class="panel-heading">
      			應考相關
      			</div>
      			<c:forEach items="${questionList_Second}" var="question">
      			<div style="padding:10px 20px;">
      			<p><h4 style="color:#E07F00;"><b>Q：${question.questionName}</b></h4>
      			<pre style="background-color:#ffffff;border:0px">${question.questionContent}</pre></p>
      			</div>
      			</c:forEach>  
      			</div>
      				
      			<!-- 考場相關 -->
      			<div class="panel panel-success">
      			<div class="panel-heading">
      			考場相關
      			</div>
      			<c:forEach items="${questionList_Third}" var="question">
      			<div style="padding:10px 20px;">
      			<p><h4 style="color:#E07F00;"><b>Q：${question.questionName}</b></h4>
      			<pre style="background-color:#ffffff;border:0px">${question.questionContent}</pre></p>
      			</div>
      			</c:forEach>
      			</div>
      			
      			<!-- 試題相關 -->
      			<div class="panel panel-success">
      			<div class="panel-heading">
      			試題相關
      			</div>
      			<c:forEach items="${questionList_Fourth}" var="question">
      			<div style="padding:10px 20px;">
      			<p><h4 style="color:#E07F00;"><b>Q：${question.questionName}</b></h4>
      			<pre style="background-color:#ffffff;border:0px">${question.questionContent}</pre></p>
      			</div>
      			</c:forEach>
      			</div>
      			
      			<!-- 成績相關 -->
      			<div class="panel panel-success">
      			<div class="panel-heading">
      			成績相關
      			</div>
      			<c:forEach items="${questionList_Fifth}" var="question">
      			<div style="padding:10px 20px;">
      			<p><h4 style="color:#E07F00;"><b>Q：${question.questionName}</b></h4>
      			<pre style="background-color:#ffffff;border:0px">${question.questionContent}</pre></p>
      			</div>
      			</c:forEach> 		
      			</div>	
      			
      			</div>
      		</div>
      	</div>
    </div>
</div><!-- wrap -->
	
<%@include  file="SystemFooter.jspf" %>

</body>
</html>