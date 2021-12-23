package com.example.apiversioning.repository.v2;

//import com.example.apiversioning.model.User;
import com.example.apiversioning.model.v2.UserV2;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryV2 extends CrudRepository<UserV2,Integer> {
}