
public class TaskManager {
	
	public static void main(String args[]) {
		
		Task cleanRoom = new Task("Clean my room", 3);
		System.out.println(cleanRoom.toString());
		cleanRoom.setPriority(2);
		System.out.println(cleanRoom.toString());
		cleanRoom.doTask();
		System.out.println(cleanRoom.toString());
	}

}
