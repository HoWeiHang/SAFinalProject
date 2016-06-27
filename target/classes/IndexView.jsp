<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IndexView</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">

	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>


	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
 	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script> 

	<link rel="stylesheet" href="css/IndexView_main_content.css">
	<link rel="stylesheet" href="css/Footer.css">
	<link rel="stylesheet" href="css/Normal_navbar.css">
    <link rel="stylesheet" href="css/jquery-ui.css">
</head>
<body>
<div class="wrap">
<%@include  file="NormalNavbar.jspf" %>
    <div class="main_content">
    	<div class="main_content_top">
    		<!--LBJ Area-->
			<div class="big_test_container">
				<div class="small_test_container">
					<span class="test_container">
						<span class="every_test"> 
							
							<span class="every_news" style="left:5%">
								<div style="overflow-x:hidden;overflow-y:auto;height:185px;">
    						<table class="table">		  	
				  				<c:forEach items="${newsSCList}" var="news" begin="0" end="2" step="1">
					  					<tr>
					  						<td style="width:30%;"><font size=1>${news.createDate}</font></td>
					  						<td><a href="${news.content}">${news.title}</a></td>
					  					</tr>
				  					</c:forEach>
								</table>
							</div>
							</span>
							<a id="open_sc_news" class="word" href="#">more</a>
  							<div id="sc_news" title="學科能力測驗" style="z-index:100;">
                            <div style="overflow-x:hidden;overflow-y:auto;height:400px;">
    						<table class="table">		  	
				  				<c:forEach items="${newsSCList}" var="news" begin="0" step="1">
					  					<tr>
					  						<td style="width:30%;"><font size=1>${news.createDate}</font></td>
					  						<td><a href="${news.content}">${news.title}</a></td>
					  					</tr>
				  					</c:forEach>
								</table>
							</div>
                            </div>
        				</span>
					</span>
        			<span class="test_container" style="left:33.3%">
        				<span class="every_test">
        					<span class="every_news" style="left:5%">
        						<div style="overflow-x:hidden;overflow-y:auto;height:185px;">
    						<table class="table">		  	
				  				<c:forEach items="${newsSSList}" var="news" begin="0" end="2" step="1">
					  					<tr>
					  						<td style="width:30%;"><font size=1>${news.createDate}</font></td>
					  						<td><a href="${news.content}">${news.title}</a></td>
					  					</tr>
				  					</c:forEach>
								</table>
							</div>
        					</span>
        					<a id="open_ss_news" class="word" href="#">more</a>
                            <div id="ss_news" title="指定科目考試" s>
                            <div style="overflow-x:hidden;overflow-y:auto;height:400px;">
    						<table class="table">		  	
				  				<c:forEach items="${newsSSList}" var="news" begin="0" step="1">
					  					<tr>
					  						<td style="width:30%;"><font size=1>${news.createDate}</font></td>
					  						<td><a href="${news.content}">${news.title}</a></td>
					  					</tr>
				  					</c:forEach>
								</table>
							</div>
                            </div>
        				</span>
        			</span>
        			<span class="test_container"style="left:66.6%">
        				<span class="every_test">
        					<span class="every_news" style="left:5%">
        					<div style="overflow-x:hidden;overflow-y:auto;height:185px;">
    						<table class="table">		  	
				  				<c:forEach items="${newsELList}" var="news" begin="0" end="2" step="1">
					  					<tr>
					  						<td style="width:30%;"><font size=1>${news.createDate}</font></td>
					  						<td><a href="${news.content}">${news.title}</a></td>
					  					</tr>
				  					</c:forEach>
								</table>
							</div>
        					</span>
        		    		<a id="open_el_news" class="word" href="#">more</a>
                            <div id="el_news" title="英文聽力測驗" >
                            <div style="overflow-x:hidden;overflow-y:auto;height:400px;">
    						<table class="table">		  	
				  				<c:forEach items="${newsELList}" var="news" begin="0" step="1">
					  					<tr>
					  						<td style="width:30%;"><font size=1>${news.createDate}</font></td>
					  						<td><a href="${news.content}">${news.title}</a></td>
					  					</tr>
				  					</c:forEach>
								</table>
							</div>
                            </div>
        				</span>
        			</span>
        	<!--學測箭頭-->
        	<span class="arrow_container" style="left:1.5%;top:8px;padding-top:15px;padding-right:22%;padding-left:5%;">	
                <ul class="navigation">           
            <li>
            	<a style="text-align:center" href="#">
        		<div style="padding-top:2%;">

        		<font class="arrow" color="#000" style="font-family: Microsoft JhengHei;padding-left:20px;" >學科能力測驗

        		<span class="glyphicon glyphicon-chevron-right " style="color:#2A7BD4; padding-left:5px;"  aria-hidden="true">

        		</span>
        		</font>
        		</div>
        		</a>
                
                <ul style="background: #FFB132; margin:0 168px;z-index:1000; top:15px;" >
                    <li><a href="SC_Page_introduction">簡介<span></span></a></li>
                    <li><a href="SC_Page_news">最新消息<span></span></a></li>
                    <li><a href="SC_Page_schedule">考試日程<span></span></a></li>
                    <li><a>參考佳作 <span class="glyphicon glyphicon-chevron-right" style="color:#FF9500;"></span></a>
                        <ul>
                    <c:forEach items="${masterpieceListForNavBarSubject}" var="masterpiece">
                   	 <li><a href="SC_Page_masterpiece?subject=${masterpiece.masterpieceSubject }">${masterpiece.masterpieceSubject }考科</a></li>
                    </c:forEach>
                </ul>
                    </li>
                    <li><a>歷屆試題 <span class="glyphicon glyphicon-chevron-right" style="color:#FF9500;"></span></a>
                        <ul>
                    <li><a>依各考科分類<span class="arrow-right"></span></a>
            			<ul>
            			 <c:forEach items="${pastPaperListForNavBarSubject}" var="pastPaper">
                            <li><a href="SC_Page_pastpaper_subject?subject=${pastPaper.pastPaperSubject }">${pastPaper.pastPaperSubject }</a></li>
                         </c:forEach>
                        </ul>
                    </li>
                    <li>
                        <a>依學年度分類<span class="arrow-right"></span></a>
                        <ul>
                            <c:forEach items="${pastPaperListForNavBarYear}" var="pastPaper">
                            <li><a href="SC_Page_pastpaper_year?year=${pastPaper.pastPaperYear }">${pastPaper.pastPaperYear }</a></li>
                         </c:forEach>
                        </ul>
                    </li>
                </ul>
                    </li>
                    <li><a href="SC_Page_statistic">統計資料<span></span></a></li>
                    <li><a href="SC_Page_form">相關表格<span></span></a></li>
                </ul>
            </li>
             
    </ul>
        		
        	</span>
        	<!--指考箭頭-->
        	<span class="arrow_container" style="left:35%;top:8px;padding-top:15px;padding-right:22%;padding-left:5%;">	
            <ul class="navigation">           
            <li>
            	<a style="text-align:center" href="#" >
        		<div style="padding-top:2%;">
        		<font class="arrow" color="#000" style="font-family: Microsoft JhengHei;padding-left:20px;" >指定考試科目
        		<span class="glyphicon glyphicon-chevron-right " style="color:#2A7BD4; padding-left:5px;"  aria-hidden="true">
        		</span>
        		</font>
        		</div>
        		</a>
        
        		<ul style="background: #FFB132; margin:0 168px;z-index:1000; top:15px;" >
                    <li><a href="SS_Page_introduction">簡介<span></span></a></li>
                    <li><a href="SS_Page_news">最新消息<span></span></a></li>
                    <li><a href="SS_Page_schedule">考試日程<span></span></a></li>
                    <li><a>參考佳作<span class="glyphicon glyphicon-chevron-right" style="color:#FF9500;"></span></a>
                        <ul>
                    <c:forEach items="${masterpieceListForNavBarSubject_SS}" var="masterpiece">
                   	 <li><a href="SS_Page_masterpiece?subject=${masterpiece.masterpieceSubject }">${masterpiece.masterpieceSubject }考科</a></li>
                    </c:forEach>
                </ul>
                    </li>
                    <li><a>歷屆試題<span class="glyphicon glyphicon-chevron-right" style="color:#FF9500;"></span></a>
                        <ul>
                    <li><a>依各考科分類<span class="arrow-right"></span></a>
            			<ul>
            			 <c:forEach items="${pastPaperListForNavBarSubject_SS}" var="pastPaper">
                            <li><a href="SS_Page_pastpaper_subject?subject=${pastPaper.pastPaperSubject }">${pastPaper.pastPaperSubject }</a></li>
                         </c:forEach>
                        </ul>
                    </li>
                    <li>
                        <a>依學年度分類<span class="arrow-right"></span></a>
                        <ul>
                            <c:forEach items="${pastPaperListForNavBarYear_SS}" var="pastPaper">
                            <li><a href="SS_Page_pastpaper_year?year=${pastPaper.pastPaperYear }">${pastPaper.pastPaperYear }</a></li>
                         </c:forEach>
                        </ul>
                    </li>
                </ul>
                    </li>
                    <li><a href="SS_Page_statistic">統計資料<span></span></a></li>
                    <li><a href="SS_Page_form">相關表格<span></span></a></li>
                </ul>
            </li>
             
    </ul>
        	</span>
        	<!--英聽箭頭-->
        	<span class="arrow_container" style="left:68%;top:8px;padding-top:15px;padding-right:22%;padding-left:5%;">
            <ul class="navigation">           
            <li>	
            	<a style="text-align:center" href="#" >
        		<div style="padding-top:2%;">
        		<font class="arrow" color="#000" style="font-family: Microsoft JhengHei;padding-left:20px;" >英文聽力測驗
        		<span class="glyphicon glyphicon-chevron-right " style="color:#2A7BD4; padding-left:5px;"  aria-hidden="true">
        		</span>
        		</font>
        		</div>
        		</a>
        
        		<ul style="background: #FFB132; margin:0 168px;z-index:1000; top:15px;" >
                    <li><a href="EL_Page_introduction">簡介<span></span></a></li>
                    <li><a href="EL_Page_news">最新消息<span></span></a></li>
                    <li><a href="EL_Page_schedule">考試日程<span></span></a></li>
                    <li><a href="EL_Page_referencepaper">參考試卷<span></span></a>
                    </li>
                    <li><a href="EL_Page_pastpaper">歷屆試題<span></span></a>
                    </li>
                    <li><a href="EL_Page_statistic">統計資料<span></span></a></li>
                    <li><a href="EL_Page_form">相關表格<span></span></a></li>
                    <li><a href="EL_Page_question">問題解答<span></span></a></li>
                </ul>
            </li>
             
    </ul>
        	</span>
		</div>
	</div>
    <!--跳出選單-->
    <script src="js/jquery.js"></script>
    <script src="js/jquery-ui.js"></script>
	<script>
		var timeout	= 500;
		var closetimer	= 0;
		var ddmenuitem	= 0;

		// open hidden layer
		function mopen(id){	
			// cancel close timer
			mcancelclosetime();

			// close old layer
			if(ddmenuitem) ddmenuitem.style.visibility = 'hidden';

			// get new layer and show it
			ddmenuitem = document.getElementById(id);
			ddmenuitem.style.visibility = 'visible';
		}
		// close showed layer
		function mclose(){
			if(ddmenuitem) ddmenuitem.style.visibility = 'hidden';
		}

		// go close timer
		function mclosetime(){
		closetimer = window.setTimeout(mclose, timeout);
		}

		// cancel close timer
		function mcancelclosetime(){
			if(closetimer){
				window.clearTimeout(closetimer);
				closetimer = null;
			}
		}

		// close layer when click-out
		document.onclick = mclose; 


        //more視窗
        $(document).ready(function(){
            $('#sc_news').dialog({
                autoOpen: false,
                minWidth: 800,
                minHeight: 500,
                modal: true,
                show: {delay: 250,effect:'slideDown'}, 
                hide: {delay: 250,effect:'slideUp'}
                
            });
        });

        $('#open_sc_news').click(function(evt) {
            evt.preventDefault();
            $('#sc_news').dialog('open');
        });
        $(document).ready(function(){
            $('#ss_news').dialog({
                autoOpen: false,
                minWidth: 800,
                minHeight: 500,
                modal: true,
                show: {delay: 250,effect:'slideDown'}, 
                hide: {delay: 250,effect:'slideUp'}
                
            });
        });

        $('#open_ss_news').click(function(evt) {
            evt.preventDefault();
            $('#ss_news').dialog('open');
        });
        $(document).ready(function(){
            $('#el_news').dialog({
                autoOpen: false,
                minWidth: 800,
                minHeight: 500,
                modal: true,
                show: {delay: 250,effect:'slideDown'}, 
                hide: {delay: 250,effect:'slideUp'}
                
            });
        });

        $('#open_el_news').click(function(evt) {
            evt.preventDefault();
            $('#el_news').dialog('open');
        });

        
	</script>



    	</div>

    	<div class="main_content_down">
    		<div class="main_content_down_left">
    			<div class="main_content_down_left_container">
    				<div class="main_content_down_left_container_block">
    					<p style="text-align:center; font-size:18px; margin-top:13px; font-family: Microsoft JhengHei;">
    						其他最新消息
    					</p>
    					<!-- // another way
    					<p style="text-align:center; line-height:335px; font-family: Microsoft JhengHei;">
    						more
    					</p> -->
    					<div class="main_content_down_left_container_block_blockOfNews">
    					<div style="overflow-x:hidden;overflow-y:auto;height:165px;">
    						<table class="table">		  	
				  				<c:forEach items="${newsOtherList}" var="news" begin="0" end="4" step="1">
					  				<tr>
					  					<td style="width:30%;"><font size=1>${news.createDate}</font></td>
					  					<td><a href="${news.content}">${news.title}</a></td>
					  				</tr>
				  				</c:forEach>
							</table>
						</div>
    					</div>
    					<a id="open_other_news" class="main_content_down_left_container_block_blockOfMore" style="text-align:center; font-family: Microsoft JhengHei;" href="#">
    						more
    					</a>
                        <div id="other_news" title="其他最新消息" >
                           <div style="overflow-x:hidden;overflow-y:auto;height:400px;">
    						<table class="table">		  	
				  				<c:forEach items="${newsOtherList}" var="news" begin="0" step="1">
					  				<tr>
					  					<td style="width:30%;"><font size=1>${news.createDate}</font></td>
					  					<td><a href="${news.content}">${news.title}</a></td>
					  				</tr>
				  				</c:forEach>
							</table>
						</div>
                            </div>
    					
    				</div>
    			</div>
    		</div>

            <script>
            //more視窗
                $(document).ready(function(){
                $('#other_news').dialog({
                    autoOpen: false,
                    minWidth: 800,
                    minHeight: 500,
                    modal: true,
                    show: {delay: 250,effect:'slideDown'}, 
                    hide: {delay: 250,effect:'slideUp'}
                
                    });
                });

                $('#open_other_news').click(function(evt) {
                    evt.preventDefault();
                $('#other_news').dialog('open');
                });
            </script>

    		<div class="main_content_down_right">
    			<div class="main_content_down_right_container">
    				<div class="main_content_down_right_container_block">
    					<div  onclick="location.href=
'http://www.ceec.edu.tw/book/test/ind.htm';"><div class="main_content_down_right_container_block_top">
    						<font  style="padding-left:60px;" class="main_content_down_right_container_block_link_setting">
    							興趣量表
    						</font>
							
    					</div>
                        </div><!--onclick-->

    					<div  onclick="location.href=
'http://www.ceec.edu.tw/book/test/col2011.htm';"><span class="main_content_down_right_container_block_mid">
    						<font  style="padding-left:45px;" class="main_content_down_right_container_block_link_setting" href="">
    							學系探索量表
    						</font>
    					</span></div><!--onclick-->

    					<div  onclick="location.href=
'http://www.ceec.edu.tw/book/test/tend.htm';"><div class="main_content_down_right_container_block_down">
    						<font  style="padding-left:45px;" class="main_content_down_right_container_block_link_setting" href="">
    							學業性向測驗
    						</font>
    					</div></div><!--onclick-->
    				</div>
    			</div>
    		</div>
    	</div> 
    </div>

</div>
<%@include  file="SystemFooter.jspf" %>
</body>
</html>