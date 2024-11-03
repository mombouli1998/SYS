import java.rmi.*;
public interface Banque extends Remote{
public Compte compteClient(int id)throws java.rmi.RemoteException;
    
}