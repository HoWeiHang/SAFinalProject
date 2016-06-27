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
	<link rel="stylesheet" href="css/SC_navbar.css">
</head>
<body>
<%@include  file="SCNavbar.jspf" %>
<div class="wrap"> 
    <div class="main_content">
      	

      	<div class="main_content_down">
      		<div class="main_content_down_block">
      			<div class="main_content_down_block_title">
      				<p style="color:#0062FF; font-size:24px; font-family: Microsoft JhengHei;">
      					歷屆試題
						<!--arrow-->
						<font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">依各考科分類</font>
						<font color="#FFC000"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#404040"><!-- 資料庫輸入 -->
						<%
      						String subject = new String(request.getParameter("subject").getBytes("ISO-8859-1"), "utf-8");
						%>
							<font><%=subject %></font>
						</font>
      				</p>
      			</div>

      			<div class="main_content_down_block_contain">


      			<div class="TableForPastpaper" >
      			<table style="undefined;table-layout: fixed; width: 656px">
					<colgroup>
					<col style="width: 98px">
					<col style="width: 76px">
					<col style="width: 77px">
					<col style="width: 104px">
					<col style="width: 148px">
					<col style="width: 83px">
					<col style="width: 134px">
					</colgroup>
					  <tr>
					    <th rowspan="2" bgcolor="#FFD966">學年度</th>
					    <th colspan="2" bgcolor="#91DCFD">一般試題</th>
					    <th colspan="2" bgcolor="#91DCFD">試題答案</th>
					    <th colspan="2" bgcolor="#88DE7C">語音試題</th>
					  </tr>
					  <tr>
					    <td bgcolor="#91DCFD">PDF檔</td>
					    <td bgcolor="#91DCFD">Word檔</td>
					    <td bgcolor="#91DCFD">選擇題答案</td>
					    <td bgcolor="#91DCFD">非選擇題評分原則</td>
					    <td bgcolor="#88DE7C">試題內容</td>
					    <td bgcolor="#88DE7C">序號內容對照表</td>
					  </tr>
					  <!-- 資料庫輸入 -->
					  <c:forEach items="${pastPaperList}" var="pastPaper">
					  <tr bgcolor="#E0E0E0">
					    <td><!-- 資料庫輸入 -->${pastPaper.pastPaperYear}</td>
					    <td><a href="${pastPaper.pastPaperPDF}"><font color="#000000">下載</font></a></td>
					    <td><a href="${pastPaper.pastPaperWORD}"><font color="#000000">下載</font></a></td>
					    <td><a href="${pastPaper.pastPaperAnswer}"><font color="#000000">下載</font></a></td>
					    <c:choose> 
  							<c:when test="${!pastPaper.pastPaperScore.equals(s)}">
    							<td><a href="${pastPaper.pastPaperScore}"><font color="#000000">下載</font></a></td>
  							</c:when>
  							<c:otherwise>
   								<td></td> 				
  							</c:otherwise>
						</c:choose>					  
					    <c:choose> 
  							<c:when test="${!pastPaper.pastPaperVoice.equals(s)}">
    							<td><a href="${pastPaper.pastPaperVoice}"><font color="#000000">下載</font></a></td>
  							</c:when>
  							<c:otherwise>
   								<td></td> 				
  							</c:otherwise>
						</c:choose>
					    <c:choose> 
  							<c:when test="${!pastPaper.pastPaperVTable.equals(s)}">
    							<td><a href="${pastPaper.pastPaperVTable}"><font color="#000000">下載</font></a></td>
  							</c:when>
  							<c:otherwise>
   								<td></td> 				
  							</c:otherwise>
						</c:choose>
					  </tr>
					  </c:forEach>
					  <!-- 資料庫輸入 -->

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