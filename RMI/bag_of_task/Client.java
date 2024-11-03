import java.rmi.*;
public class Client {
    public static void main(String[]args){
        if(System.getSecurityManager()==null){
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
               // Recherche l'objet distant "ob" dans le registre RMI et le lie à une référence Compute
               Compute c = (Compute) Naming.lookup("ob");
            
               // Récupère une tâche de vérification de parité depuis le serveur
               Task t = c.getask();
               
               // Exécute la tâche sur le serveur et obtient le résultat
               String r = c.run(t);
               
               // Affiche le résultat de la tâche (pair ou impair)
               System.out.println(r);
        } catch (Exception e) {
            System.err.println(e);
            // TODO: handle exception
        }
    }
    
}