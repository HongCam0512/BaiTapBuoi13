<%@ page import="model.User" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
<%--
    <%  %> : Xử lý logic code
    <%= %> : Xuất giá trị java ra màn hình giao diện
    <%! %> : Khai báo biến
--%>
</head>
<body>
    <%! int count = 0; %>
    <% String hello = "Hello JSP"; %>
<%--    <% User user = (User) request.getAttribute("user"); %>--%>
    <%
        List<User> userList = (List<User>) request.getAttribute("users");
    %>
<%--    This is Detail Page. <%= request.getAttribute("username") %> <br />--%>
   Expression Language ${username}
   <%= hello %> count : <%= count %>
<%--    Hello : <%= user.getFullname() %>--%>

    <%
        for (User user: userList) {
    %>

<%--        Dòng này sẽ chạy trong vòng lặp--%>
        <b>Hello <%= user.getFullname() %></b>
    <% } %>

</body>
</html>
