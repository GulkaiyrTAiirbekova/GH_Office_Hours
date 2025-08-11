package April23;
import chess.*;
import chess.game.ChessboardCall;
import chess.game.ChessBoardEmptyPiece;
import chess.game.ChessBoardNull;
import formatting.*;
import printing.*;
import vehicle.Bicycle;
import vehicle.Train;
import vehicle.TransportVehicle;

import java.util.Random;


public class Main {
    public static void main(String [] args) {
        System.out.println("=== 1. Payment System ===");
        //Create payment objects
        Payable creditCard = new CreditCardPayment("343222222222222","John Doe");
        Payable cash = new CashPayment();

        //Demonstrate individual payments

        creditCard.pay(99.99);
        cash.pay(25.59);

        //Demonstrate refunds
        creditCard.refund(10.00);
        cash.refund(5.00);

        //Bonus: Process payment array with random amounts

        Payable [] payments = {
                new CreditCardPayment("555555555555","Jane Smith"),
                new CashPayment(),
                new CreditCardPayment("346787653543","Bob Johnson")
        };

        System.out.println("\nProcessing mutable payments:");
        PaymentProcessor.processPayments(payments); //line 36

    }
}
