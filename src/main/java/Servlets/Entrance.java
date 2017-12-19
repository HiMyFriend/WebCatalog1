package Servlets;

import JClass.Client;
import JClass.WebCatalog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/login")
public class Entrance extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        for(int i = 0; i < WebCatalog.client.size(); i++){
            if((Objects.equals(WebCatalog.client.get(i).password, password))
                    && (Objects.equals(WebCatalog.client.get(i).Email, email))){
                Cookie cookies = new Cookie("id", String.valueOf(WebCatalog.client.get(i).id));
                response.addCookie(cookies);
                request.setAttribute("client", WebCatalog.client.get(i));
                request.getRequestDispatcher("Catalogi/CatalogClient.jsp").forward(request, response);
                return;
            }
        }
        for(int i = 0; i < WebCatalog.admin.size(); i++){
            if((Objects.equals(WebCatalog.admin.get(i).password, password))
                    && (Objects.equals(WebCatalog.admin.get(i).Email, email))){
                Cookie cookies = new Cookie("id", String.valueOf(WebCatalog.admin.get(i).id));
                response.addCookie(cookies);
                request.setAttribute("admin", WebCatalog.admin.get(i));
                request.getRequestDispatcher("Catalogi/CatalogAdmin.jsp").forward(request, response);
                return;
            }
        }
        request.getRequestDispatcher("jspIn/registration.jsp").forward(request, response);
    }
}
