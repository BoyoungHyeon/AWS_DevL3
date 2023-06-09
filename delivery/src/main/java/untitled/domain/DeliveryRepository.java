package untitled.domain;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(collectionResourceRel = "deliveries",path = "deliveries")
public interface DeliveryRepository
    extends PagingAndSortingRepository<Delivery, String> {

        java.util.Optional<Delivery> findByOrderId(Long id);

        Optional<Delivery> findById(Long id);
    }
