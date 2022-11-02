package com.Henry.Quick.Poll.API.repository;

import com.Henry.Quick.Poll.API.model.Options;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionRepository extends CrudRepository<Options, Long> {
}
