package org.sample;

public class Logic {
int out=0;
	private void oddNoSeries(int num) {
		while(num>0) {
	      int a = num%10;
	      out++;
	      num=num/10;
		}	
		   System.out.println(out);
		   System.out.println("ma");
		}
	public static void main(String[] args) {
		Logic l = new Logic();
		l.oddNoSeries(7654321);
		System.out.println("naveen");
	}
}
