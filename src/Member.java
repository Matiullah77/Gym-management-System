public class Member {

    private int id;
    private String name;
    private int age;
    private double fee;

    public Member() {
        id = 0;
        name = "Not Set";
        age = 0;
        fee = 0.0;
    }

    public Member(int id, String name, int age, double fee) {
        this.id = id;
        this.name = name;
        setAge(age);     // validation used
        setFee(fee);     // validation used
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

    public int getAge() {
        return age;
    }

    // VALIDATION
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public double getFee() {
        return fee;
    }

    // VALIDATION
    public void setFee(double fee) {
        if (fee >= 0) {
            this.fee = fee;
        } else {
            this.fee = 0;
        }
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public double yearlyFee() {
        return fee * 12;
    }

    public String toString() {
        return "Member ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Fee: " + fee;
    }
}
