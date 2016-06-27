<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Masterpiece</title>

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
      				<p style="color:#FF6A00; font-size:24px; font-family: Microsoft JhengHei;">
      					參考佳作
						<!--arrow-->
						<font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">
						<%
      						String subject = new String(request.getParameter("subject").getBytes("ISO-8859-1"), "utf-8");
						%>
							<font><%=subject %>作文</font>
						</font>
      				</p>
      			</div>

      			<div class="main_content_down_block_contain" style="padding-right:15%; padding-left:15%;">

      			<div class="TableFormasterpiece" >
                <table >
                    <!-- 資料庫輸入 -->
                   <c:forEach items="${masterpieceList}" var="masterpiece">
                    <tr>
                        <td>
                            ${masterpiece.masterpieceYear}學年度<!--Year-->
                        </td>
                        <td onclick="location.href='SS_Page_masterpiece_content?year=${masterpiece.masterpieceYear}&subject=${subject}';">
                        	 <c:if test="${subject == '國文'}">
                           		 學科能力測驗國文考科參考佳作<!--Title-->
                           	</c:if>
                           	<c:if test="${subject == '英文'}">
                           		 學科能力測驗英文考科參考佳作<!--Title-->
                           	</c:if>
                        </td>
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