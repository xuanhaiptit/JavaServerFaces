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

		<h:dataTable value="#{customer.getCustomerList()}" var="c"
			styleClass="order-table" headerClass="order-table-header"
			rowClasses="order-table-odd-row,order-table-even-row">

			<h:column>
				<f:facet name="header">
    				Customer ID
    			</f:facet>
				<h:outputText value="#{c.customerId}" />
			</h:column>

			<h:column>
				<f:facet name="header">
    				Name
				</f:facet>
				<h:outputText value="#{c.name}" />

			</h:column>

			<h:column>
				<f:facet name="header">
    				Address
				</f:facet>
				<h:outputText value="#{c.address}" />
			</h:column>

			<h:column>
				<f:facet name="header">
    				Created Date
				</f:facet>
				<h:outputText value="#{c.createdDate}" />
			</h:column>
		</h:dataTable>
		<h2>Add New Customer</h2>
 		<h:form>
 			
 			<h:panelGrid columns="3">
			
				Name : 
				<h:inputText id="name" value="#{customer.name}" 
					size="20" required="true"
					label="Name" >
				</h:inputText>
					
				<h:message for="name" style="color:red" />
			
				Address : 
				<h:inputTextarea id="address" value="#{customer.address}" 
					cols="30" rows="10" required="true"
					label="Address" >
				</h:inputTextarea>
					
				<h:message for="address" style="color:red" />
				
			</h:panelGrid>
			<h:commandButton action="#{customer.addCustomer()}" value="index"></h:commandButton>
<%-- 			<h:commandButton value="Submit" action="#{customer.addCustomer()}" /> --%>

 		</h:form>
	</body>
</f:view>
