
public class Slogan {
	
	private String slogan;
	private static int instances = 0;

	public Slogan(String slo) {
		slogan = slo;
		instances++;
	}
	public String toString() {
		return slogan;
	}
	public static int getCount() {
		return instances;
	}
}