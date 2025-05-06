public class Department{
    static String department = "HR";
    String employeeName;
    
    public static void main(String[] args){
        Department d1 = new Department();
        Department d2 = new Department();
        d1.employeeName = "John";
        d2.employeeName = "Alice";
        System.out.println("Department : " + Department.department);
        System.out.println("Employee 1 : " + d1.employeeName);
        System.out.println("Employee 2 : " + d2.employeeName);
        
        Department.department = "Marketing";
        System.out.println("\nAfter Modification : ");
        System.out.println("\nDepartment : " + Department.department);
        System.out.println("Employee 1 : " + d1.employeeName);
        System.out.println("Employee 2 : " + d2.employeeName);
        
    }
}