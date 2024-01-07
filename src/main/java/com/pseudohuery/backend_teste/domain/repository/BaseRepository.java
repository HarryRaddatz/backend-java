package com.pseudohuery.backend_teste.domain.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends MongoRepository<T, ID> {
    default Optional<T> findById(ID id) {
        throw new RuntimeException();
    }

    T getById(ID id);
}
