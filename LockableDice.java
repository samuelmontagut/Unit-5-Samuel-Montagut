
import java.util.Random;

public class LockableDice implements Lockable {
	
	Random rand = new Random();
	private int number;
	private int key;
	private boolean isLocked;
	
	public LockableDice(int key) {
		isLocked = true;
		this.key = key;
	}
	
	
	public void roll() {
		if (!isLocked) {
			number = rand.nextInt(6) +1 ;
		}	
	}
	
	public int getNumber() {
		if (!isLocked) {
			return number;
		}
		else {
			return 9999999;
		}
	}
	
	public void setKey(int key) {
		if(!isLocked) {
			this.key = key;
		}
	}
	
	public void lock(int key) {
		if (this.key == key) {
			isLocked = true;
		}
	}
	
	public void unlock(int key) {
		if (this.key == key) {
			isLocked = false;
		}
	}
	
	public boolean locked() {
		return isLocked;
	}

}
