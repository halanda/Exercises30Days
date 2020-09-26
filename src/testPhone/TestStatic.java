package testPhone;

public class TestStatic {
	double price;
	static String name;
	
	static {
		System.out.println("静态块");
	}
	{
		System.out.println("实例块");
	}
	public static void main(String[] args) {
		TestStatic t = new TestStatic();
		System.out.println(t.price);
		System.out.println(TestStatic.name);
	}
	
}
