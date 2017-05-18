package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private  ClientRepository clientRepository;

    @RequestMapping("/")
    public List<Client> showClient(){
        return clientRepository.findAll();
    }
}