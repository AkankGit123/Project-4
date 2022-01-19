<%@page import="in.co.sunrays.proj4.controller.CollegeCtl"%>
<%@page import="in.co.sunrays.proj4.util.ServletUtility"%>
<%@page import="in.co.sunrays.proj4.util.DataUtility"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="icon" type="image/png"
	href="<%=ORSView.APP_CONTEXT%>/img/logo.png" sizes="16*16" />
<title>College Registration Page</title>
</head>
<body>
	<form action="CollegeCtl" method="post">
		<%@include file="Header.jsp"%>
		<jsp:useBean id="bean" class="in.co.sunrays.proj4.bean.CollegeBean"
			scope="request"></jsp:useBean>
		<center>
			<h1>
				<%
					if (bean != null && bean.getId() > 0) {
				%>
				Update College
				<%
					} else {
				%>
				Add College
				<%
					}
				%>
			</h1>

			<h2>
				<font color="green"><%=ServletUtility.getSuccessMessage(request)%></font>
			</h2>
			<h2>
				<font color="red"><%=ServletUtility.getErrorMessage(request)%></font>
			</h2>

			<input type="hidden" name="id" value="<%=bean.getId()%>"> <input
				type="hidden" name="createdBy" value="<%=bean.getCreatedBy()%>">
			<input type="hidden" name="modifiedBy"
				value="<%=bean.getModifiedBy()%>"> <input type="hidden"
				name="createdDatetime"
				value="<%=DataUtility.getTimestamp(bean.getCreatedDatetime())%>">
			<input type="hidden" name="modifiedDatetime"
				value="<%=DataUtility.getTimestamp(bean.getModifiedDatetime())%>">

			<table>
				<tr>
					<th align="left">Name<span style="color: red">*</span></th>
					<td><input type="text" name="name" placeholder="Enter Name"
						value="<%=DataUtility.getStringData(bean.getName())%>"></td>
					<td style="position: fixed;"><font color="red"><%=ServletUtility.getErrorMessage("name", request)%></font></td>
				</tr>
				<tr>
					<th align="left">Address<span style="color: red">*</span></th>
					<td><input type="text" name="address"
						placeholder="Enter Address"
						value="<%=DataUtility.getStringData(bean.getAddress())%>"></td>
					<td style="position: fixed;"><font color="red"><%=ServletUtility.getErrorMessage("address", request)%>
					</font></td>
				</tr>
				<tr>
					<th align="left">State<span style="color: red">*</span></th>
					<td><input type="text" name="state" placeholder="Enter State"
						value="<%=DataUtility.getStringData(bean.getState())%>"></td>
					<td style="position: fixed;"><font color="red"><%=ServletUtility.getErrorMessage("state", request)%></font></td>
				</tr>
				<tr>
					<th align="left">City<span style="color: red">*</span></th>
					<td><input type="text" name="city" placeholder="Enter City"
						value="<%=DataUtility.getStringData(bean.getCity())%>"></td>
					<td style="position: fixed;"><font color="red"><%=ServletUtility.getErrorMessage("city", request)%></font></td>
				</tr>

				<tr>
					<th align="left">Phone No <span style="color: red">*</span></th>
					<td><input type="text" name="mobileno" value="<%=DataUtility.getStringData(bean.getPhoneno())%>"
						placeholder="Enter PhoneNo" maxlength="10" ></td>
					<td style="position: fixed;"><font color="red"> <%=ServletUtility.getErrorMessage("mobileno", request)%></font></td>
				</tr>

				<th></th>


			</table>

			<%
				if (bean.getId() > 0) {
			%>
			<input type="submit" value="<%=CollegeCtl.OP_UPDATE%>"
				name="operation">&emsp; <input type="submit"
				value="<%=CollegeCtl.OP_CANCEL%>" name="operation">
			<%
				} else {
			%>
			<input type="submit" value="<%=CollegeCtl.OP_SAVE%>" name="operation">&emsp;
			<input type="submit" value="<%=CollegeCtl.OP_RESET%>"
				name="operation">
			<%} %>


		</center>
	</form>
	<%@include file="Footer.jsp"%>
</body>
</html>