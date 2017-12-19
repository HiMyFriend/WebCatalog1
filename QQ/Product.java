package JClass;

public class Product {
    public String name;
    public int price;



    public static Product addProduct(String strLine) {
        Product res = new Product();
        int counter = 0;
        for (String real : strLine.split(" ")) {
            switch (counter) {
                case 0:
                    res.name = real;
                    counter++;
                    break;
                case 1:
                    res.price = Integer.parseInt(real);
                    counter++;
                    break;
            }
        }
        return res;
    }
}
