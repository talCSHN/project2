<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    ${goodsRetrieve}
    
<!-- jQuery 사용 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">
	
	$(document).ready(function(){
	
		$("#cart").on("click", function(){
			
			alert("장바구니에 저장 되었습니다.")
		});
		
	});// ready()
</script>
${healthRetrieve}
<div class="container">
	<form class="row g-3 m-4">
	  <div class="row">    
		<div class="card" style="width:25rem;">
		  <img src="images/items/${healthRetrieve.image}.png" class="card-img-top" alt="...">
		  <div class="card-body">
		    <h6 class="card-title">
		        <span class="fw-bold">제품코드:</span>  
		        ${healthRetrieve.ponum}</h6>
		    <h6 class="card-text">
		      <span class="fw-bold ">상품명:</span>
		        ${healthRetrieve.poname}</h6>
		    <h6 class="card-text">
		      <span class="fw-bold ">가격:</span>
		        ${healthRetrieve.price}</h6>
		    <h6 class="card-text">
		      <span class="fw-bold ">헬스 기간:</span>
		        ${healthRetrieve.period}</h6>
		    <h6 class="card-text">
		      <span class="fw-bold ">P.T 횟수:</span>
		        ${healthRetrieve.pt_count}</h6>		        		      
		    
		    <a href="#" class="btn btn-primary mt-3">구매</a>
		    <a href="cartAdd" class="btn btn-primary mt-3" id="cart">장바구니</a>
		  </div>
		</div>
	   
	  </div>
	</form>
</div>