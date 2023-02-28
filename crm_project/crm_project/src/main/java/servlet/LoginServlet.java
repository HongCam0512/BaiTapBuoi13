package servlet;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Anotation [Tên định danh]
 * Ký hiệu : @
 */
            //Tên của servlet       //Đường dẫn của servlet
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    //Truyền và nhận tham số bằng phương thức GET
    // Truyền tham số trên trình duyệt.
    // link : http://localhost:8080/login?tenthamso=giatri&tenthamso=giatri

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Yêu cầu hiển thị nội dung trong file login.jsp
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("Username " + username + " - password " + password);

        req.getRequestDispatcher("login.jsp").forward(req,resp);
    }

    //Phương thức POST: Tham số sẽ được truyền ngầm, và không giới hạn về mặt ký tự
    //
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> userList = new ArrayList<>(); //Tạo ra một danh sách rỗng
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User();
        user.setFullname("Cybersoft User");
        user.setAge(18);
        user.setGender(true);

        User user1 = new User();
        user1.setFullname("Cybersoft User 1");
        user1.setAge(21);
        user1.setGender(false);

        userList.add(user);
        userList.add(user1);

        if(username.equals("Cybersoft") && password.equals("admin@123")){
            //setAttribute(tenthamso,giatri) : gửi tham số ra giao diện file jsp
            req.setAttribute("username",username);
            req.setAttribute("users",userList);
            req.getRequestDispatcher("detail.jsp").forward(req,resp);
        }

        System.out.println("POST Username " + username + " - password " + password);
    }

    //Khi click submit button nếu người dùng truyền tham số có username là cybersoft
    // password là admin@123 thì chuyển qua page detail
    // Bên page detail sẽ hiển thị nội dung Hello + username

    //Tạo ra một Detail Servlet lắng nghe đường dẫn /detail
    // xuất ra nội dung của page html detail
}
