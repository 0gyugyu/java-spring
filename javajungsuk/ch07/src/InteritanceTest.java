class MyPoint extends Object{
	int x;
	int y;
}

//class Circle extends MyPoint { //상속
//	int r;
//}

class Circle extends Object{	//포함
	MyPoint p = new MyPoint();	//참조변수의 초기화,  = new MyPoint();를 안 해주면 안된다. 
	int r;
	
//	아니면 생성자에서 초기화
//	Circle(){	// 생성자 초기화 방법
//		p = new MyPoint();
//	}
	
}

public class InteritanceTest {
	 public static void main(String[] args) {
			Circle c = new Circle();
			
			System.out.println(c.toString());	//"Circle@3d012ddd" - Object의 메서드이기 때문에 사용이 가능
			System.out.println(c);	//"Circle@3d012ddd"
			
//			c.p.x = 1;
//			c.p.y = 2;
//			c.r = 3;
//			System.out.println(c.p.x);
//			System.out.println(c.p.y);
//			System.out.println(c.r);
	 }
}
