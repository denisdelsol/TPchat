package ChatServeur;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ChatServeurImpl implements ChatServeurInterface {

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
}
