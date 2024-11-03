import java.rmi.*;
public class client {
    public static void main(String[]args){
        try {
            hello h=(hello)Naming.lookup("rmi://:2000/object");
            String message=h.ditbonjour();
            System.out.println(message);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
