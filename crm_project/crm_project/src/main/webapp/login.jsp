
<html>
    <head>

    </head>

    <body>
<%--
        Action : link muốn gọi đến
        Method : Phương thức muốn gọi là phương thức nào [GET, POST]
        Thuộc tính name : là tên tham số truyền tới link khai báo ở thuộc tính action
        của thẻ form.
--%>
        <form action="http://localhost:8080/login" method="get">
            <input type="text" name="username" placeholder="User name" />
            <input type="text" name="password" placeholder="Password" />
            <button>Login</button>
        </form>
    </body>
</html>