<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Form</title>

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
      					相關表格
						<!--arrow-->
						<font color="#FF9A00"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font>
      				</p>
      			</div>

      			<div class="main_content_down_block_contain" align="center">

      			<div class="TableForForm">
      			<table>
				<colgroup>
				<col style="width: 30%">
				<col style="width: 70%">
				</colgroup>
				  <c:forEach  items="${formList1}" var="form1" begin="0" end="5" step="1">
				  <!-- 資料庫輸入"分類" -->
				  <tr>
				    <td class="TableForForm-sent" rowspan="1"><!-- row那邊寫分類裡有幾個後加一 ex:有三個表格就寫4 -->
				    ${form1.formDetail}
				    </td>
				  </tr>
				  <c:forEach items="${formList}" var="form" >
				  <!-- 跑這個分類的資料 -->
				  <c:if test="${form.formDetail==form1.formDetail}">
				  <tr>
				    <td class="TableForForm-82wu" onclick="location.href='${form.formDownload}';">
			 	    
				  		${form.formName}
				  		
				    </td>
				  </tr>
					</c:if>
				  <!-- 跑這個分類的資料 -->
				  </c:forEach>
				  <!-- 資料庫輸入"分類" -->
				  </c:forEach>
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