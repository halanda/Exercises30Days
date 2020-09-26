package testPhone;

public class TestPhone {
	public static void main(String[] args) {
		Phone p = new Phone();
		Phone p1 = new Phone("绿色");
		Phone p2 = new Phone("苹果", 88, "金色", "usa", 11, 15);
		/*p.getColor();
		p.setColor("红色");*/
		//System.out.println(p1.getColor());
		System.out.println(p2);
	}
}
