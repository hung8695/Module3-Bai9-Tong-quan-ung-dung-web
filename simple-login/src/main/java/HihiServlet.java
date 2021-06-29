import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HihiServlet", value = "/login")
public class HihiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        if (username.equals("admin") && password.equals("admin")) {
            writer.println("Welcome " + username + " to website");
        } else
            writer.println("Login Error");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//            String username = request.getParameter("username");
//            String password = request.getParameter("password");
//        PrintWriter writer = response.getWriter();
//        if(username.equals("admin") && password.equals("admin")){
//            writer.println("Welcome "+username+" to website");
//        } else
//            writer.println("Login Error");
//    }
    }
}
