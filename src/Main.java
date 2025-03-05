import structure.MainFrame;

public class Main {

    public static void main(String args[]) {
        var window = new MainFrame();
        Thread t1 = new Thread(window);
        t1.start();
    }


}
