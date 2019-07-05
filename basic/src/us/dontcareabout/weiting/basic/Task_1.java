package us.dontcareabout.weiting.basic;

public class Task_1 {
	/**
	 * 在 level = 5 的 case 下要在 console 顯示：
	 * <pre>
	 *      1
	 *     234
	 *    56789
	 *   0123456
	 *  789012345
	 * </pre>
	 */
	public static void main(String[] args) {
		int level = 5;

		version1(level);
		System.out.println("================================");
		version2(level);
		System.out.println("================================");
		version3(level);
	}

	private static void version1(int level) {
		int num = 0; //共有幾個數字
		for (int i = 1; i <= 2*level-1; i+=2) {
			num += i;
		}
		int x = 1; //用來跑要印的數字
		for (int i = 1; i <= level; i++) {
			for (int j = level-i; j >= 0; j--) {//印空格
				System.out.print(" ");
			}
			int count = 0; //紀錄每一層印了幾個數字
			while (x <= num) {
				if (count == 2*i-1) {
					break;
				}
				System.out.print(x%10);
				count++;
				x++;
			}
			System.out.println();
		}
	}

	private static void version2(int level) {
		int x = 1; //用來跑要印的數字
		int[][] list = new int[level][];
		for (int i = 0; i < level; i++) {
			int[] tmp = new int[2*(i+1)-1];
			list[i] = tmp; // [00],[[10][11],[20][21][22],[30][31][32][33],[40][41][42][43][44]
			for (int j = 0; j < tmp.length; j++) {
				list[i][j] = x % 10;
				x++;
			}
		}
		for (int i = 0; i < level; i++) {
			for (int j = level-i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < list[i].length; j++) {
				System.out.print(list[i][j]);
			}
			System.out.println();
		}
	}

	private static void version3(int level) {
		// TODO Auto-generated method stub
	}
}
