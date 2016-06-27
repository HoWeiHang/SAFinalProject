<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>DownloadRegion</title>
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
    							下載專區
    			</font>
    		</div>

    		<!-- blue line -->
   		 	<div class="main_content_left_line">
    		</div>
    		<!-- blue line -->
    		<div style="padding: 15px; padding-bottom: 7px; font-family: Microsoft JhengHei; font-size:14px;  color:#696969;"><!--上下左右空18px-->
				<p style="padding-bottom:3px;">
					<a class="main_content_left_text_link_setting" href="downloadregion_allsoftware">
						各類軟體
					</a>
				</p>
 				<p style="padding-bottom:3px;">
    				<a class="main_content_left_text_link_setting" href="downloadregion_relativeFile">
    					相關檔案
    				</a>
    			</p>
    							
    			<p style="padding-bottom:3px;">
    				<a class="main_content_left_text_link_setting" href="downloadregion_disabledInformation">
    					身心障礙考生資訊
    				</a>
    			</p>
    			<p style="padding-bottom:3px;">
    				<a class="main_content_left_text_link_setting" href="downloadregion_other">
    					其他
    				</a>
    			</p>
    		</div><!--上下左右空18px-->
    	</div><!--left-->						

    	<div class="main_content_right">
    		<p><font color="orange" size="5">◆各類軟體</font></p>
    			<!--right content-->
    		<p>&nbsp;</p>
        <font color="orange" size="4">→&nbsp;&nbsp;</font><a href="https://get.adobe.com/reader/?loc=tw"><font color="#000000" size="3">Adobe Reader</font></a><p>&nbsp;</p>
        <font color="orange" size="4">→&nbsp;&nbsp;</font><a href="http://www.ceec.edu.tw/Download/%E5%BD%B1%E5%83%8F%E5%88%87%E5%89%B2%E8%BB%9F%E9%AB%94.zip"><font color="#000000" size="3">影像切割軟體下載</font></a><font color="blue" size="2"> (安裝前請先於『控制台』中將「104學年度試務資料解密程式」移除)</font>
        <p>&nbsp;</p>
        <font color="orange" size="4">→&nbsp;&nbsp;</font><font color="#000000" size="3">105學年度試務資料檔解密程式 [<a  href="http://www.ceec.edu.tw/Download/ceec105prewk.zip">軟體下載</a>] [<a href="http://www.ceec.edu.tw/Download/105%E8%A7%A3%E5%AF%86%E7%A8%8B%E5%BC%8F%E6%93%8D%E4%BD%9C%E8%AA%AA%E6%98%8E.doc">操作說明</a>]</font>
        <p>&nbsp;</p>
        <font color="orange" size="4">→&nbsp;&nbsp;</font><font color="#000000" size="3">GPG [<a  href="http://www.ceec.edu.tw/Download/GPG/GPG.zip">軟體下載</a>] [<a href="http://www.ceec.edu.tw/Download/GPG/GPG_SetupGuide(981006).pdf">安裝說明下載</a>] [<a href="http://www.ceec.edu.tw/Download/GPG/GPG_UserHelp(991001).pdf">操作說明下載</a> - 99.10.01更新]</font>
        <p>&nbsp;</p>
        <font color="orange" size="4">→&nbsp;&nbsp;</font><font color="#000000" size="3">PGP [<a  href="http://www.ceec.edu.tw/Download/PGP/PGPFW658Win32.zip">軟體下載</a>] [<a href="http://www.ceec.edu.tw/Download/PGP/PGP_SetupGuide.doc">安裝說明下載</a>] [<a href="http://www.ceec.edu.tw/Download/PGP/PGP_UserHelp(991001).pdf">操作說明下載</a> - 99.10.01更新]</font>
        
    	</div>
    </div><!--main content-->
    
</div><!--wrap-->
    
<%@include  file="SystemFooter.jspf" %>

</body>
</html>