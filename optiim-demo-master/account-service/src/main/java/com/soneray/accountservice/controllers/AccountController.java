package com.soneray.accountservice.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soneray.accountservice.domain.Account;
import com.soneray.accountservice.repository.AccountRepository;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/{id}")
    public Account get(@PathVariable long id) {
        return accountRepository.findById(id).orElse(new Account("Soner AY", id));
    }

    @PostMapping
    public void create(@RequestBody Account account) {
    	accountRepository.save(account);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
    	accountRepository.deleteById(id);
    }
}
