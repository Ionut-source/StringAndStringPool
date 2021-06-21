package ro.java.ctrln;

public class ClientUsage {

    public static void main(String[] args) {

        Client clientOne = new Client();
        Client clientTwo = new Client();

        clientOne.setClientName("John");
        clientOne.setClientId(1);
        clientTwo.setClientName(new String ("John"));
        clientTwo.setClientId(1);
        System.out.println("clientOne.getClientName() == clientTwo.getClientName(): " + (clientOne.getClientName() == clientTwo.getClientName()));

        System.out.println(clientOne);
        System.out.println(clientTwo);

        String clientOneString = clientOne.toString().intern();
        String clientTwoString = clientTwo.toString().intern();

        System.out.println("clientOneString.equals(clientTwoString): " + clientOneString.equals(clientTwoString));
        System.out.println("clientOneString == clientTwoString: " + (clientOneString == clientTwoString));
    }
}
