package com.Henry.Quick.Poll.API.repository;

import com.Henry.Quick.Poll.API.model.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Long> {
}
