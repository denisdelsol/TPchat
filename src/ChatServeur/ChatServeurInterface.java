package ChatServeur;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.SortedSet;

public interface ChatServeurInterface extends Remote{
	
	boolean login(String id) throws RemoteException;
	boolean logout(String id) throws RemoteException;
	SortedSet<Message> updateMessage();

}
