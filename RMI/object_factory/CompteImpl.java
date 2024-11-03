
import java.rmi.server.*;
import java.rmi.*;
public class CompteImpl extends UnicastRemoteObject implements Compte{
    double solde=10.0;
    public CompteImpl()throws RemoteException{
        super();
    }
    @Override
    public String depot(double montant) throws RemoteException {
        this.solde+=montant;
       return "dépôt éffectué";
    }

    @Override
    public String retrait(double montant) throws RemoteException {
       double reste=this.solde-montant;
       String t="";
        if(reste<10.0){
            t="retrait impossible";
        }
        else{
            this.solde-=montant;
            t="retrait éffectué";
        }

        return t;
    }

    @Override
    public String solde() throws RemoteException {
            return "votre solde est de "+this.solde;
    }

}
