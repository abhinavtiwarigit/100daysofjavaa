package mypackage;

interface /*abstract class*/ shape
{
	/*abstract*/ int area();
	/*abstract*/ int perimeter(); 	//abstract keyword not req by default it interface methods have abstract method
}
class circle implements /*extends*/ shape
{

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

							/*@Override
							int area() {
								// TODO Auto-generated method stub
								return 0;
							}
						
							@Override
							int perimeter() {
								// TODO Auto-generated method stub
								return 0;
							} */

}
public class Myclass {

}
