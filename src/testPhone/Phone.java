package testPhone;

public class Phone {
	static {
		System.out.println("我是静态块");
	}
	{
		System.out.println("我是块");
	}
	
	private String logo="三星";
	private double pirce=3999;
	private String color="白色";
	public String location="韩国";
	//默认修饰符
	double width=3;
	//保护的
	protected double length=12;
	

	public String getLogo() {
		return logo;
	}



	public void setLogo(String logo) {
		this.logo = logo;
	}



	public double getPirce() {
		return pirce;
	}



	public void setPirce(double pirce) {
		this.pirce = pirce;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}

	

	public Phone(String logo, double pirce, String color, String location, double width, double length) {
		super();
		this.logo = logo;
		this.pirce = pirce;
		this.color = color;
		this.location = location;
		this.width = width;
		this.length = length;
	}
	
	
	public Phone(String color) {
		super();
		this.color = color;
	}
	
	


	public Phone() {
		super();
	}

	

	public static void Call() {
		System.out.println("打电话");
	}
	
	



	



	@Override
	public String toString() {
		return "Phone [logo=" + logo + ", pirce=" + pirce + ", color=" + color + ", location=" + location + ", width="
				+ width + ", length=" + length + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone();
		Phone.Call();
		//System.out.println(p.color);
		//System.out.println("我是普通执行语句，必须在main中执行");
	}

}
