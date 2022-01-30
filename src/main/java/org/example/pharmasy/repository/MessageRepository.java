package org.example.pharmasy.repository;

import org.example.pharmasy.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Integer> {

    Iterable<Message> findAllByTag(String tag);
}
