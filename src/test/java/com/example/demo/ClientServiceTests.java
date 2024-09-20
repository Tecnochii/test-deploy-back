package com.example.demo;


import com.example.demo.models.Client;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.services.ClientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.when;


@SpringBootTest
public class ClientServiceTests {

    @Autowired
    ClientService clientService;

    @MockBean
    ClientRepository clientRepository;


    @Test
    void testFindByEmail(){


        when(clientRepository.findByEmail("ema@gmail.com")).thenReturn(new Client("Ema","Leiva","ema@gmail.com"));

        Client client = clientService.findByEmail("ema@gmail.com");


        assertThat(client, is(notNullValue()));
        assertThat(client.getEmail(), equalTo("ema@gmail.com"));

    }




}
