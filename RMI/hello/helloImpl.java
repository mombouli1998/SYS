import java.rmi.server.*;
import java.rmi.*;
public class helloImpl extends UnicastRemoteObject implements hello{
    public helloImpl()throws RemoteException{
        super();
    }
    


    @Override
    public String ditbonjour() throws RemoteException {
        return "bonjour";
    }
}
