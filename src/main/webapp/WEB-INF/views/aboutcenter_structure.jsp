<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>CenterIntroduction</title>
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">

	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>

	<link rel="stylesheet" href="css/about_and_download_content.css">
	<link rel="stylesheet" href="css/Footer.css">
	<link rel="stylesheet" href="css/Normal_navbar.css">
</head>
<body>
<div class="wrap">
<%@include  file="NormalNavbar.jspf" %>
    <div class="main_content">
    	<div class="main_content_left">
    		<div style="padding: 15px;"><!--上下左右空18px-->
    			<font style="font-family: Microsoft JhengHei; font-size:23px; color:#00AAFF;">
    							認識中心
    			</font>
    		</div>

    		<!-- blue line -->
   		 	<div class="main_content_left_line">
    		</div>
    		<!-- blue line -->
    		<div style="padding: 15px; padding-bottom: 7px; font-family: Microsoft JhengHei; font-size:14px;  color:#696969;"><!--上下左右空18px-->
				<p style="padding-bottom:3px;">
					<a class="main_content_left_text_link_setting" href="aboutcenter_introduction">
						簡介
					</a>
				</p>
 				<p style="padding-bottom:3px;">
    				<a class="main_content_left_text_link_setting" href="aboutcenter_structure">
    					組織架構
    				</a>
    			</p>
    							
    			<p style="padding-bottom:3px;">
    				<a class="main_content_left_text_link_setting" href="aboutcenter_office">
    					各單位職掌
    				</a>
    			</p>
    		</div><!--上下左右空18px-->
    	</div><!--left-->						

    	<div class="main_content_right">
    		<font color="orange" size="5">組織架構</font>
    			      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true" style="font-size:20px; color:orange;"  >
    			      </span>
                <p></p>
    			<img style="float: right;" src="http://www.ceec.edu.tw/images/CeecStructure.gif" width="495" height="285"/>
    			
    		
    	</div>
    </div><!--main content-->
    
</div><!--wrap-->
    
<%@include  file="SystemFooter.jspf" %>

</body>
</html>