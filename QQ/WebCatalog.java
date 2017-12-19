package JClass;

import java.io.*;
import java.util.*;

public class WebCatalog {
    static public int id = 0;
    static public List<Client> client = new ArrayList<>();
    static public List<Admin> admin = new ArrayList<>();
    static public List<Product> products = new ArrayList<>();
    static public boolean flag = true;

    public static boolean checkIn(Client client){
        for(int i = 0; i < WebCatalog.client.size(); i++){
            Client tmp = WebCatalog.client.get(i);
            if((Objects.equals(tmp.password, client.password)) && (Objects.equals(tmp.first_name, client.first_name))){
                 return false;
            }
        }

        WebCatalog.client.add(client);
        return true;
    }

    public static void start(){
        try{
            FileInputStream fstream = new FileInputStream("C:/Users/pashi/IDEAProject/WebCatalog/database/admin.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null){
                admin.add(Admin.addAdmin(strLine));
            }
            fstream.close();
            br.close();
            FileInputStream clientFstream = new FileInputStream("C:/Users/pashi/IDEAProject/WebCatalog/database/client.txt");
            BufferedReader clientBr = new BufferedReader(new InputStreamReader(clientFstream));
            while ((strLine = clientBr.readLine()) != null){
                client.add(Client.addClient(strLine));
            }
            FileInputStream productFstream = new FileInputStream("C:/Users/pashi/IDEAProject/WebCatalog/database/products.txt");
            BufferedReader productBr = new BufferedReader(new InputStreamReader(productFstream));
            while ((strLine = productBr.readLine()) != null){
                products.add(Product.addProduct(strLine));
            }
            flag = false;
            System.out.println(id);
            clientFstream.close();
            clientBr.close();
        }catch (IOException e){
            System.out.println("Ошибка");
        }
    }

    public static List<Product> getProducts(){
        return products;
    }
}
