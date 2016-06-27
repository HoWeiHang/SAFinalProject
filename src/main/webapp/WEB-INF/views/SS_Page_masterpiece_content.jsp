<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%request.setCharacterEncoding("UTF-8");%>
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
						<c:if test="${subject == '國文'}">                         	
							<font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">國文考科作文佳作說明</font>
      					</c:if>
      					<c:if test="${subject == '英文'}">                         	
							<font color="#00AAFF"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font><font color="#FFC000">英文考科作文佳作說明</font>
      					</c:if>
      				</p>
      			</div>

      			<div class="main_content_down_block_contain">

      			<div class="TableForMasterpiece_C" >
      			<p>
      			
                <table style="undefined;table-layout: fixed; width: 100%">
                <colgroup>
					<col style="width: 10%">
					<col style="width: 15%">
					<col style="width: 75%">

				</colgroup>    
                    <tr>
                        <td>
                            編號
                        </td>
                        <td>
                            下載
                        </td>
                        <td>
                            評分說明
                        </td>
                    </tr>
                    <!-- 資料庫依搜尋結果輸入 -->
                    <c:forEach items="${masterpieceList}" var="masterpiece" varStatus="loop"> 
                    <tr>
                        <td>
                            ${loop.index+1}<!--ID-->
                        </td>
                        <td >
                            <a href="${masterpiece.masterpieceURL}"><font color="#000000">${masterpiece.masterpieceName}</font></a><!--名稱及載點-->
                        </td>
                        <td>
                            <pre style="background-color:#E0E0E0;border:0px;text-align:left;">${masterpiece.masterpieceContent}</pre><!--內容-->
                        </td>
                    </tr>
                    </c:forEach> 
                    <!-- 資料庫依搜尋結果輸入 -->
                    
                </table>
                </p>
                </div>
      			
      			</div>
      		</div>
      	</div>


    </div>
</div><!-- wrap -->
<%@include  file="SystemFooter.jspf" %>
</body>
</html>