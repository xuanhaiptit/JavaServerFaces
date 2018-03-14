<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<f:view >
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<head>
<%--  <h:outputStylesheet library="css" name="css/table-style.css" />   --%>
<!-- 	<link href="../table-style.css" rel="stylesheet" type="text/css"/> -->
	<link href="<c:url value="/view/css/table-style.css" />" rel="stylesheet">
	</head>
	<body>
		<h1>JSF 2.0 + Spring + Hibernate Example 10</h1>

		<h2>Login</h2>
 		<h:form>
 			<h:panelGrid columns="3">
				UserName : 
				<h:inputText id="userName" value="#{customer.name}" 
					size="20" required="true"
					label="userName" >
				</h:inputText>
					
				<h:message for="userName" style="color:red" />
			
				PassWord : 
				<h:inputText id="passWord" value="#{customer.name}" 
					size="20" required="true"
					label="passWord" >
				</h:inputText>
					
				<h:message for="passWord" style="color:red" />
				
			</h:panelGrid>
			<h:commandButton action="#{customer.addCustomer()}" value="index"></h:commandButton>

 		</h:form>
	</body>
</f:view>
