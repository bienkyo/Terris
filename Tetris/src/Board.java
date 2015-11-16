// Board.java

/**
 Tao ban choi Tetris, cung cap cac kieu hinh.
 Co chuc nang "undo".
*/
public class Board	{
	private int width;
	private int height;
	private boolean[][] grid;
	private boolean DEBUG = true;
	boolean committed;
	
	/**
	 Tao ban choi trong voi su cho truoc do cao va rong cua tung block.
	*/
	public Board(int width, int height) {
		this.width = width;
		this.height = height;
		grid = new boolean[width][height];
	}
	
	/**
	 Tra ve do rong cua block.
	*/
	public int getWidth() {
		return width;
	}
	
	
	/**
	 Tra ve do cao cua block.
	*/
	public int getHeight() {
		return height;
	}
	
	/**
	 Tra ve gia tri max cua do cao cua cot hien tai. Gia tri bang 0 neu rong.
	*/
	public int getMaxHeight() {	 
		return 0;
	}
		
	/**
	 Cho mot hinh va toa do x, tra ve gia tri toa do y ve cac diem den cua hinh khi cho no roi thang theo truc x.
	*/
	public int dropHeight(Piece piece, int x) {
		return 0;
	}
	
	/**
	 Tra ve do cao cua cot - gia tri toa do y cua block cao nhat + 1. Gia tri bang 0 neu cot khong co block nao.
	*/
	public int getColumnHeight(int x) {
		return 0;
	}
	
	/**
	 Tra ve so block trong mot dong cho truoc
	*/
	public int getRowWidth(int y) {
		 return 0;
	}
	
	/**
	 Tra ve true neu block trong ban. 
	 Cac block o ben ngoai ma trong vung do rong/cao phu hop luon tra ve gia tri true
	*/
	public boolean getGrid(int x, int y) {
		return false;
	}
	
	public static final int PLACE_OK = 0;
	public static final int PLACE_ROW_FILLED = 1;
	public static final int PLACE_OUT_BOUNDS = 2;
	public static final int PLACE_BAD = 3;
	
	/**
	 Tao cac hinh cua tetris. 
	 Cho phep tao cac chuc nang undo de quay lai 1 vi tri truoc do
	*/
	public int place(Piece piece, int x, int y) {
		if (!committed) throw new RuntimeException("place commit problem");
			
		int result = PLACE_OK;
		
		// Viet code vao day
		
		return result;
	}

	/**
	 Xoa dong khi no duoc lap day, va chuyen cac dong tren xuong.
	 Tra ve so cac dong con lai
	*/
	public int clearRows() {
			int rowsCleared = 0;
		// Viet code tai day
		return rowsCleared;
	}



	/**
	 Khoi phuc lai trang thai truoc do 1 vi tri va 1 clearRows().
	 Undo chi duoc goi 1 lan (chi duoc quay lai vi tri truoc do 1 lan)
	*/
	public void undo() {
		//Viet code tai day
	}
	
	
	/**
	 Ghi lai trang thai hien tai nhu la trang thai khoi tao mot lan choi moi.
	*/
	public void commit() {
		committed = true;
		//Viet code tai day
	}


	
	/*
	 Render trang thai cho nhu mot xau ky tu dang String. Su dung de in ra trang thai hien tai
	*/
	public String toString() {
		StringBuffer buff = new StringBuffer();
		for (int y = height-1; y>=0; y--) {
			buff.append('|');
			for (int x=0; x<width; x++) {
				if (getGrid(x,y)) buff.append('+');
				else buff.append(' ');
			}
			buff.append("|\n");
		}
		for (int x=0; x<width+2; x++) buff.append('-');
		return(buff.toString());
	}
}
