package api;

import dao.idvalidDAO;

import javax.enterprise.context.RequestScoped;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@RequestScoped
@WebServlet(urlPatterns = "/id-valid")
public class idvalidAPI extends HttpServlet {

    @Override
    public void init() {
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String pesel = req.getParameter("id");
        PrintWriter out = res.getWriter();

        if (idvalidDAO.veryfi(pesel)
        ) {
            out.println("true");
        } else {
            out.println("false");
        }
        out.close();

    }

}