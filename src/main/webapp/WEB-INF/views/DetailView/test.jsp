<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>test view</title>
		
		<!-- Google Font -->
	    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">
		
		
	    <!-- Css Styles -->
	    <link rel="stylesheet" href="<c:url value='/css/bootstrap.min.css'/>" type="text/css">
	    <link rel="stylesheet" href="<c:url value='/css/jquery-ui.min.css'/>" type="text/css">
	    <link rel="stylesheet" href="<c:url value='/css/style.css'/>" type="text/css">
	    
	    <script src="<c:url value='/js/jquery-3.6.0.min.js'/>"></script>
	    <%-- <script src="<c:url value='/js/tabmenuTEST.js'/>"></script> --%>
	    <script src="<c:url value='/js/bootstrap.min.js'/>"></script>
	    <script src="<c:url value='/js/jquery-ui.min.js'/>"></script>
	    
	    <script type="text/javascript">
			// 새로운 창을 만들어서 열기
			// 새로운 창에 문자열과 버튼 출력 /버튼 클릭 시 창 닫는 기능 포함
			
			
			
			
			function openWindow(){
				window.open("https://youtu.be/EH8gPlK6Tss", "youtube-link", 
									  "width=520, height=570, left=400, top=50, status=no, scrollbars=no, resizable=no");
			}
		</script>
	    
	    
	    
	</head>
	<body>
	
	<!-- TOP -->
    <jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>
	
	<section class="product-details spad">
      <div class="container">
      	<!-- <div class="col-lg-6"> -->
	       	<div class="product__details__text">
	               <h3>${musicalData.muscName} </h3>
	               <span>${musicalData.muscHashtag} </span>
	         <div class="product__details__date">${musicalData.muscStartDate} ~ ${musicalData.muscEndDate} | <a href="${musicalData.muscPlaceLink}" target="_blank">${musicalData.muscPlace}</a></div>
	         </div>
         <!-- </div> -->
          <div class="row">
              <div class="col-lg-6">

                  <div class="product__details__pic">
                      <div class="product__details__pic__item">
                          <img class="product__details__pic__item--large"
                              src="<c:url value='/images/jekyll.jpg'/>" alt="" onClick="openWindow()">
                      </div>
                     
                  </div>
              </div>
              <div class="col-lg-6">
              	<div class="product__details__text">
<!--                   <div class="product__details__text">
                          <span>#라이선스 #소설기반 #스릴넘치는</span>
                      </div> 
                      <div class="product__details__date">2021.10.19 ~ 2022.05.28</div> -->
                      <br><br><br>
                      <p>${musicalData.muscQuote}</p>
                      <a href="#" class="primary-btn">좋아요</a>
                      <ul>
                          <li><b>출연</b> <span>류정한 홍광호 신성록 박은태 카이 전동석</span></li>
                          <li><b>관람시간</b> <span>${musicalData.muscReqTime}분	<samp>인터미션 20분</samp></span></li>
                          <li><b>등급</b> <span>14세 이상</span></li>
                          <li><b>작품설명</b>
                              <div class="share">
                                  <span>${musicalData.muscSynop}</span>
                              </div>
                          </li>
                      </ul>
                  </div>
              </div>
              <div class="col-lg-12">
                  <div class="product__details__tab">
                      <ul class="nav nav-tabs" role="tablist">
                          <li class="nav-item">
                              <a class="nav-link active" data-toggle="tab" href="#tabs-1" role="tab"
                                  aria-selected="true">Casting</a>
                          </li>
                          <li class="nav-item">
                              <a class="nav-link" data-toggle="tab" href="#tabs-2" role="tab"
                                  aria-selected="false">Information</a>
                          </li>
                          <li class="nav-item">
                              <a class="nav-link" data-toggle="tab" href="#tabs-3" role="tab"
                                  aria-selected="false">Reviews</a>
                          </li>
                      </ul>
                      <div class="tab-content">
                          <div class="tab-pane active" id="tabs-1" role="tabpanel">
                              <div class="product__details__tab__desc" style="display: block;">
                                  <h6>출연진</h6>
                                  <p>지킬/하이드</p>
                                  <p>류정한 홍광호 신성록 박은태 카이 전동석</p>
                              </div>
                          </div>
                          <div class="tab-pane" id="tabs-2" role="tabpanel">
                              <div class="product__details__tab__desc">
                                  <h6>공지사항</h6>
                                  <p>사진첨부</p>
                                  <img class="jekyll_img" src="<c:url value='/images/jekyll_info.jpg'/>" alt="">
                                  <br>
                                  <img class="jekyll_img" src="<c:url value='/images/jekyll_notice.jpg'/>" alt="">
                              </div>
                          </div>
                          <div class="tab-pane" id="tabs-3" role="tabpanel">
                              <div class="product__details__tab__desc">
                                  <h6>리뷰</h6>
                                  <p>회원이 적어준 리뷰입니다.</p>
                                  <hr>
									<div class="border-bottom p-3" style="background-color: rgba(255, 255, 255, 0.1); border-color: darkslategray !important;">
									<div>
									  <div class="d-inline-block" style="h6">
									     ★★★★☆
									  </div>
									  <div class="d-inline-block custom-break-word"> km</div>
									</div>
									 <hr>
									 <pre class="custom-break-word">굳굳</pre>
									</div>
									
									<div class="border-bottom p-3" style="background-color: rgba(255, 255, 255, 0.1); border-color: darkslategray !important;">
									<div>
									  <div class="d-inline-block" style="h6">
									     ★★★★☆
									  </div>
									  <div class="d-inline-block custom-break-word"> Choi</div>
									</div>
									 <hr>
									 <pre class="custom-break-word">정말 멋있어요</pre>
									</div>
                              </div>
                          </div>
                          
                      </div><!-- tab-content  -->
                  </div><!-- product__details__tab -->
                  
              </div><!-- col-lg-12 -->
          </div><!-- row -->
      </div><!-- container -->
      </section>
    
    <br><br><br><br><br>  
    <!-- BOTTOM -->
	<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
      
	</body>
</html>