<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SLOGAN ADD</title>

</head>

<body>

	<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
	
	<form:form role="form" modelAttribute="slogan" method="post" action="${contextPath}/slogan/saveView">
		<form:hidden path="sloganId"/>
		<div class="box-body">
			<div class="form-group">
				<label for="sloganName">Slogan Ekle</label>
					<input type="text" class="form-control" id="sloganName" name="sloganName" value="${slogan.sloganName}" placeholder="Slogan Name">
			</div>
		</div>
		
		<div class="box-footer">
			<button type="submit" class="btn btn-primary">Kaydet</button>
		</div>
	</form:form>
	
</body>

</html>
