package splitwise;

public class Expense {

    private final String payerName;
    private final double amount;

    public Expense (String payerName,double amount)
    {
        this.payerName=payerName;
        this.amount=amount;
    }

    public Expense (double amount)
    {
        this("unknown",amount);
    }

    public String getPayerName()
    {
        return payerName;
    }

    public double getAmount()
    {
        return amount;
    }

}
