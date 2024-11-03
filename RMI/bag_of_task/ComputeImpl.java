import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
public class ComputeImpl extends UnicastRemoteObject implements Compute{
     // Constructeur de ComputeImpl qui lance une RemoteException pour initialiser le serveur RMI.
    protected ComputeImpl() throws RemoteException {
        super();
        //TODO Auto-generated constructor stub
    }
      // Méthode pour générer une tâche aléatoire de vérification de parité.
    @Override
    public Task getask() throws RemoteException  {  
        int n= (int)(Math.random()*(100)+1);
        Task t=new Parite(n);
        return t;
    }
    // Méthode pour exécuter la tâche et renvoyer un message indiquant si le nombre est pair ou impair.
    @Override
    public String run(Task t) throws RemoteException {
       Parite p=(Parite)t;
       boolean v=(boolean) p.execute();
       String r="";
       if(v==true){
        r=p.getN()+" est un nombre paire";
       }
           
       else{
        r= p.getN()+" n'est pas paire";
       }
            
        return r;
    }
    // Méthode main pour configurer le serveur RMI, enregistrer l'objet ComputeImpl dans le registre RMI.
    public static void main(String []args){
        if(System.getSecurityManager()==null){
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            Compute c=new ComputeImpl();
            String object="ob";
            Naming.bind(object, c); // Enregistre l'objet avec le nom "ob" dans le registre RMI.
          
            System.out.println("serveur enregistre");
        } catch (Exception e) {
            System.err.println(e);
            // TODO: handle exception
        }
    }
    
}