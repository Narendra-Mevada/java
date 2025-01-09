import java.util.Scanner;

public class Main {
    public class AnsiColors {
        public static final String RESET = "\u001B[0m";
        
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(" BUS CODE " + "  BUS NUMBER " + "           ROUTE           " + " PLATFORM NO. " + "  TIME  ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("     8D  " + "     2589MG" + "         BHADAJ CIRCLE" + "              4" + "          2:30 PM");
        System.out.println("    12D  " + "     2580FG" + "     LD ENGINEERING COLLEGE" + "         2" + "          2:46 PM");
        System.out.println("     6U  " + "     2530GM" + "          RABARI COLONY" + "             4" + "          3:09 PM");
        System.out.println("    101  " + "     FH435K" + "           RTO CIRCLE" + "               1" + "          3:23 PM");
        System.out.println("     2S  " + "     MJ679G" + "        ISKCON AHMEDABAD" + "            3" + "         3:26 PM");
        System.out.println("     9U  " + "     2590HG" + "           JAINMANGAL" + "               1" + "          3:40 PM");
        System.out.println("     8D  " + "     3580MG" + "         BHADAJ CIRCLE" + "              4" + "          3:43 PM");
        System.out.println("     2D  " + "     23496G" + "            KALUPUR" + "                 2" + "          3:56 PM");
        System.out.println("     5J  " + "     25VJ90" + "            NARODA" + "                  2" + "          4:10 PM");
        System.out.println("     2A  " + "     WA8965" + "         BHAVSAR HOSTEL" + "             4" + "          4:20 PM");
        System.out.println("-----------------------------------------------------------------------------");
        
        System.out.println("ENTER 1 FOR NEXT");
        int x = sc.nextInt();

        if (x == 1) {
            sc.nextLine();  // Consume the leftover newline character

            int num, tic, buy,pr,tpr;
            String name,name1,name2,loca;
            pr = 30;
            


            System.out.print("TO BUY A TICKET ENTER 1, TO EXIT ENTER 0: ");
            num = sc.nextInt();
            if (num == 1) {
                System.out.println("----------------------------------------------------");
                System.out.println(" NO                   ROUTE                         ");
                System.out.println("----------------------------------------------------");
                System.out.println("  1                BHADAJ_CIRCLE                    ");
                System.out.println("  2            LD_ENGINEERING_COLLEGE               ");
                System.out.println("  3                RABARI_COLONY                    ");
                System.out.println("  4              ISKCON_AHMEDABAD                   ");
                System.out.println("  5                 JAINMANGAL                      ");
                System.out.println("  6                   KALUPUR                       ");
                System.out.println("  7                   NARODA                        ");
                System.out.println("  8               BHAVSAR_HOSTEL                    ");
                System.out.println("----------------------------------------------------");
                System.out.print("ENTER YOUR DROP LOCATION (e.g., BHADAJ_CIRCLE): ");
                loca = sc.next();
                System.out.print("ENTER YOUR FIRST NAME IN CAPITAL: ");
                name1 = sc.next();
                System.out.print("ENTER YOUR LAST NAME IN CAPITAL: ");
                name2 = sc.next();
                System.out.println("HOW MANY TICKETS DO YOU WANT: ");
                tic = sc.nextInt();
                tpr = pr*tic;
                System.out.println("YOUR TICKET PRICE:\u001B[32m" +tpr+"rs.\u001B[0m");
                System.out.println("IF YOU WANT TO BUY IT ENTER 1; TO CANCEL ENTER 0: ");
                buy = sc.nextInt();
                
                if (buy == 1) {
                    name=name1+" "+name2;
                    System.out.println("Successfull...");
                    System.out.println("\u001B[32m------------------------------------------------\nNAME: " + name + "\nLOCATION: " + loca + "\nPRICE: " +tpr+"rs."+"\nPAYMENT: DONE\nTIME VALID FOR: 3 hours\n------------------------------------------------\u001B[0m");
                    System.out.println("Happy journey...");
                } else {
                    System.out.println("\u001B[32mHave a good day...\u001B[0m");
                }
            }
        } else {
            System.out.println("\u001B[32mHave a good day...\u001B[0m");
        }
    }

    private static void clearScreen() {
        throw new UnsupportedOperationException("Not supported yet.");
        
    }
}
