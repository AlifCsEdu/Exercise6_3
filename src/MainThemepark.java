import java.util.Scanner;

public class MainThemepark {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ThemePark[] ticket = new ThemePark[1];

        String name;
        String ic;
        char memberIn;
        boolean Member = false;
        String activity;
        String category;

        System.out.println("Theme Park Registration System");

        for (int i = 0; i < ticket.length; i++) {
            System.out.println("Choose Between : " + "\nWaterpark or WildlifePark");
            String option = in.next();

        if(option.equalsIgnoreCase("Waterpark")){
            System.out.println("=====Data for No" + (i + 1) + "=====");
            System.out.println("Enter Name : ");
            in.nextLine();
            name = in.nextLine();
            System.out.println("Enter IC : ");
            ic = in.nextLine();
            System.out.println("Member?" + "\n\t(Y)es or (N)o");
            memberIn = in.next().charAt(0);
            if(memberIn=='Y'){
                Member = true;
            }else if(memberIn == 'N'|| memberIn == 'n'){
                Member = false;
            }
            System.out.println("Choose Your Activity : ( " + "Surf Beach || Water Rides || Wave Pool )");
            in.nextLine();
            activity = in.nextLine();
            ticket[i] = new WaterPark(name, ic, Member, activity);
        }else if(option.equalsIgnoreCase("WildlifePark")){
            System.out.println("=====Data for No" + (i + 1) + "=====");
            System.out.println("Enter Name : ");
            in.nextLine();
            name = in.nextLine();
            System.out.println("Enter IC : ");
            ic = in.nextLine();
            System.out.println("Member?" + "\n\t(Y)es or (N)o");
            memberIn = in.next().charAt(0);
            if(memberIn=='Y'){
                Member = true;
            }else if(memberIn == 'N'|| memberIn == 'n'){
                Member = false;
            }
            System.out.println("Choose Your Category" + "Adult || Children");
            in.nextLine();
            category = in.nextLine();
            ticket[i] = new WildlifePark(name, ic, Member, category);
        }
        }
        for(int i=0;i< ticket.length; i++){
            System.out.println("Booking no : " + (i + 1));
            System.out.println("\n" + ticket[i].toString());
        }
    }
}
