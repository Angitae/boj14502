//package wkfl;
//import java.util.Scanner;
//
//public class Solve {
//	static int N,M;
//	// N * M ũ���� ����
//	// �� �� �� ��
//	static int yy[] = {-1, 0, 1, 0};
//	static int xx[] = {0, -1, 0, 1};
//	static int map[][];
//	static int visit[][];
//	static int save;
//	// ������ �� ����
//	static int wall = 3;
//	static int row, col;
//	// ������ �� �� ���� 3�� -> wall--;�� ����� ���̱�
//	
//	
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		N = sc.nextInt();
//		M = sc.nextInt();
//		map = new int[N][M];
//		visit = new int[N][M];
//		for(int i = 0; i < N; i++){
//			for(int j = 0; j < M; j++){
//				 map[i][j] = sc.nextInt();
//		// �� 2�� ����� �༭ �湮�Ѱ� ǥ���� �ֱ�
//			} // �� �����ֱ�
//		}
//		for(int i = 0; i< N*M; i++){
//			row = i / M;
//			col = i % M;
//			if(map[row][col] == 0 ){
//				dfs(row, col);
//			}
//		}
//		solve();
//		System.out.println(save);
//	}
//	// ���� �� ��ġ�� ������ ���̷��� �۶߸���...
////	static void reset(){
////		
////	}
//	static void dfs(int xx, int yy){
//		
//	}
//	static void solve(){
//		// �� 3�� ��ġ�ϱ�...
//		for(int i = 0; i < N; i++){
//			for(int j = 0; j < M; j++){
//				if(map[i][j] == 2){
//					
//				}
//			} // �� �����ֱ�
//		}
//	}
//	
//	static void safety(){
//		// ���� �������� ����
//	}
//	static void spread(){
//		// ���̷��� �۶߸���
//	}
//}

package wkfl;
import java.util.Scanner;

public class Solve{
	static int dx[] = {};
	static int dy[] = {};
	static int [][] map, visit; // ���߹迭 �̷��Ե� ���� ���� �ִ�.
	static int N, M;
	static int wallcnt = 3;
	static int number; // �������� ��
	static int row, col;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		 N = sc.nextInt();
		 M = sc.nextInt();
		 map = new int[N][M];
		 visit = new int[N][M];
		 for(int i = 0; i< N; i++){
			 for(int j=0; j<M; j++){
				 map[i][j] = sc.nextInt();
			 }
		 }
		 
		 for(int i= 0 ; i < N*M; i++){
			 row = i / M;
			 col = i % M;
			 if(map[row][col] == 0){
				 map[row][col] = 1;
				 dfs(row, col);
				 map[row][col] = 0;
			 }
		 }
		 
		}
	
	static void dfs(int j , int k){
		
	}
	
	static void spread(){
		
	}
}
