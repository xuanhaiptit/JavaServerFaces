<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insurance Card Management</title>
    <head>
<link href="<c:url value="/view/css/style.css" />" rel="stylesheet">
    </head>
    <body>
        <h:form>
            <p></p>
            <center>
                <table class="tbl_input" cellpadding="4" cellspacing="0" width="400px" border="0">
                    <c:forEach var="item" items="${login.messageErro}">
                        <tr>
                            <td class="errMsg" colspan="2"><c:out value="${item}" /></td>
                        </tr>
                    </c:forEach>
                    <tr>
                        <th colspan="2" align="center">Login to the Manage insurance</th>
                    </tr>
                    <tr align="left">
                        <td class="lbl_left">UserName</td>

                        <td align="center"><h:inputText id="userName" value="#{login.userName}" size="20"
                                ></h:inputText></td>
                    </tr>
                    <tr>
                        <td class="lbl_left">PassWord</td>
                        <td align="center"><h:inputSecret  id="passWord" value="#{login.passWord}" size="20"
                                ></h:inputSecret></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><h:commandButton action="#{login.actionLogin()}" value="Login"></h:commandButton></td>
                    </tr>
                </table>
            </center>

        </h:form>
    </body>
</f:view>
