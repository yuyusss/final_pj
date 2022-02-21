<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html xmlns='http://www.w3.org/1999/xhtml'>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	<link href="<c:url value='/css/rank.css'/>" rel="stylesheet"
	type="text/css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js" type="text/javascript"></script>
	<script src="<c:url value='/js/rank.js'/>"></script>
	</head>
	<body>
	<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true' />
<h1 style="margin:30px;">뮤지컬 랭킹</h1>
<div id="content">
            <dl id="rank-list">
                <dd>
                    <ol>
                        <li><a href="#">1.</a></li>
                        <li><a href="#">2.</a></li>
                        <li><a href="#">3.</a></li>
                        <li><a href="#">4.</a></li>
                        <li><a href="#">5.</a></li>
                        <li><a href="#">6.</a></li>
                        <li><a href="#">7.</a></li>
                        <li><a href="#">8.</a></li>
                        <li><a href="#">9.</a></li>
                        <li><a href="#">10.</a></li>
                    </ol>
                </dd>
            </dl>
        </div>
      <div>
	<table class="ranktable"  style="margin-bottom:130px;">
	<thead>
	<tr>
	<th>랭킹</th>
	<th>공연명</th>
	<th>공연 일시</th>
	<th>공연장소</th>
	</tr>
	<thead>
	</thead>
	<tbody>
	<tr>
	<td>1위</td>
	<td><a href="#">공연명</a></td>
	<td>공연일시</td>
	<td>공연장소</td>
	</tr>
	<tr>
	<td>2위</td>
	<td><a href="#">공연명</a></td>
	<td>공연일시</td>
	<td>공연장소</td>
	</tr>
	<tr>
	<td>3위</td>
	<td><a href="#">공연명</a></td>
	<td>공연일시</td>
	<td>공연장소</td>
	</tr>
	<tr>
	<td>4위</td>
	<td><a href="#">공연명</a></td>
	<td>공연일시</td>
	<td>공연장소</td>
	</tr>
	<tr>
	<td>5위</td>
	<td><a href="#">공연명</a></td>
	<td>공연일시</td>
	<td>공연장소</td>
	</tr>
	<tr>
	<td>6위</td>
	<td><a href="#">공연명</a></td>
	<td>공연일시</td>
	<td>공연장소</td>
	</tr>
	<tr>
	<td>7위</td>
	<td><a href="#">공연명</a></td>
	<td>공연일시</td>
	<td>공연장소</td>
	</tr>
	<tr>
	<td>8위</td>
	<td><a href="#">공연명</a></td>
	<td>공연일시</td>
	<td>공연장소</td>
	</tr>
	<tr>
	<td>9위</td>
	<td><a href="#">공연명</a></td>
	<td>공연일시</td>
	<td>공연장소</td>
	</tr>
	<tr>
	<td>10위</td>
	<td><a href="#">공연명</a></td>
	<td>공연일시</td>
	<td>공연장소</td>
	</tr>
	</tbody>
		
	</table>
      </div>
     <jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' /> 
      
	</body>
</html>