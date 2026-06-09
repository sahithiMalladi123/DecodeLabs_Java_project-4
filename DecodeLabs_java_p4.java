import java.util.Scanner;

 class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== CURRENCY CONVERTER =====");

        System.out.println("1. INR (Indian Rupee)");
        System.out.println("2. USD (US Dollar)");
        System.out.println("3. EUR (Euro)");

        System.out.print("Select Base Currency (1-3): ");
        int base = sc.nextInt();

        System.out.print("Select Target Currency (1-3): ");
        int target = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        double amountInUSD = 0;
        double convertedAmount = 0;

        // Convert Base Currency to USD
        switch (base) {
            case 1: // INR
                amountInUSD = amount / 83.0;
                break;
            case 2: // USD
                amountInUSD = amount;
                break;
            case 3: // EUR
                amountInUSD = amount * 1.08;
                break;
            default:
                System.out.println("Invalid Base Currency!");
                return;
        }

        // Convert USD to Target Currency
        switch (target) {
            case 1: // INR
                convertedAmount = amountInUSD * 83.0;
                break;
            case 2: // USD
                convertedAmount = amountInUSD;
                break;
            case 3: // EUR
                convertedAmount = amountInUSD / 1.08;
                break;
            default:
                System.out.println("Invalid Target Currency!");
                return;
        }

        System.out.println("\nConverted Amount: " + convertedAmount);

        sc.close();
    }
}