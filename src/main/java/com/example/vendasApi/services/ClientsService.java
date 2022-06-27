package com.example.vendasApi.services;

import com.example.vendasApi.models.Client;
import com.example.vendasApi.repositories.ClientsRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientsService {

    private ClientsRepository repository;

    public ClientsService( ClientsRepository repository ){
        this.repository = repository;
    }

    public void salvarCliente(Client cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Client cliente){
        //aplica validações
    }
}
