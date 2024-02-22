package arraytolist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class araio {
	public static void main(String[] args) {
		
	
	String a="Strinjk";
	String b="Selviammal";
	
	System.out.println("+++++SWAPPINGBEORE");
	System.out.println(a);
	System.out.println(b);	
String temp=a;
a=b;
b=temp;
System.out.println("+++++SWAPPINGafteRE");
System.out.println(a);
System.out.println(b);	
	
	
//int[] ints =new int[5];
//ints[0]=10;
//ints[1]=28;
//ints[2]=430;
//ints[4]=40;
//
//List<Integer> l=new ArrayList<Integer>();
//Collections.addAll(l,Arrays.stream(ints).boxed().toArray(Integer[]::new));
//	System.out.println(l);
	}
}
