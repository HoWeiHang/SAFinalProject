<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>TestIndex</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>

	<link rel="stylesheet" href="css/Test_main_content.css">
	<link rel="stylesheet" href="css/SC_navbar.css">
	<link rel="stylesheet" href="css/Footer.css">
</head>
<body>

${message}

<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container_top">
		<div class="container_top_text">
			<div class="container_top_topic">
			學科能力測驗
			</div>
			<div class="container_top_topic2">
					<a class="a_text_white" style="font-size:14px;" href="../IndexView/IndexView.html">首頁 </a>
					<font>&nbsp;|&nbsp;</font>
					<a class="a_text_white" style="font-size:14px;" href="http://www.ceec.edu.tw/CeecMag/paper.html">訂閱選才電子報</a>
					<font>&nbsp;|&nbsp;</font>
					<a class="a_text_white" style="font-size:14px;" href="">管理者登入</a>
					<br>
					<br>
					<a class="a_text_white" style="font-size:20px;" href="../SS_Page/SSIndexView.html">指定科目考試</a>
					<font>&nbsp;|&nbsp;</font>
					<a class="a_text_white" style="font-size:20px;" href="../EL_Page/ELIndexView.html">英語聽力測驗</a>
			</div>
		</div>
	</div>
</nav>
<!--下面是我新寫的bar,記得複製要小心.然後對照上面程式碼,不一樣就刪掉 -->
<nav class="navbar">
    <div class="main_content_topbar">
    
          <div style="font-family: Microsoft JhengHei;font-size:20px;">
            <ul class="navigation">
            
            <li style="padding-left: 23.5%;">
                <a class="main_content_link_setting" href="SC_Page_introduction">簡介</a>
            </li>
             <li>
                <a class="main_content_link_setting" href="SC_Page_news">最新消息</a>
            </li>
             <li>
                <a class="main_content_link_setting" href="03-schedule/SC_Page_schedule.html">考試日程</a>
            </li>
            <li>
                <a href="#">參考佳作</a>
                <ul>
                    <li><a href="04-masterpiece/SC_Page_masterpiece_Chinese.html">國文考科</a></li>
                    <li>
                        <a href="04-masterpiece/SC_Page_masterpiece_English.html">英文考科</a>
                        
                    </li>
                </ul>
            </li>
            <li>
                <a href="#">歷屆試題</a>
                <ul>
                    <li><a href="#">依各考科分類<span class="arrow-right"></span></a>
            <ul>
                            <li><a href="SC_Page_pastpaper_subject?subject=Chinese">國文</a></li>
                            <li><a href="SC_Page_pastpaper_subject?subject=English">英文</a></li>
                            <li><a href="SC_Page_pastpaper_subject?subject=Math">數學</a></li>
                            <li><a href="SC_Page_pastpaper_subject?subject=Society">社會</a></li>
                            <li><a href="SC_Page_pastpaper_subject?subject=Science">自然</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#">依學年度分類<span class="arrow-right"></span></a>
                        <ul>
                            <li><a href="05-pastpaper/SC_Page_pastpaper_year.html">104</a></li>
                            <li><a href="05-pastpaper/SC_Page_pastpaper_year.html">103</a></li>
                            <li><a href="05-pastpaper/SC_Page_pastpaper_year.html">102</a></li>
                            <li><a href="05-pastpaper/SC_Page_pastpaper_year.html">101</a></li>
                            <li><a href="05-pastpaper/SC_Page_pastpaper_year.html">100</a></li>
                            <li><a href="05-pastpaper/SC_Page_pastpaper_year.html">99</a></li>
                        </ul>
                    </li>
                </ul>
            </li>
             <li>
                <a class="main_content_link_setting" href="06-statistic/SC_Page_statistic.html">統計資料</a>
            </li>
             <li >
                <a class="main_content_link_setting" href="07-form/SC_Page_form.html" style="border-right: 1px solid #fff;">相關表格</a>
            </li>

    </ul>
          </div>

        </div>
</nav>
<div class="wrap"> 
    <div class="main_content">
      	
123
      	<div class="main_content_down">
      		<div class="index_main_content_down_block">
      			<div class="index_main_content_down_left">
      				<p style="font-family: Microsoft JhengHei;font-size:19.5px;">
      					最新消息 <font color="#00AAFFFF"><span class="glyphicon glyphicon-chevron-right"  aria-hidden="true"></span> </font>
      				</p>
      				<div style="padding:3%;">
      				<font style="font-family: Microsoft JhengHei; font-size:17px;">
      				<table class="table">
      									  	
				  	<c:forEach items="${newsList}" var="news" begin="0" end="5" step="1">
					  	<tr>
					  		<td style="width:30%;"><font size=1>${news.createDate}</font></td>
					  		<td>${news.title}</td>
					  	</tr>
				  	</c:forEach>
					</table>
      				</font><!--只能15筆資料-->
      				</div>
      				<!--more-->
      				<div style="right:20px; position:absolute; bottom:0px; text-align:right;">
      				<a id="open_news"  style="font-family: Microsoft JhengHei; font-size:15px; color: red;" href="#">
      					more...
      					</a>
					
      				</div>
      				<!--more-->
      			</div>

      			<span class="index_main_content_down_midline" style="background-color: #6495ED;"><!--鉛垂線-->
      			</span>

      			<div class="index_main_content_down_right">
      				<p style="font-family: Microsoft JhengHei;font-size:19.5px;">
      					考試日程 <font color="#00AAFFFF"><span class="glyphicon glyphicon-chevron-right " aria-hidden="true"></span> </font>
      				</p>
      				<div style="padding:3%;">
      				<font style="font-family: Microsoft JhengHei; font-size:17px;">
      				hi<br>
   		   			hi<br>
   		   			hi<br>
   		   			hi<br>
   		   			hi<br>
   		   			hi<br>
   		   			hi<br>
   		   			hi<br>
   		   			hi<br>
   		   			hi<br>
   		   			hi<br>
   		   			hi<br>
   		   			hi<br>
      				hi<br>
      				hi<br>
      				</font><!--只能15筆資料-->
      				</div>
      				<!--more-->
      				<div style="right:20px; position:absolute; bottom:0px; text-align:right;">
      				<a id="open_date"  style="font-family: Microsoft JhengHei; font-size:15px; color: red;" href="#">
      					more...
      					</a>
					
      				</div>
      				<!--more-->
      			</div>
            </div>
      		</div>
      	</div>
    </div>
</div><!-- wrap -->
	
<footer style="padding-top:12px;"><!--底部navbar-->
  
  <div class="footer_left">
    <div class="footer_left_left">
      <p align="right" style="font-family: Microsoft JhengHei;" >認識中心</p>
    </div>

    <div class="footer_left_right">
      <p style="padding-left:20px;" class="footer_text_setting" >
        <a class="footer_left_link_setting" href="../FooterRelativePage/01-aboutcenter/aboutcenter_introduction.html">
          簡介
        </a>
      </p>
      <p style="padding-left:20px;" class="footer_text_setting" >
        <a class="footer_left_link_setting" href="../FooterRelativePage/01-aboutcenter/aboutcenter_structure.html">
          組織架構
        </a>
      </p>
      <p style="padding-left:20px;" class="footer_text_setting" >
        <a class="footer_left_link_setting" href="../FooterRelativePage/01-aboutcenter/aboutcenter_office.html">
          各單位職掌
        </a>
      </p>
    </div>
  </div>
  
  <span class="footer_mid">
    <span class="footer_mid_left">
      <p align="center" style="font-family: Microsoft JhengHei;">測驗考試</p>
    </span>

    <span class="footer_mid_right">
      <p class="footer_text_setting">
        <a class="footer_left_link_setting" href="../SC_Page/SCIndexView.html">
          學科能力測驗
        </a>
      </p>
      <p class="footer_text_setting">
        <a class="footer_left_link_setting" href="../SS_Page/SSIndexView.html">
          指定科目考試
        </a>
      </p>
      <p class="footer_text_setting">
        <a class="footer_left_link_setting" href="../EL_Page/ELIndexView.html">
          英文聽力測驗
        </a>
      </p>
    </span>
  </span>
  
  <div class="footer_right">
    <div class="footer_right_top">
      <div class="footer_right_top_left_one">
        <p align="center" style="font-family: Microsoft JhengHei;">
          <a class="footer_right_link_setting" href="../FooterRelativePage/02-downloadregion/downloadregion_allsoftware.html">
            下載專區
          </a>
        </p>
      </div>
      <span class="footer_right_top_left_two">
        <p align="center" style="font-family: Microsoft JhengHei;">
          <a class="footer_right_link_setting" href="../FooterRelativePage/03-syllabuschange/syllabuschange.html">
            課綱異動
          </a>
        </p>
      </span>
      <span class="footer_right_top_left_three">
        <p align="center" style="font-family: Microsoft JhengHei;">
          <a class="footer_right_link_setting" href="../FooterRelativePage/04-relativewebsite/Relativewebsite.html">
            相關網站
          </a>
        </p>
      </span>
      <div class="footer_right_top_left_four">
        <p align="center" style="font-family: Microsoft JhengHei;">
          <a class="footer_right_link_setting" href="">
            其他資訊
          </a>
        </p>
      </div>
    </div>

    <div class="footer_right_down">
      <p style="padding-left:20px;margin-top:0px;font-size:11.5px;color:#696969;font-family: Microsoft JhengHei;">
        &nbsp;&nbsp;總機：(02)2366-1416　
            語音查詢：(02)2364-3677　
            傳真：(02)2362-0755 
        <br>
        &nbsp;&nbsp;地址：10673 台北市舟山路237號
            信箱：10099 臺北郵政71-64號
      </p>
      
    </div>
  </div>
   </footer>



    
  

</body>
</html>