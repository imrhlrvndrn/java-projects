class thr1 extends Thread{
	public void run(){
		System.out.println("Here");
	}
	public static void main (String ar[]){
		thr1 t= new thr1();
		try{
			t.start();
			t.sleep(1000);
			t.start();
		} catch(Exception e){
			System.out.println("Exception: "+e);
		}
	}
}