package com.example.clientservice.service;

import com.example.clientservice.model.Client;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientService {
    private static List<Client> clients = new ArrayList<>();

    static {
        //Initialize Data
        Client ranga = new Client(1, "RangaKaranam@ymail.com");

        Client satish = new Client(2, "SatishT@gmail.com");

        clients.add(ranga);
        clients.add(satish);
    }

    public List<Client> retrieveAllClients() {
        return clients;
    }

    public Client retrieveClient(int clientId) {
        for (Client client : clients) {
            if (client.getId() == clientId) {
                return client;
            }
        }
        return null;
    }

    public Client addClient(Client newClient) {
        clients.add(newClient);
        return newClient;
    }

    public String removeClient(int clientId) {
        Client client = this.retrieveClient(clientId);
        clients.remove(client);
        return "Client deleted successfully";
    }
}
