class A{
	int i=10;
	int j=100;
	A(){}
	A(int i){
		this.i=i;
	System.out.println("Parent class i="+i);
	}
	void show(){
		System.out.println("Show() in parent");
	}
	
}
class B extends A{
	int i=20;
	B(int i){
		super (i);
		System.out.println("Child class i="+this.i);
	}
}
class Ex{
	public static void main(String args[]){
		B obj=new B(40);
	}
}