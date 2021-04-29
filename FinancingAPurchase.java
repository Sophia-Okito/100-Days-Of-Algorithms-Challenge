package com.company;

public class FinancingAPurchase {

    public static void main(String[] args) {
        System.out.println(amort(25, 500, 45, 6));
    }
    public static String amort(double rate, int bal, int term, int num_payments) {
        double prince = 0;
        double newbalance = bal;
        int count = 0;
        double interest = 0;

        double c = bal * Math.pow(1 + rate / 100 / 12, term) * (rate / 100 / 12) / (Math.pow(1 + rate / 100 / 12, term) - 1);

        for (int i = 0; i < term; i++) {
            prince = c - (rate / 100 / 12) * newbalance;
            interest = c - prince;
            newbalance -= prince;
            count++;
            if (count == num_payments) {
                break;
            }
        }

        return (String.format("num_payment %d c %.0f princ %.0f int %.0f balance %.0f", num_payments, c, prince, interest, newbalance ));
    }
}
