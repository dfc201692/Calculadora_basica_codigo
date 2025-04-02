// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*PrimerThread thread1, thread2, thread3, thread4, thread5;

        thread1 = new PrimerThread("1");
        thread2 = new PrimerThread("2");
        thread3 = new PrimerThread("3");
        thread4 = new PrimerThread("4");
        thread5 = new PrimerThread("5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();*/

        //ejecución de hilo con interfaz Runnable
        SegundoHilo hilo = new SegundoHilo();
        hilo.inicio();


    }
}