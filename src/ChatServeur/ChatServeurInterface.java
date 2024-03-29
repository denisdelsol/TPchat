package ChatServeur;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.SortedSet;

public interface ChatServeurInterface extends Remote{
	
	boolean login(String id) throws RemoteException;
	
	boolean logout(String id) throws RemoteException ;
	
	SortedSet<Message> updateMessage(int idLastMessage) throws RemoteException;
	
	Message sendMessage(String idPersonne, String corps, Date date) throws RemoteException;

}
