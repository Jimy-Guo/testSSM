<%@ page contentType="text/html;charset=GBK"  language="java" %>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!111</h2>
<div align="center">
<form action="selsct">
	<input type="text" name="id" />
	<input type="submit" name="��ѯ"  />
</form>
<table border="1px" style="color: gold" align="center" >
    <tbody>
    <tr>
        <th>���</th>
        <th>����</th>
        <th>����</th>
        <th>�Ա�</th>
        <th>��ַ</th>
        <th>����</th>
    </tr>
    <%--���������ȡÿ��Ԫ�ز���ӡ--%>
    <%--varStatus�൱�ڱ�����i--%>
    <c:forEach items="${elist}" var="employee" >
        <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.age}</td>
            <td>${employee.sex}</td>
            <td>${employee.address}</td>
            <td colspan="2"><a href="/">�޸�</a> | <a href="delete">ɾ��</a></td>
        </tr>
    </c:forEach>
    <tr>
	    <td colspan="7">
	    	<a href="addpage">���</a>
	    </td>
    </tr>
    </tbody>
</table>
</div>
</body>
</html>
