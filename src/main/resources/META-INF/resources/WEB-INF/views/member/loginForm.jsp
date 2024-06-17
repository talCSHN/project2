<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jQuery 설치 -->
<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">
	
	$(document).ready(function(){
	
		// 회원가입 서브밋
		$("form").on("submit", function(){
			alert("login submit");
			this.action="login";  //LoginServlet의 맵핑값
			this.method="post";
		});
		
	});// ready()

</script>

<div class="container">
    <form class="row g-3 m-4">
    <div class="row mb-3">
    	<div>${errorMessage}</div>
		  </div>
		  <div class="row mb-3">
		    <label for="name" class="col-sm-2 col-form-label">이름</label>
		    <div class="col-auto">
		      <input type="text" class="form-control" id="name" name="name">
		    </div>
		  </div>
		 <div class="row mb-3">
		    <label for="access_pw" class="col-sm-2 col-form-label">출입비밀번호</label>
		    <div class="col-auto">
		      <input type="password" class="form-control" name="access_pw" id="access_pw">
		    </div>
		  </div>
		  <div class="col-12">
		    <button type="submit" class="btn btn-primary">로그인</button>
		    <button type="reset" class="btn btn-primary">취소</button>
		  </div>
 </form>
</div> 
