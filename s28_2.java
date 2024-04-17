class MyThread extends Thread{

public void run(){

System.out.println(Thread.currentThread()); try{ Thread.sleep(2000); System.out.println(ie);

}cat (InterruptedException ie){

} } }

class TestMyThread{

public static void main(String args[]){

System.out.println(Thread.currentThread());

MyThread ob1 = new MyThread();

MyThread ob2 = new MyThread();

MyThread ob3= new MyThread();

ob1.setName("Child1");

ob2.setName("Child2");

ob3.setName("Child3");
ob1.start();

ob2.start();

ob3.start();
}
}
