<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>TestIndex</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>

	<link rel="stylesheet" href="css/Test_main_content.css">
	<link rel="stylesheet" href="css/Footer.css">
	<link rel="stylesheet" href="css/SC_navbar.css">
</head>
<body>
<%@include  file="SCNavbar.jspf" %>
<div class="wrap"> 
    <div class="main_content">
      		<div class="index_main_content_down_block">
      			<div class="index_main_content_down_left">
      				<p style="font-family: Microsoft JhengHei;font-size:19.5px;">
      					最新消息 <font color="#00AAFFFF"><span class="glyphicon glyphicon-chevron-right"  aria-hidden="true"></span> </font>
      				</p>
      				<div style="padding:3%;">
      				<font style="font-family: Microsoft JhengHei; font-size:17px;">
      				<table class="table">
      									  	
				  	<c:forEach items="${newsList}" var="news" begin="0" end="5" step="1">
					  	<tr>
					  		<td style="width:30%;"><font size=1>${news.createDate}</font></td>
					  		<td ><a href="${news.content}">${news.title}</a></td>
					  	</tr>
				  	</c:forEach>
					</table>
      				</font><!--只能15筆資料-->
      				</div>
      				<!--more-->
      				<div style="padding-right:20px; bottom:0px; text-align:right;">
      				<a id="open_news"  style="font-family: Microsoft JhengHei; font-size:15px; color: red;" href="SC_Page_news">
      					more...
      					</a>
					
      				</div>
      				<!--more-->
      			</div>
      			<div class="index_main_content_down_right">
      				<p style="font-family: Microsoft JhengHei;font-size:19.5px;">
      					考試日程 <font color="#00AAFFFF"><span class="glyphicon glyphicon-chevron-right " aria-hidden="true"></span> </font>
      				</p>
      				<div style="padding:3%;">
      				<font style="font-family: Microsoft JhengHei; font-size:17px;">
      				<table class="table">
      									  	
				  	<c:forEach items="${scheduleList}" var="schedule" begin="0" end="5" step="1">
				  	<c:if test="${schedule.scheduleId!=1}">
					  	<tr>
					  		<td style="width:30%;">
					  		<font size=1>
					  			${schedule.scheduleStartTime}
                            	~
                            	${schedule.scheduleEndTime}
                            </font>
                            </td>
					  		<td>${schedule.scheduleName}</td>
					  	</tr>
					  	</c:if>
				  	</c:forEach>
					</table>
      				</font><!--只能15筆資料-->
      				</div>
      				<!--more-->
      				<div style="right:20px; bottom:0px; text-align:right;">
      				<a id="open_date"  style="font-family: Microsoft JhengHei; font-size:15px; color: red;" href="SC_Page_schedule">
      					more...
      					</a>
					
      				</div>
      				<!--more-->
      			</div>
            </div>
      		</div>

    </div>

</div><!-- wrap -->

<%@include  file="SystemFooter.jspf" %>


</body>
</html>