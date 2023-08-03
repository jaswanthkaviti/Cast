package com.Movies.Cast.repository;

import com.Movies.Cast.table.Castmembers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface castrepo extends CrudRepository<Castmembers,Integer> {

}
