import java.rmi.*;

public interface hello extends Remote{
    public String ditbonjour() throws java.rmi.RemoteException;
}