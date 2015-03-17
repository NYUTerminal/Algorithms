public class Fibanocci {

	public static void main(String[] args) {
		System.out.println("static");
		long startTime = System.nanoTime();
		//System.out.println(fibonacci(50));
		long endTime = System.nanoTime();
		//System.out.println(endTime - startTime);
		System.out.println("dynamic");
		long startTimeDynamic = System.nanoTime();
		long[] temp = new long[101];
		System.out.println(fibonacciDynamic(40, temp));
		long endTimeDynamic = System.nanoTime();
		System.out.println(endTimeDynamic - startTimeDynamic);
		System.out.println("end");
	}

	public static int fibonacci(int num) {
		if (num < 1) {
			return -1;
		}

		if (num == 1 || num == 2) {
			return 1;
		}
		return fibonacci(num - 2) + fibonacci(num - 1);
	}

	public static long fibonacciDynamic(int num, long[] temp) {
		if (num < 1) {
			return -1;
		}
		if (temp[num] != 0) {
			return temp[num];
		}
		if (num == 1 || num == 2) {
			temp[num] = 1;
			return 1;
		}
		long currentFib = fibonacciDynamic(num - 2, temp)
				+ fibonacciDynamic(num - 1, temp);
		temp[num] = currentFib;
		return temp[num];
	}

}// 233274 - 10
// 679477 - 20