package com.example.demo.dataStorage;

import com.example.demo.models.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class ClientStorage {
    private Map<Long, Client> clients = new ConcurrentHashMap<>();
    private AtomicLong _id = new AtomicLong(1);

    public List<Client> getAllClients(){
        return new ArrayList<>(clients.values());
    }

    public Client save(Client client){
        long id = _id.getAndIncrement();
        client.setId(id);
        clients.put(id, client);
        return client;
    }
}
