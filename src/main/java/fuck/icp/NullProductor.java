package fuck.icp;

/**
 * Created by THINK on 2016/11/30.
 */
public class NullProductor {
    public void makeNull() {
        Object a = null;
        try {
            System.out.println(a.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Thread.sleep(3000L);
            new NullProductor().makeNull();
        }
    }
}
