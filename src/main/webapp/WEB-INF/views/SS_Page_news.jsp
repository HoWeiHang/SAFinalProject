<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>News</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>

	<link rel="stylesheet" href="css/Test_main_content.css">
	<link rel="stylesheet" href="css/Footer.css">
	<link rel="stylesheet" href="css/SS_navbar.css">
</head>
<body>
<%@include  file="SSNavbar.jspf" %>
<div class="wrap"> 
    <div class="main_content">
      	
      	<div class="main_content_down">
      		<div class="main_content_down_block">
      			<div class="main_content_down_block_title">
      				<form id="form1" name="form1" method="get" action="SS_Page_news_Search">
      				<p style="color:#0062FF; font-size:24px; font-family: Microsoft JhengHei;">
      					最新消息
						<!--arrow-->
						<font color="#00AAFFFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font>					
						<span style="float:right; padding-right:50px; font-size:15px;">
						<select name="month">
      						<option value="all">全部月份</option>						
                    		<option value="1">1月</option>
                    		<option value="2">2月</option>
                    		<option value="3">3月</option>
                    		<option value="4">4月</option>
                    		<option value="5">5月</option>
                    		<option value="6">6月</option>
                    		<option value="7">7月</option>
                    		<option value="8">8月</option>
                    		<option value="9">9月</option>
                    		<option value="10">10月</option>
                    		<option value="11">11月</option>
                    		<option value="12">12月</option>
						</select>
						<input type="text" name="word" id="text" placeholder="標題關鍵字搜尋">&nbsp
						<input type="submit" name="submit" id="submit" class="button" value="搜尋" style="font-size:15px;"> 
						</span>						
      				</p>
      				</form>
      			</div>

      			<div class="main_content_down_block_contain">
      			<!-- news -->
      			<div style="overflow-x:hidden;overflow-y:auto;height:320px;">
      			<div class="TableForNews" >
                <table >
                    
                    <c:forEach items="${newsList}" var="news">
                    <!-- 資料庫輸入-->
                    	<tr>
                        	<td>
                            ${news.createDate}<!--Date-->
                        	</td>
                        	<td onclick="location.href='${news.content}';" style="padding-left:10px;">
                           ${news.title} <!--NewsTitle-->
                        	</td>
                   		 </tr>
                    <!-- 資料庫輸入-->
                		</c:forEach>  
                    
                </table>
                </div>
                </div><!-- 滾輪 -->
      			</div>
      		</div>
      	</div>

    </div>
</div><!-- wrap -->
<%@include  file="SystemFooter.jspf" %>
</body>
</html>