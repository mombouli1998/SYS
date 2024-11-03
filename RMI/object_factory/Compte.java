import java.rmi.*;
public interface Compte extends Remote{
    public String depot(double montant) throws java.rmi.RemoteException;
    public String retrait(double montant) throws java.rmi.RemoteException;
    public String solde()throws java.rmi.RemoteException;
}