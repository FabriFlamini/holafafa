package com.example.demo.controller;


import com.example.demo.Entity.Cliente;
import com.example.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> crear(@RequestBody Cliente cliente){
        try{
            Cliente clienteCreado = clienteService.guardar(cliente);
            return ResponseEntity.created(URI.create("")).body(clienteCreado);
    } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getStackTrace());
        }

    }



}
