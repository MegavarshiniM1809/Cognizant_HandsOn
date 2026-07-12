import java.util.Arrays;
import java.util.Comparator;
public class Test {
    public static void main(String[] args) {
        Book[] books = {
                new Book(101,"Java Programming","James Gosling"),
                new Book(102,"Data Structures","Mark Allen"),
                new Book(103,"Operating Systems","Silberschatz"),
                new Book(104,"Computer Networks","Andrew Tanenbaum")
        };

        Book result1=LibrarySearch.linearSearch(books,"Operating Systems");
        if (result1!=null) {
            System.out.println("Linear Search Found:");
            System.out.println(result1.getTitle());
        }
        Arrays.sort(books,Comparator.comparing(Book::getTitle));
        Book result2=LibrarySearch.binarySearch(books,"Operating Systems");
        if (result2!=null) {
            System.out.println();
            System.out.println("Binary Search Found:");
            System.out.println(result2.getTitle());
        }
    }
}