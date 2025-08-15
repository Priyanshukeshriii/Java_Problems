class Employee{
    String name;
    String lastName;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary >=  0 ) {
            this.salary = salary;
        }
        else{
            System.out.println("enter a valid salary for employee "+this.name+" " +this.lastName);
        }
    }

    public Employee(String name, String lastName, double salary) {
        this.lastName = lastName;
        this.name = name;
        setSalary(salary);
    }
}


public class EmployeeList {
    public static void main(String[] args) {
        Employee E1 = new Employee("Priyanshu" , "Keshri" , 10000);
        Employee E2 = new Employee("Rupam" , "Sahani" , 1000);
        Employee E3 = new Employee("Ujjwal" , "Raj" , -1000);
        System.out.println(E1.getSalary());
        System.out.println(E2.getSalary());
        System.out.println(E3.getSalary());
        E1.setSalary(E1.getSalary()+ E1.getSalary()/10);
        E2.setSalary(E2.getSalary()+ E2.getSalary()/10);
        E3.setSalary(E3.getSalary()+ E3.getSalary()/10);
        System.out.println(E1.getSalary());
        System.out.println(E2.getSalary());
        System.out.println(E3.getSalary());

    }
}
