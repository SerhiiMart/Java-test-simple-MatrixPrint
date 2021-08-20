package matrixproject;

public class matrixproject {
	public static void main(String args[]){
		for (int j = 1; j <= 25; j++) {
			switch (j) {
				case 1:
				case 5:
				case 7:
				case 9:
				case 13:
				case 17:
				case 19:
				case 21:
				case 25:
					System.out.print(" * ");
					break;
				default: System.out.printf("%2d ", j);
			}
			if (( j % 5) == 0) {
				System.out.println("\n");
			}
		}
	}

}
