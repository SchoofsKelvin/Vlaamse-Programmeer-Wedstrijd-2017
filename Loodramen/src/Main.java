import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			boolean[][] raam = readWindow(sc);
			int rows = raam.length;
			int cols = raam[0].length;
			StringBuffer res = new StringBuffer();
			solve(raam, res, 1, 1);
			// for (int ii=0; ii<rows; ii++) {
			// for (int j=0; j<cols; j++) {
			// System.out.print(raam[ii][j] ? "1" : "0");
			// }
			// System.out.println();
			// }
			System.out.println(i + 1 + " <" + rows + "," + cols + ">" + res.toString());
		}

		sc.close();
	}

	public static String cut(int x, int y, String[] raam) {
		return "";
	}

	public static boolean isPoint(boolean[][] raam, int row, int col) {
		if (row == 1 && col == 2) {
//			System.out.println();
		}
		int rows = raam.length;
		int cols = raam[0].length;
		if (row == 0 || row == rows - 1) return false;
		if (col == 0 || col == cols - 1) return false;
		for (int x = 0; x < rows; x++) {
			if ( !raam[x][col]) return false;
		}
		for (int y = 0; y < cols; y++) {
			if ( !raam[row][y]) return false;
		}
		return true;
	}

	public static boolean[][] readWindow(Scanner sc) {
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		sc.nextLine();
		boolean[][] res = new boolean[rows][];
		for (int row = 0; row < rows; row++) {
			String line = sc.nextLine();
			boolean[] leRow = new boolean[cols];
			for (int c = 0; c < cols; c++) {
				leRow[c] = line.charAt(c) == '*';
			}
			res[row] = leRow;
		}
		return res;
	}

	public static void solve(boolean[][] raam, StringBuffer res, int x, int y) {
		int rows = raam.length;
		if (rows == 0) return;
		int cols = raam[0].length;
		if (cols == 0) return;
		for (int row = 1; row < rows - 1; row++) {
			for (int col = 1; col < cols - 1; col++) {
				if (isPoint(raam, row, col)) {
					res.append("(" + (row+x) + "," + (col+y) + ")");
					int idk = 0;
					for (boolean[][] part : split(raam, row, col)) {
						res.append("[");
						int rrow = ((idk == 2 || idk == 3) ? row + x+1 : x);
						int ccol = ((idk == 1 || idk == 3) ? col + y+1 : y);
						solve(part, res,rrow,ccol);
						res.append("]");
						idk++;
					}
				}
			}
		}
	}

	public static boolean[][] range(boolean[][] raam, int xmin, int ymin, int xmax, int ymax) {
		int rows = xmax - xmin, cols = ymax - ymin;
		boolean[][] res = new boolean[rows][cols];
		for (int x = 0; x < rows; x++) {
			for (int y = 0; y < cols; y++) {
				res[x][y] = raam[x + xmin][y + ymin];
			}
		}
		return res;
	}

	public static boolean[][][] split(boolean[][] raam, int x, int y) {
		int rows = raam.length;
		int cols = raam[0].length;
		boolean[][] leftTop = range(raam, 0, 0, x , y );
		boolean[][] rightTop = range(raam, x + 1, 0, rows, y);
		boolean[][] leftBottom = range(raam, 0, y + 1, x, cols);
		boolean[][] rightBottom = range(raam, x + 1, y + 1, rows, cols);
		return new boolean[][][] { leftTop, leftBottom, rightTop, rightBottom };
	}

	private class Panel{
		
		int i;
		int j;
		private Panel p1;
		private Panel p2;
		private Panel p3;
		private Panel p4;
		
		Panel(int x, int y){
			i = x;
			j = y;
		}
		
		Panel(){
			i = -1;
			j = -1;
		}
		
		public void cut(int x, int y){
			if(i == -1 && j == -1){
				i = x;
				j = y;
				p1 = new Panel();
				p2 = new Panel();
				p3 = new Panel();
				p4 = new Panel();
			}else{
				if(x < i && y < j){
					
				}

				if(x < i && y < j){
					
				}

				if(x < i && y < j){
					
				}

				if(x < i && y < j){
					
				}
			}
		}
		
		@Override
		public String toString(){
			if(i == -1 || j == -1){
				return "";
			}else{
				String p1s = "";
				String p2s = "";
				String p3s = "";
				String p4s = "";
				if(p1 != null){
					p1s = p1.toString();
				}
//				return "("+i+","+j+")" + ;
				return "";
			}
		}
	}
}
