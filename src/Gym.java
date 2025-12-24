public class Gym {

    private String name;
    private String location;
    private int members;
    private int trainers;

    public Gym() {
        name = "My Gym";
        location = "Not Set";
        members = 0;
        trainers = 0;
    }

    public Gym(String name, String location, int members, int trainers) {
        this.name = name;
        this.location = location;
        this.members = members;
        this.trainers = trainers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMembers() {
        return members;
    }

    public int getTrainers() {
        return trainers;
    }

    public void addMember() {
        members++;
    }

    public void addTrainer() {
        trainers++;
    }

    public String toString() {
        return "Gym Name: " + name +
                ", Location: " + location +
                ", Members: " + members +
                ", Trainers: " + trainers;
    }
}
