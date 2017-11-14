//package wkfl;
//import java.util.Scanner;
//
//public class Solve {
//	static int N,M;
//	// N * M 크기의 지도
//	// 위 오 아 왼
//	static int yy[] = {-1, 0, 1, 0};
//	static int xx[] = {0, -1, 0, 1};
//	static int map[][];
//	static int visit[][];
//	static int save;
//	// 안전한 곳 숫자
//	static int wall = 3;
//	static int row, col;
//	// 세워야 할 벽 숫자 3개 -> wall--;로 세우고 줄이기
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
//		// 맵 2개 만들어 줘서 방문한거 표시해 주기
//			} // 맵 정해주기
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
//	// 먼저 방어벽 설치한 다음에 바이러스 퍼뜨리기...
////	static void reset(){
////		
////	}
//	static void dfs(int xx, int yy){
//		
//	}
//	static void solve(){
//		// 방어벽 3개 설치하기...
//		for(int i = 0; i < N; i++){
//			for(int j = 0; j < M; j++){
//				if(map[i][j] == 2){
//					
//				}
//			} // 맵 정해주기
//		}
//	}
//	
//	static void safety(){
//		// 안전 가옥갯수 세기
//	}
//	static void spread(){
//		// 바이러스 퍼뜨리기
//	}
//}

package wkfl;
import java.util.Scanner;

public class Solve{
	static int dx[] = {};
	static int dy[] = {};
	static int [][] map, visit; // 이중배열 이렇게도 만들 수가 있다.
	static int N, M;
	static int wallcnt = 3;
	static int number; // 안전영역 수
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
