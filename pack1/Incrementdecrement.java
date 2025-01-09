package pack1;

public class Incrementdecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8;
		int b=5;
		int c= a++ + --b + a++;
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		
		int d=8;
		int e=5;
		int f= ++d + e-- + ++d;
		
		System.out.println("d:"+d);
		System.out.println("e:"+e);
		System.out.println("f:"+f);
		
		int g=2;
		int h=3;
		int i= ++g * h-- + ++g;
		
		System.out.println("g:"+g);
		System.out.println("h:"+h);
		System.out.println("i:"+i);



	}

}
