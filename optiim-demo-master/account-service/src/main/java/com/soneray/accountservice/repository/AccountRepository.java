package com.soneray.accountservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.soneray.accountservice.domain.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
