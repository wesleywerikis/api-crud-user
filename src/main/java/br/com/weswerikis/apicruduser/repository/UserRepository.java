package br.com.weswerikis.apicruduser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.weswerikis.apicruduser.entity.User;


public interface UserRepository extends JpaRepository <User, Long> {
    
}
