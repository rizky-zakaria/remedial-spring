package com.developer.restapispringboot.repository;

import com.developer.restapispringboot.entity.Cat;
import com.developer.restapispringboot.entity.Production;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatRepository extends JpaRepository<Cat, Long> {

    List<Cat> findAllByName(String name);

    Cat findCatById(Long id);

    @Override
    List<Cat> findAll();

    @Override
    List<Cat> findAll(Sort sort);

    @Override
    List<Cat> findAllById(Iterable<Long> iterable);

    @Override
    <S extends Cat> List<S> saveAll(Iterable<S> iterable);

    @Override
    void flush();

    @Override
    <S extends Cat> S saveAndFlush(S s);

    @Override
    void deleteInBatch(Iterable<Cat> iterable);

    @Override
    void deleteAllInBatch();

    @Override
    Cat getOne(Long aLong);

    @Override
    <S extends Cat> List<S> findAll(Example<S> example);

    @Override
    <S extends Cat> List<S> findAll(Example<S> example, Sort sort);

}
