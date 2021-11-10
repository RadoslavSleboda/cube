package block;
import java.util.Scanner;

public class Block {

	Scanner key = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Set cube size:");
		int size = key.nextInt();
		cube(size);

}
	
	public static void cube(int size) {
		// top part
		for (int i = 0; i <= size /2; i++) {
		System.out.print(" ");
		}

		for (int i = 0; i < 2 * size; i++) {
			System.out.print("_");
			}
		System.out.println(" ");
		for (int i = 0; i < size /2; i++) {
			for (int j = size/2; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("/");
			for (int x = 0; x < 2 * size; x++) {
				System.out.print(" ");
			}
			System.out.print("/");
			for (int y = 0; y < i; y++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println(" ");
		}
		// bottom part
		System.out.print(" ");
		for (int i = 0; i < 2 * size; i++) {
		System.out.print("_");
		}
		
		System.out.println(" ");
		for (int i = 1; i < size; i++) {
			System.out.print("|");
			
			for (int j = 0; j < 2 * size; j++) {
				System.out.print(" ");
			}
			System.out.print("|");
			if (i < size/2) {
				for (int j = 0; j < size/2; j++) {
					System.out.print(" ");
				}
			System.out.print("|");
			} else { 
				for (int x = size - i; x > 0; x--) {
					System.out.print(" ");
				}
				System.out.print("/");
			}
			System.out.println(" ");
			}
		System.out.print("|");
		System.out.print(" ");
		for (int i = 1; i < 2 * size; i++) {
			System.out.print("_");
			}
		System.out.print("|");
		}
	}

