import java.rmi.*;
import java.rmi.server.*;
import java.util.Hashtable;

public class BanqueImpl extends UnicastRemoteObject implements Banque {
    public Hashtable<Integer,Compte>lstCompte=new Hashtable<Integer,Compte>();
    protected BanqueImpl() throws RemoteException {
        super();
        //TODO Auto-generated constructor stub
    }

    public Compte compteClient(int id) throws RemoteException {
         if(lstCompte.contains(id)){
            return lstCompte.get(id);
        }
        else{
            Compte c=new CompteImpl();
            lstCompte.put(id,c);
            return c;
        } 
        
        
    }


}