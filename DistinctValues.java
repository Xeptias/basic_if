public class DistinctValues{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
			if (a==b&&b==c){
				System.out.println("1");
			}
			else
			/*if (a!=b) {System.out.println( a +" "+ b);}
			else if (b!=c) {System.out.println( b +" "+ c);}
			else if (c!=a) {System.out.println( a +" "+ c);}
			//else System.out.println( a + " " + b + " " + c);
			//else System.out.println("Not equals");*/

			if (a!=b && b!=c && a!=c)System.out.println("3");

				else if (a==b || b!=c || b!=c)System.out.println("2");
	}

}