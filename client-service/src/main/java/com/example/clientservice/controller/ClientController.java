package com.example.clientservice.controller;

import com.example.clientservice.model.Client;
import com.example.clientservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public List<Client> retrieveClients() {
        return clientService.retrieveAllClients();
    }

    @GetMapping("/clients/{clientId}")
    public Client retrieveClientById(@PathVariable int clientId) {
        return clientService.retrieveClient(clientId);
    }

    @PostMapping("/clients")
    public ResponseEntity<Void> registerStudentForCourse(
            @RequestBody Client newClient) {

        Client client = clientService.addClient(newClient);

        if (client == null)
            return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
                "/{id}").buildAndExpand(client.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @PutMapping("/clients/{clientId}")
    public void updateClient(@PathVariable int clientId, @RequestBody Client newClient) {
        clientService.retrieveAllClients().forEach(client -> {
            if(client.getId() == clientId){
                client.setEmail(newClient.getEmail());
            }
        });
    }

    @DeleteMapping("/clients/{clientId}")
    public void removeClientById(@PathVariable int clientId) {
        clientService.removeClient(clientId);
    }
}
