import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /** Hello.
     *
     */
    public enum BankAccountType {
        /** No.
         * CHECKINGS
         */
        CHECKINGS,
        /** No.
         * SAVINGS
         */
        SAVINGS,
        /** No.
         * STUDENT
         */
        STUDENT,
        /** No.
         * WORKPLACE
         */
        WORKPLACE
    }
    /** Heck you.
     *
     * */
    private int accountNumber;
    /** Heck you.
     *
     * */
    public BankAccountType accountType;
    /** Heck you.
     *
     * */
    private double accountBalance;
    /** Heck you.
     *
     * */
    private String ownerName;
    /** Heck you.
     *
     * */
    public double interestRate;
    /** Heck you.
     *
     * */
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType student) {
        ownerName = name;
        accountType = student;

        Bank.totalAccounts++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public double getInterestEarned() {
        return interestEarned;
    }

    public void setAccountNumber(final int an) {
        accountNumber = an;
    }
    public void setAccountBalance(final double ab) {
        accountBalance = ab;
    }
    public void setOwnerName(final String name) {
        ownerName = name;
    }
    public void setInterestEarned(final double ie) {
        interestEarned = ie;
    }
}