package ChatServeur;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import java.util.Date;
import java.util.SortedSet;

public class ChatServeurImpl implements ChatServeurInterface {
	private SortedSet<Message> messages;

	public ChatServeurImpl() {
		super();
	}

	public static void main(String[] argv) {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		try {
			String name = "ChatServeur";
			ChatServeurInterface engine = new ChatServeurImpl();
			ChatServeurInterface stub = (ChatServeurInterface) UnicastRemoteObject
					.exportObject(engine, 0);
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind(name, stub);
			System.out.println("ChatServuer bound");
		} catch (Exception e) {
			System.err.println("ChatServeur exception:");
			e.printStackTrace();
		}
	}

	@Override
	public boolean login(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean logout(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SortedSet<Message> updateMessage(int idLastMessage)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message sendMessage(String idPersonne, String corps, Date date)
			throws RemoteException {

		// TODO Auto-generated method stub
		return null;
	}
}
