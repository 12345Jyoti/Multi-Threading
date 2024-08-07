public class ThreadOp {
    public static void main(String[] args){
        int x=22+44;
        System.out.println("Sum is: "+x);
        Thread t=Thread.currentThread();
        String tName=t.getName();
        System.out.println("Thread Name: "+tName);

        //setname
        t.setName("MyMain");
        System.out.println(t.getName());
        try{
            Thread.sleep(5000);
        }catch(Exception e){

        }

        //going to start userThread class
        UserThread userThread=new UserThread();
        userThread.start();


        System.out.println(t.getId() );
        System.out.println("Ended!!");


    }
   static   class UserThread extends Thread{
        public void run(){
            System.out.println("This is UserThread!!!!");
        }
    }
}
