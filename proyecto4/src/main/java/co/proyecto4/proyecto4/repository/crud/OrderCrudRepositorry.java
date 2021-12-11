package co.proyecto4.proyecto4.repository.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import co.proyecto4.proyecto4.model.Order;

public interface OrderCrudRepositorry extends MongoRepository<Order, Integer> {
   
        @Query("{'salesMan.zone': ?0}")
        List<Order> findByZone(final String zone);
        
        @Query("{status: ?0}")
        List<Order> findByStatus(final String status);

        Optional<Order> findTopByOrderByIdDesc();
    }
    