import java.rmi.Naming;

public class MyClient {
    public static void main(String[] args) {
        try {
            MyRemote remoteObject = (MyRemote) Naming.lookup("rmi://localhost:1099/MyRemote");
            String response = remoteObject.sayHello();
            System.out.println("Response from server: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}