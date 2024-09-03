import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class MyServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099); // Start RMI registry on port 1099
            MyRemoteImpl remoteObject = new MyRemoteImpl();
            Naming.rebind("rmi://localhost:1099/MyRemote", remoteObject);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}