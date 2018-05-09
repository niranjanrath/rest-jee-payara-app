package nl.niranjan.ee.trash;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cdiservlet")
public class NewServlet extends HttpServlet {

    @Inject
    private Message message;

//    @Override
//    public void init() {
//        message = new MessageB();
//    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.getWriter().write(message.get());
    }
}