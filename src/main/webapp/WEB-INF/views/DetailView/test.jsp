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
	    <link rel="stylesheet" href="<c:url value='/css/owl.carousel.min.css'/>" type="text/css">
	    <link rel="stylesheet" href="<c:url value='/css/style.css'/>" type="text/css">
	    
	    <script src="<c:url value='/js/jquery-3.6.0.min.js'/>"></script>
	    <script src="<c:url value='/js/tabmenuTEST.js'/>"></script>
	    
	</head>
	<body>
	<section class="product-details spad">
      <div class="container">
          <div class="row">
              <div class="col-lg-6 col-md-6">
                  <div class="product__details__pic">
                      <div class="product__details__pic__item">
                          <img class="product__details__pic__item--large"
                              src="img/product/details/product-details-1.jpg" alt="">
                      </div>
                     
                  </div>
              </div>
              <div class="col-lg-6 col-md-6">
                  <div class="product__details__text">
                      <h3>뮤지컬 지킬앤하이드 [Jekyll & Hyde]</h3>
                      <div class="product__details__rating">
<!--                           <i class="fa fa-star"></i>
                          <i class="fa fa-star"></i>
                          <i class="fa fa-star"></i>
                          <i class="fa fa-star"></i>
                          <i class="fa fa-star-half-o"></i> -->
                          <span>#라이선스 #소설기반 #스릴넘치는</span>
                      </div>
                      <!-- <div class="product__details__price">가격</div> -->
                      <p>지금 이 순간, 단 하나의 선택!</p>
<!--                       <div class="product__details__quantity">
                          <div class="quantity">
                              <div class="pro-qty">
                                  <input type="text" value="1">
                              </div>
                          </div>
                      </div> -->
                      <a href="#" class="primary-btn">찜하기</a>
                      <!-- <a href="#" class="heart-icon"><span class="icon_heart_alt"></span></a> -->
                      <ul>
                          <li><b>출연</b> <span>류정한 홍광호 신성록 박은태 카이 전동석</span></li>
                          <li><b>관람시간</b> <span>170분 <samp>인터미션 20분</samp></span></li>
                          <li><b>등급</b> <span>14세 이상</span></li>
                          <li><b>작품설명</b>
                              <div class="share">
                                  <span>~~~~~~~~~~~</span>
                              </div>
                          </li>
                      </ul>
                  </div>
              </div>
              <div class="col-lg-12">
                  <div class="product__details__tab">
                      <ul id="tab_menu" class="nav nav-tabs" role="tablist">
                          <li class="nav-item">
                              <a class="nav-link" data-toggle="tab" href="#tabs-1" role="tab"
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
                          <div class="tab-pane" id="tabs-1" role="tabpanel" style="display: block;">
                              <div class="product__details__tab__desc">
                                  <h6>Products Infomation</h6>
                                  <p>출연진</p>
                                  <p>지킬/하이드 : 류정한 ~~~#</p>
                              </div>
                          </div>
                          <div class="tab-pane" id="tabs-2" role="tabpanel">
                              <div class="product__details__tab__desc">
                                  <h6>Products Infomation</h6>
                                  <p>공지사항</p>
                                  <p>사진첨부</p>
                              </div>
                          </div>
                          <div class="tab-pane" id="tabs-3" role="tabpanel">
                              <div class="product__details__tab__desc">
                                  <h6>리뷰</h6>
                                  <p>~~~~</p>
                              </div>
                          </div>
                      </div>
                  </div>
              </div>
          </div>
      </div>
      </section>
	</body>
</html>