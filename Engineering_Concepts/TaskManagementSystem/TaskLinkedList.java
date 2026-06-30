public class TaskLinkedList {
    private Task head;
    public void addTask(Task task) {
        if (head==null) {
            head=task;
            return;
        }
        Task current=head;
        while (current.next!=null) {
            current=current.next;
        }
        current.next=task;
    }

    public void searchTask(int id) {
        Task current=head;
        while (current!=null) {
            if (current.getTaskId()==id) {
                System.out.println("Task Found");
                System.out.println("Task Name : "+current.getTaskName());
                System.out.println("Status : "+current.getStatus());
                return;
            }
            current=current.next;
        }
        System.out.println("Task Not Found");
    }

    public void displayTasks() {
        Task current=head;
        while (current!=null) {
            System.out.println("-----------------------");
            System.out.println("Task ID : "+current.getTaskId());
            System.out.println("Task Name : "+current.getTaskName());
            System.out.println("Status : "+current.getStatus());
            current=current.next;
        }
    }

    public void deleteTask(int id) {
        if (head==null) {
            return;
        }
        if (head.getTaskId()==id) {
            head=head.next;
            System.out.println("Task Deleted");
            return;
        }
        Task current=head;
        while (current.next!=null&&current.next.getTaskId()!=id) {
            current=current.next;
        }
        if (current.next!=null) {
            current.next=current.next.next;
            System.out.println("Task Deleted");
        }
        else {
            System.out.println("Task Not Found");
        }
    }
}