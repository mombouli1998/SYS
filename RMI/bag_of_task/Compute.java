import java.rmi.Remote;
import java.rmi.RemoteException;
// Interface Compute pour exécuter des tâches à distance via RMI ; définit une méthode pour obtenir une tâche (getask) et une autre pour l'exécuter (run), toutes deux pouvant lancer une RemoteException en cas de problème de communication.
public interface Compute extends Remote {
    public Task getask()throws  RemoteException;
    public String run(Task t) throws RemoteException;
}