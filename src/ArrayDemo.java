
public class ArrayDemo {
public static void main(String[] args) {
	//int[] myintArray1;
	/*myintArray1=new int[10];
	myintArray1[0]=100;
	myintArray1[1]=900;*/
	int[] myIntArray1={100,90};
	System.out.println("0 index:" + myIntArray1[0]);
	System.out.println("1st index:" + myIntArray1[1]);
	//System.out.println("2nd index:" + myintArray1[2]);
	
	String[] myStringArray1={"bmw", "audi", "honda"};
	System.out.println("0 index:" + myStringArray1[0]);
	System.out.println("1st index:" + myStringArray1[1]);
	System.out.println("2nd index:" + myStringArray1[2]);
	
	int len1=myIntArray1.length;
	int len2=myStringArray1.length;
	
	System.out.println("Int Array length:" + len1);
	System.out.println("String Array length:" + len2);
	
	
	
}
}
