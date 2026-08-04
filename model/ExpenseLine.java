/**
 * Contains the model classes of the Splitwise application.
 */
package splitwise.model;
/**
 * Represents one expense in the Splitwise application.
 * @param payerName payerName the friend who paid
 * @param amount total amount paid
 */
public record ExpenseLine (String payerName,double amount)
{

}

