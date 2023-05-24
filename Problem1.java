import java.util.*;

public class week13_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 필요한 자료형을 넣어주세요
		ArrayList<Double> list = new ArrayList<Double>();
		System.out.print("Enter five integers and five doubles: ");

		for (int i = 0; i < 10; i++) {
			double in = input.nextDouble();
			list.add(in);
		}

		list = sort(list);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 1 == 0)
				System.out.printf("%.0f ",list.get(i));
			else if (list.get(i) % 1 != 0)
				System.out.print(list.get(i) + " ");
		}
	}

	public static ArrayList<Double> sort(ArrayList<Double> arr) {
		Collections.sort(arr);

		return arr;
	}
}
