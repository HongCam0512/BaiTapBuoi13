package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    //GET : Gõ đường dẫn trên trình duyệt
    //POST : Gọi ngầm bằng code hoặc thẻ form

    @Override             //Request từ dùng     //Response server trả ra cho người dùng
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //phương thức GET sẽ thực thi code ở đây
        System.out.println("Hello Phương Thức Get");
    }
}
