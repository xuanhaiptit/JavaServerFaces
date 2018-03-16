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
        <%@ include file="header.jsp"%>
        <h:form id="form">
            <div id="divSearch">
                <p style="margin-left: 30px">List of insurance cards</p>
                <p style="margin-left: 100px">Company name</p>
                <div style="margin-left: 100px" id="divItemCompany">
                    <h:selectOneMenu value="#{MH02Bean.companyInternalId}"
                        valueChangeListener="#{MH02Bean.valueChanged}" onchange="submit()">
                        <f:selectItems value="#{MH02Bean.listItemCompany}" var="c" itemLabel="#{c.companyName}"
                            itemValue="#{c.companyInternalId}" />
                    </h:selectOneMenu>
                </div>
                <div id="divTableSearch">
                    <p style="margin-left: 30px">Search information</p>
                    <table style="margin-left: 30px" class="tbl_input" border="1" cellpadding="10" cellspacing="10"
                        width="400px">
                        <tr>
                            <td>
                                <table style="margin-left: 5px" class="tbl_input" border="0" cellpadding="5"
                                    cellspacing="5">
                                    <tr>
                                        <td>User name</td>
                                        <td align="left"><h:inputText id="userFullName"
                                                value="#{MH02Bean.userFullName}" size="20" /></td>
                                    </tr>
                                    <tr>
                                        <td>Insurance card number</td>
                                        <td align="left" width="80px"><h:inputText id="insuranceNumber"
                                                value="#{MH02Bean.insuranceNumber}" size="20" /></td>
                                    </tr>
                                    <tr>
                                        <td>Register Place</td>
                                        <td align="left" width="80px"><h:inputText id="placeOfRegister"
                                                value="#{MH02Bean.placeOfRegister}" size="20" /></td>
                                    </tr>
                                    <tr>
                                        <td colspan="2" align="center"><h:commandButton
                                                action="#{MH02Bean.doInitMH02()}" value="Search" style="width: 150px" /></td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </div>
                <div id="divExport">
                    <p>
                        <input type="button" style="margin-left: 30px" value="Register"
                            onclick="location.href='AddUserInput.do'" /> <input type="button"
                            style="margin-left: 400px" value="Export CSV" onclick="location.href=''" /> <input
                            type="button" style="margin-left: 5px" value="Export PDF" onclick="location.href=''" />
                    </p>
                </div>
            </div>
        </h:form>
        <h:outputText id="companyInternalId" value="#{MH02Bean.companyInternalId}" />
        <h:outputText id="userFullName" value="#{MH02Bean.userFullName}" />
        <h:outputText id="insuranceNumber" value="#{MH02Bean.insuranceNumber}" />
        <h:outputText id="placeOfRegister" value="#{MH02Bean.placeOfRegister}" />
    </body>
</f:view>


<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link href="view/css/style.css" rel="stylesheet" type="text/css" />
        <title>Insurance Card Management</title>
    </head>
    <body>
        <jsp:include page="header.jsp" />
        <form action="listuser.do?type=search" method="post">
            <div>
                <p style="margin-left: 30px">Danh sách thẻ bảo hiểm</p>
                <p style="margin-left: 100px">Tên công ti</p>
                <select style="margin-left: 100px" name="companyInternalId">
                    <c:forEach var="company" items="${companyList}">
                        <c:choose>
                            <c:when test="${company.companyInternalId == companyInternalId}">
                                <option value="${company.companyInternalId}" selected="selected">${company.companyName}
                                </option>
                            </c:when>
                            <c:otherwise>
                                <option value="${company.companyInternalId}">${company.companyName}</option>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </select>
                <p style="margin-left: 30px">Thông tin tìm kiếm</p>
                <table style="margin-left: 30px" class="tbl_input" border="1" cellpadding="10" cellspacing="10"
                    width="400px">
                    <tr>
                        <td>
                            <table style="margin-left: 5px" class="tbl_input" border="0" cellpadding="5"
                                cellspacing="5">
                                <tr>
                                    <td>Tên người sử dụng</td>
                                    <td align="left">
                                        <input class="txBox" type="text" name="userFullName" size="20"
                                        value="<c:out value="${userFullName}" escapeXml="true"/>" />
                                    </td>
                                </tr>
                                <tr>
                                    <td>Mã số thẻ bảo hiểm</td>
                                    <td align="left" width="80px">
                                        <input class="txBox" type="text" name="insuranceNumber" size="20"
                                        value="<c:out value="${insuranceNumber}" escapeXml="true"/>" />
                                    </td>
                                </tr>
                                <tr>
                                    <td>Nơi đăng ký</td>
                                    <td align="left" width="80px">
                                        <input class="txBox" type="text" name="placeOfRegister" size="20"
                                        value="<c:out value="${placeOfRegister}" escapeXml="true"/>" />
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2" align="center">
                                        <input type="submit" value="Tìm kiếm" style="width: 150px"/>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
                <p>
                    <input type="button" style="margin-left: 30px" value="Đăng kí"
                    onclick="location.href='AddUserInput.do'" />
                    <input type="button" style="margin-left: 400px" value="Export CSV" onclick="location.href=''" />
                    <input type="button" style="margin-left: 5px" value="Export PDF" onclick="location.href=''" />
                </p>
            </div>
        </form>

        <c:choose>
        <c:when test="${listUser.size() == 0}">
            <p>${MSG005}</p>
        </c:when>
        <c:otherwise>
            <table class="tbl_list" border="1" cellpadding="4" cellspacing="0" width="700px">
                <tr>
                    <th>Tên người sử dụng 
                        <c:choose>
                            <c:when test="${sortType==ASC}">
                                ▲<a href="listuser.do?type=sort&&sortType=DESC">▼</a>
                            </c:when>
                            <c:otherwise>
                                <a href="listuser.do?type=sort&&sortType=ASC">▲</a>▼
                            </c:otherwise>
                        </c:choose>
                    </th>
                    <th>Giới tính</th>
                    <th>Ngày sinh</th>
                    <th>Mã số thẻ bảo hiểm</th>
                    <th>Kì hạn</th>
                    <th>Nơi đăng ký KCB</th>
                </tr>
                <c:forEach var="user" items="${listUser}">
                    <tr>
                        <td>
                            <a href="showDetailUser.do?userInternalId=${user.userInternalId}">
                                <c:out value="${user.userFullName}" escapeXml="true" />
                            </a>
                        </td>
                        <td align="center">${user.userSexDivisionFormat}</td>
                        <td align="center">${user.birthdateFormat}</td>
                        <td align="center">${user.insuranceNumber}</td>
                        <td align="center">${user.insuranceStartDateFormat} ~ ${user.insuranceEndDateFormat}</td>
                        <td>${user.placeOfRegister}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:otherwise>
    </c:choose>

    <c:if test="${totalUser > limit}">
        <table>
            <tr>
                <td class="lbl_paging">
                    <c:if test="${startPage > 1}">
                        <a href="listuser.do?type=paging&&currentPage=${currentPage-1}">≪ |</a>
                    </c:if> 
                    <c:forEach var="paging" items="${listPaging}">
                        <c:choose>
                            <c:when test="${currentPage == paging}">
                                <strong>${paging} |</strong>
                            </c:when>
                            <c:otherwise>
                                <a href="listuser.do?type=paging&&currentPage=${paging}">${paging} |</a>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach> 
                    <c:if test="${endPage<totalPage}">
                        <a href="listuser.do?type=paging&&currentPage=${currentPage+1}">≫</a>
                    </c:if>
                </td>
            </tr>
        </table>
    </c:if>
</body>
</html> --%>