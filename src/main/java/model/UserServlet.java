package model;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/show")
public class UserServlet extends HttpServlet {

    public static final String VIEW = "/show.jsp";
    getInfo user=new getInfo();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("user",user);

        RequestDispatcher view = req.getRequestDispatcher(VIEW);
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        user.setName(req.getParameter("name"));
        user.setBreed(req.getParameter("breed"));
        user.setSex(req.getParameter("sex"));
        user.setAge(req.getParameter("age"));
        System.out.println(user.getName());
        System.out.println(user.getBreed());
        System.out.println(user.getSex());
        System.out.println(user.getAge());

    }
}