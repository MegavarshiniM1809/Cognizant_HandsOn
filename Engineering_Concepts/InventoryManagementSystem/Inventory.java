import java.util.HashMap;
public class Inventory {
    private HashMap<Integer,Product> products;
    public Inventory() {
        products=new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(),product);
        System.out.println("Product added successfully.");
    }

    public void updateProduct(int productId,int quantity,double price) {
        Product product=products.get(productId);
        if (product!=null) {
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int productId) {
        if (products.remove(productId) !=null) {
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayProducts() {
        for (Product product : products.values()) {
            System.out.println("-----------------------------");
            System.out.println("Product ID : "+product.getProductId());
            System.out.println("Product Name : "+product.getProductName());
            System.out.println("Quantity : "+product.getQuantity());
            System.out.println("Price : "+product.getPrice());
        }
    }
}