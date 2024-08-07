public class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Value of i is: "+i);
            try{
                Thread.sleep(1000);

            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

    }
    //thread1
    public static void main(String[] args){
        MyThread t1= new MyThread();
        //Thread2
        Thread thread=new Thread(t1);
        thread.start();

        //Thread3
        myThreadWithThreadClass newThread=new myThreadWithThreadClass();
        newThread.start();

    }
}
