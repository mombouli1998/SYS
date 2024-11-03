import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;
import java.rmi.*;
import java.net.*;
public class Serveur {
    public static void main(String args[]){
        try  {
            Banque b=new BanqueImpl();
            String object="object";
            Registry r=LocateRegistry.createRegistry(2001);
            r.rebind(object, b);
            System.out.println("serveur enregister");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}