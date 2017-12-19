package Servlets;

import JClass.Client;
import JClass.Product;
import JClass.WebCatalog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

import static Servlets.Korzina.basketPeople;

@WebServlet(name = "KorzinaAdd", urlPatterns = "/korzinaadd")
public class KorzinaAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        int idPeople = Integer.parseInt(cookies[1].getValue());
        Product res = new Product();
        res.price = Integer.parseInt(request.getParameter("price"));
        res.name = request.getParameter("name");
        WebCatalog.client.get(idPeople).basket.add(res);
        for(int i = 0; i < WebCatalog.products.size(); i++) {
            if(Objects.equals(WebCatalog.products.get(i).name, res.name)) {
                WebCatalog.products.remove(i);
                break;
            }
        }
        request.getRequestDispatcher("Catalogi/Korzina.jsp").forward(request, response);
    }
}
