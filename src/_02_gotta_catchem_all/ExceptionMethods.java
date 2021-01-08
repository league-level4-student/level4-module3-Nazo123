package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divideZero(double num,double denominator) throws IllegalArgumentException {
		if(denominator == 0.0) {
			throw new IllegalArgumentException();
		}else {
			return num/denominator;
		}
		
	}
	public String reverseString(String s) throws IllegalStateException{
		String w = "";
		if(s.equals("")) {
			throw new IllegalStateException();
		}
		char[] a = s.toCharArray();
		for(int i = a.length-1; i > -1;i--) {
			System.out.print(i);
			w = w+a[i];
			System.out.print(w);
		}
		System.out.println(s);
	
		return w;
	}
}
