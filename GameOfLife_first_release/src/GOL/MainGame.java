package GOL;

import java.util.Timer;
import java.util.Scanner;

public class MainGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] field = new int[8][8];
		
		setup(field);
		GameGrid(field);
		
	}
	
	public static void setup(int field[][]) {
		int row= 0;
		int col= 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many coins to set [1-64]: ");
		int anz = scan.nextInt();
		for (int i = 0; i < anz; i++) {
			Scanner r = new Scanner(System.in);
			System.out.println("choose row: ");
			row = r.nextInt();
			Scanner c = new Scanner(System.in);
			System.out.println("choose column: ");
			col = c.nextInt();
			field[row][col] = 1;
		}
	}
	public static void GameGrid(int field[][]) {
		
		for (int row = 0; row < field.length; row++) {
			System.out.println(""); 
			for ( int col = 0; col < field.length; col++) {
				System.out.print(field[row][col] +" ");
				System.out.print("|");
			}
			
		}
		System.out.println("");
	}
	public static void check(char field[][]) {
	}
}
