package day1java;

class Bank 
{
    long accno=96123451234l;
    String ifsc="SBI993345665"; 
}

class Bank2 extends Bank
{
	String name="Vishnu";
	double salary =500000;
}

class BbDriver
{
	public static void main(String[] args)
	{
		Bank2 b=new Bank2();
		System.out.println(b.accno);
		System.out.println(b.ifsc);
		System.out.println(b.name);
		System.out.println(b.salary);
		
	}
}