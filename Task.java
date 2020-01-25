public class Task implements Priority{
	
    private String name;
    private int priority;
    private boolean isDone;

    public Task(String name, int priority){
        this.name = name;
        this.priority = priority;
        isDone = false;
    }

    public int getPriority(){
        return priority;
    }
    
    public void setPriority(int importance){
        this.priority = importance;
    }
    
    public void doTask(){
        isDone = true;
        this.setPriority(0);
    }

    public String toString(){
    	if(priority == 0) {
    		return "Task: " + "\nTaks is done";
    	}
    	else {
    		return "Task: " + name + "\n Priority: " + this.getPriority();
    	}
    }
}
