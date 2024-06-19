<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헬스상품 자세히보기</title>
<style type="text/css">
    .App {
	  text-align: center;
	  font-size: 16px;
	}
	
    label, input, button {
    margin: 10px;
    padding: 5px;
    }

	footer {
	    bottom: 0;
	    position: absolute;
	    width: 90%;
	    height: 40px;
	}
 </style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
 <div class="App">
	<jsp:include page="common/top.jsp" flush="true" /><br>
	<jsp:include page="common/menu.jsp" flush="true" /> <!-- flush=true 버퍼에 다 차지 않아도 그때 그때 데이터를 보내줘라 -->
	<hr>												<!-- 큰 데이터가 버퍼에 다 담기지 못해서 데이터가 유실되고 다 담긴다고 해도 순서가 엉망진창 될 수 있기 때문에 flush=true 사용. -->
	<jsp:include page="health/healthRetrieve.jsp" flush="true" />
 </div>
</body>
</html>