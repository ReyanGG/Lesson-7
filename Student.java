class Student {
    int roll;
    String name;
    int grade;

    Student(int roll, String name, int grade) {
        this.roll = roll;
        this.name = name;
        this.grade = grade;
    }

    public void getdetails() {
        System.out.println("Roll no" + this.roll + " ,Name " + this.name + " , grade" + this.grade);
    }
}

public class Student {
    public static void main(String[] args) {
        Employee Sid = new Employee(545, "sid", 100000);
        Sid.getdetails();
    }

}
