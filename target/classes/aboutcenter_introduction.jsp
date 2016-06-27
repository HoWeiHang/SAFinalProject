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
    		<font color="orange" size="5">簡介</font>
    			      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true" style="font-size:20px; color:orange;"  >
    			      </span>
                    <p>&nbsp;</p>
                   <p><font color="green" size="4">◆我們的主任</font></p>
                   <img style="float: right;" src="http://www.ceec.edu.tw/CeecIntro/CeecCEO020801.png" width="150" height="180"/>
                   <p>-主任：黎建球 博士</p>
                   <p>-學歷：輔仁大學哲學研究所　博　士 (1982/9至1985/6)</p>
                   <p>-現職：大學入學考試中心主任　(2013/8至今)</p>
                   <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;輔仁大學哲學系講座教授　(2012/8至今)</p> 
                   <p>&nbsp;</p>
                   <p><font color="green" size="4">◆沿革</font></p>
                   <p>-1989年7月1日成立，命名為「中華民國大學入學考試中心」。</p>
                   <p>-1993年3月改制為「財團法人大學入學考試中心基金會」。</P>
                   <p>-成立的目的：研究改進大學入學制度與技術並辦理大學入學考試。</p>
                   <p>&nbsp;</p>
                   <p><font color="green" size="4">◆歷年重要工作及成果</font></p>
                   <p>-完成《大學入學制度改革建議書》</p>
                   <p>-辦理《大學推薦甄選入學方案》</p>
                   <p>-開辦《學科能力測驗》</p>
                   <p>-承辦大學聯合招生委員會「試務總會」業務</p>
                   <p>-辦理《指定科目考試》</p>
                   <p>-研發「語文表達能力測驗」及「英文寫作能力測驗」</p>
                   <p>-革新試務作業</p>
                   <p>-協助高中學生發展生涯規劃及選擇大學校系</p>
                   <p>-出版考試相關書籍</p>
                   <p>-推動入學制度與試務經驗之交換</p>
                   <p>&nbsp;</p>
                   <p><font color="green" size="4">◆未來發展方向</font></p>
                   <p>-發展成為考試專業機構</p>
                   <p>-研究發展各類相關測驗</p>
                   <p>-革新考試相關試務作業</p>
                   <p>-強化相關考試諮詢服務</p>
                   <p>&nbsp;</p>
                   <p><font color="green" size="4">◆我們的位置</font></p>
                   <img src="http://www.ceec.edu.tw/images/map-ceec(ch).gif" width="400" height="280">
                   <p>搭捷運：新店線，公館站下車，2號(銘傳國小、大考中心)出口</p>
                   <P>搭公車：捷運公館站(羅斯福路方向)或公館站(基隆路方向)</p>
    			
    		
    	</div>
    </div><!--main content-->
    
</div><!--wrap-->

 <%@include  file="SystemFooter.jspf" %>
 
</body>
</html>