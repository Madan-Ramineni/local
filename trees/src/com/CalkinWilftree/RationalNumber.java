package com.CalkinWilftree;

public class RationalNumber
{
   private int numerator, denominator;
   public RationalNumber(int num, int den)
   {
      if (den == 0)
         den = 1;

      if (den < 0)
      {
         num = num * -1;
         den = den * -1;
      }
      numerator = num;
      denominator = den;
      reduce();
   }
   
   //To return numerator
   public int getNumerator()
   {
      return numerator;
   }
   
   //To return denominator
   public int getDenominator()
   {
      return denominator;
   }
   public RationalNumber reciprocal()
   {
      return new RationalNumber(denominator, numerator);
   } //End reciprocal
   
   //For adding rationals
   public RationalNumber add(RationalNumber op2)
   {
      int commonDenominator = denominator * op2.getDenominator();
      int num1 = numerator * op2.getDenominator();
      int num2 = op2.getNumerator() * denominator;
      int sum = num1 + num2;

      return new RationalNumber(sum, commonDenominator);
   } //End Addition
   
   //For subtracting rationals
   public RationalNumber subtract(RationalNumber op2)
   {
      int commonDenominator = denominator * op2.getDenominator();
      int num1 = numerator * op2.getDenominator();
      int num2 = op2.getNumerator() * denominator;
      int diff = num1 - num2;

      return new RationalNumber(diff, commonDenominator);
   } //End Subtraction
   public RationalNumber multiply(RationalNumber op2)
   {
      int num = numerator * op2.getNumerator();
      int den = denominator * op2.getDenominator();

      return new RationalNumber(num, den);
   } //End Multiply
   
   //For Dividing rationals
   public RationalNumber divide(RationalNumber op2)
   {
      return multiply(op2.reciprocal());
   } //End Divide
   
   public boolean equals(RationalNumber op2)
   {
      return(numerator == op2.getNumerator() &&
             denominator == op2.getDenominator() );
   }
   
   public boolean lessThan(RationalNumber op2)
   {
	return(numerator * op2.getDenominator() < denominator * op2.getNumerator());
   }
   
   public boolean greaterThan(RationalNumber op2)
   {
	return(numerator * op2.getDenominator() > denominator * op2.getNumerator());
   }
   
   public String toString()
   {
      String result;
 
      if (numerator == 0)
         result = "0";
      else
         if (denominator == 1)
            result = numerator + "";
         else
            result = numerator + "/" + denominator;

      return result;
   } //End toString
   
   //Reduced form
   private void reduce()
   {
      if (numerator != 0)
      {
         int common = gcd(Math.abs(numerator), denominator);
         numerator = numerator / common;
         denominator = denominator / common;
      }
   } //End Reduce
   private int gcd(int num1, int num2)
   {
      while (num1 != num2)
         if (num1 > num2)
            num1 = num1 - num2;
         else
            num2 = num2 - num1;
      return num1;
   } //End GCD
} //End RationalNumber
