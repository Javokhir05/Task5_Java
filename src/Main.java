import  java.math.BigDecimal;
import  java.math.RoundingMode;
public class Main {
    public static void main(String[] args) {
        //Task 5 in Lab/Java
        // using double
//        double prCost = 9.99;
//
//        double grossVal = (double) (prCost * 0.23);
//        System.out.println("product cost = " + prCost);
//        System.out.println(" Value with VAT : " + (grossVal + prCost));
//
//        double totalVal = (double) ((grossVal + prCost) * 10000);
//        System.out.println("total Value : " + totalVal);

        // decimal
        BigDecimal prPrice = new BigDecimal("9.99");
        BigDecimal vatRate = new BigDecimal("0.23");

        BigDecimal vatAmount = prPrice.multiply(vatRate);
        BigDecimal grossPrice = prPrice.add(vatAmount);
        BigDecimal totalGross = grossPrice.multiply(BigDecimal.valueOf(10000));
        // First I was going to push this code without using RoundingMode which I didn't know
        BigDecimal totalPrPrice = totalGross.divide(BigDecimal.ONE.add(vatRate), 2, RoundingMode.HALF_UP);
        System.out.println("product price :" + prPrice);
        System.out.println("vat rate :" + vatRate);
        System.out.println("gross value :" + grossPrice);
        System.out.println("total gross value with vat :" + totalGross);
        System.out.println("Total price without vat: " + totalPrPrice);
    }
}