class MyPoint3 extends Object{
	int x;
	int y;
	
	//생성자
	MyPoint3(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// Object클래스의 toString()을 오버라이딩
	public String toString() {
		return "x:"+x+", y:"+y;
	}
}

//class MyPoint3D extends MyPoint3{
//	int z;
//
//	// 조상의 getLocation()을 오버라이딩
//	// getLocation을 상속 받긴 받음
//	// 그러나 조상것을 사용하지 않고 자손 것을 사용함
//	String getLocation() {
//		return "x:"+x+", y:"+y+", z:"+z;
//	}
//}

public class OverrideTest {

	public static void main(String[] args) {
		MyPoint3 p = new MyPoint3(1,2);
		System.out.println(p);
		
//		MyPoint3 p = new MyPoint3(3,5);
//		p.x = 3;
//		p.y = 7;
//		System.out.println(p.toString());
//		System.out.println("p.x="+p.x);
//		System.out.println("p.y="+p.y);
	}
}
