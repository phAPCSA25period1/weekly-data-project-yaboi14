import java.util.Scanner;

/**
 * Instructions:
 * - Complete the WeeklyData.java class first.
 * - Use this App class to collect user input and test your WeeklyData methods.
 * - Follow all TODOs carefully.
 * - Do NOT hard-code values — use loops and method calls.
 */
public class App {

    public static void main(String[] args) {

        // -------------------------------------------------------------
        // TODO 1: Create a Scanner for user input
        // -------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        // -------------------------------------------------------------
        // TODO 2: Give information about your program
        //         Ask the user about their goals (if applicable)
        // -------------------------------------------------------------
        System.out.println("Welcome to the Weekly Data Analyzer!");
        System.out.println("This program will help you track and analyze your weekly data of your steps.");

        // -------------------------------------------------------------
        // TODO 3: Create an array to hold 7 days of data
        //         Use an appropriate data type (int or double)
        //         Name the array weekData
        // -------------------------------------------------------------
        double[] weekData = new double[7];

        // -------------------------------------------------------------
        // TODO 4: Use a for loop to collect data for each day of the week
        //         Prompt example:
        //         "Enter <data type> for day X: "
        //
        //         Include input validation:
        //         - Use a while loop to prevent negative values
        //         - Re-prompt if the value is invalid
        // -------------------------------------------------------------
        for (int i = 0; i < weekData.length; i++) {
            System.out.print("Enter your steps for day " + (i + 1) + ": ");
            double input = scanner.nextDouble();
            while (input < 0) {
                System.out.print("Invalid input. Please enter a non-negative value for day " + (i + 1) + ": ");
                input = scanner.nextDouble();
            }
            weekData[i] = input;
        }

        // -------------------------------------------------------------
        // TODO 5: Create a WeeklyData object
        //         Pass the weekData array into the constructor
        // -------------------------------------------------------------
        WeeklyData weeklyData = new WeeklyData(weekData);

        // -------------------------------------------------------------
        // TODO 6: Display the results of the analysis
        //         Call methods from WeeklyData to display:
        //         - Total
        //         - Average
        //         - Minimum
        //         - Maximum
        //
        //         Use clear labels and formatted output if needed
        // -------------------------------------------------------------
        System.out.println("Total steps for the week: " + weeklyData.getTotal());
        System.out.println("Average daily steps: " +  weeklyData.getAverage());
        System.out.println("Minimum daily steps: " + weeklyData.getMin());
        System.out.println("Maximum daily steps: " + weeklyData.getMax());
        System.out.println();
        // -------------------------------------------------------------
        // TODO 7: Display the full week of data
        //         Use the toString() method from WeeklyData
        // -------------------------------------------------------------
        System.out.println("Here is your data for the week:");
        System.out.println(weeklyData.toString());

        // -------------------------------------------------------------
        // TODO 8: Give the user insights about their week
        //         --> "You need to drink more water next week!"
        //         --> "You were very hydrated this week!"
        //         --> etc.
        // -------------------------------------------------------------
        if (weeklyData.getAverage() < 5000) {
            System.out.println("You need to walk more next week!");
            System.out.println("Staying active is important for your health, make sure to get those steps in!");
        } else if (weeklyData.getAverage() < 10000) {
            System.out.println("Good effort! Try to reach 15,000 steps next week!");
            System.out.println("Did you know? Walking 10,000 steps a day can significantly improve your health.");
        } else if (weeklyData.getAverage() < 15000) {
            System.out.println("Great job staying active this week!");
            System.out.println("Keep up the good work and aim for even more steps next week!");
        } else if (weeklyData.getAverage() >= 15000) {
            System.out.println("Excellent work! You must love going out side!");
            System.out.println("Your dedication to staying active is inspiring. Keep it up!");
        }

    }
}
