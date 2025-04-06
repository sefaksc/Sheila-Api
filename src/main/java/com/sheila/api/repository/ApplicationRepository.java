package com.sheila.api.repository;

import com.sheila.api.model.Application;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ApplicationRepository extends MongoRepository<Application, String> {
    Optional<Application> findByName(String name);
}
