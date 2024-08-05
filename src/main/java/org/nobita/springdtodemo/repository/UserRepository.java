package org.nobita.springdtodemo.repository;

import org.nobita.springdtodemo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
