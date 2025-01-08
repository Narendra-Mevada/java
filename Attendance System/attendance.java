import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("\t\tAttendance Note");
        System.out.println("----------------------------------------------");
        System.out.print("Enter the total number of students: ");
        int x = sc.nextInt();
        
        // Students' roll numbers
        int roll[] = new int[x];
        char present[] = new char[x];
        
        // Initialize roll numbers
        for (int i = 0; i < x; i++) {
            roll[i] = i + 1;
        }
        
        // Take attendance
        System.out.println("Note: Enter 'p' for Present and 'a' for Absent.");
        for (int i = 0; i < x; i++) {
            System.out.print("Roll No " + roll[i] + ": ");
            present[i] = Character.toLowerCase(sc.next().charAt(0));
        }

        // Menu loop
        while (true) {
            System.out.println();
            System.out.print(
                "Note: Enter 's' to show attendance, 'd' to separate present/absent students, or 'x' to exit: ");
            char show = Character.toLowerCase(sc.next().charAt(0));
            
            if (show == 's') {
                System.out.println("----------------------------------------------");
                System.out.println("\t\tAttendance");
                System.out.println("----------------------------------------------");
                for (int i = 0; i < x; i++) {
                    System.out.println("Roll No " + roll[i] + ": " + (present[i] == 'p' ? "Present" : "Absent"));
                }
            } else if (show == 'd') {
                System.out.println("----------------------------------------------");
                System.out.println("\t\tAttendance");
                System.out.println("----------------------------------------------");
                System.out.println("Present Students:");
                for (int i = 0; i < x; i++) {
                    if (present[i] == 'p') {
                        System.out.println("Roll No: " + roll[i]);
                    }
                }
                System.out.println("Absent Students:");
                for (int i = 0; i < x; i++) {
                    if (present[i] == 'a') {
                        System.out.println("Roll No: " + roll[i]);
                    }
                }
            } else if (show == 'x') {
                System.out.println("Exiting... Thank you!");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
    }
}
