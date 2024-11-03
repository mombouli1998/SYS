import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;
import java.rmi.*;
import java.net.*;
public class serveur {
    public static void main(String []args){
        try {
            hello h=new helloImpl();
            String objet="object";
            Registry r=LocateRegistry.createRegistry(2000);
            r.rebind(objet, h);
            System.out.println("serveur enregistrer");

        } catch (Exception e) {
            System.err.println("message d'erreur "+e);
        }
    }
    
}
