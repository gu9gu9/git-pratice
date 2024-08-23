<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<%@ include file="/WEB-INF/views/common/top.jsp" %>

<div class="card">
   <div class="card-header">Home</div>
   <div class="card-body">
      <img src="${pageContext.request.contextPath}/resources/image/photos/photo1.jpg" height="100" /> 
      <img src="resources/image/photos/photo2.jpg" height="100" />
   </div>
</div>


<jsp:include page="/WEB-INF/views/common/bottom.jsp"/>