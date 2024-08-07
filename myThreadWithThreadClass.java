public class myThreadWithThreadClass  extends Thread{
    @Override
    public void run() {
        for(int i=10;i>1;i--){
            System.out.println("valur of j is :"+ i);
        }
    }
}
