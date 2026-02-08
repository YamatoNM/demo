package com.example.demo.services;

import com.example.demo.dataStorage.ClientStorage;
import com.example.demo.models.Client;

import java.util.List;

public class ClientService {
    private final ClientStorage cs = new ClientStorage();
    public Client CreateClient(Client client){
        Client newClient = new Client(client.getUsername(), client.getEmail(), client.getPassword(), client.getRole());
             return cs.save(newClient);
    }
    public List<Client> findAll(){
        return cs.getALLClients();
    }
}
