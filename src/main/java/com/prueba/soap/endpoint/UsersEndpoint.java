package com.prueba.soap.endpoint;

import com.prueba.soap.service.UserService;
import com.prueba.soap.spring_boot_soap_example.GetUserRequest;
import com.prueba.soap.spring_boot_soap_example.GetUserResponse;
import com.prueba.soap.spring_boot_soap_example.UsersResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UsersEndpoint {
    @Autowired
    UserService userService;

    @PayloadRoot(namespace = "http://soap.prueba.com/springboot-soap-example",
            localPart = "usersRequest")
    @ResponsePayload
    public UsersResponse getUsersRequest(){
        UsersResponse response=new UsersResponse();
        response.setUsers(userService.getAllUsers());
        return response;
    }
}
