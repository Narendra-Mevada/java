import java.util.*;

class attandance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("\t\tAttandace Note");
        System.out.println("----------------------------------------------");
        System.out.print("Enter the total number of students:");
        int x = sc.nextInt();
        // students
        int roll[] = new int[x];
        // enter a students in array
        for (int i = 0; i < x; i++) {
            roll[i] = i + 1;
        }
        // take attendance
        System.out.println("Note: Enter 'p' for Present and 'a' for absent.");
        char present[] = new char[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Roll No " + roll[i] + ": ");
            present[i] = sc.next().charAt(0);

        }

        System.out.println();
        System.out.print(
                "Note: Enter 's' to show the attendance, 'd' for present and absent student divide and 'x' for exit...");
        char show = sc.next().charAt(0);
        if (show == 's') {
            System.out.println("----------------------------------------------");
            System.out.println("\t\tAttandace");
            System.out.println("----------------------------------------------");
            for (int i = 0; i < x; i++) {
                System.out.print("Roll No " + roll[i] + ": ");
                if (present[i] == 'p') {
                    System.out.print("Present");
                    System.out.println();
                } else {
                    System.out.print("Absent");
                    System.out.println();
                }
            }

        }
        if (show == 'd') {
            System.out.println("----------------------------------------------");
            System.out.println("\t\tAttandace");
            System.out.println("----------------------------------------------");

            System.out.println("Present Students:");
            for (int i = 0; i < x; i++) {
                if (present[i] == 'p') {
                    System.out.println("Roll no: " + roll[i]);
                } else {

                }
            }
            System.out.println();
            System.out.println("Absent Students:");
            for (int i = 0; i < x; i++) {
                if (present[i] == 'a') {
                    System.out.println("Roll no: " + roll[i]);
                } else {

                }
            }

        } else {
            System.exit(show);
        }

    }
}
