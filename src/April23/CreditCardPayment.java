package April23;

public class CreditCardPayment  implements Payable{
    private String cardNumber;
    private String cardHolderName;

    public CreditcardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Processing credit card payment of $%.2f with card ending in %s for %s\n",
                amount, cardNumber.substring(cardNumber.length() -4),cardHolderName);
    }
    @Override

    public void refund(double amount) {
        System.out.printf("Refunding $s.2f to credit card ending in %s for %s\n",
                amount, cardNumber.substring(cardNumber.length() -4), cardHolderName) ;
    }
}
