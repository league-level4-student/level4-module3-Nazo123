package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divideZero(double num,double denominator) throws Exception {
		if(denominator == 0.0) {
			throw new IllegalArgumentException();
		}else {
			return num/denominator;
		}
		
	}
	public static String reverseString(String s) throws Exception{
		String w = "";
		if(s.contentEquals(null)) {
			throw new IllegalStateException();
		}
		char[] a = s.toCharArray();
		for(int i = a.length-1; i > 0;i--) {
			w = ""+a[i];
		}
		return w;
	}
}
