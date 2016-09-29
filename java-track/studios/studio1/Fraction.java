package studio1;

import java.util.Scanner;

public class Fraction 
{
	private int numerator, denominator;
	
	public Fraction(int numerator, int denominator)
	{
		
		this.numerator = numerator;
		this.denominator = denominator;
		
	}

	public int getNumerator()
	{
		return numerator;
	}

	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
	}

	public int getDenominator()
	{
		return denominator;
	}

	public void setDenominator(int denominator) 
	{
		this.denominator = denominator;
	}

	public String fractions()
	{
		System.out.println("The simplified fraction :" + Simplify(this.numerator,this.denominator));
		return this.numerator+"/"+this.denominator;
	}
	public String reciprocals()
	{
		return this.denominator+"/"+this.numerator;
	}
	
	public String Sum(Fraction a) 
	{
		int d =  this.denominator*a.denominator;
		int n1 = this.numerator*a.denominator;
		int n2 = a.numerator*this.denominator; 
		int n = n1+n2;
		
		return Simplify(n,d);
	}

	public String Product(Fraction a)
	{
		int d =  this.denominator*a.denominator;
		int n = this.numerator*a.numerator;
		return Simplify(n,d);
	}
	
	public String Simplify(int n , int d)
	{
		int c = gcd(n,d);
		int n1 = n/c;
		int d1 = d/c;
		return n1+"/"+d1;
	}
	public int gcd(int a, int b) {
	    if (a == 0)
	        return b;

	    while (b != 0) {
	        if (a > b)
	            a = a - b;
	        else
	            b = b - a;
	    }

	    return a;
	}
	public String toString() {
		return "[numerator=" + numerator + ", denominator=" + denominator + ", fraction=" + fractions()
				+ ", reciprocal=" + reciprocals() + " Simplified fraction ="+ Simplify(numerator,denominator)+ "]";
	}

	public static void main(String[] args) 
	{
		Fraction a = new Fraction(3,5);
		System.out.println(a);
		System.out.println("The sum of two fractions "+a.Sum(new Fraction(4,7)));
		System.out.println("The product of two fractions "+a.Product(new Fraction(4,7)));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator: " );
		int nume1 = sc.nextInt();
		System.out.println("Enter the denominator: " );
		int deno1 = sc.nextInt();
		Fraction b = new Fraction(nume1,deno1);
		System.out.println(b);
		System.out.println("Enter the numerator: " );
		int nume2 = sc.nextInt();
		System.out.println("Enter the denominator: " );
		int deno2 = sc.nextInt();
		Fraction c = new Fraction(nume2,deno2);
		System.out.println(c);
		System.out.println("The sum of two fractions "+b.Sum(new Fraction(nume2,deno2)));
		System.out.println("The product of two fractions "+b.Product(new Fraction(nume2,deno2)));
	}

}
