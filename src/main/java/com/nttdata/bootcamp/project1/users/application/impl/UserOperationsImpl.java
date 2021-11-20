package com.nttdata.bootcamp.project1.users.application.impl;

import com.nttdata.bootcamp.project1.users.application.UserOperations;
import com.nttdata.bootcamp.project1.users.domain.User;
import com.nttdata.bootcamp.project1.users.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserOperationsImpl implements UserOperations {

    @Autowired
    UserRepository userRepository;


    @Override
    public Flux<User> queryAll() {
        return userRepository.getAll();
    }

    @Override
    public Mono<User> findById(Integer id) {
        return userRepository.getClientById(id);
    }

    @Override
    public Mono<User>  create(User user) {
        return userRepository.createClient(user);
    }

    @Override
    public Mono<User>  update(Integer id, User user) {
        return userRepository.updateClient(id, user);
    }

    @Override
    public Mono<Void> delete(Integer id) {
        return userRepository.deleteClientById(id);
    }
}