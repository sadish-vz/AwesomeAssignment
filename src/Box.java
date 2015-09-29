
public class Box {
int x;
int y;

public Box(int theX,int theY)
{
	x = theX;
	y = theY;
	}

public int GetArea()
{
return x * y;	}

	public static void main(String[] args) {
		System.out.println("Hello World");
Box b1 = new Box(10,15);
System.out.println("Area: " + b1.GetArea());
	}

}
