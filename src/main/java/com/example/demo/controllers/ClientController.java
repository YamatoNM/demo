package com.example.demo.controllers;


import com.example.demo.models.Client;
import com.example.demo.services.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    ClientService clientService = new ClientService();
    @GetMapping("/clients")
    public List<Client> getUsers(){
        return clientService.findAll();
    }
    @PostMapping("/clients/create")
    public Client createClient(@RequestBody Client client){
        return clientService.CreateClient(client);
    }
}
