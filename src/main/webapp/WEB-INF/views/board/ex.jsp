<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--[if lte IE 9]>     <html class="no-js ie"> <![endif]-->
<!--[if gt IE 9]><!--> <html class="no-js"> <!--<![endif]-->
<head>
  <meta name="viewport" content="width=device-width,initial-scale=1, maximum-scale=1, user-scalable=no">
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title ng-bind="'page_title' | translate"></title>
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width">
  <meta name="robots" content="noindex, nofollow">
  <!--  -->
    <link type="image/png" href="//www.wix.com/favicon.ico" rel="shortcut icon">
  <!--  -->
  <link href="//static.parastorage.com/services/third-party/fonts/Helvetica/fontFace.css" rel="stylesheet" type="text/css" />
  <!--  -->
  <link rel="stylesheet" href="//static.parastorage.com/services/wix-public/1.299.0/styles/error-pages/styles.css">
  <!--  -->
</head>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.css">
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.js"></script>

<link href="<c:url value='/css/board1.css'/>" rel="stylesheet"
	type="text/css">
<link href="//static.parastorage.com/services/third-party/fonts/Helvetica/fontFace.css" rel="stylesheet" type="text/css" />
  <!--  -->
  <link rel="stylesheet" href="//static.parastorage.com/services/wix-public/1.299.0/styles/error-pages/styles.css">

<body lang="ko" ng-controller="ErrorPageController as errorPageCtrl" class="error-page-app" ng-class="{'secondary-background': isSecondaryBackground}">
<main id="PAGES_CONTAINER" tabindex="-1">
	<div id="SITE_PAGES">
		<div id="TRANSITION_GROUP" class="_2YGAo">
			<div id="wge3h" class="Ry26q">
				<div class="_3CemL"></div>
				<div class="_3K7uv">
				<div id="Containerwge3h" class="_1KV2M">
				<div data-mesh-id="Containerwge3hinlineContent" data-testid="inline-content" class="">
				<div data-mesh-id="Containerwge3hinlineContent-gridContainer" data-testid="mesh-container-content">
				<section id="comp-l08xlb0j" class="_3d64y">
				<div id="bgLayers_comp-l08xlb0j" data-hook="bgLayers" class="_3wnIc"><div data-testid="colorUnderlay" class="_3KzuS _3SQN-">
				</div><div id="bgMedia_comp-l08xlb0j" class="_2GUhU"></div></div><div data-testid="columns" class="_1uldx"><div id="comp-l08xlb0m" class="_1vNJf"><div id="bgLayers_comp-l08xlb0m" data-hook="bgLayers" class="_3wnIc"><div data-testid="colorUnderlay" class="_3KzuS _3SQN-"></div><div id="bgMedia_comp-l08xlb0m" class="_2GUhU"></div></div><div data-mesh-id="comp-l08xlb0minlineContent" data-testid="inline-content" class=""><div data-mesh-id="comp-l08xlb0minlineContent-gridContainer" data-testid="mesh-container-content"><div id="comp-l08xlb0p" class="_2Hij5" data-testid="richTextElement"><h2 class="font_3" style="font-size:30px; line-height:normal"><span style="letter-spacing:normal"><span style="font-size:30px">공연 요청</span></span></h2></div><div id="comp-l08xlb0v"><table id="example" class="display" style="width: 100%">
					<thead>
						<tr>
							<th>게시글 번호</th><th>작성자</th><th>제목</th><th>내 용</th><th>조회 수</th><th>작성일</th><th>삭제</th>
						</tr>
					</thead>
					<tbody id="listArea">
					</tbody>
				</table>
				</div></div></div></div></div></section></div></div></div></div></div></div></div></main>
				</body>
				<script type="text/javascript">
	$(document).ready(
			function() {
				$("#writeBtn").click(function() {
					location.href = "write4";
				})
				$.ajax({
					url : "boardList4",
					success : function(result) {
						var html = "";
						result.forEach(function(item) {
							html += "<tr> <td>"+item.idx+"</td><td>"+item.memId+"</td><td><a style='text-decoration:none;' href = 'view4?idx=" + item.idx
									+ "'>" + item.title + "</a></td><td>"+item.contents+"</td><td>"+item.hits+"</td><td>"+item.writedate+"</td><td><a href='/board/deleteboard4/"+item.idx+"' style='text-decoration:none;'>&#10060;</a></td>"
						})
						$("#listArea").append(html)
						$('#example').DataTable();
					}
				});
				$("#deleteBtn").click(function() {
					location.href = "write4";
				})
			});

</script>
<script src="//static.parastorage.com/services/third-party/jquery/2.0.3/jquery.min.js"></script>
<!--<![endif]-->

<script src="//static.parastorage.com/services/third-party/angularjs/1.2.28/angular.min.js"></script>
  <!--  -->
<script src="//static.parastorage.com/services/third-party/angularjs/1.2.28/i18n/angular-locale_ko.js"></script>
<script src="//static.parastorage.com/services/third-party/angular-translate/1.1.1/angular-translate.min.js"></script>

<script src="//static.parastorage.com/services/wix-public/1.299.0/scripts/error-pages/locale/messages_ko.js"></script>
  <!--  -->
<script src="//static.parastorage.com/services/wix-public/1.299.0/scripts/error-pages/app.js"></script>
</html>
