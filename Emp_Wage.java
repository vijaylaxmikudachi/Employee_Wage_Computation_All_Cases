import java.util.Random;

public class Emp_Wage {
    // Constants
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 4;
    public static final int MAX_WORKING_HOURS = 100;
    public static final int MAX_WORKING_DAYS = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int totalWage = 0;
        int totalHours = 0;
        int totalDays = 0;

        // Randomly determine the working hours until the condition is met
        Random random = new Random();

        while (totalHours < MAX_WORKING_HOURS && totalDays < MAX_WORKING_DAYS) {
            int employeeType = random.nextInt(3); // 0 for absent, 1 for full-time, 2 for part-time

            int workingHours = 0;
            switch (employeeType) {
                case 1: // Full-time
                    workingHours = FULL_DAY_HOURS;
                    break;
                case 2: // Part-time
                    workingHours = PART_TIME_HOURS;
                    break;
                default: // Absent
                    workingHours = 0;
                    break;
            }

            // Update total working hours and days
            if (workingHours > 0) {
                totalDays++;
            }
            totalHours += workingHours;

            // Calculate the daily wage and add to total wage
            int dailyWage = WAGE_PER_HOUR * workingHours;
            totalWage += dailyWage;
        }

        // Display the results
        System.out.println("Total Wage: $" + totalWage);
        System.out.println("Total Hours Worked: " + totalHours);
        System.out.println("Total Days Worked: " + totalDays);
    }
}
