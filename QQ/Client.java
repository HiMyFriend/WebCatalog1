package JClass;

import java.util.ArrayList;

public class Client {
    public int id;
    public String first_name;
    public String last_name;
    public String Email;
    public String phone;
    public String password;
    public ArrayList<Product> basket = new ArrayList<>();

    public static Client addClient(String people) {
        Client res = new Client();
        res.id = WebCatalog.id++;
        int counter = 0;
        for (String real : people.split(" ")) {
            switch (counter) {
                case 0:
                    res.first_name = real;
                    counter++;
                    break;
                case 1:
                    res.last_name = real;
                    counter++;
                    break;
                case 2:
                    res.Email = real;
                    counter++;
                    break;
                case 3:
                    res.phone = real;
                    counter++;
                    break;
                case 4:
                    res.password = real;
                    counter++;
                    break;
                case 5:
                    res.id = Integer.parseInt(real);
                    counter++;
                    break;
            }
        }
        return res;
    }
}
