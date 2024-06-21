<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="webjars/jquery/3.7.1/jquery.min.js"></script>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <form class="row g-3 m-4">
		  <div class="row mb-3">
		    <label for="userid" class="col-sm-2 col-form-label">	아이디</label>
		    <div class="col-auto">
		      <input type="text" class="form-control" id="userid" name="userid" 
		       value="${login.userid}"
		       disabled="disabled">
		    </div>
		  </div>
		
		  
		  <div class="row mb-3">
		    <label for="username" class="col-sm-2 col-form-label">이름</label>
		    <div class="col-auto">
		      <input type="text" class="form-control" name="username" 
		      id="ponum"
		       value="${login.username}"
		       disabled="disabled">
		    </div>
		  </div>
		  <div class="row mb-3">
		    <label for="gender" class="col-sm-2 col-form-label">성별</label>
		    <div class="col-auto">
		      <input type="text" class="form-control" name="gender" 
		      id="gender"
		       value="${login.gender}"
		       disabled="disabled">
		    </div>
		  </div>
		  <div class="row mb-3">
		    <label for="height" class="col-sm-2 col-form-label">키</label>
		    <div class="col-auto">
		      <input type="text" class="form-control" name="height" 
		      id="height"
		       value="${login.height}"
		       disabled="disabled">
		    </div>
		  </div>
		  <div class="row mb-3">
		    <label for="weight" class="col-sm-2 col-form-label">몸무게</label>
		    <div class="col-auto">
		      <input type="text" class="form-control" name="weight" 
		      id="weight"
		       value="${login.weight}"
		       disabled="disabled">
		    </div>
		  </div>			  		  		  		  		  
		  <hr>
		  <div class="row mb-3">
		      <div class="col-auto">
			    <label for="sample4_postcode" class="visually-hidden">post</label>
			    <input type="text" name="post" 
			           value="${login.post}"
			           class="form-control" id="sample4_postcode" placeholder="우편번호">
			  </div>
		  </div>
		   <div class="row mb-3">
		      <div class="col-sm-5">
			    <label for="sample4_roadAddress" class="visually-hidden">도로명주소</label>
			    <input type="text"  name="addr1"
			           value="${login.addr1}" 
			     class="form-control" id="sample4_roadAddress" placeholder="도로명주소">
			  </div>
			 <div class="col-sm-5">
			    <label for="sample4_jibunAddress" class="visually-hidden">지번주소</label>
			    <input type="text" name="addr2" 
			           value="${login.addr2}"
			    class="form-control" id="sample4_jibunAddress" placeholder="지번주소">
			    <span id="guide" style="color:#999"></span>
			  </div>
		  </div>
		  <hr>
		  <div class="row mb-3">
		      <label for="phone1" class="col-sm-2 col-form-label">전화번호</label>
		     <div class="col-auto">
		      <select name="phone1" class="form-control" id="phone1">
			      <option value="010" 
					<c:if test="${login.phone1 == '010'}">
						selected					
					</c:if>	
				  >010</option>
	             <option value="011" 
	                <c:if test="${login.phone1 == '011'}">
						selected					
					</c:if>
	             >011</option>
			 </select>
			   </div>	
			<div class="col-auto">
			  <label for="phone2" class="visually-hidden">전화번호2</label>
			  <input type="text" name="phone2" 
			         value="${login.phone2}"
			  class="form-control" id="phone2">
			</div>
			<div class="col-auto">
			  <label for="phone3" class="visually-hidden">전화번호3</label> 
			  <input type="text" name="phone3" 
			         value="${login.phone3}"
			  class="form-control" id="phone3">
			</div>
		  </div>
 </form>
	
</div>