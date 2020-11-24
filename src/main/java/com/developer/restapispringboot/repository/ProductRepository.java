package com.developer.restapispringboot.repository;

import com.developer.restapispringboot.entity.Production;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Production, Long> {

    List<Production> findAllByName(String name);

    Production findProductById(Long id);

    @Override
    List<Production> findAll();

    @Override
    List<Production> findAll(Sort sort);

    @Override
    List<Production> findAllById(Iterable<Long> iterable);

    @Override
    <S extends Production> List<S> saveAll(Iterable<S> iterable);

    @Override
    void flush();

    @Override
    <S extends Production> S saveAndFlush(S s);

    @Override
    void deleteInBatch(Iterable<Production> iterable);

    @Override
    void deleteAllInBatch();

    @Override
    Production getOne(Long aLong);

    @Override
    <S extends Production> List<S> findAll(Example<S> example);

    @Override
    <S extends Production> List<S> findAll(Example<S> example, Sort sort);

}
