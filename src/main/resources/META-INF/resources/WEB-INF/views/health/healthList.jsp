<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
  <div class="row">
    <c:forEach var="dto" items="${healthList}">
	    <div class="col border border-dark m-4 w-80">
	      <a href="healthRetrieve?ponum=${dto.ponum}"> 
			<img src="images/items/${dto.image}.png" width="200">
		  </a>
		   <div class="mt-4 fs-6">${dto.poname}</div>
	       <div class="mt-4 fs-6">${dto.price}</div>
	       <div class="mt-2 fs-6">${dto.period}</div>
	       <div class="mt-2 fs-6">${dto.pt_count}</div>
	    </div>
    </c:forEach>
  </div>
</div>