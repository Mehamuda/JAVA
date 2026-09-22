class Assignment extends Thread{
	private String name;
	public Assignment (String name){
		this.name=name;
	}
	public void run(){
		for (int i=1;i<=0;i++){
			System.out.println(name+" Writing Page "+i);
		}
		System.out.println(name+" Completed Writing");
	}
}
class ThreadEx{
	public static void main (String args[]){
		Assignment t1=new Assignment("Shaik");
		t1.start();
		Assignment t2=new Assignment("Mehamuda");
		t2.start();
	}
}