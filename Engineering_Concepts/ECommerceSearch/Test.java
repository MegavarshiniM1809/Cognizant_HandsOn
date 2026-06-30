import java.util.Arrays;
import java.util.Comparator;
public class Test {
    public static void main(String[] args) {
        Product[] products={
                new Product(101,"Laptop","Electronics"),
                new Product(102,"Mouse","Accessories"),
                new Product(103,"Keyboard","Accessories"),
                new Product(104,"Monitor","Electronics"),
                new Product(105,"Printer","Electronics")
        };
        Product result1=Search.linearSearch(products,"Keyboard");
        if (result1!=null) {
            System.out.println("Linear Search Found: "+result1.getProductName());
        }
        Arrays.sort(products,Comparator.comparing(Product::getProductName));
        Product result2=Search.binarySearch(products,"Keyboard");
        if (result2!=null) {
            System.out.println("Binary Search Found: "+result2.getProductName());
        }
    }
}