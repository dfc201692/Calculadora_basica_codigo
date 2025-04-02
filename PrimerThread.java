public class PrimerThread  extends Thread{

    int sleepTime;
    public PrimerThread(String id){
        super(id);

        sleepTime = (int) (Math.random() * 3000);

        System.out.println(" Nombre del hilo: " + getName() +" tiempo de dormir: " + sleepTime);
    }

    public void run(){
        try {
            sleep(sleepTime);

        } catch (InterruptedException interruptedException){
            System.out.println("interruptedException.toString() = " + interruptedException.toString());
        }

        System.out.println(" Hilo:  " + getName() );
    }
}
