package com.codegym.repository;

import java.util.List;
import java.util.Optional;

public interface IGeneralRepository<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    void save(T t);

    void remove(Long id);
}