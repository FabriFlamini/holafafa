package com.example.demo.service;


import com.example.demo.Entity.Cliente;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    /**
     * Va a registrar al cliente a un id
     * @param cliente
     * @return
     */
    public Cliente guardar(Cliente cliente){
      return clienteRepository.save(cliente);
    }


}
