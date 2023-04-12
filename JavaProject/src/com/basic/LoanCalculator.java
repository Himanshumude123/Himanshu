package com.basic;

import java.util.Scanner;

public class LoanCalculator {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        double principalAmount = sc.nextDouble();
        
        System.out.print("Enter the interest rate: ");
        double interestRate = sc.nextDouble();
        
        double loanAmount;
        
        if (interestRate != 0) {
            // Housing loan
            loanAmount = principalAmount * (100 + interestRate) / 100;
        } else {
            // Commercial loan
            System.out.print("Enter value 1: ");
            double value1 = sc.nextDouble();
            
            System.out.print("Enter value 2: ");
            double value2 = sc.nextDouble();
            
            loanAmount = principalAmount * (value1 + value2 + 100) / 100;
        }
        
        System.out.printf("The loan amount is: %.2f", loanAmount);
    }
    
}

