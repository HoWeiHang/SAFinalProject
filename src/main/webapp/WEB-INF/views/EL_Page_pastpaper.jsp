<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Pastpaper</title>

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
      					歷屆試題
						<!--arrow-->
						<font color="#5EBF68"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font>
      				</p>
      			</div>

      			<div class="main_content_down_block_contain">
      				<div class="TableForPastpaper" align="center">
      			<table style="undefined;table-layout: fixed; width: 656px">
					<colgroup>
					<col style="width: 100px">
					<col style="width: 100px">
					<col style="width: 100px">
					<col style="width: 100px">
					<col style="width: 100px">
					</colgroup>
					  <tr>
					    <th rowspan="2" bgcolor="#FFD966">學年度</th>
					    <th colspan="2" bgcolor="#91DCFD">第一次英聽</th>
					    <th colspan="2" bgcolor="#88DE7C">第二次英聽</th>
					  </tr>
					  <tr>
					    <td bgcolor="#91DCFD">試卷</td>
					    <td bgcolor="#91DCFD">答案</td>
					    <td bgcolor="#88DE7C">試卷</td>
					    <td bgcolor="#88DE7C">答案</td>
					  </tr>
					  <!-- 資料庫輸入
					  <tr bgcolor="#E0E0E0">
					    <td><!-- 資料庫輸入(國英數社自) 104</td>
					    <td><a href="第一次題目"><font color="#000000">下載</font></a></td>
					    <td><a href="第一次答案"><font color="#000000">下載</font></a></td>
					    <td><a href="第二次題目"><font color="#000000">下載</font></a></td>
					    <td><a href="第二次答案"><font color="#000000">下載</font></a></td>
					  </tr>
					  資料庫輸入 -->
					  
				</table>
				</div>
      			</div>
      		</div>
      	</div>
    </div>
</div><!-- wrap -->
	
<%@include  file="SystemFooter.jspf" %>  

</body>
</html>