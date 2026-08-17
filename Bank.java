
public class Bank {

    //these are instance variables
    String bankName;
    String userName;
    String accountType;
    int userId;
    double balance;
    long accountNumber;

    Bank(String bankName, String userName, String accountType, int userId, double balance, long accountNumber) {
        this.bankName = bankName;
        this.userName = userName;
        this.accountType = accountType;
        this.userId = userId;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    void displayBankDetails() {
        System.out.println("Bank name: " + bankName);
    }

    void displayUserDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("User name: " + userName);
    }

    void displayAccountDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    String createAccountSummary() {
        String accountSummary;
        accountSummary = "Account summary: " + "\n Bank Name: " + bankName + "\n User Name:" + userName + "\n Account Type:" + accountType + "\n userId: " + userId + "\n Balance: " + balance + "\n Account Number: " + accountNumber;
        return accountSummary;
    }

    boolean hasMinimumBalance(double minimumBalance) {
        boolean res = false;
        if (balance >= minimumBalance) {
            res = true;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bankName = sc.nextLine();
        int userId = sc.nextInt();
        sc.nextLine();
        String userName = sc.nextLine();
        long accountNumber = sc.nextLong();
        sc.nextLine();
        String accountType = sc.nextLine();
        double balance = sc.nextDouble();

    }

}
