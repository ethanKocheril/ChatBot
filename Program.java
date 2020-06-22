import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        System.out.println("Hello! My name is Jeff.");
        System.out.println("I was created in the year 2020.");
        System.out.println("Please tell me your name.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //I used nextLine instead of next because I wanted to include compound strings
        System.out.println("Hello " + name + "!");
        System.out.println("What are your interests?");
        String interests = scanner.nextLine();
        if(interests.equals("sports") || interests.equals("gaming")){
            System.out.println("That's great! Do you want to go pro?");
            String confirmation = scanner.next();
            if(confirmation.equals("yes")){
                System.out.println("Good luck! Remember to have fun!");
            }
            if(confirmation.equals("no")){
                System.out.println("Well, in the end if you enjoy it, that's what matters.");
            }
        }
        if(interests.equals("music") || interests.equals("art")){
            System.out.println("Great! Have you created anything recently?");
            String confirmation1 = scanner.next();
            if(confirmation1.equals("yes")){
                System.out.println("That's great!");
            } else {
                System.out.println("If you plan to create something, keep working on it!");
            }
        }
        System.out.println("It was nice talking to you!");
    }
}
