package ro.java.ctrln;

public class GarbageCollection {

    public static void main(String[] args) {

        exampleOneGarbageCollection();
        exampleTwoGarbageCollection();
        exampleThreeGarbageCollection();
        System.out.println("Final metoda main!");

        System.gc();
    }

    private static void exampleThreeGarbageCollection() {
        new Client().setClientName("Client3");
        System.gc();
    }

    private static void exampleTwoGarbageCollection() {
        Client clientOne = new Client();
        clientOne.setClientName("Client1");
        clientOne.setClientId(100);
        Client clientTwo = new Client();
        clientTwo.setClientName("Client2");
        clientTwo.setClientId(200);

        clientOne = clientTwo;

        System.out.println("Final metoda exampleTwoGarbageCollection");
        System.gc();
    }

    private static void exampleOneGarbageCollection() {
        Client client = new Client();
        client.setClientName("ClientOne");
        client.setClientId(1);
        client = null;
        System.out.println("Final metoda exampleOneGarbageCollection!");
        System.gc();
    }
}
