package day3;

public class Ex02 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 78; i++) {
			sum += i * (78-i);
		}
		System.out.println(sum);
	}
}
