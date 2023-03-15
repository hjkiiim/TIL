package org.example.behavioralPattern.strategy.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy{
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        try{
            System.out.print("Enter the card number : ");
            String number = READER.readLine();
            System.out.print("Enter the card expiration data MM/YY");
            String date = READER.readLine();
            System.out.print("Enter the CVV code : ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public boolean pay(int paymentAmount) {
        if(cardIspresent()){
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }
    private boolean cardIspresent(){
        return card != null;
    }
}
