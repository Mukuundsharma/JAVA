
public class Main {
//page 87
	public static void main(String[] args) {

		int a = calcArea(7, 12);
		short c = 7;
		calcArea(c, 15);// works because short is primitive data type same as int
		// int d = calcArea(57);//Insufficient parameters
		calcArea(2, 3);
		long t = 42;
		// int f = calcArea(t,17);//t is not int, long is 64 bit
		// int g = calcArea();//no arguments to pass
		// calcArea();// no arguments to pass
		byte h = (byte) calcArea(4, 20);
		int j = calcArea(2, 3, 5);
	}

	static int calcArea(int height, int width) {
		int area = height * width;
		System.out.println(" the area is " + area);
		return area;
	}

	static int calcArea(int height, int width, int breadth)// created this method to fit three parameters
	{
		int area = height * width * breadth;
		System.out.println(" the area is " + area);
		return area;
	}

}
