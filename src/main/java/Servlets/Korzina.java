package Servlets;

import JClass.Product;
import JClass.WebCatalog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/korzina")
public class Korzina extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        int id = Integer.parseInt(cookies[1].getValue());
        if (request.getParameter("Korzina") != null) {
            request.setAttribute("korzinaclient", basketPeople(id));
            request.getRequestDispatcher("Catalogi/Korzina.jsp").forward(request, response);
        }
    }

    static ArrayList<Product> basketPeople(int id) {
        for(int i = 0; i < WebCatalog.client.size(); i++){
            if(WebCatalog.client.get(i).id == id){
                return WebCatalog.client.get(i).basket;
            }
        }
        return null;
    }
}

