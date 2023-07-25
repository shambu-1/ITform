package q1;

class SingletonClass {

	private static SingletonClass single_instance = null;
	
	public String s;
	
	private SingletonClass() {
		s = "String of Singleton";
	}
	
	public static synchronized SingletonClass getInstane() {
		if(single_instance == null)
			single_instance = new SingletonClass();
		return single_instance;
	}
	
}

class Singleton{
	public static void main(String [] args) {
		SingletonClass x = SingletonClass.getInstane();
		SingletonClass y = SingletonClass.getInstane();
		SingletonClass z = SingletonClass.getInstane();
		
		
		System.out.println("HashCode of x is "+ x.hashCode());
		System.out.println("HashCode of y is "+ y.hashCode());
		System.out.println("HashCode of z is "+ z.hashCode());
		
		if(x ==y && y==z)
			System.out.println("All objects are pointing to one instance of the class");
		else
			System.out.println("All are diifferent object");
	}
}
