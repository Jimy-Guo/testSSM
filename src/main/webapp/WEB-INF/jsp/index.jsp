<%@ page contentType="text/html;charset=GBK"  language="java" %>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!111</h2>
<div align="center">
<form action="selsct">
	<input type="text" name="id" />
	<input type="submit" name="查询"  />
</form>
<table border="1px" style="color: gold" align="center" >
    <tbody>
    <tr>
        <th>序号</th>
        <th>名字</th>
        <th>年龄</th>
        <th>性别</th>
        <th>地址</th>
        <th>操作</th>
    </tr>
    <%--遍历结果获取每个元素并打印--%>
    <%--varStatus相当于遍历的i--%>
    <c:forEach items="${elist}" var="employee" >
        <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.age}</td>
            <td>${employee.sex}</td>
            <td>${employee.address}</td>
            <td colspan="2"><a href="/">修改</a> | <a href="delete">删除</a></td>
        </tr>
    </c:forEach>
    <tr>
	    <td colspan="7">
	    	<a href="addpage">添加</a>
	    </td>
    </tr>
    </tbody>
</table>
</div>
</body>
</html>
