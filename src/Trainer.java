public class Trainer {

    private int id;
    private String name;
    private String specialization;
    private double salary;

    public Trainer() {
        id = 0;
        name = "Not Set";
        specialization = "Not Set";
        salary = 0.0;
    }

    public Trainer(int id, String name, String specialization, double salary) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        setSalary(salary); // validation
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getSalary() {
        return salary;
    }

    // VALIDATION
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }

    public double yearlySalary() {
        return salary * 12;
    }

    public boolean isHighSalary() {
        return salary > 1000;
    }

    public String toString() {
        return "Trainer ID: " + id +
                ", Name: " + name +
                ", Specialization: " + specialization +
                ", Salary: " + salary;
    }
}
