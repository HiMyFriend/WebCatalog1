package JClass;

import java.util.Iterator;

public class Admin {
    public int id;
    public String first_name;
    public String last_name;
    public String Email;
    public String phone;
    public String password;

    public static Admin addAdmin(String people){
        Admin admin = new Admin();
        int counter = 0;
        for (String retval : people.split(" ")) {
            switch (counter) {
                case 0:
                    admin.first_name = retval;
                    counter++;
                    break;
                case 1:
                    admin.last_name = retval;
                    counter++;
                    break;
                case 2:
                    admin.Email = retval;
                    counter++;
                    break;
                case 3:
                    admin.phone = retval;
                    counter++;
                    break;
                case 4:
                    admin.password = retval;
                    counter++;
                    break;
                case 5:
                    admin.id = Integer.parseInt(retval);
                    counter++;
                    break;
            }
        }
        return admin;
    }
}
