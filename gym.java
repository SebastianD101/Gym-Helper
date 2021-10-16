import java.util.Scanner;
/**
 * A gym helper application
 *
 * @author Sebastian DSouza Purdue CS
 * @version 10/16/2021
 */
public class gym {
    private static String welcomePrompt = "Welcome to Sebastian's gym helper application!\n" +
                                "Recommendations are not medical advice, consult with a doctor before taking supplements for working out";
    private static String questionPrompt = "What would do you need help with?";
    private static String ongoingMenu = "1. Calculate BMI\n" +
                                "2. Calculate Benchpress Weight\n" +
                                "3. Calculate Squat Weight\n" +
                                "4. Calculate Deadlift Weight\n" +
                                "5. How much protein should I be taking?\n" +
                                "6. How much creatine should I be taking?\n" +
                                "7. How much pre-workout should I be taking?\n" +
                                "8. Exit";
    private static String bodyWeightPrompt = "Enter body weight to the nearest pound";
    private static String heightPrompt = "Enter height to the nearest inch";
    private static String barPrompt = "Enter weight of bar";
    private static String platePrompt = "Enter weight of plate (one side of bar only)";
    private static String proteinPrompt = "It is recommended you take 0.4 grams of protein per pound of body weight\n" + 
                                    "Enter body weight to the nearest pound";
    private static String creatinePrompt = "To load with creatine, take 5 grams four times per day for 5–7 days. Then take 3–8 grams per day depending on body weight to maintain levels.\n" + 
                                    "Enter body weight to the nearest pound";
    private static String preworkoutPrompt = "It is recommended you take 1.5 grams of caffeine per pound of body weight 45-60 minutes before a workout.\n" + 
                                    "Enter body weight to the nearest pound";
    private static String errorMessage = "Try Again: Enter a number from 1 to 8 only.";
    private static String exitMessage = "Thank you for using Sebastian's gym helper!";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        double bodyWeight; 
        double height;
        double barWeight; 
        double plateWeight;

        System.out.println(welcomePrompt);
        do {
            System.out.println(questionPrompt);
            System.out.println(ongoingMenu);
            input = scanner.nextInt();
            if (input == 1) {
                System.out.println(bodyWeightPrompt);
                bodyWeight = scanner.nextDouble();
                System.out.println(heightPrompt);
                height = scanner.nextDouble();
                double BMI = (bodyWeight / height / height) * 703;
                System.out.printf("\nYour body mass index is: %1.2f\n\n", BMI);
            } else if (input == 2) {
                System.out.println(barPrompt);
                barWeight= scanner.nextDouble();
                System.out.println(platePrompt);
                plateWeight = scanner.nextDouble();
                double benchWeight = barWeight + (plateWeight * 2);
                System.out.println("\nThe total weight of your benchpress is:" + benchWeight + "\n");
            } else if (input == 3) {
                System.out.println(barPrompt);
                barWeight= scanner.nextDouble();
                System.out.println(platePrompt);
                plateWeight = scanner.nextDouble();
                double benchWeight = barWeight + (plateWeight * 2);
                System.out.println("\nThe total weight of your squat is:" + benchWeight + "\n");
            } else if (input == 4) {
                System.out.println(barPrompt);
                barWeight= scanner.nextDouble();
                System.out.println(platePrompt);
                plateWeight = scanner.nextDouble();
                double benchWeight = barWeight + (plateWeight * 2);
                System.out.println("\nThe total weight of your deadlift is:" + benchWeight + "\n");
            } else if (input == 5) {
                System.out.println(proteinPrompt);
                bodyWeight = scanner.nextDouble();
                System.out.printf("\nYou can take %1.2f grams of protein daily\n\n", bodyWeight * 0.4);
            } else if (input == 6) {
                System.out.println(creatinePrompt);
                bodyWeight = scanner.nextDouble();
                if (bodyWeight <= 120) {
                    System.out.println("\nAfter your loading phase, you should take a maintaince dose of 3 grams daily.\n");
                } else if (bodyWeight < 200) {
                    System.out.println("\nAfter your loading phase, you should take a maintaince dose of 5 grams daily.\n");
                } else {
                    System.out.println("\nAfter your loading phase, you should take a maintaince dose of 8 grams daily.\n");
                }
            } else if (input == 7) {
                System.out.println(preworkoutPrompt);
                bodyWeight = scanner.nextDouble();
                System.out.printf("\nYou can take %1.2f grams of caffeine before a workout\n\n", bodyWeight * 1.5);
            } else if (input == 8) {
                System.out.println(exitMessage);
            } else {
                System.out.println(errorMessage);
                input = 1;
            }
        }while (input <= 7 && input >= 1);


        scanner.close();
    }
}