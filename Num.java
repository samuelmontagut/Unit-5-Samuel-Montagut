
public class Num {
	
	private int num;
	
	public Num(int n) {
		num = n;
	}
	
	public void setNum(int u) {
		num = u;
	}
	public int getNum() {
		return num;
	}
	public String toString() {
		return "" + num;
	}
	public boolean compareNums(Num otherNum) {
		return this.getNum() == otherNum.getNum();
	}

}
