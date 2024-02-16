


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class adminLog extends HttpServlet {

 public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
    PrintWriter out=res.getWriter();
    out.println("hello");
    out.close();
//    RequestDispatcher rd=req.getRequestDispatcher("index.html");
res.setContentType("text/html");
//    String userName=req.getParameter("username");
//    String password=req.getParameter("password");
//     System.out.println("userName");
     
//     RequestDispatcher rd= req.getRequestDispatcher("index.html");
    
}
    
    


}
