package second;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			demo();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void demo() throws Exception {

		System.out.println("Hellow World ..!");

		int i =1/0;

		System.out.println("Program completed");
	}
}
