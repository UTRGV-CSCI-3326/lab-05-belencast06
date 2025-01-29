import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        /*Get and store the user's name. (Store as text)
        Get and store the user's age. (Store as a whole number)
        Get and store the user's weight. (Store it as a real number)
        Get and store if the user is a smoker. (Store it as either true or false)
        Output all of the information back to the user. */

        Scanner scanner = new Scanner(System.in);

        String uName;
        int uAge;
        double uWeight;
        boolean smoker;
        char sCheck;

        System.out.print("Enter your full name:");
        uName=scanner.nextLine();

        System.out.print("Enter your age:");
        uAge=scanner.nextInt();

        System.out.print("Enter your weight:");
        uWeight=scanner.nextDouble();

        System.out.print("Are you are a smoker [Y]es or [N]o:");
        sCheck=scanner.next().charAt(0);
        char sUpper=Character.toUpperCase(sCheck);

        if(sUpper=='Y')
            smoker=true;
        else 
            smoker=false; //obviously no input vaildation in this porgram

        System.out.println("\nYour Information");
        System.out.println("-----------------");
        System.out.println("Name:"+uName);
        System.out.println("Age:"+uAge);
        System.out.println("Weight:"+uWeight);
        System.out.println("Smoker:"+smoker);
    }
}
