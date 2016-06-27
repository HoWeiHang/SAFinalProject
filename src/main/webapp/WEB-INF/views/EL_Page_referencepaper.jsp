<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Referencepaper</title>

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
      					參考試卷
						<!--arrow-->
						<font color="#5EBF68"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> </font>
      				</p>
      			</div>
      			<div class="main_content_down_block_contain">  

<center><font color="#FFC000" size=5>大學入學考試中心<p>高中英語聽力測驗參考試卷說明</p></font></center>
<p></p>
<pre style="background-color:#ffffff;border:0px">    依據大學招生委員會聯合會於民國101年3月23日會員大會之決議，自104學年度起，大學各校系可自訂是否將英聽測驗成績納入「繁星推薦入學」、「個人申請入學」及「考試入學」之招生檢定項目。這表示，大學校系除了仍然可以選擇在個人申請管道將英聽測驗成績設為審查資料之外，還可以考慮在不同管道設為檢定項目。

    本中心已於101年7月公布英聽測驗「考試說明」，並於102年8月公布「參考試卷」。本年度，為使看圖辨義題型在評量考生基本聽解能力上更具有鑑別效
果。經專家學者組成計畫小組，提出該題型之改進方案並進行試題研發，經彙整各方意見，以及學者專家審查，於103年6月30日公布修訂後之「參考試卷」及參考答案，同時，於103年8月出版《認識高中英語聽力測驗2》，收錄本測驗之簡介、修訂後之考試說明、參考試卷說明、參考試卷及試題解析，並附語音光碟。

    有關本次公布之參考試卷，說明如下：
 （一）本測驗依據「普通高級中學課程綱要」命題。
 （二）本年度公布之參考試卷，係彙編自歷次高中英語聽力測驗之試題，並經座談會、專家諮詢，以及本中心命題研究委員會委員審查修正後完成。
 （三）參考試卷僅作為參考示例，正式考試將考量主題內容及試題難度等，組成最適當之試卷；另各相關資訊，請參考當年度的簡章說明。
      			</pre>
      			<div class="TableForPastpaper" >
      			<table style="undefined;table-layout: fixed; width: 700px">
					<colgroup>
					<col style="width: 100px">
					<col style="width: 100px">
					<col style="width: 100px">
					<col style="width: 150px">

					</colgroup>
					  <tr>
					    <th rowspan="1" bgcolor="#FFD966">公告年度</th>
					    <th colspan="2" bgcolor="#91DCFD">試題內容</th>
					    <th colspan="1" bgcolor="#88DE7C">參考答案</th>
					  </tr>
                	
                	<c:forEach  items="${referencePaperListForDistinctYear}" var="referencePaperListForDistinctYear" >
                	<tr bgcolor="#E0E0E0">
                	<td> ${referencePaperListForDistinctYear.referencePaperYear}</td>
                	<c:forEach items="${referencePaperList}" var="referencePaper">
                	<c:if test="${referencePaperListForDistinctYear.referencePaperYear==referencePaper.referencePaperYear}">
                	<c:if test="${referencePaper.referencePaperName.equals(a)}">
                	<td><a href="${referencePaper.referencePaperDownload}"><font color="#000000">語音檔下載</font></a></td>
                	</c:if>
                	<c:if test="${referencePaper.referencePaperName.equals(b)}">
                	<td><a href="${referencePaper.referencePaperDownload}"><font color="#000000">試題下載</font></a></td>
                	</c:if>
					<c:if test="${referencePaper.referencePaperName.equals(c)}"> 
					<td><a href="${referencePaper.referencePaperDownload}"><font color="#000000">參考答案下載</font></a></td>    
					 </c:if>   
					    
					   
					  
					  
					
					
					
					</c:if>
                	</c:forEach> 
                	</tr>
                	</c:forEach>
                	
                	
                	
                	 
                	 
                	<!-- <c:forEach items="${referencePaperList}" var="referencePaper">
					  <tr bgcolor="#E0E0E0">
					    <td>${referencePaper.referencePaperYear}</td>
					    <td><a href="試題下載"><font color="#000000">試題下載</font></a></td>
					    <td><a href="語音檔下載"><font color="#000000">語音檔下載</font></a></td>
					    <td><a href="參考答案下載"><font color="#000000">參考答案下載</font></a></td>
					  </tr>
					  
                	</c:forEach>  -->
				</table>
      			</div>
      		</div>
      	</div>
    </div>
</div><!-- wrap -->
<%@include  file="SystemFooter.jspf" %>
</body>
</html>