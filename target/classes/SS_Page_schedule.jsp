<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Schedule</title>

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
      					考試日程
						<!--arrow-->
						<font color="#FF9A00"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font>

						<div align="right" style="margin-top:-30px;padding-right:40px;">
      				<a href="https://ap.ceec.edu.tw/examinfo/SysOpen.aspx?examid=104DRSE" style="color:#FF6A00;">點我看 試務系統開放時間 </a>
      				</div>
      				</p>
      			</div>

      			<div class="main_content_down_block_contain">
      			<!-- news -->
      			<div style="overflow-x:hidden;overflow-y:auto;height:320px;">
      			<div class="TableForNews" >
                <table >
                    
                    <c:forEach items="${scheduleList}" var="schedule">
                    <c:if test="${schedule.scheduleId!=1}">
                    	<tr>
                        	<td>
                            	${schedule.scheduleStartTime}
                            	~
                            	${schedule.scheduleEndTime}  <!--Date-->
                        	</td>
                        	<td>
                        		${schedule.scheduleName} <!--Schedule Title-->
                        	</td>
                    	</tr>
                    	</c:if>
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