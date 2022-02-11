<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>과제</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value='/css/board.css'/>" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="<c:url value='/js/board.js'/>"></script>
<script src="<c:url value='/js/jquery-3.6.0.min.js'/>"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.css">
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.js"></script>
<style>
.fakeimg {
  height: 200px;
  background: #aaa;
}
.subReply {
    padding-left: 50px;
}
</style>
<script type="text/javascript">
function deleteCheck(){
	var answer = confirm("선택한 게시글을 삭제하시겠습니까?");
	if(answer == true){
		location.href="/board/deleteboard/${idx}";
	}
}
</script>

<script>

function drawReply(replys) {
	$("#cnt").text("등록된 댓글 - " + replys.length)
	var html = '';
	html += '<h4>댓글 작성</h4><form class="form-inline" action="writeReply" method="post"><input type="hidden" name="idx" value = "' + IDX + '"><input type="hidden" name="replyIdx" value = "0"><input type="text" class="form-control mb-2 mr-sm-2" id="contents" placeholder="답글" name="contents"><button type="submit" >등록</button></form>';
	html += '<hr>'
	replys.forEach(function(reply){ 
		if (reply.replyIdx == 0) {
			var rc = 0;
			replys.forEach(function(i){
				if (reply.idx == i.replyIdx) rc++;
			})
			html += '<div class="row"><div class="col-sm-12">';
			html += '<form class="form-inline" action="writeReply" method="post"><label for="pwd" class="mr-sm-2">' + reply.contents + '(' + rc + ')' + '</label>';
			html += '<input type="hidden" name="idx" value = "' + IDX + '"><input type="hidden" name="replyIdx" value = "' + reply.idx + '"><input type="text" class="form-control mb-2 mr-sm-2" id="contents" placeholder="답글" name="contents"><button type="submit">등록</button></form>';
			html += '<div class="row"><div class="col-sm-12 sub' + reply.idx + '"></div></div></div></div>';
		}
	})
	$("#replyArea").append(html);
	replys.forEach(function(reply){ 
		if (reply.replyIdx != 0) {
			var rc = 0;
			replys.forEach(function(i){
				if (reply.idx == i.replyIdx) rc++;
			})
			var subHtml = '';
			subHtml = '<div class="row"><div class="col-sm-12 subReply">';
			subHtml += '<form class="form-inline" action="writeReply" method="post"><label for="pwd" class="mr-sm-2">↳' + reply.contents + '(' + rc + ')'  +'</label>'
			subHtml += '<input type="hidden" name="idx" value = "' + IDX + '"><input type="hidden" name="replyIdx" value = "' + reply.idx + '"><input type="text"class="form-control mb-2 mr-sm-2" id="contents" id="contents" placeholder="답글" name="contents"><button type="submit" >등록</button></form>';
			subHtml += '<div class="row"><div class="col-sm-12 sub' + reply.idx + '"></div></div></div></div>';
			$(".sub" + reply.replyIdx).append(subHtml);
		}
	})
}


 var IDX = getQueryStringObject().idx;
 function getQueryStringObject() {
    var a = window.location.search.substr(1).split('&');
    if (a == "") return {};
    var b = {};
    for (var i = 0; i < a.length; ++i) {
        var p = a[i].split('=', 2);
        if (p.length == 1)
            b[p[0]] = "";
        else
            b[p[0]] = decodeURIComponent(p[1].replace(/\+/g, " "));
    }
    return b;
}

  $.ajax({url: "boardView?idx="+IDX, success: function(result){
	  $("#image").append('<img src="/resources/static/images/'+ result.image + '" style="width: 100%;"  >');
	  $("#title").text(result.title);
	  $("#memID").text(result.memID)
	  $("#contents").text(result.contents);
   }});

  $.ajax({url: "replyList?idx="+IDX, success: function(replys){
	  drawReply(replys)
   }});
  
  </script>
</head>
<body>
<span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; 메뉴</span>
<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="/board">공연 요청</a>
  <a href="/write">Services</a>

</div>

<div class="boardcontainer">
	<div class="row">
		<div class="col-sm-12">
	     <h2 id = "title" ></h2><a href="javascript:deleteCheck();">게시글 삭제</a>
	      <hr>
		</div>
	</div> 
	<div class="row">
		<div class="col-sm-6">
			<div class="row">
				<hr>
				<div class="col-sm-12">
			      <h4 id = "contents"></h4>
				</div>
				<br>
				<br>
			</div>
		</div>
		<div class="col-sm-6">
	      <div><img id="image" onerror="this.parentNode.style.display='none'"></div>
		</div>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div class="row">
		<div class="col-sm-12">
	      <h2 id = "cnt"></h2>
	      <hr>
	      <br>
	      <div id = "replyArea"></div>
		</div>
	</div>
</div>
</body>
</html>
