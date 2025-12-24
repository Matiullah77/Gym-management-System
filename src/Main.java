import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Gym gym = new Gym("Basic Gym", "City Center", 0, 0);

        int choice;

        do {
            System.out.println("\n=== GYM MENU ===");
            System.out.println("1. Add Member");
            System.out.println("2. Add Trainer");
            System.out.println("3. Show Gym Info");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                Member m = new Member();

                System.out.print("Enter member id: ");
                m.setId(sc.nextInt());

                System.out.print("Enter name: ");
                sc.nextLine();
                m.setName(sc.nextLine());

                System.out.print("Enter age: ");
                m.setAge(sc.nextInt());

                System.out.print("Enter monthly fee: ");
                m.setFee(sc.nextDouble());

                gym.addMember();
                System.out.println("Member added successfully!");
                System.out.println(m);
            }

            else if (choice == 2) {
                Trainer t = new Trainer();

                System.out.print("Enter trainer id: ");
                t.setId(sc.nextInt());

                System.out.print("Enter name: ");
                sc.nextLine();
                t.setName(sc.nextLine());

                System.out.print("Enter specialization: ");
                t.setSpecialization(sc.nextLine());

                System.out.print("Enter salary: ");
                t.setSalary(sc.nextDouble());

                gym.addTrainer();
                System.out.println("Trainer added successfully!");
                System.out.println(t);
            }

            else if (choice == 3) {
                System.out.println(gym);
            }

            else if (choice == 4) {
                System.out.println("Exiting program...");
            }

            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
