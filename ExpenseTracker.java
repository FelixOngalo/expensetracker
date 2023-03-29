import java.util.Scanner;

public class ExpenseTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double expenses = 0.0;
        double income = 0.0;
        double budget = 0.0;

        while (true) {
            System.out.println("1. Add Expense");
            System.out.println("2. Add Income");
            System.out.println("3. Set Budget");
            System.out.println("4. Generate Report");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter expense amount:");
                    double expense = scanner.nextDouble();
                    expenses += expense;
                    System.out.println("Expense added successfully.");
                    break;
                case 2:
                    System.out.println("Enter income amount:");
                    double incomeAmount = scanner.nextDouble();
                    income += incomeAmount;
                    System.out.println("Income added successfully.");
                    break;
                case 3:
                    System.out.println("Enter budget amount:");
                    budget = scanner.nextDouble();
                    System.out.println("Budget set successfully.");
                    break;
                case 4:
                    System.out.println("Expense: " + expenses);
                    System.out.println("Income: " + income);
                    System.out.println("Budget: " + budget);
                    if (expenses > budget) {
                        System.out.println("You have exceeded your budget.");
                    } else if (expenses == budget) {
                        System.out.println("You have reached your budget limit.");
                    } else {
                        System.out.println("You have remaining budget of " + (budget - expenses));
                    }
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
