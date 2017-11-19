package pei.java.jse.lab.language;


public class InfiniteInitializationLoop {
	
	public String str= new String("I am a string");
	
	// the class has a member object of its own type
	public InfiniteInitializationLoop stupid = new InfiniteInitializationLoop();
	
	static public void main(String args[]){
		/*
		 * creating this object causes memory overflow, 
		 * exception thrown: java.lang.StackOverflowError
		 */
		// new InfiniteInitializationLoop();
	}
}
