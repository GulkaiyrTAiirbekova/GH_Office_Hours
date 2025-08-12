package April23.payable;

import java.util.Random;


/*
public class PaymentProcessor {
    public final int cardNumber;
    //public final int cardNumber = 1;
    then we don't need further constructor

    public PaymentProcessor(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}

 */
public class PaymentProcessor {

    public static void processPayments(Payable[] payments) {
        Random rand = new Random();

        for (Payable payment : payments) {
            double amount = 1 + rand.nextDouble() * 99; //Random amount between $1-100
            payment.pay(amount);
        }
    }
}

/*
in case if not "public static void" then we need to create
PaymentProcessor ins =  New PaymentProccessor();
ins.


and only then it will be available

1.) PaymentProcessor.processPayments(payments);
2.) PaymentProcess inst = new PaymentProcessor();
inst.processPayments(payments);
 */


