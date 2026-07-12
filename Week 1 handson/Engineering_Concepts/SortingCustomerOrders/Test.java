public class Test {
    public static void main(String[] args) {
        Order[] orders={
                new Order(101,"Rahul",5000),
                new Order(102,"Priya",2500),
                new Order(103,"Arun",8000),
                new Order(104,"Meena",3000)
        };
        System.out.println("Bubble Sort:");
        SortOrders.bubbleSort(orders);
        SortOrders.displayOrders(orders);
        System.out.println();
        Order[] orders2={
                new Order(101,"Rahul",5000),
                new Order(102,"Priya",2500),
                new Order(103,"Arun",8000),
                new Order(104, "Meena",3000)
        };
        System.out.println("Quick Sort:");
        SortOrders.quickSort(orders2,0,orders2.length-1);
        SortOrders.displayOrders(orders2);
    }
}