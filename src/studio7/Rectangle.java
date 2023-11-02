package studio7;

public class Rectangle {
	
	private int length;
	private int width;
	
	
	public Rectangle(int w, int l) {
		length = l;
		width = w;	
		
	}
	
	public int area() {
		int area;
		return area = length * width; 
	}
	
	public int perimeter() {
		int perimeter;
		return perimeter =( (2*length)+ (2*width)) ;
	}
	
	public boolean square() {
		return length == width;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		

	}

}
