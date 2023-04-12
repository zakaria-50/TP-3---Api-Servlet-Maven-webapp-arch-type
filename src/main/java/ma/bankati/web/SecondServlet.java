package ma.bankati.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SecondServlet extends HelloServlet{

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
        hello from second servlet
        </h2>
        </bogy>
        </html>
        
        """ ;

    }
}
