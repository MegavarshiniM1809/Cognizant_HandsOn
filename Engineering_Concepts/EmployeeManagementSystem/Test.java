public class Test {
    public static void main(String[] args) {
        EmployeeManagement management=new EmployeeManagement(5);
        Employee e1=new Employee(101,"Alia","Manager",55000);
        Employee e2=new Employee(102,"Priya", "Developer", 45000);
        Employee e3=new Employee(103,"Mega","Tester",40000);
        management.addEmployee(e1);
        management.addEmployee(e2);
        management.addEmployee(e3);
        System.out.println();
        management.displayEmployees();
        System.out.println();
        management.searchEmployee(102);
        System.out.println();
        management.deleteEmployee(102);
        System.out.println();
        management.displayEmployees();
    }
}