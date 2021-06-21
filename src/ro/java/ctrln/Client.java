package ro.java.ctrln;

import java.util.Objects;

public class Client extends Person {

    private  String ClientName;
    private int ClientId;

    public Client() {}

    public Client(String clientName, int clientId, String cnp) {
        super(cnp);
        this.ClientName= clientName;
        this.ClientId = clientId;
    }

    public Client(String cnp) {

    }


    public String getClientName() {
        return ClientName;
    }

    public int getClientId() {
        return ClientId;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public void setClientId(int clientId) {
        ClientId = clientId;
    }

    @Override
    public String toString() {
        return "Client{" +
                "ClientName='" + ClientName + '\'' +
                ", ClientId=" + ClientId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return ClientId == client.ClientId && ClientName.equals(client.ClientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ClientName, ClientId);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Reciclare memorie pentru obiectul: " + this);
    }
}
