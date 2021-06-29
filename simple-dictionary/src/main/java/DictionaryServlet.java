import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionaryServlet", value = "/dictionary")
public class DictionaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("hello","Xin chào");
        dictionary.put("goodbye","Tạm biệt");
        dictionary.put("one","Một");
        dictionary.put("two","Hai");
        dictionary.put("three","Ba");
        dictionary.put("four","Bốn");

        String search = request.getParameter("txtSearch");
        String result = dictionary.get(search);
        PrintWriter writer = response.getWriter();
        if(result != null){
            writer.println("Word: "+search);
            writer.println("Result: "+result);
        } else
            writer.println("Not found");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
