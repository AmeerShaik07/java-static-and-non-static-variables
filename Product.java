public class Product{
    static String category = "Electronics";
    String productName;
    
    public static void main(String[] args){
        Product p1 = new Product();
        Product p2 = new Product();
        p1.productName = "Laptop";
        p2.productName = "SmartPhone";
        System.out.println("Category: " + Product.category);
        System.out.println("Product p1 : " + p1.productName);
        System.out.println("Product p2 : " + p2.productName);
    }
}