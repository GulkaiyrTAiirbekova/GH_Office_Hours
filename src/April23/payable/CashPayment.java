package April23.payable;

public class CashPayment  implements Payable { //whenever "implements" must have @Override
    @Override
    public void pay(double amount) {
        System.out.println("Accepting cash payment of $%.2f\n", amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Please return to the cashier to receivr your cash refund of $%.2f\n", amount);
    }
}

