public class Test {
    public static void main(String[] args) {
        TaskLinkedList list=new TaskLinkedList();
        list.addTask(new Task(101,"Coding","Pending"));
        list.addTask(new Task(102,"Testing","Completed"));
        list.addTask(new Task(103,"Documentation","Pending"));
        System.out.println("All Tasks");
        list.displayTasks();
        System.out.println();
        list.searchTask(102);
        System.out.println();
        list.deleteTask(102);
        System.out.println();
        System.out.println("After Deletion");
        list.displayTasks();
    }
}