

import java.util.Scanner;

public class Main_2563 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[100][100];

		int n = sc.nextInt();
		int cnt = 0;
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for(int j=x;j<x+10;j++) {
				for(int k=y;k<y+10;k++) {
					arr[j][k] = 1;
				}
			}
		}
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(arr[i][j] == 1) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}

}
