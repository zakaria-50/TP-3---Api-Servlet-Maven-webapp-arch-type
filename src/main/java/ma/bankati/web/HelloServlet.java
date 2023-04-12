package ma.bankati.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*@WebServlet(name = "HS" , urlPatterns = "/hello", loadOnStartup = 1)*/

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        var out  = response.getWriter() ;


        var page = """
        <html>
        
        <body>
        <h1>
        hello from servlet
        </h2>
        </bogy>
        </html>
        
        """ ;
        /*out.println("<h2 >hello from HelloServlet</h2> ");
        out.println("<h3>protocole utilisé : "+request.getProtocol()+"</h3>");
        out.println("<h3>protocole utilisé : "+request.getMethod()+"</h3>");
        out.println("<h3>protocole utilisé : "+request.getServerName()+"</h3>");
        out.println("<h3>protocole utilisé : "+request.getServerPort()+"</h3>");*/

        out.println(page);


        /*navigation*/
        request.getRequestDispatcher("/hello2").forward(request , response);
        /*redirection*/
        response.sendRedirect(getServletContext().getContextPath()+"/hello2");
    }
}
