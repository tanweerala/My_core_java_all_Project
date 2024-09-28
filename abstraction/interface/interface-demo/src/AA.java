public interface AA 
{
	void method1();
	void method2();
	static void method3()
	{
		System.out.println("It is static method");
	}
	default void method4()
	{
		System.out.println("It is default method");
	}
}
