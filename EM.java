class Employee {
    int EID;
    String name;
    double salary;

    Employee(int EID, String name, double salary) {
        this.EID = EID;
        this.name = name;
        this.salary = salary;
    }

    public void getdetails() {
        System.out.println("Employee ID" + this.EID + " ,Name " + this.name + " , Salary" + this.salary);
    }
}

public class EM {
    public static void main(String[] args) {
        Employee Sid = new Employee(545, "sid", 100000);
        Sid.getdetails();
    }
}